package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBSaplingGenerators;
import net.minecraft.references.BlockItemIds;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Mixin(Blocks.class)
public class MixinPoplarGrower {
    @WrapOperation(
            method= "register(Lnet/minecraft/references/BlockItemId;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;",
            at= @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/Blocks;register(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;)Lnet/minecraft/world/level/block/Block;"))
    private static Block wrapper(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties, Operation<Block> original) {
        if (id.equals(BlockItemIds.POPLAR_SAPLING.block())) {
            return original.call(id, (Function<BlockBehaviour.Properties, Block>) MixinPoplarGrower::createSaplingBlock, properties);
        }
        return original.call(id, factory, properties);
    }
    @Unique
    private static Block createSaplingBlock(BlockBehaviour.Properties settings) {
        return new SaplingBlock(BFBSaplingGenerators.YELLOW_POPLAR, settings);
    }
}