package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WallHangingSignBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.entity.BlockEntityType;

@Mixin(BlockEntityType.class)
public class MixinBlockEntityType {
    @Inject(method = "supports", at = @At("HEAD"), cancellable = true)
    private void bfbWood$signSupports(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        Block block = state.getBlock();

        if (block instanceof BFBSign) {
            if (BlockEntityType.HANGING_SIGN.equals(this)) {
                if (!(block instanceof HangingSignBlock || block instanceof WallHangingSignBlock)) {
                    return;
                }
            } else if (!BlockEntityType.SIGN.equals(this)) {
                return;
            }

            cir.setReturnValue(true);
        }
    }
}
