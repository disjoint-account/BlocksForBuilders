package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.WoodType;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.block.entity.HangingSignBlockEntityRenderer;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({SignBlockEntityRenderer.class, HangingSignBlockEntityRenderer.class})
public abstract class MixinSignBlockEntityRenderer extends MixinAbstractSignBlockEntityRenderer {
    @Inject(method = "getTextureId", at = @At("HEAD"), cancellable = true)
    private void bfb$rendererSignTextureId(WoodType woodType, CallbackInfoReturnable<SpriteIdentifier> cir) {
        if (this.bfb$renderedBlockEntity != null) {
            if (this.bfb$renderedBlockEntity.getCachedState().getBlock() instanceof BFBSign signBlock) {
                cir.setReturnValue(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, signBlock.getTexture()));
            }
        }
    }
}