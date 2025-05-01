package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockState;
import net.minecraft.block.UntintedParticleLeavesBlock;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class PalmLeavesBlock extends UntintedParticleLeavesBlock {
    public PalmLeavesBlock(Settings settings, float leafParticleChance, ParticleEffect particleEffect) {
        super(leafParticleChance, particleEffect, settings);
    }

    private boolean canGrowCoconuts(BlockState state) {
        return state.get(DISTANCE) ==  1;
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return (state.get(DISTANCE) == 7 && !(Boolean)state.get(PERSISTENT)) || canGrowCoconuts(state);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (this.shouldDecay(state)) {
            dropStacks(state, world, pos);
            world.removeBlock(pos, false);
        }
        if (canGrowCoconuts(state) && world.getBlockState(pos.down()).isAir() && random.nextDouble() < 0.1) {
            world.setBlockState(pos.down(), BlocksForBuildersBlocks.COCONUT.getDefaultState().with(CoconutBlock.HANGING, true));
        }
    }
}
