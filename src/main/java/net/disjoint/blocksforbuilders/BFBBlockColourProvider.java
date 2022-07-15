package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

import javax.annotation.Nullable;

public class BFBBlockColourProvider implements BlockColorProvider {

    BlockColorProvider vanillaProvider;
    boolean shouldApply;

    public BFBBlockColourProvider(BlockColorProvider vanillaProvider) {
        this.vanillaProvider = vanillaProvider;
        this.shouldApply = true;
    }

    public void setShouldApply(boolean shouldApply) {
        this.shouldApply = shouldApply;
    }

    @Override
    public int getColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
            return vanillaProvider.getColor(state, world, pos, tintIndex);
        }
}
