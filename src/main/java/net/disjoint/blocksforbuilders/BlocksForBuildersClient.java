package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.FoliageColors;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BFBEntityModelLayers.registerEntityModelLayers();

        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.WILLOW_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.PALM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.PALM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.MAPLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.BEECH_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.BEECH_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.BEECH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_BEECH_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_PINE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.CEDAR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.CEDAR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.CEDAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_CEDAR_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
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
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, RenderLayer.getCutout());
    }
    static {
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.DEFAULT;
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.BIRCH;
                }
                return FoliageColors.BIRCH;
            }, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.SPRUCE;
                }
                return FoliageColors.SPRUCE;
            }, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.DEFAULT;
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.DEFAULT;
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.DEFAULT;
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.DEFAULT;
                }
                return BiomeColors.getFoliageColor(world, pos);
            }, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES);
        }
    }
}

