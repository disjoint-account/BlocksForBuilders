package net.disjoint.blocksforbuilders;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.ScheduledTickAccess;
import org.jspecify.annotations.NonNull;

public class PieBlock extends Block {
    public static final IntegerProperty CHOMPS = IntegerProperty.create("chomps", 0, 3);
    public static final MapCodec<PieBlock> CODEC = simpleCodec(PieBlock::new);
    public static final int MAX_CHOMPS = 3;
    public static final int DEFAULT_COMPARATOR_OUTPUT = getComparatorOutput(0);
    private static final VoxelShape HALF_PIE = Block.box(1.0, 0.0, 1.0, 15.0, 5.0, 8.0);
    private static final VoxelShape SLICE = Block.box(1.0, 0.0, 8.0, 8.0, 5.0, 15.0);
    private static final VoxelShape THREE_SLICES = Shapes.or(HALF_PIE, SLICE);
    protected static final VoxelShape[] CHOMPS_TO_SHAPE = new VoxelShape[]{
            Block.box(1.0, 0.0, 1.0, 15.0, 5.0, 15.0),
            THREE_SLICES,
            HALF_PIE,
            Block.box(8.0, 0.0, 1.0, 15.0, 5.0, 8.0)
    };

    @Override
    public MapCodec<PieBlock> codec() {
        return CODEC;
    }

    public PieBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(CHOMPS, 0));
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return CHOMPS_TO_SHAPE[state.getValue(CHOMPS)];
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (world.isClientSide()) {
            if (tryEat(world, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return tryEat(world, pos, state, player);
    }

    protected static InteractionResult tryEat(LevelAccessor world, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(2, 0.3F);
            int i = (Integer)state.getValue(CHOMPS);
            world.gameEvent(player, GameEvent.EAT, pos);
            if (i < 3) {
                world.setBlock(pos, state.setValue(CHOMPS, Integer.valueOf(i + 1)), Block.UPDATE_ALL);
            } else {
                world.removeBlock(pos, false);
                world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }

            return InteractionResult.SUCCESS;
        }
    }

    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos, ScheduledTickAccess tickView, RandomSource random
    ) {
        return direction == Direction.DOWN && !state.canSurvive(world, pos)
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).isSolid();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(CHOMPS);
    }

    @Override
    protected int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos, Direction direction) {
        return getComparatorOutput((Integer)state.getValue(CHOMPS));
    }

    public static int getComparatorOutput(int chomps) {
        return (5 - chomps) * 3;
    }

    @Override
    protected boolean hasAnalogOutputSignal(@NonNull BlockState state) {
        return true;
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType type) {
        return false;
    }
}