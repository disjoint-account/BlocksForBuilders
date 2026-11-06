package net.disjoint.blocksforbuilders.world.gen;

import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BlocksForBuildersBiomeModifiers {
    public static void modifyBiomes() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.WINDSWEPT_SAVANNA),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.GOLD_ACACIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.RIVER),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.WILLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.BEACH),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PALM_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_BEECH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_BEECH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_POPLAR_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_POPLAR_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PUMPKIN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST),
                GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_PATCH_PLACED_KEY);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(Biomes.DAPPLED_FOREST), MobCategory.CREATURE, EntityTypes.WOLF, 5, 2, 5);
    }
}
