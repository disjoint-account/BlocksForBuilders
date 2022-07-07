package net.disjoint.blocksforbuilders;

import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

public class WoodLog extends PillarBlock {

    public WoodLog() {
        super(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    }
}
