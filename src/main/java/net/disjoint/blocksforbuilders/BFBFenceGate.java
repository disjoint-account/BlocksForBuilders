package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

public class BFBFenceGate extends FenceGateBlock {

    public BFBFenceGate(BlockState baseBlockState, Settings settings) {
        super(settings, WoodType.OAK);
    }
}
