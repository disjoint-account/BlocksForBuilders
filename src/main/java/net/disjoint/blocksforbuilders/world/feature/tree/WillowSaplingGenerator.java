package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class WillowSaplingGenerator {
    public static final SaplingGenerator WILLOW = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":willow",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.WILLOW_KEY), Optional.empty());
}