package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class GoldAcaciaSaplingGenerator extends SaplingGenerator {


    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_TREE;
    }
}
