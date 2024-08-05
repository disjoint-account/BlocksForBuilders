package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class GhostwoodSaplingGenerator {
    public static final SaplingGenerator GHOSTWOOD = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":ghostwood",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.GHOSTWOOD_KEY), Optional.empty());
}