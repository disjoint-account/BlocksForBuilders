package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityModelLayers;
import net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle;
import net.disjoint.blocksforbuilders.util.particles.BFBParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.client.color.block.BlockTintSources;

import java.util.List;

public class BlocksForBuildersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BFBEntityModelLayers.registerEntityModelLayers();

        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.GHOSTWOOD_LEAVES, BFBLeavesParticle.GhostwoodLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.GREEN_JUNGLE_LEAVES, BFBLeavesParticle.GreenJungleLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.WILLOW_LEAVES, BFBLeavesParticle.WillowLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.PALM_LEAVES, BFBLeavesParticle.PalmLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.MAPLE_LEAVES, BFBLeavesParticle.MapleLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.BEECH_LEAVES, BFBLeavesParticle.BeechLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.PINE_LEAVES, BFBLeavesParticle.PineLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.CEDAR_LEAVES, BFBLeavesParticle.CedarLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.GOLD_ACACIA_LEAVES, BFBLeavesParticle.GoldAcaciaLeavesFactory::new);
        ParticleProviderRegistry.getInstance().register(BFBParticleTypes.YELLOW_BIRCH_LEAVES, BFBLeavesParticle.YellowBirchLeavesFactory::new);

        BlockColorRegistry.register(List.of(BlockTintSources.foliage()),
                BlocksForBuildersBlocks.FALLEN_OAK_LEAVES,
                BlocksForBuildersBlocks.OAK_HEDGE,
                BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES,
                BlocksForBuildersBlocks.JUNGLE_HEDGE,
                BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES,
                BlocksForBuildersBlocks.DARK_OAK_HEDGE,
                BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES,
                BlocksForBuildersBlocks.ACACIA_HEDGE,
                BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES,
                BlocksForBuildersBlocks.MANGROVE_HEDGE
        );
        BlockColorRegistry.register(List.of(BlockTintSources.constant(-8345771)), BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, BlocksForBuildersBlocks.BIRCH_HEDGE);
        BlockColorRegistry.register(List.of(BlockTintSources.constant(-10380959)), BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, BlocksForBuildersBlocks.SPRUCE_HEDGE);
    }
}

