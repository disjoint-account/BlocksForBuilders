package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityModelLayers;
import net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle;
import net.disjoint.blocksforbuilders.util.particles.BFBParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.world.biome.FoliageColors;

public class BlocksForBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BFBEntityModelLayers.registerEntityModelLayers();

        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GHOSTWOOD_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.WILLOW_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.WILLOW_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.WILLOW_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.WILLOW_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PALM_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PALM_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PALM_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.MAPLE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.BEECH_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.BEECH_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.BEECH_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.BEECH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_BEECH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PINE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PINE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_PINE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.CEDAR_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.CEDAR_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.CEDAR_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.CEDAR_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_CEDAR_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.OAK_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.BIRCH_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.SPRUCE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.JUNGLE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.DARK_OAK_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.ACACIA_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.AZALEA_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.MANGROVE_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.CHERRY_HEDGE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(BlocksForBuildersBlocks.PALE_OAK_HEDGE, BlockRenderLayer.CUTOUT);

        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.GHOSTWOOD_LEAVES, BFBLeavesParticle.GhostwoodLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.GREEN_JUNGLE_LEAVES, BFBLeavesParticle.GreenJungleLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.WILLOW_LEAVES, BFBLeavesParticle.WillowLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.PALM_LEAVES, BFBLeavesParticle.PalmLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.MAPLE_LEAVES, BFBLeavesParticle.MapleLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.BEECH_LEAVES, BFBLeavesParticle.BeechLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.PINE_LEAVES, BFBLeavesParticle.PineLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.CEDAR_LEAVES, BFBLeavesParticle.CedarLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.GOLD_ACACIA_LEAVES, BFBLeavesParticle.GoldAcaciaLeavesFactory::new);
        ParticleFactoryRegistry.getInstance().register(BFBParticleTypes.YELLOW_BIRCH_LEAVES, BFBLeavesParticle.YellowBirchLeavesFactory::new);
    }

    static {
        registerStandardTintable(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES);
        registerStandardTintable(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES);
        registerStandardTintable(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES);
        registerStandardTintable(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES);
        registerStandardTintable(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES);

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

        registerStandardTintable(BlocksForBuildersBlocks.OAK_HEDGE);
        registerStandardTintable(BlocksForBuildersBlocks.JUNGLE_HEDGE);
        registerStandardTintable(BlocksForBuildersBlocks.DARK_OAK_HEDGE);
        registerStandardTintable(BlocksForBuildersBlocks.ACACIA_HEDGE);
        registerStandardTintable(BlocksForBuildersBlocks.MANGROVE_HEDGE);

        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.BIRCH;
                }
                return FoliageColors.BIRCH;
            }, BlocksForBuildersBlocks.BIRCH_HEDGE);
        }
        {
            ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
                if (world == null || pos == null) {
                    return FoliageColors.SPRUCE;
                }
                return FoliageColors.SPRUCE;
            }, BlocksForBuildersBlocks.SPRUCE_HEDGE);
        }
    }
    private static void registerStandardTintable(Block block) {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return FoliageColors.DEFAULT;
            }
            return BiomeColors.getFoliageColor(world, pos);
        }, block);
    }
}

