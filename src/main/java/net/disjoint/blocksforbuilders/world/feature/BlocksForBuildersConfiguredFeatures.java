package net.disjoint.blocksforbuilders.world.feature;

import com.google.common.collect.ImmutableList;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.PalmTrunkPlacer;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.ScorchwoodTrunkPlacer;
import net.disjoint.blocksforbuilders.world.feature.tree.decorators.CoconutTreeDecorator;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.RandomOffsetPlacement;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraft.resources.Identifier;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.MegaJungleTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> SCORCHWOOD_SAPLING_KEY = registerKey("scorchwood_sapling");

    public static final ResourceKey<ConfiguredFeature<?,?>> GREEN_JUNGLE_KEY = registerKey("green_jungle");
    public static final ResourceKey<ConfiguredFeature<?,?>> MEGA_GREEN_JUNGLE_KEY = registerKey("mega_green_jungle");
    public static final ResourceKey<ConfiguredFeature<?,?>> MAPLE_KEY = registerKey("maple");
    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ACACIA_KEY = registerKey("gold_acacia");
    public static final ResourceKey<ConfiguredFeature<?,?>> GOLD_ACACIA_SPAWN_KEY = registerKey("gold_acacia_spawn");
    public static final ResourceKey<ConfiguredFeature<?,?>> GHOSTWOOD_KEY = registerKey("ghostwood");
    public static final ResourceKey<ConfiguredFeature<?,?>> SCORCHWOOD_KEY = registerKey("scorchwood");
    public static final ResourceKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("willow");
    public static final ResourceKey<ConfiguredFeature<?,?>> WILLOW_SPAWN_KEY = registerKey("willow_spawn");
    public static final ResourceKey<ConfiguredFeature<?,?>> PALM_KEY = registerKey("palm");
    public static final ResourceKey<ConfiguredFeature<?,?>> PALM_SPAWN_KEY = registerKey("palm_spawn");
    public static final ResourceKey<ConfiguredFeature<?,?>> BEECH_KEY = registerKey("beech");
    public static final ResourceKey<ConfiguredFeature<?,?>> PINE_KEY = registerKey("pine");
    public static final ResourceKey<ConfiguredFeature<?,?>> MEGA_PINE_KEY = registerKey("mega_pine");
    public static final ResourceKey<ConfiguredFeature<?,?>> CEDAR_KEY = registerKey("cedar");
    public static final ResourceKey<ConfiguredFeature<?,?>> MEGA_CEDAR_KEY = registerKey("mega_cedar");
    public static final ResourceKey<ConfiguredFeature<?,?>> YELLOW_BIRCH_KEY = registerKey("yellow_birch");

    public static final ResourceKey<ConfiguredFeature<?,?>> PUMPKIN_KEY = registerKey("pumpkin");
    public static final ResourceKey<ConfiguredFeature<?,?>> SWEET_BERRY_KEY = registerKey("sweet_berry");

    public static final ResourceKey<ConfiguredFeature<?,?>> FALLEN_MAPLE_KEY = registerKey("fallen_maple");
    public static final ResourceKey<ConfiguredFeature<?,?>> FALLEN_BEECH_KEY = registerKey("fallen_beech");
    public static final ResourceKey<ConfiguredFeature<?,?>> FALLEN_YELLOW_BIRCH_KEY = registerKey("fallen_yellow_birch");

    public static final ResourceKey<ConfiguredFeature<?,?>> ASHEN_CARPET_KEY = registerKey("ashen_carpet");

    public static final ResourceKey<ConfiguredFeature<?,?>> MOSS_CARPET_KEY = registerKey("moss_carpet");

    public static final ResourceKey<ConfiguredFeature<?,?>> COARSE_DIRT_KEY = registerKey("coarse_dirt");

    public static final ResourceKey<ConfiguredFeature<?,?>> ORE_ANTIGORITE = registerKey("antigorite");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        RuleTest ruleTest = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        BlockStateProvider belowTrunkProvider = TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(biomes);


        FeatureUtils.register(
                context,
                SCORCHWOOD_SAPLING_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new CompositeFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.SIMPLE_BLOCK,
                                        new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING)),
                                        CountPlacement.of(96),
                                        RandomOffsetPlacement.ofTriangle(7, 3),
                                        BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE), BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), BlocksForBuildersBlocks.SCORCHED_GRASS)))
                                )
                        )
                )
        );

        register(context, GREEN_JUNGLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new StraightTrunkPlacer(4, 8, 0),
                BlockStateProvider.simple(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME)))
                .decorators(ImmutableList.of(new CocoaDecorator(0.2F), TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.25F))).build());

        register(context, MEGA_GREEN_JUNGLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.simple(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 1, 2),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME)))
                .decorators(ImmutableList.of(TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.25F))).build());

        register(context, GOLD_ACACIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(4, 5, 2),
                BlockStateProvider.simple(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, GOLD_ACACIA_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY)));

        register(context, YELLOW_BIRCH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.BIRCH_LOG),
                new StraightTrunkPlacer(4, 4, 3),
                BlockStateProvider.simple(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.WILLOW_LOG),
                new ForkingTrunkPlacer(4, 2, 1),
                BlockStateProvider.simple(BlocksForBuildersBlocks.WILLOW_LEAVES),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(1), ConstantInt.of(4), 0.0f, 0.0f, 1.0f, 0.75f),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, WILLOW_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY)));

        register(context, GHOSTWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.GHOSTWOOD_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.simple(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, SCORCHWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.SCORCHWOOD_LOG),
                new ScorchwoodTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                new TwoLayersFeatureSize(0, 0, 0),
                belowTrunkProvider)
                .belowTrunkProvider(BlockStateProvider.simple(BlocksForBuildersBlocks.SCORCHED_GRASS))
                .decorators(ImmutableList.of(
                new AlterGroundDecorator(RuleBasedStateProvider.ifTrueThenProvide(BlockPredicate.matchesTag(BlockTags.BENEATH_TREE_PODZOL_REPLACEABLE), BlocksForBuildersBlocks.SCORCHED_GRASS)))).build());

        register(context, PALM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.PALM_LOG),
                new PalmTrunkPlacer(4, 4, 4),
                BlockStateProvider.simple(BlocksForBuildersBlocks.PALM_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0)),
                new TwoLayersFeatureSize(0, 0, 0),
                BlockStateProvider.simple(Blocks.SAND)).decorators(List.of(new CoconutTreeDecorator(1.0f))).build());

        register(context, PALM_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY),
                        0.1f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY)));

        register(context, MAPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.simple(BlocksForBuildersBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, BEECH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.BEECH_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.simple(BlocksForBuildersBlocks.BEECH_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.PINE_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.simple(BlocksForBuildersBlocks.PINE_LEAVES),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, MEGA_PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.PINE_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.simple(BlocksForBuildersBlocks.PINE_LEAVES),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.CEDAR_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.simple(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());

        register(context, MEGA_CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(BlocksForBuildersBlocks.CEDAR_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.simple(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2),
                TreeConfiguration.defaultPlaceBelowTreeTrunkProvider(context.lookup(Registries.BIOME))).build());


        register(context, PUMPKIN_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PUMPKIN)));

        register(context, SWEET_BERRY_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));

        register(context, FALLEN_MAPLE_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES)));

        register(context, FALLEN_BEECH_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES)));

        register(context, FALLEN_YELLOW_BIRCH_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES)));

        register(context, ASHEN_CARPET_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksForBuildersBlocks.ASHEN_CARPET)));

        register(context, MOSS_CARPET_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.MOSS_CARPET)));

        register(context, COARSE_DIRT_KEY, Feature.DISK, new DiskConfiguration(BlockStateProvider.simple(Blocks.COARSE_DIRT),
                        BlockPredicate.matchesBlocks(List.of(Blocks.PODZOL, Blocks.DIRT)), UniformInt.of(2, 3), 1));

        FeatureUtils.register(context, ORE_ANTIGORITE, Feature.ORE, new OreConfiguration(ruleTest, BlocksForBuildersBlocks.ANTIGORITE.defaultBlockState(), 64));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }


    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(
            final Block oakLog,
            final Block oakLeaves,
            final int baseHeight,
            final int heightRandA,
            final int heightRandB,
            final int blobRadius,
            final BlockStateProvider belowTrunkProvider
    ) {
        return new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(oakLog),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.simple(oakLeaves),
                new BlobFoliagePlacer(ConstantInt.of(blobRadius), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1),
                belowTrunkProvider
        );
    }
}

