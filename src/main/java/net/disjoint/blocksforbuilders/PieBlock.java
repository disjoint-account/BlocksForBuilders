package net.disjoint.blocksforbuilders;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class PieBlock extends Block {
    public static final IntProperty CHOMPS = IntProperty.of("chomps", 0, 3);
    public static final MapCodec<PieBlock> CODEC = createCodec(PieBlock::new);
    public static final int MAX_CHOMPS = 3;
    public static final int DEFAULT_COMPARATOR_OUTPUT = getComparatorOutput(0);
    private static final VoxelShape HALF_PIE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 5.0, 8.0);
    private static final VoxelShape SLICE = Block.createCuboidShape(1.0, 0.0, 8.0, 8.0, 5.0, 15.0);
    private static final VoxelShape THREE_SLICES = VoxelShapes.union(HALF_PIE, SLICE);
    protected static final VoxelShape[] CHOMPS_TO_SHAPE = new VoxelShape[]{
            Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 5.0, 15.0),
            THREE_SLICES,
            HALF_PIE,
            Block.createCuboidShape(8.0, 0.0, 1.0, 15.0, 5.0, 8.0)
    };

    @Override
    public MapCodec<PieBlock> getCodec() {
        return CODEC;
    }

    public PieBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(CHOMPS, Integer.valueOf(0)));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return CHOMPS_TO_SHAPE[state.get(CHOMPS)];
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            if (tryEat(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }

            if (player.getStackInHand(Hand.MAIN_HAND).isEmpty()) {
                return ActionResult.CONSUME;
            }
        }

        return tryEat(world, pos, state, player);
    }

    protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        } else {
            player.getHungerManager().add(2, 0.1F);
            int i = (Integer)state.get(CHOMPS);
            world.emitGameEvent(player, GameEvent.EAT, pos);
            if (i < 3) {
                world.setBlockState(pos, state.with(CHOMPS, Integer.valueOf(i + 1)), Block.NOTIFY_ALL);
            } else {
                world.removeBlock(pos, false);
                world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }

            return ActionResult.SUCCESS;
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos)
                ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSolid();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CHOMPS);
    }

    @Override
    protected int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return getComparatorOutput((Integer)state.get(CHOMPS));
    }

    public static int getComparatorOutput(int chomps) {
        return (5 - chomps) * 3;
    }

    @Override
    protected boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }
}