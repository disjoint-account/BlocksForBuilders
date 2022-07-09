package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersConfiguredFeatures {


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SAKURA_TREE =
            ConfiguredFeatures.register("sakura_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlocksForBuilders.SAKURA_LOG),
                    new StraightTrunkPlacer(4, 2, 2),
                    BlockStateProvider.of(BlocksForBuilders.SAKURA_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GREEN_JUNGLE_TREE =
            ConfiguredFeatures.register("green_jungle_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlocksForBuilders.GREEN_JUNGLE_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(BlocksForBuilders.GREEN_JUNGLE_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GOLD_ACACIA_TREE =
            ConfiguredFeatures.register("gold_acacia_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.ACACIA_LOG),
                    new ForkingTrunkPlacer(4, 5, 2),
                    BlockStateProvider.of(BlocksForBuilders.GOLD_ACACIA_LEAVES),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> RED_OAK_TREE =
            ConfiguredFeatures.register("red_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(Blocks.OAK_LOG),
                    new StraightTrunkPlacer(4, 2, 2),
                    BlockStateProvider.of(BlocksForBuilders.RED_OAK_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> GHOSTWOOD_TREE =
            ConfiguredFeatures.register("ghostwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(BlocksForBuilders.GHOSTWOOD_LOG),
                    new StraightTrunkPlacer(4, 2, 2),
                    BlockStateProvider.of(BlocksForBuilders.GHOSTWOOD_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build());

    public static final RegistryEntry<PlacedFeature> SAKURA_CHECKED =
            PlacedFeatures.register("sakura_checked", SAKURA_TREE,
                    PlacedFeatures.wouldSurvive(BlocksForBuilders.SAKURA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SAKURA_SPAWN =
            ConfiguredFeatures.register("sakura_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SAKURA_CHECKED, 0.5f)),
                            SAKURA_CHECKED));
    public static final RegistryEntry<PlacedFeature> GOLD_ACACIA_CHECKED =
            PlacedFeatures.register("gold_acacia_checked", GOLD_ACACIA_TREE,
                    PlacedFeatures.wouldSurvive(BlocksForBuilders.GOLD_ACACIA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> GOLD_ACACIA_SPAWN =
            ConfiguredFeatures.register("gold_acacia_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(GOLD_ACACIA_CHECKED, 0.5f)),
                            GOLD_ACACIA_CHECKED));

    public static final RegistryEntry<PlacedFeature> RED_OAK_CHECKED =
            PlacedFeatures.register("red_oak_checked", RED_OAK_TREE,
                    PlacedFeatures.wouldSurvive(BlocksForBuilders.RED_OAK_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> RED_OAK_SPAWN =
            ConfiguredFeatures.register("red_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(RED_OAK_CHECKED, 0.5f)),
                            RED_OAK_CHECKED));
    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BlocksForBuilders.MOD_ID);
    }
}
