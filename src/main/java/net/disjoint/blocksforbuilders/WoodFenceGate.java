package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WoodFenceGate extends FenceGateBlock {

    public WoodFenceGate() {
        super(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE_GRAY));
    }
}
