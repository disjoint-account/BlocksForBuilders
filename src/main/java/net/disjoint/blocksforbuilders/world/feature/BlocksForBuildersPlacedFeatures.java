package net.disjoint.blocksforbuilders.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class BlocksForBuildersPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> RED_OAK_PLACED = PlacedFeatures.register("red_oak_placed",
            BlocksForBuildersConfiguredFeatures.RED_OAK_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.05f, 1)));


}
