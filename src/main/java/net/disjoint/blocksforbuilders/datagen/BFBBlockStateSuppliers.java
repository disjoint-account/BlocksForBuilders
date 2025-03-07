package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.HedgeBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BFBBlockStateSuppliers {

    public static BlockStateSupplier createHedgeState(Block hedgeBlock, Identifier postId, Identifier singleId, Identifier cornerId, Identifier straightId, Identifier tShapeId, Identifier crossId,
                                                      Identifier tallPostId, Identifier tallSingleId, Identifier tallCornerId, Identifier tallStraightId, Identifier tallTShapeId, Identifier tallCrossId) {
        return VariantsBlockStateSupplier.create(hedgeBlock)
                .coordinate(
                        BlockStateVariantMap.create(HedgeBlock.EAST, HedgeBlock.NORTH, HedgeBlock.SOUTH, HedgeBlock.TALL, HedgeBlock.WEST)
                                .register(false, false, false, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, postId))
                                .register(false, false, false, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallPostId))
                                .register(false, true, false, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, singleId))
                                .register(false, true, false, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallSingleId))
                                .register(true, false, false, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, singleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, false, false, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallSingleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, true, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, singleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, true, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallSingleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, false, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, singleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, false, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallSingleId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, true, false, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, cornerId))
                                .register(true, true, false, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallCornerId))
                                .register(true, false, true, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, cornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, false, true, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallCornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, true, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, cornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, false, true, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallCornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, true, false, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, cornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, true, false, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallCornerId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, true, true, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, straightId))
                                .register(false, true, true, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallStraightId))
                                .register(true, false, false, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, straightId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, false, false, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallStraightId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, true, true, false, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tShapeId))
                                .register(true, true, true, true, false,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallTShapeId))
                                .register(true, false, true, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, false, true, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallTShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R90)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, true, true, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(false, true, true, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallTShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R180)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, true, false, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, true, false, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallTShapeId)
                                                .put(VariantSettings.Y, VariantSettings.Rotation.R270)
                                                .put(VariantSettings.UVLOCK, true))
                                .register(true, true, true, false, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, crossId))
                                .register(true, true, true, true, true,
                                        BlockStateVariant.create().put(VariantSettings.MODEL, tallCrossId))
                );
    }
}
