package net.disjoint.blocksforbuilders.world.biome;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.attribute.BackgroundMusic;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class BFBBiomes {
    public static final ResourceKey<Biome> AUTUMNAL_FOREST = register("autumnal_forest");
    public static final ResourceKey<Biome> SCORCHED_FOREST = register("scorched_forest");
    public static final ResourceKey<Biome> ALPINE_FOREST = register("alpine_forest");

    public static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }

    public static void bootstrap(BootstrapContext<Biome> context) {
        context.register(AUTUMNAL_FOREST, autumnalForest(context));
        context.register(SCORCHED_FOREST, scorchedForest(context));
        context.register(ALPINE_FOREST, alpineForest(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome autumnalForest(BootstrapContext<Biome> context) {
        net.minecraft.world.level.biome.MobSpawnSettings.Builder spawnBuilder = new net.minecraft.world.level.biome.MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 2, 5));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 5, new MobSpawnSettings.SpawnerData(EntityType.FOX, 1, 4));

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addForestFlowers(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MAPLE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.BEECH_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PUMPKIN_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_PATCH_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_MAPLE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_BEECH_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_MAPLE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_BEECH_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .set(EnvironmentAttributes.BACKGROUND_MUSIC, BackgroundMusic.OVERWORLD)
                .build();


        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .putAttributes(environmentAttributeMap)
                .specialEffects((new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder())
                        .waterColor(0x3f76e4)
                        .grassColorOverride(0x79c05a)
                        .foliageColorOverride(0xaea42a)
                .build()).build();
    }

    public static Biome scorchedForest(BootstrapContext<Biome> context) {
        net.minecraft.world.level.biome.MobSpawnSettings.Builder spawnBuilder = new net.minecraft.world.level.biome.MobSpawnSettings.Builder();

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SCORCHWOOD_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_ASHEN_CARPET_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_ASHEN_CARPET_PLACED_KEY);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .set(EnvironmentAttributes.SKY_COLOR, 0x818181)
                .set(EnvironmentAttributes.FOG_COLOR, 0x7A7A7A)
                .set(EnvironmentAttributes.WATER_FOG_COLOR, 0x7F7F7F)
                .set(EnvironmentAttributes.BACKGROUND_MUSIC, BackgroundMusic.EMPTY)
                .build();

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .putAttributes(environmentAttributeMap)
                .specialEffects((new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder())
                        .waterColor(0xA5A5A5)
                        .grassColorOverride(0x86B783)
                        .foliageColorOverride(0x68A464)
                        .build()).build();
    }

    public static Biome alpineForest(BootstrapContext<Biome> context) {
        net.minecraft.world.level.biome.MobSpawnSettings.Builder spawnBuilder = new net.minecraft.world.level.biome.MobSpawnSettings.Builder();

        BiomeDefaultFeatures.farmAnimals(spawnBuilder);
        spawnBuilder.addSpawn(MobCategory.CREATURE, 8, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 8, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 2, 3));
        spawnBuilder.addSpawn(MobCategory.CREATURE, 8, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 4));

        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE),
                        context.lookup(Registries.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addFerns(biomeBuilder);
        BiomeDefaultFeatures.addMossyStoneBlock(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, BlocksForBuildersPlacedFeatures.COARSE_DIRT_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PINE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MEGA_PINE_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.CEDAR_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MEGA_CEDAR_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_SINGLE_PLACED_KEY);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_MOSS_CARPET_PLACED_KEY);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_MOSS_CARPET_PLACED_KEY);

        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);
        BiomeDefaultFeatures.addGiantTaigaVegetation(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMushrooms(biomeBuilder);
        BiomeDefaultFeatures.addDefaultExtraVegetation(biomeBuilder, true);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .set(EnvironmentAttributes.BACKGROUND_MUSIC, BackgroundMusic.OVERWORLD)
                .build();

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(0.5f)
                .downfall(0.8f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .putAttributes(environmentAttributeMap)
                .specialEffects((new net.minecraft.world.level.biome.BiomeSpecialEffects.Builder())
                        .waterColor(0x3F76E4)
                        .grassColorOverride(0x86B783)
                        .foliageColorOverride(0x68A464)
                        .build()).build();
    }
}
