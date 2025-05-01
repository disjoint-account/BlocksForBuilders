package net.disjoint.blocksforbuilders.util;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.function.Function;

public class BFBParticleTypes {
    public static final BFBSimpleParticleType GHOSTWOOD_LEAVES = register("ghostwood_leaves", false);
    public static final BFBSimpleParticleType GREEN_JUNGLE_LEAVES = register("green_jungle_leaves", false);
    public static final BFBSimpleParticleType WILLOW_LEAVES = register("willow_leaves", false);
    public static final BFBSimpleParticleType PALM_LEAVES = register("palm_leaves", false);
    public static final BFBSimpleParticleType MAPLE_LEAVES = register("maple_leaves", false);
    public static final BFBSimpleParticleType BEECH_LEAVES = register("beech_leaves", false);
    public static final BFBSimpleParticleType PINE_LEAVES = register("pine_leaves", false);
    public static final BFBSimpleParticleType CEDAR_LEAVES = register("cedar_leaves", false);
    public static final BFBSimpleParticleType GOLD_ACACIA_LEAVES = register("gold_acacia_leaves", false);
    public static final BFBSimpleParticleType YELLOW_BIRCH_LEAVES = register("yellow_birch_leaves", false);

    public BFBParticleTypes() {
    }

    private static BFBSimpleParticleType register(String name, boolean alwaysShow) {
        return Registry.register(Registries.PARTICLE_TYPE, name, new BFBSimpleParticleType(alwaysShow));
    }
}
