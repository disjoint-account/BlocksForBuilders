package net.disjoint.blocksforbuilders.mixin;

import java.util.function.Consumer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.disjoint.blocksforbuilders.SpriteIdentifierRegistry;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

@Mixin(TexturedRenderLayers.class)
public class MixinTexturedRenderLayers {
    @Inject(method = "addDefaultTextures", at = @At("RETURN"))
    private static void injectTerrestriaSigns(Consumer<SpriteIdentifier> consumer, CallbackInfo info) {
        for(SpriteIdentifier identifier: SpriteIdentifierRegistry.INSTANCE.getIdentifiers()) {
            consumer.accept(identifier);
        }
    }
}