package net.disjoint.blocksforbuilders.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.disjoint.blocksforbuilders.boatstuff.entity.BFBBoatEntityRenderer;
import net.disjoint.blocksforbuilders.boatstuff.entity.BFBBoatHolder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;

@Mixin(BoatEntityRenderer.class)
@Environment(EnvType.CLIENT)
public class MixinBoatEntityRenderer {

    @WrapOperation(method = "render*", at = @At(value = "INVOKE", target = "Ljava/util/Map;get(Ljava/lang/Object;)Ljava/lang/Object;"))
    @SuppressWarnings("unused")
    private Object bfbWood$getBoatTextureAndModel(Map<BoatEntity.Type, Pair<Identifier, BoatEntityModel>> instance, Object type, Operation<Object> original, BoatEntity entity) {
        //noinspection ConstantConditions
        if (entity instanceof BFBBoatHolder terraformEntity &&
                (Object) this instanceof BFBBoatEntityRenderer terraformRenderer) {
            return terraformRenderer.getTextureAndModel(terraformEntity);
        }

        return original.call(instance, type);
    }
}