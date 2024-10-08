package net.disjoint.blocksforbuilders.world.biome;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.MusicType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class BFBBiomes {
    public static final RegistryKey<Biome> AUTUMNAL_FOREST = register("autumnal_forest");

    public static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }

        public static void bootstrap(Registerable<Biome> context) {
            context.register(AUTUMNAL_FOREST, autumnalForest(context));
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

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 2, 5));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 5, 1, 4));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.RED_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.ORANGE_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.PUMPKIN_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SWEET_BERRY_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_RED_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_ORANGE_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.SMALL_FALLEN_YELLOW_BIRCH_PLACED_KEY);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_RED_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_ORANGE_OAK_PLACED_KEY);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, BlocksForBuildersPlacedFeatures.LARGE_FALLEN_YELLOW_BIRCH_PLACED_KEY);


        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.8f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .waterFogColor(329011)
                        .skyColor(0x79a6ff)
                        .grassColor(0x79c05a)
                        .foliageColor(0xaea42a)
                        .fogColor(12638463)
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST))
                .build()).build();
    }


}
