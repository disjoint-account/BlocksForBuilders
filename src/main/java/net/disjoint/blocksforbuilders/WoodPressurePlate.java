package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import static net.minecraft.block.AbstractBlock.Settings.copy;

public class WoodPressurePlate extends PressurePlateBlock {

    public WoodPressurePlate() {
        super(BlockSetType.OAK, copy(Blocks.OAK_PRESSURE_PLATE));
    }
}