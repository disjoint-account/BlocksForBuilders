package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.gameevent.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static net.disjoint.blocksforbuilders.CoconutBlock.*;
import static net.minecraft.world.level.block.Block.popResource;

@Mixin(ShearsDispenseItemBehavior.class)
public class MixinShearsDispenserBehavior {
    @Inject(method = "tryShearBeehive",
            at = @At(value = "TAIL"),
            cancellable = true)
    private static void tryShearBlock(ServerLevel world, ItemStack tool, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.is(BlocksForBuildersBlocks.COCONUT) && blockState.getValue(HAS_FIBER)) {
            world.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1.0F, 1.0F);
            popResource(world, pos, new ItemStack(BlocksForBuildersItems.COCONUT_FIBER, 3));
            world.setBlockAndUpdate(pos, blockState.setValue(HAS_FIBER, false));
            world.gameEvent(null, GameEvent.SHEAR, pos);
            cir.setReturnValue(true);
        }
    }
}
