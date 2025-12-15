package net.disjoint.blocksforbuilders.world.biome;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.attribute.BackgroundMusic;
import net.minecraft.world.attribute.EnvironmentAttributeMap;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class BFBBiomes {
    public static final RegistryKey<Biome> AUTUMNAL_FOREST = register("autumnal_forest");
    public static final RegistryKey<Biome> SCORCHED_FOREST = register("scorched_forest");
    public static final RegistryKey<Biome> ALPINE_FOREST = register("alpine_forest");

    public static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }

    public static void bootstrap(Registerable<Biome> context) {
        context.register(AUTUMNAL_FOREST, autumnalForest(context));
        context.register(SCORCHED_FOREST, scorchedForest(context));
        context.register(ALPINE_FOREST, alpineForest(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome autumnalForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.WOLF, 2, 5));
        spawnBuilder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.FOX, 1, 4));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addCaveAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MAPLE_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.BEECH_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PUMPKIN_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_PATCH_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_MAPLE_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_BEECH_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_MAPLE_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_BEECH_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .with(EnvironmentAttributes.BACKGROUND_MUSIC_AUDIO, BackgroundMusic.DEFAULT)
                .build();


        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .addEnvironmentAttributes(environmentAttributeMap)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .grassColor(0x79c05a)
                        .foliageColor(0xaea42a)
                .build()).build();
    }

    public static Biome scorchedForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addCaveAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SCORCHWOOD_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_ASHEN_CARPET_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_ASHEN_CARPET_PLACED_KEY);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .with(EnvironmentAttributes.SKY_COLOR_VISUAL, 0x818181)
                .with(EnvironmentAttributes.FOG_COLOR_VISUAL, 0x7A7A7A)
                .with(EnvironmentAttributes.WATER_FOG_COLOR_VISUAL, 0x7F7F7F)
                .with(EnvironmentAttributes.BACKGROUND_MUSIC_AUDIO, BackgroundMusic.EMPTY)
                .build();

        return new Biome.Builder()
                .precipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .addEnvironmentAttributes(environmentAttributeMap)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0xA5A5A5)
                        .grassColor(0x86B783)
                        .foliageColor(0x68A464)
                        .build()).build();
    }

    public static Biome alpineForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        spawnBuilder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        spawnBuilder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        spawnBuilder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));

        DefaultBiomeFeatures.addCaveAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.LOCAL_MODIFICATIONS, BlocksForBuildersPlacedFeatures.COARSE_DIRT_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PINE_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MEGA_PINE_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.CEDAR_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.MEGA_CEDAR_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_SINGLE_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_MOSS_CARPET_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_MOSS_CARPET_PLACED_KEY);

        DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);
        DefaultBiomeFeatures.addGiantTaigaGrass(biomeBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder, true);

        EnvironmentAttributeMap environmentAttributeMap = EnvironmentAttributeMap.builder()
                .with(EnvironmentAttributes.BACKGROUND_MUSIC_AUDIO, BackgroundMusic.DEFAULT)
                .build();

        return new Biome.Builder()
                .precipitation(true)
                .temperature(0.5f)
                .downfall(0.8f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .addEnvironmentAttributes(environmentAttributeMap)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3F76E4)
                        .grassColor(0x86B783)
                        .foliageColor(0x68A464)
                        .build()).build();
    }
}
