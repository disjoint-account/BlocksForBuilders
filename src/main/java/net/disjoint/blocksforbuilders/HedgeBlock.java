package net.disjoint.blocksforbuilders;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class HedgeBlock extends Block implements Waterloggable {
    private static final VoxelShape CENTRAL_SHAPE;
    private static final VoxelShape NORTH_SHAPE;
    private static final VoxelShape EAST_SHAPE;
    private static final VoxelShape SOUTH_SHAPE;
    private static final VoxelShape WEST_SHAPE;
    private static final VoxelShape CENTRAL_TALL_SHAPE;
    private static final VoxelShape NORTH_TALL_SHAPE;
    private static final VoxelShape EAST_TALL_SHAPE;
    private static final VoxelShape SOUTH_TALL_SHAPE;
    private static final VoxelShape WEST_TALL_SHAPE;
    private static final VoxelShape CENTRAL_COLLISION_SHAPE;
    private static final VoxelShape NORTH_COLLISION_SHAPE;
    private static final VoxelShape EAST_COLLISION_SHAPE;
    private static final VoxelShape SOUTH_COLLISION_SHAPE;
    private static final VoxelShape WEST_COLLISION_SHAPE;
    private static final BooleanProperty NORTH = BooleanProperty.of("north");
    private static final BooleanProperty EAST = BooleanProperty.of("east");
    private static final BooleanProperty SOUTH = BooleanProperty.of("south");
    private static final BooleanProperty WEST = BooleanProperty.of("west");
    private static final BooleanProperty TALL = BooleanProperty.of("tall");
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public HedgeBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(NORTH, false).with(EAST, false).with(SOUTH, false).with(WEST, false).with(TALL, false).with(WATERLOGGED, false));
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShapeForState(state);
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getCollisionShapeForState(state);
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape centralShape;
        VoxelShape northShape;
        VoxelShape eastShape;
        VoxelShape southShape;
        VoxelShape westShape;
        if (!state.get(NORTH)) {
            northShape = VoxelShapes.empty();
        }
        else {
            if (state.get(TALL)) {
                northShape = NORTH_TALL_SHAPE;
            }
            else northShape = NORTH_SHAPE;
        }

        if (!state.get(EAST)) {
            eastShape = VoxelShapes.empty();
        }
        else {
            if (state.get(TALL)) {
                eastShape = EAST_TALL_SHAPE;
            }
            else eastShape = EAST_SHAPE;
        }

        if (!state.get(SOUTH)) {
            southShape = VoxelShapes.empty();
        }
        else {
            if (state.get(TALL)) {
                southShape = SOUTH_TALL_SHAPE;
            }
            else southShape = SOUTH_SHAPE;
        }

        if (!state.get(WEST)) {
            westShape = VoxelShapes.empty();
        }
        else {
            if (state.get(TALL)) {
                westShape = WEST_TALL_SHAPE;
            }
            else westShape = WEST_SHAPE;
        }

        if (state.get(TALL)) {
            centralShape = CENTRAL_TALL_SHAPE;
        }
        else centralShape = CENTRAL_SHAPE;

        return VoxelShapes.union(centralShape, northShape, eastShape, southShape, westShape);
    }

    private static VoxelShape getCollisionShapeForState(BlockState state) {
        VoxelShape centralShape;
        VoxelShape northShape;
        VoxelShape eastShape;
        VoxelShape southShape;
        VoxelShape westShape;
        if (!state.get(NORTH)) {
            northShape = VoxelShapes.empty();
        }
        else northShape = NORTH_COLLISION_SHAPE;

        if (!state.get(EAST)) {
            eastShape = VoxelShapes.empty();
        }
        else eastShape = EAST_COLLISION_SHAPE;

        if (!state.get(SOUTH)) {
            southShape = VoxelShapes.empty();
        }
        else southShape = SOUTH_COLLISION_SHAPE;

        if (!state.get(WEST)) {
            westShape = VoxelShapes.empty();
        }
        else westShape = WEST_COLLISION_SHAPE;

        centralShape = CENTRAL_COLLISION_SHAPE;

        return VoxelShapes.union(centralShape, northShape, eastShape, southShape, westShape);
    }


    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        FluidState state = world.getFluidState(pos);
        boolean bl = state.isIn(FluidTags.WATER) && state.getLevel() == 8;
        return updateState(this.getDefaultState().with(WATERLOGGED, bl), world, pos);
    }

    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (!requirements(state, world, pos)) {
            tickView.scheduleBlockTick(pos, this, 0);
        }
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!requirements(state, world, pos)) {
            world.setBlockState(pos, updateState(state, world, pos));
        }
    }

    private boolean requirements(BlockState state, WorldView world, BlockPos pos) {
        if (isValidNeighbor(world, pos, Direction.NORTH) != state.get(NORTH)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.EAST) != state.get(EAST)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.SOUTH) != state.get(SOUTH)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.WEST) != state.get(WEST)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.UP) != state.get(TALL)) {
            return false;
        }
        else return true;
    }

    private BlockState updateState(BlockState state, WorldView world, BlockPos pos) {
        if (state.isOf(this)) {
            boolean north;
            boolean east;
            boolean south;
            boolean west;
            boolean tall;
            north = isValidNeighbor(world, pos, Direction.NORTH);
            east = isValidNeighbor(world, pos, Direction.EAST);
            south = isValidNeighbor(world, pos, Direction.SOUTH);
            west = isValidNeighbor(world, pos, Direction.WEST);
            tall = isValidNeighbor(world, pos, Direction.UP);

            return state.with(NORTH, north).with(EAST, east).with(SOUTH, south).with(WEST, west).with(TALL, tall);
        }
        return state;
    }

    public boolean isValidNeighbor(WorldView world, BlockPos pos, Direction direction) {
        BlockState neighborState = world.getBlockState(pos.offset(direction));
        return neighborState.isIn(BlockTags.WALLS) || neighborState.isIn(BlockTags.FENCES) || neighborState.isIn(BlockTags.FENCE_GATES) || Block.isFaceFullSquare(neighborState.getCollisionShape(world, pos.offset(direction)), direction.getOpposite());
    }

    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, TALL, WATERLOGGED);
    }

    static {
        CENTRAL_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 14, 11);
        NORTH_SHAPE = Block.createCuboidShape(5, 0, 0, 11, 14, 5);
        EAST_SHAPE = Block.createCuboidShape(11, 0, 5, 16, 14, 11);
        SOUTH_SHAPE = Block.createCuboidShape(5, 0, 11, 11, 14, 16);
        WEST_SHAPE = Block.createCuboidShape(0, 0, 5, 5, 14, 11);
        CENTRAL_TALL_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 16, 11);
        NORTH_TALL_SHAPE = Block.createCuboidShape(5, 0, 0, 11, 16, 5);
        EAST_TALL_SHAPE = Block.createCuboidShape(11, 0, 5, 16, 16, 11);
        SOUTH_TALL_SHAPE = Block.createCuboidShape(5, 0, 11, 11, 16, 16);
        WEST_TALL_SHAPE = Block.createCuboidShape(0, 0, 5, 5, 16, 11);
        CENTRAL_COLLISION_SHAPE = Block.createCuboidShape(5, 0, 5, 11, 24, 11);
        NORTH_COLLISION_SHAPE = Block.createCuboidShape(5, 0, 0, 11, 24, 5);
        EAST_COLLISION_SHAPE = Block.createCuboidShape(11, 0, 5, 16, 24, 11);
        SOUTH_COLLISION_SHAPE = Block.createCuboidShape(5, 0, 11, 11, 24, 16);
        WEST_COLLISION_SHAPE = Block.createCuboidShape(0, 0, 5, 5, 24, 11);
    }
}
