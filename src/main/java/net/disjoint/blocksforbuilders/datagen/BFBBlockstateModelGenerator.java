package net.disjoint.blocksforbuilders.datagen;

import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BFBBlockstateModelGenerator extends BlockStateModelGenerator {
    public BFBBlockstateModelGenerator(Consumer<BlockStateSupplier> blockStateCollector, ItemModelOutput itemModelOutput, BiConsumer<Identifier, ModelSupplier> modelCollector) {
        super(blockStateCollector, itemModelOutput, modelCollector);
    }

    public static void registerSign(BlockStateModelGenerator blockStateModelGenerator, Block particleBlock, Block signBlock, Block wallSignBlock) {
        Identifier identifier = Models.PARTICLE.upload(signBlock, TextureMap.particle(particleBlock), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(signBlock, identifier));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(wallSignBlock, identifier));
        blockStateModelGenerator.registerItemModel(signBlock.asItem());
    }
}