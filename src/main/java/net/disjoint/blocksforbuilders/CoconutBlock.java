package net.disjoint.blocksforbuilders;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;

public class CoconutBlock extends SaplingBlock implements SimpleWaterloggedBlock {
    public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty HANGING = BooleanProperty.create("hanging");
    public static final BooleanProperty HAS_MILK = BooleanProperty.create("has_milk");
    public static final BooleanProperty HAS_FIBER = BooleanProperty.create("has_fiber");
    private final VoxelShape UP_SHAPE = Block.box(5, 9, 5, 11, 16, 11);
    private final VoxelShape DOWN_SHAPE = Block.box(5, 0, 5, 11, 7, 11);

    public CoconutBlock(TreeGrower generator, Properties settings) {
        super(generator, settings);
        this.registerDefaultState(this.getStateDefinition().any().setValue(HANGING, false).setValue(HAS_MILK, true).setValue(HAS_FIBER, true).setValue(WATERLOGGED, false).setValue(STAGE, 0));
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return getShapeForState(state);
    }

    private VoxelShape getShapeForState(BlockState state) {
        if (state.getValue(HANGING)) {
            return UP_SHAPE;
        }
        else return DOWN_SHAPE;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return Block.isFaceFull(world.getBlockState(pos.below()).getCollisionShape(world, pos.below()), Direction.UP) || Block.isFaceFull(world.getBlockState(pos.above()).getCollisionShape(world, pos.above()), Direction.DOWN);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return floor.is(BlockTags.SAND);
    }

    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        FluidState state = world.getFluidState(pos);
        ItemStack itemStack = ctx.getItemInHand();
        boolean milk = itemStack.is(BlocksForBuildersItems.COCONUT) || itemStack.is(BlocksForBuildersItems.STRIPPED_COCONUT);
        boolean fiber = itemStack.is(BlocksForBuildersItems.COCONUT) || itemStack.is(BlocksForBuildersItems.EMPTY_COCONUT);
        boolean bl = state.is(FluidTags.WATER) && state.getAmount() == 8;
        for (Direction direction : ctx.getNearestLookingDirections()) {
            if (direction == Direction.UP || !Block.isFaceFull(world.getBlockState(pos.below()).getCollisionShape(world, pos.below()), Direction.UP)) {
                return this.defaultBlockState().setValue(WATERLOGGED, bl).setValue(HANGING, true).setValue(HAS_MILK, milk).setValue(HAS_FIBER, fiber);
            }
            else return this.defaultBlockState().setValue(WATERLOGGED, bl).setValue(HANGING, false).setValue(HAS_MILK, milk).setValue(HAS_FIBER, fiber);
        }
        return null;
    }

    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        boolean creative = !player.isCreative();
        if (itemStack.is(Items.BUCKET)) {
            if (state.getValue(HAS_MILK)) {
                player.getInventory().placeItemBackInInventory(new ItemStack(Items.MILK_BUCKET));
                world.setBlockAndUpdate(pos, state.setValue(HAS_MILK, false));
                world.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (creative) {
                    itemStack.shrink(1);
                }
            }
            return InteractionResult.SUCCESS;
        }
        if (itemStack.is(Items.SHEARS) && state.getValue(HAS_FIBER)) {
            popResource(world, pos, new ItemStack(BlocksForBuildersItems.COCONUT_FIBER, 3));
            world.setBlockAndUpdate(pos, state.setValue(HAS_FIBER, false));
            world.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
            if (creative) {
                itemStack.hurtWithoutBreaking(1, player);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

    private boolean shouldBreak(BlockState state, LevelReader world, BlockPos pos) {
        if (state.getValue(HANGING)) {
            return !Block.isFaceFull(world.getBlockState(pos.above()).getCollisionShape(world, pos.above()), Direction.DOWN);
        }
        else return !Block.isFaceFull(world.getBlockState(pos.below()).getCollisionShape(world, pos.below()), Direction.UP);
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (shouldBreak(state, world, pos)){
            tickView.scheduleTick(pos, this, 1);
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (shouldBreak(state, world, pos)) {
            world.destroyBlock(pos, true);
        }
    }

    private boolean conditionsForGrowth(BlockState state, LevelReader world, BlockPos pos) {
        return !state.getValue(HANGING) && world.getBlockState(pos.below()).is(BlockTags.SAND);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.getMaxLocalRawBrightness(pos.above()) >= 9 && random.nextInt(7) == 0 && conditionsForGrowth(state, world, pos)) {
            this.advanceTree(world, pos, state, random);
        }
        if (state.getValue(HANGING) && world.getBlockState(pos.above()).is(BlocksForBuildersBlocks.PALM_LEAVES)) {
            if (!state.getValue(HAS_MILK) && random.nextDouble() < 0.1) {
                world.setBlockAndUpdate(pos, state.setValue(HAS_MILK, true));
            }
            if (!state.getValue(HAS_FIBER) && random.nextDouble() < 0.1) {
                world.setBlockAndUpdate(pos, state.setValue(HAS_FIBER, true));
            }
        }
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        return conditionsForGrowth(state, world, pos);
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return (double) world.getRandom().nextFloat() < 0.45 && conditionsForGrowth(state, world, pos);
    }

    @Override
    protected ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData) {
        boolean milk = state.getValue(HAS_MILK);
        boolean fiber = state.getValue(HAS_FIBER);
        if (milk && fiber) {
            return new ItemStack(BlocksForBuildersItems.COCONUT);
        } else if (!milk && fiber) {
            return new ItemStack(BlocksForBuildersItems.EMPTY_COCONUT);
        } else if (milk) {
            return new ItemStack(BlocksForBuildersItems.STRIPPED_COCONUT);
        }
        else return new ItemStack(BlocksForBuildersItems.STRIPPED_EMPTY_COCONUT);
    }

    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HANGING, HAS_MILK, HAS_FIBER, WATERLOGGED, STAGE);
    }
}
