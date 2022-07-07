package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.DoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class WoodDoor extends DoorBlock {

    public WoodDoor() {
        super(FabricBlockSettings.copy(Blocks.OAK_DOOR).mapColor(MapColor.WHITE_GRAY));
    }
}