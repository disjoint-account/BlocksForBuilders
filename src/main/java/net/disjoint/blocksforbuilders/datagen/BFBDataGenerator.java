package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.world.biome.BFBBiomes;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BFBDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

       pack.addProvider(BFBWorldGenerator::new);
       pack.addProvider(BFBRecipeGenerator::new);
       pack.addProvider(BFBBlockTagProvider::new);
       pack.addProvider(BFBItemTagProvider::new);
       pack.addProvider(BFBEntityTagProvider::new);
       pack.addProvider(BFBLootTableGenerator::new);
       pack.addProvider(BFBModelProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BlocksForBuildersConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BlocksForBuildersPlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.BIOME, BFBBiomes::bootstrap);
    }
}