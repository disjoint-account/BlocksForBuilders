package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.ScorchwoodTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> GREEN_JUNGLE_KEY = registerKey("green_jungle");
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_OAK_KEY = registerKey("red_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_KEY = registerKey("gold_acacia");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_SPAWN_KEY = registerKey("gold_acacia_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> GHOSTWOOD_KEY = registerKey("ghostwood");
    public static final RegistryKey<ConfiguredFeature<?,?>> SCORCHWOOD_KEY = registerKey("scorchwood");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("willow");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_SPAWN_KEY = registerKey("willow_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> ORANGE_OAK_KEY = registerKey("orange_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> YELLOW_BIRCH_KEY = registerKey("yellow_birch");

    public static final RegistryKey<ConfiguredFeature<?,?>> PUMPKIN_KEY = registerKey("pumpkin");
    public static final RegistryKey<ConfiguredFeature<?,?>> SWEET_BERRY_KEY = registerKey("sweet_berry");

    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_RED_OAK_KEY = registerKey("fallen_red_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_ORANGE_OAK_KEY = registerKey("fallen_orange_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_YELLOW_BIRCH_KEY = registerKey("fallen_yellow_birch");

    public static final RegistryKey<ConfiguredFeature<?,?>> ASHEN_CARPET_KEY = registerKey("ashen_carpet");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, GREEN_JUNGLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, RED_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.RED_OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GOLD_ACACIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(4, 5, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GOLD_ACACIA_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY)));

        register(context, ORANGE_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, YELLOW_BIRCH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.BIRCH_LOG),
                new StraightTrunkPlacer(4, 4, 3),
                BlockStateProvider.of(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, WILLOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.WILLOW_LOG),
                new ForkingTrunkPlacer(4, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.WILLOW_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), ConstantIntProvider.create(4), 0.0f, 0.0f, 1.0f, 0.75f),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, WILLOW_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY)));

        register(context, GHOSTWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, SCORCHWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.SCORCHWOOD_LOG),
                new ScorchwoodTrunkPlacer(7, 2, 0),
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), 0),
                new TwoLayersFeatureSize(0, 0, 0))
                .dirtProvider(BlockStateProvider.of(BlocksForBuildersBlocks.SCORCHED_GRASS)).forceDirt().build());

        register(context, PUMPKIN_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,6,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.PUMPKIN)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, SWEET_BERRY_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,3,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.SWEET_BERRY_BUSH)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));



        register(context, FALLEN_RED_OAK_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, FALLEN_ORANGE_OAK_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, FALLEN_YELLOW_BIRCH_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));


        register(context, ASHEN_CARPET_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.ASHEN_CARPET)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), BlocksForBuildersBlocks.SCORCHED_GRASS)))));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

