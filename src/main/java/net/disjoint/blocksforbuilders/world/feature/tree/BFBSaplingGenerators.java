package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersTreeFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class BFBSaplingGenerators {

    public static final TreeGrower WILLOW = new TreeGrower(BlocksForBuilders.MOD_ID + ":willow",
            WeightedList.of(BlocksForBuildersTreeFeatures.WILLOW_KEY), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.WILLOW_KEY);

    public static final TreeGrower PALM = new TreeGrower(BlocksForBuilders.MOD_ID + ":palm",
            WeightedList.of(BlocksForBuildersTreeFeatures.PALM_KEY), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.PALM_KEY);

    public static final TreeGrower GHOSTWOOD = new TreeGrower(BlocksForBuilders.MOD_ID + ":ghostwood",
            WeightedList.of(BlocksForBuildersTreeFeatures.GHOSTWOOD_KEY), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.GHOSTWOOD_KEY);

    public static final TreeGrower SCORCHWOOD = new TreeGrower(BlocksForBuilders.MOD_ID + ":scorchwood",
            WeightedList.of(BlocksForBuildersTreeFeatures.SCORCHWOOD_KEY), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.SCORCHWOOD_KEY);

    public static final TreeGrower GREEN_JUNGLE = new TreeGrower(BlocksForBuilders.MOD_ID + ":green_jungle",
            WeightedList.of(BlocksForBuildersTreeFeatures.GREEN_JUNGLE_KEY), WeightedList.of(BlocksForBuildersTreeFeatures.MEGA_GREEN_JUNGLE_KEY), WeightedList.of(), BlocksForBuildersTreeFeatures.GREEN_JUNGLE_KEY);

    public static final TreeGrower MAPLE = new TreeGrower(BlocksForBuilders.MOD_ID + ":maple",
            WeightedList.of(TreeFeatures.RED_POPLAR), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.MAPLE_KEY);

    public static final TreeGrower BEECH = new TreeGrower(BlocksForBuilders.MOD_ID + ":beech",
            WeightedList.of(TreeFeatures.ORANGE_POPLAR), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.BEECH_KEY);

    public static final TreeGrower PINE = new TreeGrower(BlocksForBuilders.MOD_ID + ":pine",
            WeightedList.of(BlocksForBuildersTreeFeatures.PINE_KEY), WeightedList.of(BlocksForBuildersTreeFeatures.MEGA_PINE_KEY), WeightedList.of(), BlocksForBuildersTreeFeatures.PINE_KEY);

    public static final TreeGrower CEDAR = new TreeGrower(BlocksForBuilders.MOD_ID + ":cedar",
            WeightedList.of(BlocksForBuildersTreeFeatures.CEDAR_KEY), WeightedList.of(BlocksForBuildersTreeFeatures.MEGA_CEDAR_KEY), WeightedList.of(), BlocksForBuildersTreeFeatures.CEDAR_KEY);

    public static final TreeGrower GOLD_ACACIA = new TreeGrower(BlocksForBuilders.MOD_ID + ":gold_acacia",
            WeightedList.of(BlocksForBuildersTreeFeatures.GOLD_ACACIA_KEY), WeightedList.of(), WeightedList.of(), BlocksForBuildersTreeFeatures.GOLD_ACACIA_KEY);

    public static final TreeGrower YELLOW_POPLAR = new TreeGrower(BlocksForBuilders.MOD_ID + ":poplar",
            WeightedList.of(TreeFeatures.YELLOW_POPLAR), WeightedList.of(), WeightedList.of(), TreeFeatures.YELLOW_POPLAR);
}
