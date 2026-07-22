package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.disjoint.blocksforbuilders.PumpkinPie;
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
            method= "registerItem(Ljava/lang/String;Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/Item;",
            at= @At(value = "INVOKE", target = "Lnet/minecraft/world/item/Items;registerItem(Lnet/minecraft/resources/ResourceKey;Ljava/util/function/Function;Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/Item;"))
    private static Item wrapper(ResourceKey<Item> key, Function<Item.Properties, Item> factory, Item.Properties settings, Operation<Item> original, String name, Item.Properties ignored) {
        if (name.equals("pumpkin_pie")) {
            return original.call(key, (Function<Item.Properties, Item>) MixinPumpkinPie::createBlockItem, settings);
        }
        return original.call(key, factory, settings);
    }
    @Unique
    private static Item createBlockItem(Item.Properties settings) {
        return new BlockItem(PumpkinPie.PUMPKIN_PIE, settings);
    }
}