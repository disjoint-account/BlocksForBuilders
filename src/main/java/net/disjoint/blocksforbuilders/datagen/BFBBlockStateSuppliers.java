package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.CoconutBlock;
import net.disjoint.blocksforbuilders.HedgeBlock;
import net.disjoint.blocksforbuilders.PieBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.Direction;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

@Environment(EnvType.CLIENT)
public class BFBBlockStateSuppliers {

    public static MultiVariantGenerator createHedgeBlockState(Block hedgeBlock, MultiVariant postId, MultiVariant singleId, MultiVariant cornerId, MultiVariant straightId, MultiVariant tShapeId, MultiVariant crossId,
                                                              MultiVariant tallPostId, MultiVariant tallSingleId, MultiVariant tallCornerId, MultiVariant tallStraightId, MultiVariant tallTShapeId, MultiVariant tallCrossId) {
        return MultiVariantGenerator.dispatch(hedgeBlock).with(PropertyDispatch.initial(HedgeBlock.EAST, HedgeBlock.NORTH, HedgeBlock.SOUTH, HedgeBlock.TALL, HedgeBlock.WEST)
                                .select(false, false, false, false, false, postId)
                                .select(false, false, false, true, false, tallPostId)
                                .select(false, true, false, false, false, singleId)
                                .select(false, true, false, true, false, tallSingleId)
                                .select(true, false, false, false, false, singleId.with(Y_ROT_90).with(UV_LOCK))
                                .select(true, false, false, true, false, tallSingleId.with(Y_ROT_90).with(UV_LOCK))
                                .select(false, false, true, false, false, singleId.with(Y_ROT_180).with(UV_LOCK))
                                .select(false, false, true, true, false, tallSingleId.with(Y_ROT_180).with(UV_LOCK))
                                .select(false, false, false, false, true, singleId.with(Y_ROT_270).with(UV_LOCK))
                                .select(false, false, false, true, true, tallSingleId.with(Y_ROT_270).with(UV_LOCK))
                                .select(true, true, false, false, false, cornerId)
                                .select(true, true, false, true, false, tallCornerId)
                                .select(true, false, true, false, false, cornerId.with(Y_ROT_90).with(UV_LOCK))
                                .select(true, false, true, true, false, tallCornerId.with(Y_ROT_90).with(UV_LOCK))
                                .select(false, false, true, false, true, cornerId.with(Y_ROT_180).with(UV_LOCK))
                                .select(false, false, true, true, true, tallCornerId.with(Y_ROT_180).with(UV_LOCK))
                                .select(false, true, false, false, true, cornerId.with(Y_ROT_270).with(UV_LOCK))
                                .select(false, true, false, true, true, tallCornerId.with(Y_ROT_270).with(UV_LOCK))
                                .select(false, true, true, false, false, straightId)
                                .select(false, true, true, true, false, tallStraightId)
                                .select(true, false, false, false, true, straightId.with(Y_ROT_90).with(UV_LOCK))
                                .select(true, false, false, true, true, tallStraightId.with(Y_ROT_90).with(UV_LOCK))
                                .select(true, true, true, false, false, tShapeId)
                                .select(true, true, true, true, false, tallTShapeId)
                                .select(true, false, true, false, true, tShapeId.with(Y_ROT_90).with(UV_LOCK))
                                .select(true, false, true, true, true, tallTShapeId.with(Y_ROT_90).with(UV_LOCK))
                                .select(false, true, true, false, true, tShapeId.with(Y_ROT_180).with(UV_LOCK))
                                .select(false, true, true, true, true, tallTShapeId.with(Y_ROT_180).with(UV_LOCK))
                                .select(true, true, false, false, true, tShapeId.with(Y_ROT_270).with(UV_LOCK))
                                .select(true, true, false, true, true, tallTShapeId.with(Y_ROT_270).with(UV_LOCK))
                                .select(true, true, true, false, true, crossId)
                                .select(true, true, true, true, true, tallCrossId)
                );
    }

