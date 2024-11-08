package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Items.class)
public class MixinPumpkinPieFood {
    @WrapOperation(method = "<clinit>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/item/Item$Settings;food(Lnet/minecraft/component/type/FoodComponent;)Lnet/minecraft/item/Item$Settings;",
                    ordinal = 0
            ),
            slice = @Slice(
                    from = @At(
                            value = "FIELD",
                            target = "Lnet/minecraft/component/type/FoodComponents;PUMPKIN_PIE:Lnet/minecraft/component/type/FoodComponent;"
                    )
            )
    )
    private static Item.Settings unfoodify(Item.Settings instance, FoodComponent foodComponent, Operation<Item.Settings> original) {
        return instance;
    }
}