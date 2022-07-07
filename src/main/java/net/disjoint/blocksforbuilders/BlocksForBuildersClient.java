package net.disjoint.blocksforbuilders;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GOLD_ACACIA_SAPLING, RenderLayer.getCutout());

        registerTextures();
    }

    private static void registerTextures() {
        Identifier texture = BlocksForBuilders.GHOSTWOOD_SIGN.getTexture();
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
    }
}
