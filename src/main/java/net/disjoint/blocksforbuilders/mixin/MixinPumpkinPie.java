package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.PumpkinPie;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Items.class)
public class MixinPumpkinPie {
    @Redirect(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = {"stringValue=pumpkin_pie"}, ordinal = 0)),
            at = @At(value = "NEW", target = "net/minecraft/item/Item", ordinal = 0))
    private static Item pumpkinPie(Item.Settings settings) {
        return new BlockItem(PumpkinPie.PUMPKIN_PIE, new Item.Settings());
    }
}