    public static MultiVariantGenerator createDirectionalStairsBlockState(Block block, MultiVariant straight, MultiVariant innerLeft, MultiVariant innerRight, MultiVariant outerLeft, MultiVariant outerRight) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.STAIRS_SHAPE)
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.STRAIGHT, straight)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.STRAIGHT, straight.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.STRAIGHT,  straight.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.STRAIGHT,  straight.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_RIGHT, outerRight)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outerRight.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outerRight.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outerRight.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_LEFT,  outerLeft.with(Y_ROT_270))
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_LEFT,  outerLeft.with(Y_ROT_90))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_LEFT, outerLeft)
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_LEFT,  outerLeft.with(Y_ROT_180))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_RIGHT, innerRight)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_RIGHT,  innerRight.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_RIGHT,  innerRight.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_RIGHT,  innerRight.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_LEFT,  innerLeft.with(Y_ROT_270))
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_LEFT,  innerLeft.with(Y_ROT_90))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_LEFT, innerLeft)
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_LEFT,  innerLeft.with(Y_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.STRAIGHT,  straight.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.STRAIGHT,  straight.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.STRAIGHT,  straight.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.STRAIGHT,  straight.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.EAST, Half.TOP, StairsShape.OUTER_RIGHT,  outerRight.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.WEST, Half.TOP, StairsShape.OUTER_RIGHT,  outerRight.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_RIGHT,  outerRight.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.NORTH, Half.TOP, StairsShape.OUTER_RIGHT,  outerRight.with(X_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.OUTER_LEFT,  outerLeft.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.OUTER_LEFT,  outerLeft.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_LEFT,  outerLeft.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.OUTER_LEFT,  outerLeft.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.EAST, Half.TOP, StairsShape.INNER_RIGHT,  innerRight.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.WEST, Half.TOP, StairsShape.INNER_RIGHT,  innerRight.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.INNER_RIGHT,  innerRight.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.NORTH, Half.TOP, StairsShape.INNER_RIGHT,  innerRight.with(X_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.INNER_LEFT,  innerLeft.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.INNER_LEFT,  innerLeft.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.INNER_LEFT, innerLeft.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.INNER_LEFT, innerLeft.with(X_ROT_180).with(Y_ROT_270)));
    }

    public static MultiVariantGenerator createDirectionalSlabBlockState(Block block, MultiVariant slab, MultiVariant topSlab, MultiVariant doubleBlock) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.SLAB_TYPE)
                                .select(Direction.EAST, SlabType.BOTTOM, slab.with(Y_ROT_270))
                                .select(Direction.EAST, SlabType.DOUBLE, doubleBlock.with(Y_ROT_270))
                                .select(Direction.EAST, SlabType.TOP, topSlab.with(Y_ROT_270))
                                .select(Direction.NORTH, SlabType.BOTTOM, slab.with(Y_ROT_180))
                                .select(Direction.NORTH, SlabType.DOUBLE, doubleBlock.with(Y_ROT_180))
                                .select(Direction.NORTH, SlabType.TOP, topSlab.with(Y_ROT_180))
                                .select(Direction.SOUTH, SlabType.BOTTOM, slab)
                                .select(Direction.SOUTH, SlabType.DOUBLE, doubleBlock)
                                .select(Direction.SOUTH, SlabType.TOP, topSlab)
                                .select(Direction.WEST, SlabType.BOTTOM, slab.with(Y_ROT_90))
                                .select(Direction.WEST, SlabType.DOUBLE, doubleBlock.with(Y_ROT_90))
                                .select(Direction.WEST, SlabType.TOP, topSlab.with(Y_ROT_90)));
    }

    public static MultiVariantGenerator createPillarSlabBlockState(Block block, MultiVariant slab, MultiVariant topSlab, MultiVariant yAxisSlab, MultiVariant yAxisTopSlab, MultiVariant doubleBlock) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.FACING, BlockStateProperties.SLAB_TYPE)
                                .select(Direction.EAST, SlabType.BOTTOM, slab)
                                .select(Direction.EAST, SlabType.DOUBLE, doubleBlock.with(X_ROT_270).with(Y_ROT_90))
                                .select(Direction.EAST, SlabType.TOP, topSlab)
                                .select(Direction.NORTH, SlabType.BOTTOM, slab.with(Y_ROT_270))
                                .select(Direction.NORTH, SlabType.DOUBLE, doubleBlock.with(X_ROT_270))
                                .select(Direction.NORTH, SlabType.TOP, topSlab.with(Y_ROT_270))
                                .select(Direction.SOUTH, SlabType.BOTTOM, slab.with(Y_ROT_90))
                                .select(Direction.SOUTH, SlabType.DOUBLE, doubleBlock.with(X_ROT_270))
                                .select(Direction.SOUTH, SlabType.TOP, topSlab.with(Y_ROT_90))
                                .select(Direction.WEST, SlabType.BOTTOM, slab.with(Y_ROT_180))
                                .select(Direction.WEST, SlabType.DOUBLE, doubleBlock.with(X_ROT_270).with(Y_ROT_90))
                                .select(Direction.WEST, SlabType.TOP, topSlab.with(Y_ROT_180))
                                .select(Direction.UP, SlabType.BOTTOM, yAxisSlab)
                                .select(Direction.UP, SlabType.DOUBLE, doubleBlock.with(Y_ROT_180))
                                .select(Direction.UP, SlabType.TOP, yAxisTopSlab)
                                .select(Direction.DOWN, SlabType.BOTTOM, yAxisTopSlab.with(X_ROT_180))
                                .select(Direction.DOWN, SlabType.DOUBLE, doubleBlock.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.DOWN, SlabType.TOP, yAxisSlab.with(X_ROT_180)));
    }

    public static MultiVariantGenerator createPillarCarpetBlockState(Block block, MultiVariant carpet) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING)
                                .select(Direction.EAST, carpet.with(Y_ROT_180))
                                .select(Direction.NORTH, carpet.with(Y_ROT_90))
                                .select(Direction.SOUTH, carpet.with(Y_ROT_270))
                                .select(Direction.WEST, carpet));
    }

    public static MultiVariantGenerator createDirectionalBlockState(Block block, MultiVariant model) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.FACING)
                                .select(Direction.DOWN, model.with(X_ROT_180))
                                .select(Direction.EAST, model.with(X_ROT_90).with(Y_ROT_90))
                                .select(Direction.NORTH, model.with(X_ROT_90))
                                .select(Direction.SOUTH, model.with(X_ROT_90).with(Y_ROT_180))
                                .select(Direction.UP, model)
                                .select(Direction.WEST, model.with(X_ROT_90).with(Y_ROT_270)));
    }

    public static MultiVariantGenerator createGrimstoneStyleStairsBlockState(Block block, MultiVariant straight, MultiVariant straightTop, MultiVariant inner, MultiVariant innerTop, MultiVariant outer, MultiVariant outerTop) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.STAIRS_SHAPE)
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.STRAIGHT, straight)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.STRAIGHT, straight.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.STRAIGHT,  straight.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.STRAIGHT,  straight.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_RIGHT, outer)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outer.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outer.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_RIGHT,  outer.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.OUTER_LEFT,  outer.with(Y_ROT_270))
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.OUTER_LEFT,  outer.with(Y_ROT_90))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.OUTER_LEFT, outer)
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.OUTER_LEFT,  outer.with(Y_ROT_180))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_RIGHT, inner)
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_RIGHT,  inner.with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_RIGHT,  inner.with(Y_ROT_90))
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_RIGHT,  inner.with(Y_ROT_270))
                                .select(Direction.EAST, Half.BOTTOM, StairsShape.INNER_LEFT,  inner.with(Y_ROT_270))
                                .select(Direction.WEST, Half.BOTTOM, StairsShape.INNER_LEFT,  inner.with(Y_ROT_90))
                                .select(Direction.SOUTH, Half.BOTTOM, StairsShape.INNER_LEFT, inner)
                                .select(Direction.NORTH, Half.BOTTOM, StairsShape.INNER_LEFT,  inner.with(Y_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.STRAIGHT,  straightTop.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.STRAIGHT,  straightTop.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.STRAIGHT,  straightTop.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.STRAIGHT,  straightTop.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.EAST, Half.TOP, StairsShape.OUTER_RIGHT,  outerTop.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.WEST, Half.TOP, StairsShape.OUTER_RIGHT,  outerTop.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_RIGHT,  outerTop.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.NORTH, Half.TOP, StairsShape.OUTER_RIGHT,  outerTop.with(X_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.OUTER_LEFT,  outerTop.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.OUTER_LEFT,  outerTop.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.OUTER_LEFT,  outerTop.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.OUTER_LEFT,  outerTop.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.EAST, Half.TOP, StairsShape.INNER_RIGHT,  innerTop.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.WEST, Half.TOP, StairsShape.INNER_RIGHT,  innerTop.with(X_ROT_180).with(Y_ROT_270))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.INNER_RIGHT,  innerTop.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.NORTH, Half.TOP, StairsShape.INNER_RIGHT,  innerTop.with(X_ROT_180))
                                .select(Direction.EAST, Half.TOP, StairsShape.INNER_LEFT,  innerTop.with(X_ROT_180))
                                .select(Direction.WEST, Half.TOP, StairsShape.INNER_LEFT,  innerTop.with(X_ROT_180).with(Y_ROT_180))
                                .select(Direction.SOUTH, Half.TOP, StairsShape.INNER_LEFT,  innerTop.with(X_ROT_180).with(Y_ROT_90))
                                .select(Direction.NORTH, Half.TOP, StairsShape.INNER_LEFT,  innerTop.with(X_ROT_180).with(Y_ROT_270)));
    }

    public static MultiVariantGenerator createPieBlockState(Block block, MultiVariant full, MultiVariant oneBite, MultiVariant twoBites, MultiVariant threeBites) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(PieBlock.CHOMPS)
                                .select(0, full)
                                .select(1, oneBite)
                                .select(2, twoBites)
                                .select(3, threeBites));
    }

    public static MultiVariantGenerator createCoconutBlockState(Block block, MultiVariant identifier, MultiVariant strippedId, MultiVariant emptyId, MultiVariant strippedEmptyId) {
        return MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(CoconutBlock.HANGING, CoconutBlock.HAS_FIBER, CoconutBlock.HAS_MILK)
                                .select(false, true, true, identifier)
                                .select(true, true, true, identifier.with(X_ROT_180))
                                .select(false, true, false, emptyId)
                                .select(true, true, false, emptyId.with(X_ROT_180))
                                .select(false, false, true, strippedId)
                                .select(true, false, true, strippedId.with(X_ROT_180))
                                .select(false, false, false, strippedEmptyId)
                                .select(true, false, false, strippedEmptyId.with(X_ROT_180)));
    }

}
