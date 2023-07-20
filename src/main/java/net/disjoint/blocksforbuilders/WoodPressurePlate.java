package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class WoodPressurePlate extends PressurePlateBlock {

    public WoodPressurePlate() {
        super(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK);
    }
}