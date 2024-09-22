package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class WillowLeafBlock extends LeavesBlock {

    public WillowLeafBlock() {
        super(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.PALE_GREEN));
        //change colour!!!!!
    }
}