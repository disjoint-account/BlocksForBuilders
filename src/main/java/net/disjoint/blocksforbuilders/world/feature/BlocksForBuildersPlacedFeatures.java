package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class BlocksForBuildersPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");
    public static final RegistryKey<PlacedFeature> BEECH_PLACED_KEY = registerKey("beech_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_BIRCH_PLACED_KEY = registerKey("yellow_birch_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ACACIA_PLACED_KEY = registerKey("gold_acacia_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");
    public static final RegistryKey<PlacedFeature> PALM_PLACED_KEY = registerKey("palm_placed");
    public static final RegistryKey<PlacedFeature> SCORCHWOOD_PLACED_KEY = registerKey("scorchwood_placed");
    public static final RegistryKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");
    public static final RegistryKey<PlacedFeature> MEGA_PINE_PLACED_KEY = registerKey("mega_pine_placed");
    public static final RegistryKey<PlacedFeature> CEDAR_PLACED_KEY = registerKey("cedar_placed");
    public static final RegistryKey<PlacedFeature> MEGA_CEDAR_PLACED_KEY = registerKey("mega_cedar_placed");

    public static final RegistryKey<PlacedFeature> PUMPKIN_PLACED_KEY = registerKey("pumpkin_placed");
    public static final RegistryKey<PlacedFeature> SWEET_BERRY_PATCH_PLACED_KEY = registerKey("sweet_berry_patch_placed");
    public static final RegistryKey<PlacedFeature> SWEET_BERRY_SINGLE_PLACED_KEY = registerKey("sweet_berry_single_placed");

    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_MAPLE_PLACED_KEY = registerKey("small_fallen_maple_placed");
    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_BEECH_PLACED_KEY = registerKey("small_fallen_beech_placed");
    public static final RegistryKey<PlacedFeature> SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY = registerKey("small_fallen_yellow_birch_placed");

    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_MAPLE_PLACED_KEY = registerKey("large_fallen_maple_placed");
    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_BEECH_PLACED_KEY = registerKey("large_fallen_beech_placed");
    public static final RegistryKey<PlacedFeature> LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY = registerKey("large_fallen_yellow_birch_placed");

    public static final RegistryKey<PlacedFeature> SMALL_ASHEN_CARPET_PLACED_KEY = registerKey("small_ashen_carpet_placed");
    public static final RegistryKey<PlacedFeature> LARGE_ASHEN_CARPET_PLACED_KEY = registerKey("large_ashen_carpet_placed");

    public static final RegistryKey<PlacedFeature> SMALL_MOSS_CARPET_PLACED_KEY = registerKey("small_moss_carpet_placed");
    public static final RegistryKey<PlacedFeature> LARGE_MOSS_CARPET_PLACED_KEY = registerKey("large_moss_carpet_placed");

    public static final RegistryKey<PlacedFeature> COARSE_DIRT_PLACED_KEY = registerKey("coarse_dirt_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.MAPLE_SAPLING));

        register(context, BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.BEECH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.BEECH_SAPLING));

        register(context, YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.YELLOW_BIRCH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 1), BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING));

        register(context, GOLD_ACACIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.01f, 1), BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));

        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.25f, 1), BlocksForBuildersBlocks.WILLOW_SAPLING));

        register(context, PALM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.PALM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.25f, 1), BlocksForBuildersBlocks.COCONUT));

        register(context, SCORCHWOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.SCORCHWOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(4, 0.5f, 8), BlocksForBuildersBlocks.SCORCHWOOD_SAPLING));

        register(context, PINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.PINE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.PINE_SAPLING));

        register(context, MEGA_PINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.MEGA_PINE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.05f, 1), BlocksForBuildersBlocks.PINE_SAPLING));

        register(context, CEDAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.CEDAR_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.5f, 6), BlocksForBuildersBlocks.CEDAR_SAPLING));

        register(context, MEGA_CEDAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.MEGA_CEDAR_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.05f, 1), BlocksForBuildersBlocks.CEDAR_SAPLING));



        register(context, PUMPKIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.PUMPKIN_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SWEET_BERRY_PATCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.SWEET_BERRY_PATCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, SWEET_BERRY_SINGLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.SWEET_BERRY_SINGLE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());



        register(context, SMALL_FALLEN_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_MAPLE_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));

        register(context, SMALL_FALLEN_BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_BEECH_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));

        register(context, SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_YELLOW_BIRCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));



        register(context, LARGE_FALLEN_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_MAPLE_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));

        register(context, LARGE_FALLEN_BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_BEECH_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));

        register(context, LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.FALLEN_YELLOW_BIRCH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));



        register(context, SMALL_ASHEN_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.ASHEN_CARPET_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));
        register(context, LARGE_ASHEN_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.ASHEN_CARPET_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));



        register(context, SMALL_MOSS_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.MOSS_CARPET_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 4));
        register(context, LARGE_MOSS_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.MOSS_CARPET_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.5f, 8));



        register(context, COARSE_DIRT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.COARSE_DIRT_KEY),
                RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of(), PlacedFeatures.createCountExtraModifier(1, 0.2f, 2));
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
