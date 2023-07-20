package net.disjoint.blocksforbuilders;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.disjoint.blocksforbuilders.signstuff.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.util.Identifier;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GREEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.POTTED_GREEN_JUNGLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GREEN_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GHOSTWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.POTTED_GHOSTWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_RED_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.POTTED_RED_OAK_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_GOLD_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.POTTED_GOLD_ACACIA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_BIRCH_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_SPRUCE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_JUNGLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_DARK_OAK_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_ACACIA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_FLOWERING_AZALEA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.FALLEN_MANGROVE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BlocksForBuilders.PAPER_LANTERN, RenderLayer.getCutout());

        registerTextures();

        TerraformBoatClientHelper.registerModelLayers(BlocksForBuilders.id("green_jungle"), false);
        TerraformBoatClientHelper.registerModelLayers(BlocksForBuilders.id("ghostwood"), false);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, BlocksForBuilders.FALLEN_OAK_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuilders.FALLEN_OAK_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getBirchColor();
            }
            return FoliageColors.getBirchColor();
        }, BlocksForBuilders.FALLEN_BIRCH_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getBirchColor(), BlocksForBuilders.FALLEN_BIRCH_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getSpruceColor();
            }
            return FoliageColors.getSpruceColor();
        }, BlocksForBuilders.FALLEN_SPRUCE_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getSpruceColor(), BlocksForBuilders.FALLEN_SPRUCE_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, BlocksForBuilders.FALLEN_JUNGLE_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuilders.FALLEN_JUNGLE_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, BlocksForBuilders.FALLEN_DARK_OAK_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuilders.FALLEN_DARK_OAK_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, BlocksForBuilders.FALLEN_ACACIA_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuilders.FALLEN_ACACIA_LEAVES);
    }
    {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.getDefaultColor();
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, BlocksForBuilders.FALLEN_MANGROVE_LEAVES);

        ColorProviderRegistry.ITEM.register((stack, layer) -> FoliageColors.getDefaultColor(), BlocksForBuilders.FALLEN_MANGROVE_LEAVES);
    }

    private static void registerTextures() {
        }

        {
            Identifier texture = BlocksForBuilders.GREEN_JUNGLE_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GHOSTWOOD_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GREEN_JUNGLE_HANGING_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GHOSTWOOD_HANGING_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GREEN_JUNGLE_HANGING_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
        {
            Identifier texture = BlocksForBuilders.GHOSTWOOD_HANGING_SIGN.getTexture();
            SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, texture));
        }
    }

