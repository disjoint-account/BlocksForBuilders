package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import static net.minecraft.block.AbstractBlock.Settings.copy;

public class WoodButton extends ButtonBlock {

    public WoodButton() {
        super(BlockSetType.OAK,15, copy(Blocks.OAK_BUTTON));
    }
}
