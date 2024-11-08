package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.disjoint.blocksforbuilders.PumpkinPie;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Function;

@Mixin(Items.class)
public class MixinPumpkinPie {
    @WrapOperation(
            method= "register(Ljava/lang/String;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;",
            at= @At(value = "INVOKE", target = "Lnet/minecraft/item/Items;register(Lnet/minecraft/registry/RegistryKey;Ljava/util/function/Function;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;"))
    private static Item wrapper(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings, Operation<Item> original, String name, Item.Settings ignored) {
        if (name.equals("pumpkin_pie")) {
            return original.call(key, (Function<Item.Settings, Item>) MixinPumpkinPie::createBlockItem, settings);
        }
        return original.call(key, factory, settings);
    }
    @Unique
    private static Item createBlockItem(Item.Settings settings) {
        return new BlockItem(PumpkinPie.PUMPKIN_PIE, settings);
    }
}