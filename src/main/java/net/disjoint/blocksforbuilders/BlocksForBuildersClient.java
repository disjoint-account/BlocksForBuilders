package net.disjoint.blocksforbuilders;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ColourProviders.registerClient();

        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_SAKURA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.SAKURA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.SAKURA_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GREEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GHOSTWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_RED_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GOLD_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_SPRUCE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_DARK_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_FLOWERING_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_MANGROVE_LEAVES, RenderLayer.getCutout());

        registerTextures();
    }

    private static void registerTextures() {
        {
            Identifier texture = BlocksForBuilders.SAKURA_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GREEN_JUNGLE_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GHOSTWOOD_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
    }
}
