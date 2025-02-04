package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class BFBSaplingGenerators {

    public static final SaplingGenerator WILLOW = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":willow",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.WILLOW_KEY), Optional.empty());
    public static final SaplingGenerator PALM = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":palm",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.PALM_KEY), Optional.empty());
    public static final SaplingGenerator GHOSTWOOD = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":ghostwood",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.GHOSTWOOD_KEY), Optional.empty());
    public static final SaplingGenerator SCORCHWOOD = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":scorchwood",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.SCORCHWOOD_KEY), Optional.empty());
    public static final SaplingGenerator GREEN_JUNGLE = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":green_jungle",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.GREEN_JUNGLE_KEY), Optional.empty());
    public static final SaplingGenerator MAPLE = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":maple",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator ORANGE_OAK = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":orange_oak",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.ORANGE_OAK_KEY), Optional.empty());
    public static final SaplingGenerator GOLD_ACACIA = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":gold_acacia",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_KEY), Optional.empty());
    public static final SaplingGenerator YELLOW_BIRCH = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":yellow_birch",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.YELLOW_BIRCH_KEY), Optional.empty());
}
