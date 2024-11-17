package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ScorchwoodSaplingGenerator {
    public static final SaplingGenerator SCORCHWOOD = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":scorchwood",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.SCORCHWOOD_KEY), Optional.empty());
}