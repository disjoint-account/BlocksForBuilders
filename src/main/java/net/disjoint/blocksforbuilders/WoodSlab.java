package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WoodSlab extends SlabBlock {

    public WoodSlab() {
        super(FabricBlockSettings.copy(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY));
    }
}