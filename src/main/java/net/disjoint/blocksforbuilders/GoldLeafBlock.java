package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;

public class GoldLeafBlock extends LeavesBlock {

    public GoldLeafBlock() {
        super(FabricBlockSettings.copyOf(Blocks.ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW));
    }
}