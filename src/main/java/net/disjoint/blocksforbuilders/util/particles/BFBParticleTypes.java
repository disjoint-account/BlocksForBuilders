package net.disjoint.blocksforbuilders.util.particles;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;

public class BFBParticleTypes {
    public static final SimpleParticleType GHOSTWOOD_LEAVES = register("ghostwood_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType GREEN_JUNGLE_LEAVES = register("green_jungle_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType WILLOW_LEAVES = register("willow_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType PALM_LEAVES = register("palm_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType MAPLE_LEAVES = register("maple_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType BEECH_LEAVES = register("beech_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType PINE_LEAVES = register("pine_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType CEDAR_LEAVES = register("cedar_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType GOLD_ACACIA_LEAVES = register("gold_acacia_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType YELLOW_BIRCH_LEAVES = register("yellow_birch_leaves", FabricParticleTypes.simple());

    private static SimpleParticleType register(String name, SimpleParticleType particleType) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        BlocksForBuilders.LOGGER.info("Registering Particles for " + BlocksForBuilders.MOD_ID);
    }
}
