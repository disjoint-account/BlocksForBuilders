package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class WoodButton extends ButtonBlock {

    public WoodButton() {
        super(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK,15, true);
    }
}
