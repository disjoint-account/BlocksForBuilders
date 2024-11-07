package net.disjoint.blocksforbuilders.mixin;

        import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
        import org.spongepowered.asm.mixin.Mixin;
        import org.spongepowered.asm.mixin.Unique;
        import org.spongepowered.asm.mixin.injection.At;
        import org.spongepowered.asm.mixin.injection.Inject;
        import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
        import net.minecraft.block.AbstractBlock;

@Mixin(AbstractBlock.Settings.class)
public class MixinAbstractBlockSettings implements BlockSettingsLock {
    @Unique
    private boolean bfb$locked = false;

    @Inject(method = "sounds", at = @At("HEAD"), cancellable = true)
    private void bfbWood$preventSoundsOverride(CallbackInfoReturnable<AbstractBlock.Settings> cir) {
        if (this.bfb$locked) {
            cir.setReturnValue((AbstractBlock.Settings) (Object) this);
            this.bfb$locked = false;
        }
    }

    @Override
    public void bfb$lock() {
        this.bfb$locked = true;
    }
}