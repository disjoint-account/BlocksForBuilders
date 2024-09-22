package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class BlocksForBuildersPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_OAK_PLACED_KEY = registerKey("red_oak_placed");
    public static final RegistryKey<PlacedFeature> GOLD_ACACIA_PLACED_KEY = registerKey("gold_acacia_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_OAK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.RED_OAK_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.05f, 1), BlocksForBuildersBlocks.RED_OAK_SAPLING));

        register(context, GOLD_ACACIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.GOLD_ACACIA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.01f, 1), BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));

        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.005f, 1), BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));
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
