package net.disjoint.blocksforbuilders.signstuff.mixin;

        import net.disjoint.blocksforbuilders.signstuff.BlockSettingsLock;
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
    private void bfb$preventSoundsOverride(CallbackInfoReturnable<AbstractBlock.Settings> ci) {
        if (this.bfb$locked) {
            ci.setReturnValue((AbstractBlock.Settings) (Object) this);
            this.bfb$locked = false;
        }
    }

    @Override
    public void lock() {
        this.bfb$locked = true;
    }
}
