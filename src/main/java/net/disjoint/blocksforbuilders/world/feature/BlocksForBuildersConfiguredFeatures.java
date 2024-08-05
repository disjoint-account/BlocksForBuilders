package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class BlocksForBuildersConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> GREEN_JUNGLE_KEY = registerKey("green_jungle");
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_OAK_KEY = registerKey("red_oak");
    public static final RegistryKey<ConfiguredFeature<?,?>> RED_OAK_SPAWN_KEY = registerKey("red_oak_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_KEY = registerKey("gold_acacia");
    public static final RegistryKey<ConfiguredFeature<?,?>> GOLD_ACACIA_SPAWN_KEY = registerKey("gold_acacia_spawn");
    public static final RegistryKey<ConfiguredFeature<?,?>> GHOSTWOOD_KEY = registerKey("ghostwood");
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

        register(context, RED_OAK_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.RED_OAK_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.RED_OAK_PLACED_KEY)));

        register(context, GOLD_ACACIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(4, 5, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, GOLD_ACACIA_SPAWN_KEY, Feature.RANDOM_SELECTOR,
                new RandomFeatureConfig(List.of(new RandomFeatureEntry(placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY),
                        0.05f)), placedFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY)));

        register(context, GHOSTWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG),
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

