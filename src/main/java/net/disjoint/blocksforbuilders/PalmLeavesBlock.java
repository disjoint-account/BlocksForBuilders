package net.disjoint.blocksforbuilders;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;

public class PalmLeavesBlock extends UntintedParticleLeavesBlock {
    public PalmLeavesBlock(Properties settings, float leafParticleChance, ParticleOptions particleEffect) {
        super(leafParticleChance, particleEffect, settings);
    }

    private boolean canGrowCoconuts(BlockState state) {
        return state.getValue(DISTANCE) == 1;
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return (state.getValue(DISTANCE) == 7 && !(Boolean)state.getValue(PERSISTENT)) || canGrowCoconuts(state);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (this.decaying(state)) {
            dropResources(state, world, pos);
            world.removeBlock(pos, false);
        }
        if (canGrowCoconuts(state) && world.getBlockState(pos.below()).isAir() && random.nextDouble() < 0.1) {
            world.setBlockAndUpdate(pos.below(), BlocksForBuildersBlocks.COCONUT.defaultBlockState().setValue(CoconutBlock.HANGING, true));
        }
    }
}
