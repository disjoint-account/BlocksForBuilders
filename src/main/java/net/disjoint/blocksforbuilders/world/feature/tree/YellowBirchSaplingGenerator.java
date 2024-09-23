package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class YellowBirchSaplingGenerator {
    public static final SaplingGenerator YELLOW_BIRCH = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":yellow_birch",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.YELLOW_BIRCH_KEY), Optional.empty());
}
