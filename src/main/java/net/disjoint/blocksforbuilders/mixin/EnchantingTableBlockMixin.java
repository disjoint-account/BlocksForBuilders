package net.disjoint.blocksforbuilders.mixin;

import net.disjoint.blocksforbuilders.BFBBookshelf;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.util.BlocksForBuildersTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantingTableBlock.class)
public class EnchantingTableBlockMixin {
    @Inject(method = "canAccessBookshelf", at = @At("RETURN"), cancellable = true)
    private static void injected(World world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue((world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Blocks.BOOKSHELF) ||
                world.getBlockState(tablePos.add(bookshelfOffset)).isIn(BlocksForBuildersTags.Blocks.BOOKSHELVES)));
                world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2));
    }
}