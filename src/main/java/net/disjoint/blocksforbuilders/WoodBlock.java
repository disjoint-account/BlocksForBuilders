package net.disjoint.blocksforbuilders;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.sound.BlockSoundGroup;

public class WoodBlock extends Block {

    public WoodBlock() {
        super(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY));
    }
}
