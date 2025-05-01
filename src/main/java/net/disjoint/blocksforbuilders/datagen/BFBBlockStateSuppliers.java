package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.CoconutBlock;
import net.disjoint.blocksforbuilders.HedgeBlock;
import net.disjoint.blocksforbuilders.PieBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.enums.StairShape;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

@Environment(EnvType.CLIENT)
public class BFBBlockStateSuppliers {

    public static VariantsBlockModelDefinitionCreator createHedgeBlockState(Block hedgeBlock, WeightedVariant postId, WeightedVariant singleId, WeightedVariant cornerId, WeightedVariant straightId, WeightedVariant tShapeId, WeightedVariant crossId,
                                                           WeightedVariant tallPostId, WeightedVariant tallSingleId, WeightedVariant tallCornerId, WeightedVariant tallStraightId, WeightedVariant tallTShapeId, WeightedVariant tallCrossId) {
        return VariantsBlockModelDefinitionCreator.of(hedgeBlock).with(BlockStateVariantMap.models(HedgeBlock.EAST, HedgeBlock.NORTH, HedgeBlock.SOUTH, HedgeBlock.TALL, HedgeBlock.WEST)
                                .register(false, false, false, false, false, postId)
                                .register(false, false, false, true, false, tallPostId)
                                .register(false, true, false, false, false, singleId)
                                .register(false, true, false, true, false, tallSingleId)
                                .register(true, false, false, false, false, singleId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(true, false, false, true, false, tallSingleId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(false, false, true, false, false, singleId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(false, false, true, true, false, tallSingleId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(false, false, false, false, true, singleId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(false, false, false, true, true, tallSingleId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(true, true, false, false, false, cornerId)
                                .register(true, true, false, true, false, tallCornerId)
                                .register(true, false, true, false, false, cornerId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(true, false, true, true, false, tallCornerId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(false, false, true, false, true, cornerId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(false, false, true, true, true, tallCornerId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(false, true, false, false, true, cornerId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(false, true, false, true, true, tallCornerId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(false, true, true, false, false, straightId)
                                .register(false, true, true, true, false, tallStraightId)
                                .register(true, false, false, false, true, straightId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(true, false, false, true, true, tallStraightId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(true, true, true, false, false, tShapeId)
                                .register(true, true, true, true, false, tallTShapeId)
                                .register(true, false, true, false, true, tShapeId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(true, false, true, true, true, tallTShapeId.apply(ROTATE_Y_90).apply(UV_LOCK))
                                .register(false, true, true, false, true, tShapeId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(false, true, true, true, true, tallTShapeId.apply(ROTATE_Y_180).apply(UV_LOCK))
                                .register(true, true, false, false, true, tShapeId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(true, true, false, true, true, tallTShapeId.apply(ROTATE_Y_270).apply(UV_LOCK))
                                .register(true, true, true, false, true, crossId)
                                .register(true, true, true, true, true, tallCrossId)
                );
    }

    public static VariantsBlockModelDefinitionCreator createDirectionalStairsBlockState(Block block, WeightedVariant straight, WeightedVariant innerLeft, WeightedVariant innerRight, WeightedVariant outerLeft, WeightedVariant outerRight) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straight)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straight.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT,  straight.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT,  straight.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outerRight)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_Y_270))
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outerLeft)
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_Y_180))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, innerRight)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  innerLeft.apply(ROTATE_Y_270))
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  innerLeft.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, innerLeft)
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  innerLeft.apply(ROTATE_Y_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT,  straight.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT,  straight.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT,  straight.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT,  straight.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerRight.apply(ROTATE_X_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerRight.apply(ROTATE_X_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT,  innerLeft.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT,  innerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT, innerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT, innerLeft.apply(ROTATE_X_180).apply(ROTATE_Y_270)));
    }

    public static VariantsBlockModelDefinitionCreator createDirectionalSlabBlockState(Block block, WeightedVariant slab, WeightedVariant topSlab, WeightedVariant doubleBlock) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.SLAB_TYPE)
                                .register(Direction.EAST, SlabType.BOTTOM, slab.apply(ROTATE_Y_270))
                                .register(Direction.EAST, SlabType.DOUBLE, doubleBlock.apply(ROTATE_Y_270))
                                .register(Direction.EAST, SlabType.TOP, topSlab.apply(ROTATE_Y_270))
                                .register(Direction.NORTH, SlabType.BOTTOM, slab.apply(ROTATE_Y_180))
                                .register(Direction.NORTH, SlabType.DOUBLE, doubleBlock.apply(ROTATE_Y_180))
                                .register(Direction.NORTH, SlabType.TOP, topSlab.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, SlabType.BOTTOM, slab)
                                .register(Direction.SOUTH, SlabType.DOUBLE, doubleBlock)
                                .register(Direction.SOUTH, SlabType.TOP, topSlab)
                                .register(Direction.WEST, SlabType.BOTTOM, slab.apply(ROTATE_Y_90))
                                .register(Direction.WEST, SlabType.DOUBLE, doubleBlock.apply(ROTATE_Y_90))
                                .register(Direction.WEST, SlabType.TOP, topSlab.apply(ROTATE_Y_90)));
    }

    public static VariantsBlockModelDefinitionCreator createPillarSlabBlockState(Block block, WeightedVariant slab, WeightedVariant topSlab, WeightedVariant yAxisSlab, WeightedVariant yAxisTopSlab, WeightedVariant doubleBlock) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.FACING, Properties.SLAB_TYPE)
                                .register(Direction.EAST, SlabType.BOTTOM, slab)
                                .register(Direction.EAST, SlabType.DOUBLE, doubleBlock.apply(ROTATE_X_270).apply(ROTATE_Y_90))
                                .register(Direction.EAST, SlabType.TOP, topSlab)
                                .register(Direction.NORTH, SlabType.BOTTOM, slab.apply(ROTATE_Y_270))
                                .register(Direction.NORTH, SlabType.DOUBLE, doubleBlock.apply(ROTATE_X_270))
                                .register(Direction.NORTH, SlabType.TOP, topSlab.apply(ROTATE_Y_270))
                                .register(Direction.SOUTH, SlabType.BOTTOM, slab.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, SlabType.DOUBLE, doubleBlock.apply(ROTATE_X_270))
                                .register(Direction.SOUTH, SlabType.TOP, topSlab.apply(ROTATE_Y_90))
                                .register(Direction.WEST, SlabType.BOTTOM, slab.apply(ROTATE_Y_180))
                                .register(Direction.WEST, SlabType.DOUBLE, doubleBlock.apply(ROTATE_X_270).apply(ROTATE_Y_90))
                                .register(Direction.WEST, SlabType.TOP, topSlab.apply(ROTATE_Y_180))
                                .register(Direction.UP, SlabType.BOTTOM, yAxisSlab)
                                .register(Direction.UP, SlabType.DOUBLE, doubleBlock.apply(ROTATE_Y_180))
                                .register(Direction.UP, SlabType.TOP, yAxisTopSlab)
                                .register(Direction.DOWN, SlabType.BOTTOM, yAxisTopSlab.apply(ROTATE_X_180))
                                .register(Direction.DOWN, SlabType.DOUBLE, doubleBlock.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.DOWN, SlabType.TOP, yAxisSlab.apply(ROTATE_X_180)));
    }

    public static VariantsBlockModelDefinitionCreator createPillarCarpetBlockState(Block block, WeightedVariant carpet) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING)
                                .register(Direction.EAST, carpet.apply(ROTATE_Y_180))
                                .register(Direction.NORTH, carpet.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, carpet.apply(ROTATE_Y_270))
                                .register(Direction.WEST, carpet));
    }

    public static VariantsBlockModelDefinitionCreator createDirectionalBlockState(Block block, WeightedVariant model) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.FACING)
                                .register(Direction.DOWN, model.apply(ROTATE_X_180))
                                .register(Direction.EAST, model.apply(ROTATE_X_90).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, model.apply(ROTATE_X_90))
                                .register(Direction.SOUTH, model.apply(ROTATE_X_90).apply(ROTATE_Y_180))
                                .register(Direction.UP, model)
                                .register(Direction.WEST, model.apply(ROTATE_X_90).apply(ROTATE_Y_270)));
    }

    public static VariantsBlockModelDefinitionCreator createGrimstoneStyleStairsBlockState(Block block, WeightedVariant straight, WeightedVariant straightTop, WeightedVariant inner, WeightedVariant innerTop, WeightedVariant outer, WeightedVariant outerTop) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straight)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, straight.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT,  straight.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT,  straight.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, outer)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outer.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outer.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT,  outer.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outer.apply(ROTATE_Y_270))
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outer.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, outer)
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT,  outer.apply(ROTATE_Y_180))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, inner)
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  inner.apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  inner.apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT,  inner.apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  inner.apply(ROTATE_Y_270))
                                .register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  inner.apply(ROTATE_Y_90))
                                .register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, inner)
                                .register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT,  inner.apply(ROTATE_Y_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT,  straightTop.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT,  straightTop.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT,  straightTop.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT,  straightTop.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT,  outerTop.apply(ROTATE_X_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerTop.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT,  outerTop.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_270))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT,  innerTop.apply(ROTATE_X_180))
                                .register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT,  innerTop.apply(ROTATE_X_180))
                                .register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_180))
                                .register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_90))
                                .register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT,  innerTop.apply(ROTATE_X_180).apply(ROTATE_Y_270)));
    }

    public static VariantsBlockModelDefinitionCreator createPieBlockState(Block block, WeightedVariant full, WeightedVariant oneBite, WeightedVariant twoBites, WeightedVariant threeBites) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(PieBlock.CHOMPS)
                                .register(0, full)
                                .register(1, oneBite)
                                .register(2, twoBites)
                                .register(3, threeBites));
    }

    public static VariantsBlockModelDefinitionCreator createCoconutBlockState(Block block, WeightedVariant identifier, WeightedVariant strippedId, WeightedVariant emptyId, WeightedVariant strippedEmptyId) {
        return VariantsBlockModelDefinitionCreator.of(block).with(BlockStateVariantMap.models(CoconutBlock.HANGING, CoconutBlock.HAS_FIBER, CoconutBlock.HAS_MILK)
                                .register(false, true, true, identifier)
                                .register(true, true, true, identifier.apply(ROTATE_Y_180))
                                .register(false, true, false, emptyId)
                                .register(true, true, false, emptyId.apply(ROTATE_Y_180))
                                .register(false, false, true, strippedId)
                                .register(true, false, true, strippedId.apply(ROTATE_Y_180))
                                .register(false, false, false, strippedEmptyId)
                                .register(true, false, false, strippedEmptyId.apply(ROTATE_Y_180)));
    }

}
