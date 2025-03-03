package net.disjoint.blocksforbuilders;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class CoconutBlock extends SaplingBlock implements Waterloggable {
    public static final IntProperty STAGE = Properties.STAGE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final BooleanProperty HANGING = BooleanProperty.of("hanging");
    public static final BooleanProperty HAS_MILK = BooleanProperty.of("has_milk");
    public static final BooleanProperty HAS_FIBER = BooleanProperty.of("has_fiber");
    private final VoxelShape UP_SHAPE = Block.createCuboidShape(5, 9, 5, 11, 16, 11);
    private final VoxelShape DOWN_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 7, 11);

    public CoconutBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(HANGING, false).with(HAS_MILK, true).with(HAS_FIBER, true).with(WATERLOGGED, false).with(STAGE, 0));
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShapeForState(state);
    }

    private VoxelShape getShapeForState(BlockState state) {
        if (state.get(HANGING)) {
            return UP_SHAPE;
        }
        else return DOWN_SHAPE;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return Block.isFaceFullSquare(world.getBlockState(pos.down()).getCollisionShape(world, pos.down()), Direction.UP) || Block.isFaceFullSquare(world.getBlockState(pos.up()).getCollisionShape(world, pos.up()), Direction.DOWN);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.SAND);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        FluidState state = world.getFluidState(pos);
        ItemStack itemStack = ctx.getStack();
        boolean milk = itemStack.isOf(BlocksForBuildersItems.COCONUT) || itemStack.isOf(BlocksForBuildersItems.SHEARED_COCONUT);
        boolean fiber = itemStack.isOf(BlocksForBuildersItems.COCONUT) || itemStack.isOf(BlocksForBuildersItems.EMPTY_COCONUT);
        boolean bl = state.isIn(FluidTags.WATER) && state.getLevel() == 8;
        for (Direction direction : ctx.getPlacementDirections()) {
            if (direction == Direction.UP || !Block.isFaceFullSquare(world.getBlockState(pos.down()).getCollisionShape(world, pos.down()), Direction.UP)) {
                return this.getDefaultState().with(WATERLOGGED, bl).with(HANGING, true).with(HAS_MILK, milk).with(HAS_FIBER, fiber);
            }
            else return this.getDefaultState().with(WATERLOGGED, bl).with(HANGING, false).with(HAS_MILK, milk).with(HAS_FIBER, fiber);
        }
        return null;
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        boolean creative = !player.isCreative();
        if (itemStack.isOf(Items.BUCKET)) {
            if (state.get(HAS_MILK)) {
                player.getInventory().offerOrDrop(new ItemStack(Items.MILK_BUCKET));
                world.setBlockState(pos, state.with(HAS_MILK, false));
                world.playSound(null, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (creative) {
                    itemStack.decrement(1);
                }
            }
            return ActionResult.SUCCESS;
        }
        if (itemStack.isOf(Items.SHEARS) && state.get(HAS_FIBER)) {
            dropStack(world, pos, new ItemStack(BlocksForBuildersItems.COCONUT_FIBER, 3));
            world.setBlockState(pos, state.with(HAS_FIBER, false));
            world.playSound(null, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (creative) {
                itemStack.damage(1, player);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    private boolean shouldBreak(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HANGING)) {
            return !Block.isFaceFullSquare(world.getBlockState(pos.up()).getCollisionShape(world, pos.up()), Direction.DOWN);
        }
        else return !Block.isFaceFullSquare(world.getBlockState(pos.down()).getCollisionShape(world, pos.down()), Direction.UP);
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (shouldBreak(state, world, pos)){
            tickView.scheduleBlockTick(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (shouldBreak(state, world, pos)) {
            world.breakBlock(pos, true);
        }
    }

    private boolean conditionsForGrowth(BlockState state, WorldView world, BlockPos pos) {
        return !state.get(HANGING) && world.getBlockState(pos.down()).isIn(BlockTags.SAND);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(pos.up()) >= 9 && random.nextInt(7) == 0 && conditionsForGrowth(state, world, pos)) {
            this.generate(world, pos, state, random);
        }
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return conditionsForGrowth(state, world, pos);
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return (double)world.random.nextFloat() < 0.45 && conditionsForGrowth(state, world, pos);
    }

    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HANGING, HAS_MILK, HAS_FIBER, WATERLOGGED, STAGE);
    }
}
