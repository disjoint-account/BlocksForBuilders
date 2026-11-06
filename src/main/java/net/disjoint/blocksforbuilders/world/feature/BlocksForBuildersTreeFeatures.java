package net.disjoint.blocksforbuilders.world.feature;

import com.google.common.collect.ImmutableList;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.PalmTrunkPlacer;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.ScorchwoodTrunkPlacer;
import net.disjoint.blocksforbuilders.world.feature.tree.decorators.CoconutTreeDecorator;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BlockStateProviders;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersTreeFeatures {
    public static final ResourceKey<Feature> GREEN_JUNGLE_KEY = createKey("green_jungle");
    public static final ResourceKey<Feature> MEGA_GREEN_JUNGLE_KEY = createKey("mega_green_jungle");
    public static final ResourceKey<Feature> MAPLE_KEY = createKey("maple");
    public static final ResourceKey<Feature> GOLD_ACACIA_KEY = createKey("gold_acacia");
    public static final ResourceKey<Feature> GHOSTWOOD_KEY = createKey("ghostwood");
    public static final ResourceKey<Feature> SCORCHWOOD_KEY = createKey("scorchwood");
    public static final ResourceKey<Feature> WILLOW_KEY = createKey("willow");
    public static final ResourceKey<Feature> PALM_KEY = createKey("palm");
    public static final ResourceKey<Feature> BEECH_KEY = createKey("beech");
    public static final ResourceKey<Feature> PINE_KEY = createKey("pine");
    public static final ResourceKey<Feature> MEGA_PINE_KEY = createKey("mega_pine");
    public static final ResourceKey<Feature> CEDAR_KEY = createKey("cedar");
    public static final ResourceKey<Feature> MEGA_CEDAR_KEY = createKey("mega_cedar");
    public static final ResourceKey<Feature> POPLAR_KEY = createKey("poplar");

    public static void bootstrap(final BootstrapContext<Feature> context) {
        HolderGetter<BlockStateProvider> blockStateProviders = context.lookup(Registries.BLOCK_STATE_PROVIDER);
        Holder<BlockStateProvider> belowTrunkProvider = blockStateProviders.getOrThrow(BlockStateProviders.SOIL_BENEATH_TREE);

        context.register(GREEN_JUNGLE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new StraightTrunkPlacer(4, 8, 0),
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider)
                .decorators(ImmutableList.of(new CocoaDecorator(0.2F), TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.25F))).build());

        context.register(MEGA_GREEN_JUNGLE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2),
                belowTrunkProvider)
                .decorators(ImmutableList.of(TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.25F))).build());

        context.register(GOLD_ACACIA_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(4, 5, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        context.register(POPLAR_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.POPLAR_LOG),
                new StraightTrunkPlacer(4, 4, 3),
                BlockStateProvider.of(Blocks.YELLOW_POPLAR_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        context.register(WILLOW_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.WILLOW_LOG),
                new ForkingTrunkPlacer(4, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.WILLOW_LEAVES),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(1), ConstantInt.of(4), 0.0f, 0.0f, 1.0f, 0.75f),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        context.register(GHOSTWOOD_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        Holder<BlockStateProvider> scorchedGrass = blockStateProviders.getOrThrow(BFBBlockStateProviders.SCORCHED_GRASS_BENEATH_TREE);

        context.register(SCORCHWOOD_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.SCORCHWOOD_LOG),
                new ScorchwoodTrunkPlacer(7, 2, 0),
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                new TwoLayersFeatureSize(0, 0, 0),
                belowTrunkProvider)
                .decorators(List.of(new AlterGroundDecorator(scorchedGrass))).build());

        context.register(PALM_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PALM_LOG),
                new PalmTrunkPlacer(4, 4, 4),
                BlockStateProvider.of(BlocksForBuildersBlocks.PALM_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0)),
                new TwoLayersFeatureSize(0, 0, 0),
                BlockStateProvider.holderOf(Blocks.SAND)).decorators(List.of(new CoconutTreeDecorator(1.0f))).build());

        context.register(MAPLE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(Blocks.RED_POPLAR_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        context.register(BEECH_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.BEECH_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(Blocks.ORANGE_POPLAR_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider).build());

        context.register(PINE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LEAVES),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2),
                belowTrunkProvider).build());

        context.register(MEGA_PINE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LEAVES),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2),
                belowTrunkProvider).build());

        context.register(CEDAR_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2),
                belowTrunkProvider).build());

        context.register(MEGA_CEDAR_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2),
                belowTrunkProvider).build());
    }

    public static ResourceKey<Feature> createKey(final String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }
}
