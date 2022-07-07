package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class WoodStairs extends StairsBlock {

    public WoodStairs(Block block) {
        super(block.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE_GRAY));
    }
}