package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WoodTrapdoor extends TrapdoorBlock {

    public WoodTrapdoor() {
        super(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.WHITE_GRAY));
    }
}