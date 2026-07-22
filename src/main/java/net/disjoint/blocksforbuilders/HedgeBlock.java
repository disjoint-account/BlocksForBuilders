package net.disjoint.blocksforbuilders;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;

public class HedgeBlock extends Block implements SimpleWaterloggedBlock {
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
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty TALL = BooleanProperty.create("tall");
    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public HedgeBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any().setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(TALL, false).setValue(WATERLOGGED, false));
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return getShapeForState(state);
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return getCollisionShapeForState(state);
    }

    private static VoxelShape getShapeForState(BlockState state) {
        VoxelShape centralShape;
        VoxelShape northShape;
        VoxelShape eastShape;
        VoxelShape southShape;
        VoxelShape westShape;
        if (!state.getValue(NORTH)) {
            northShape = Shapes.empty();
        }
        else {
            if (state.getValue(TALL)) {
                northShape = NORTH_TALL_SHAPE;
            }
            else northShape = NORTH_SHAPE;
        }

        if (!state.getValue(EAST)) {
            eastShape = Shapes.empty();
        }
        else {
            if (state.getValue(TALL)) {
                eastShape = EAST_TALL_SHAPE;
            }
            else eastShape = EAST_SHAPE;
        }

        if (!state.getValue(SOUTH)) {
            southShape = Shapes.empty();
        }
        else {
            if (state.getValue(TALL)) {
                southShape = SOUTH_TALL_SHAPE;
            }
            else southShape = SOUTH_SHAPE;
        }

        if (!state.getValue(WEST)) {
            westShape = Shapes.empty();
        }
        else {
            if (state.getValue(TALL)) {
                westShape = WEST_TALL_SHAPE;
            }
            else westShape = WEST_SHAPE;
        }

        if (state.getValue(TALL)) {
            centralShape = CENTRAL_TALL_SHAPE;
        }
        else centralShape = CENTRAL_SHAPE;

        return Shapes.or(centralShape, northShape, eastShape, southShape, westShape);
    }

    private static VoxelShape getCollisionShapeForState(BlockState state) {
        VoxelShape centralShape;
        VoxelShape northShape;
        VoxelShape eastShape;
        VoxelShape southShape;
        VoxelShape westShape;
        if (!state.getValue(NORTH)) {
            northShape = Shapes.empty();
        }
        else northShape = NORTH_COLLISION_SHAPE;

        if (!state.getValue(EAST)) {
            eastShape = Shapes.empty();
        }
        else eastShape = EAST_COLLISION_SHAPE;

        if (!state.getValue(SOUTH)) {
            southShape = Shapes.empty();
        }
        else southShape = SOUTH_COLLISION_SHAPE;

        if (!state.getValue(WEST)) {
            westShape = Shapes.empty();
        }
        else westShape = WEST_COLLISION_SHAPE;

        centralShape = CENTRAL_COLLISION_SHAPE;

        return Shapes.or(centralShape, northShape, eastShape, southShape, westShape);
    }


    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Level world = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        FluidState state = world.getFluidState(pos);
        boolean bl = state.is(FluidTags.WATER) && state.getAmount() == 8;
        return updateState(this.defaultBlockState().setValue(WATERLOGGED, bl), world, pos);
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (!requirements(state, world, pos)) {
            tickView.scheduleTick(pos, this, 0);
        }
        if (state.getValue(WATERLOGGED)) {
            tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!requirements(state, world, pos)) {
            world.setBlockAndUpdate(pos, updateState(state, world, pos));
        }
    }

    private boolean requirements(BlockState state, LevelReader world, BlockPos pos) {
        if (isValidNeighbor(world, pos, Direction.NORTH) != state.getValue(NORTH)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.EAST) != state.getValue(EAST)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.SOUTH) != state.getValue(SOUTH)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.WEST) != state.getValue(WEST)) {
            return false;
        }
        if (isValidNeighbor(world, pos, Direction.UP) != state.getValue(TALL)) {
            return false;
        }
        else return true;
    }

    private BlockState updateState(BlockState state, LevelReader world, BlockPos pos) {
        if (state.is(this)) {
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

            return state.setValue(NORTH, north).setValue(EAST, east).setValue(SOUTH, south).setValue(WEST, west).setValue(TALL, tall);
        }
        return state;
    }

    public boolean isValidNeighbor(LevelReader world, BlockPos pos, Direction direction) {
        BlockState neighborState = world.getBlockState(pos.relative(direction));
        return neighborState.is(BlockTags.WALLS) || neighborState.is(BlockTags.FENCES) || neighborState.is(BlockTags.FENCE_GATES) || Block.isFaceFull(neighborState.getCollisionShape(world, pos.relative(direction)), direction.getOpposite());
    }

    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, TALL, WATERLOGGED);
    }

    static {
        CENTRAL_SHAPE = Block.box(5, 0, 5, 11, 14, 11);
        NORTH_SHAPE = Block.box(5, 0, 0, 11, 14, 5);
        EAST_SHAPE = Block.box(11, 0, 5, 16, 14, 11);
        SOUTH_SHAPE = Block.box(5, 0, 11, 11, 14, 16);
        WEST_SHAPE = Block.box(0, 0, 5, 5, 14, 11);
        CENTRAL_TALL_SHAPE = Block.box(5, 0, 5, 11, 16, 11);
        NORTH_TALL_SHAPE = Block.box(5, 0, 0, 11, 16, 5);
        EAST_TALL_SHAPE = Block.box(11, 0, 5, 16, 16, 11);
        SOUTH_TALL_SHAPE = Block.box(5, 0, 11, 11, 16, 16);
        WEST_TALL_SHAPE = Block.box(0, 0, 5, 5, 16, 11);
        CENTRAL_COLLISION_SHAPE = Block.box(5, 0, 5, 11, 24, 11);
        NORTH_COLLISION_SHAPE = Block.box(5, 0, 0, 11, 24, 5);
        EAST_COLLISION_SHAPE = Block.box(11, 0, 5, 16, 24, 11);
        SOUTH_COLLISION_SHAPE = Block.box(5, 0, 11, 11, 24, 16);
        WEST_COLLISION_SHAPE = Block.box(0, 0, 5, 5, 24, 11);
    }
}
