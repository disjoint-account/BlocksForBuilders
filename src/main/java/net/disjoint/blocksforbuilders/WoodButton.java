package net.disjoint.blocksforbuilders;

import net.minecraft.block.Blocks;
import net.minecraft.block.WoodenButtonBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class WoodButton extends WoodenButtonBlock {

    public WoodButton() {
        super(FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision());
    }
}
