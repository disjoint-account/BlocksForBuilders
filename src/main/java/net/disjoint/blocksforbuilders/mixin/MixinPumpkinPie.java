package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.disjoint.blocksforbuilders.PumpkinPie;
import net.minecraft.references.ItemIds;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Mixin(Items.class)
public class MixinPumpkinPie {
    @WrapOperation(
            method= "registerItem(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/Item;",
            at= @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Items;registerItem(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Function;Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/Item;"))
    private static Item wrapper(ResourceKey<Item> id, Function<Item.Properties, Item> itemFactory, Item.Properties properties, Operation<Item> original) {
        if (id.equals(ItemIds.PUMPKIN_PIE)) {
            return original.call(id, (Function<Item.Properties, Item>) MixinPumpkinPie::createBlockItem, properties);
        }
        return original.call(id, itemFactory, properties);
    }
    @Unique
    private static Item createBlockItem(Item.Properties settings) {
        return new BlockItem(PumpkinPie.PUMPKIN_PIE, settings);
    }
}