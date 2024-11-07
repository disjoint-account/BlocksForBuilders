package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.signstuff.util.BFBHangingSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBHangingSignBlock extends HangingSignBlock implements BFBHangingSign {
    private final String texture;

    public BFBHangingSignBlock(String texture, WoodType woodType, AbstractBlock.Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/" + texture);
    }

    @Override
    public Identifier getGUITexture() {
        return Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/" + texture);
    }
}
