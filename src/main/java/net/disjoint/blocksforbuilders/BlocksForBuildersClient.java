package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.disjoint.blocksforbuilders.boatstuff.renderers.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.RaftEntityModel;
import net.minecraft.world.biome.FoliageColors;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(BFBEntityTypes.GHOSTWOOD_BOAT, GhostwoodBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GhostwoodBoatEntityRenderer.GHOSTWOOD_BOAT, BoatEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT, GhostwoodChestBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GhostwoodChestBoatEntityRenderer.GHOSTWOOD_CHEST_BOAT, BoatEntityModel::getChestTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.WILLOW_BOAT, WillowBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(WillowBoatEntityRenderer.WILLOW_BOAT, BoatEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.WILLOW_CHEST_BOAT, WillowChestBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(WillowChestBoatEntityRenderer.WILLOW_CHEST_BOAT, BoatEntityModel::getChestTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.GREEN_JUNGLE_BOAT, GreenJungleBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GreenJungleBoatEntityRenderer.GREEN_JUNGLE_BOAT, BoatEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT, GreenJungleChestBoatEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GreenJungleChestBoatEntityRenderer.GREEN_JUNGLE_CHEST_BOAT, BoatEntityModel::getChestTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.GREEN_BAMBOO_RAFT, GreenBambooRaftEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GreenBambooRaftEntityRenderer.GREEN_BAMBOO_RAFT, RaftEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT, GreenBambooChestRaftEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(GreenBambooChestRaftEntityRenderer.GREEN_BAMBOO_CHEST_RAFT, RaftEntityModel::getChestTexturedModelData);

        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_ORANGE_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, RenderLayer.getCutout());
    }
    static {
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getDefaultColor();
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuildersBlocks.FALLEN_OAK_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getBirchColor();
                }
                return FoliageColors.getBirchColor();
            }, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getBirchColor(), BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getSpruceColor();
                }
                return FoliageColors.getSpruceColor();
            }, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getSpruceColor(), BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getDefaultColor();
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getDefaultColor();
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getDefaultColor();
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.getDefaultColor();
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES);

            ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES);
        }
    }
}

