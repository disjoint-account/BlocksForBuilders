package net.disjoint.blocksforbuilders.world.gen;

import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BlocksForBuildersTreeGeneration {
    public static void generateTrees() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY);

    }
}
