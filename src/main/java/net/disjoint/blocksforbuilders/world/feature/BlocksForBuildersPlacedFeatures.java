package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class BlocksForBuildersPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_OAK_PLACED_KEY = registerKey("red_oak_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_OAK_PLACED_KEY = registerKey("orange_oak_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_BIRCH_PLACED_KEY = registerKey("yellow_birch_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ACACIA_PLACED_KEY = registerKey("gold_acacia_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");

    public static final RegistryKey<PlacedFeature> PUMPKIN_PLACED_KEY = registerKey("pumpkin_placed");
    public static final RegistryKey<PlacedFeature> SWEET_BERRY_PLACED_KEY = registerKey("sweet_berry_placed");

    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_RED_OAK_PLACED_KEY = registerKey("small_fallen_red_oak_placed");
    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_ORANGE_OAK_PLACED_KEY = registerKey("small_fallen_orange_oak_placed");
    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY = registerKey("small_fallen_yellow_birch_placed");

    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_RED_OAK_PLACED_KEY = registerKey("large_fallen_red_oak_placed");
    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_ORANGE_OAK_PLACED_KEY = registerKey("large_fallen_orange_oak_placed");
    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY = registerKey("large_fallen_yellow_birch_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.RED_OAK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.RED_OAK_SAPLING));

        register(context, ORANGE_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.ORANGE_OAK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.ORANGE_OAK_SAPLING));

        register(context, YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.YELLOW_BIRCH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING));

        register(context, GOLD_ACACIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.01f, 1), BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));

        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.25f, 1), BlocksForBuildersBlocks.WILLOW_SAPLING));



        register(context, PUMPKIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.PUMPKIN_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SWEET_BERRY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.SWEET_BERRY_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());



        register(context, SMALL_FALLEN_RED_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_RED_OAK_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));

        register(context, SMALL_FALLEN_ORANGE_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_ORANGE_OAK_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));

        register(context, SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_YELLOW_BIRCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));



        register(context, LARGE_FALLEN_RED_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_RED_OAK_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));

        register(context, LARGE_FALLEN_ORANGE_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_ORANGE_OAK_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));

        register(context, LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_YELLOW_BIRCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));
    }


        public static RegistryKey<PlacedFeature> registerKey(String name) {
            return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
