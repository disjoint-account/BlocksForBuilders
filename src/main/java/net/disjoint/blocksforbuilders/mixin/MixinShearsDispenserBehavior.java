package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.dispenser.ShearsDispenserBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static net.disjoint.blocksforbuilders.CoconutBlock.*;
import static net.minecraft.block.Block.dropStack;

@Mixin(ShearsDispenserBehavior.class)
public class MixinShearsDispenserBehavior {
    @Inject(method = "tryShearBlock",
            at = @At(value = "TAIL"),
            cancellable = true)
    private static void tryShearBlock(ServerWorld world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.isOf(BlocksForBuildersBlocks.COCONUT) && blockState.get(HAS_FIBER)) {
            world.playSound(null, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0F, 1.0F);
            dropStack(world, pos, new ItemStack(BlocksForBuildersItems.COCONUT_FIBER, 3));
            world.setBlockState(pos, blockState.with(HAS_FIBER, false));
            world.emitGameEvent(null, GameEvent.SHEAR, pos);
            cir.setReturnValue(true);
        }
    }
}
