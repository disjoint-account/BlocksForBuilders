package net.disjoint.blocksforbuilders.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class BFBOverworldRegion extends Region {
    public BFBOverworldRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, BFBBiomes.AUTUMNAL_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.TAIGA, BFBBiomes.SCORCHED_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BFBBiomes.ALPINE_FOREST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BFBBiomes.ALPINE_FOREST);
        });
    }
}