package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.FenceGateBlock;

public class BFBFenceGate extends FenceGateBlock {

    public BFBFenceGate(BlockState baseBlockState, Settings settings) {
        super(settings);
    }
}
