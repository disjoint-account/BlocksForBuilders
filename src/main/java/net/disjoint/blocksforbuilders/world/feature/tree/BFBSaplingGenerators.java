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
            Optional.of(BlocksForBuildersConfiguredFeatures.MEGA_GREEN_JUNGLE_KEY), Optional.of(BlocksForBuildersConfiguredFeatures.GREEN_JUNGLE_KEY), Optional.empty());
    public static final SaplingGenerator MAPLE = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":maple",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.MAPLE_KEY), Optional.empty());
    public static final SaplingGenerator BEECH = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":beech",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.BEECH_KEY), Optional.empty());
    public static final SaplingGenerator PINE = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":pine",
            Optional.of(BlocksForBuildersConfiguredFeatures.MEGA_PINE_KEY), Optional.of(BlocksForBuildersConfiguredFeatures.PINE_KEY), Optional.empty());
    public static final SaplingGenerator CEDAR = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":cedar",
            Optional.of(BlocksForBuildersConfiguredFeatures.MEGA_CEDAR_KEY), Optional.of(BlocksForBuildersConfiguredFeatures.CEDAR_KEY), Optional.empty());
    public static final SaplingGenerator GOLD_ACACIA = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":gold_acacia",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_KEY), Optional.empty());
    public static final SaplingGenerator YELLOW_BIRCH = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":yellow_birch",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.YELLOW_BIRCH_KEY), Optional.empty());
}
