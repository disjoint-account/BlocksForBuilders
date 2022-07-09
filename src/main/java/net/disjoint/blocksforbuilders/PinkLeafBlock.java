package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class PinkLeafBlock extends LeavesBlock {

    public PinkLeafBlock() {
        super(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES).mapColor(MapColor.PINK));
    }
}