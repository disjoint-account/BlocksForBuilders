package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;

public class GreenLeafBlock extends LeavesBlock {

    public GreenLeafBlock() {
        super(FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).mapColor(MapColor.LIME));
    }
}