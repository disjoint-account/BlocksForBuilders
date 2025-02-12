package net.disjoint.blocksforbuilders.world.feature;

import com.google.common.collect.ImmutableList;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.PalmTrunkPlacer;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.ScorchwoodTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.PredicatedStateProvider;
import net.minecraft.world.gen.treedecorator.CocoaTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeavesVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> GREEN_JUNGLE_KEY = registerKey("green_jungle");
    public static final RegistryKey<ConfiguredFeature<?,?>> MEGA_GREEN_JUNGLE_KEY = registerKey("mega_green_jungle");
    public static final RegistryKey<ConfiguredFeature<?,?>> MAPLE_KEY = registerKey("maple");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_KEY = registerKey("gold_acacia");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_SPAWN_KEY = registerKey("gold_acacia_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> GHOSTWOOD_KEY = registerKey("ghostwood");
    public static final RegistryKey<ConfiguredFeature<?,?>> SCORCHWOOD_KEY = registerKey("scorchwood");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_KEY = registerKey("willow");
    public static final RegistryKey<ConfiguredFeature<?,?>> WILLOW_SPAWN_KEY = registerKey("willow_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> PALM_KEY = registerKey("palm");
    public static final RegistryKey<ConfiguredFeature<?,?>> PALM_SPAWN_KEY = registerKey("palm_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> BEECH_KEY = registerKey("beech");
    public static final RegistryKey<ConfiguredFeature<?,?>> PINE_KEY = registerKey("pine");
    public static final RegistryKey<ConfiguredFeature<?,?>> MEGA_PINE_KEY = registerKey("mega_pine");
    public static final RegistryKey<ConfiguredFeature<?,?>> CEDAR_KEY = registerKey("cedar");
    public static final RegistryKey<ConfiguredFeature<?,?>> MEGA_CEDAR_KEY = registerKey("mega_cedar");
    public static final RegistryKey<ConfiguredFeature<?,?>> YELLOW_BIRCH_KEY = registerKey("yellow_birch");

    public static final RegistryKey<ConfiguredFeature<?,?>> PUMPKIN_KEY = registerKey("pumpkin");
    public static final RegistryKey<ConfiguredFeature<?,?>> SWEET_BERRY_PATCH_KEY = registerKey("sweet_berry_patch");
    public static final RegistryKey<ConfiguredFeature<?,?>> SWEET_BERRY_SINGLE_KEY = registerKey("sweet_berry_single");

    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_MAPLE_KEY = registerKey("fallen_maple");
    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_BEECH_KEY = registerKey("fallen_beech");
    public static final RegistryKey<ConfiguredFeature<?,?>> FALLEN_YELLOW_BIRCH_KEY = registerKey("fallen_yellow_birch");

    public static final RegistryKey<ConfiguredFeature<?,?>> ASHEN_CARPET_KEY = registerKey("ashen_carpet");

    public static final RegistryKey<ConfiguredFeature<?,?>> COARSE_DIRT_KEY = registerKey("coarse_dirt");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, GREEN_JUNGLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new StraightTrunkPlacer(4, 8, 0),
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new CocoaTreeDecorator(0.2F), TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).build());

        register(context, MEGA_GREEN_JUNGLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG),
                new MegaJungleTrunkPlacer(10, 2, 19),
                BlockStateProvider.of(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES),
                new JungleFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of(TrunkVineTreeDecorator.INSTANCE, new LeavesVineTreeDecorator(0.25F))).build());

        register(context, GOLD_ACACIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(4, 5, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GOLD_ACACIA_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY)));

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

        register(context, PALM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PALM_LOG),
                new PalmTrunkPlacer(4, 4, 4),
                BlockStateProvider.of(BlocksForBuildersBlocks.PALM_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(0, 0, 0)).build());

        register(context, PALM_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY),
                        0.1f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY)));

        register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, BEECH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.BEECH_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.BEECH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, MEGA_PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.of(BlocksForBuildersBlocks.PINE_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2)).build());

        register(context, CEDAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
                new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, MEGA_CEDAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LOG),
                new GiantTrunkPlacer(13, 2, 14),
                BlockStateProvider.of(BlocksForBuildersBlocks.CEDAR_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0), UniformIntProvider.create(13, 17)),
                new TwoLayersFeatureSize(1, 1, 2)).build());

        register(context, PUMPKIN_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,6,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.PUMPKIN)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, SWEET_BERRY_PATCH_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,3,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3))), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, SWEET_BERRY_SINGLE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,0,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, 3))), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, FALLEN_MAPLE_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, FALLEN_BEECH_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, FALLEN_YELLOW_BIRCH_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), Blocks.PODZOL)))));

        register(context, ASHEN_CARPET_KEY, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,4,1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(BlocksForBuildersBlocks.ASHEN_CARPET)), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.noFluid(), BlockPredicate.matchingBlocks(Direction.DOWN.getVector(), BlocksForBuildersBlocks.SCORCHED_GRASS)))));

        register(context, COARSE_DIRT_KEY, Feature.DISK, new DiskFeatureConfig(PredicatedStateProvider.of(Blocks.COARSE_DIRT),
                        BlockPredicate.matchingBlocks(List.of(Blocks.PODZOL, Blocks.DIRT)), UniformIntProvider.create(2, 3), 1));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

