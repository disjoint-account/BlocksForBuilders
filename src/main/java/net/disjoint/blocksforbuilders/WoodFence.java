package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.FenceBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WoodFence extends FenceBlock {

    public WoodFence() {
        super(FabricBlockSettings.copy(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY));
    }
}