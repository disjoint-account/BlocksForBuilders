package net.disjoint.blocksforbuilders.world.gen;

import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BlocksForBuildersTreeGeneration {
    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY);

    }
}
