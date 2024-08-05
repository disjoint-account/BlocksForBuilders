package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.signstuff.util.BFBHangingSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBHangingSignBlock extends HangingSignBlock implements BFBHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;

    public BFBHangingSignBlock(Identifier texture, Identifier guiTexture, AbstractBlock.Settings settings) {
        super(WoodType.OAK, BlockSettingsLock.lock(settings));
        this.texture = texture;
        this.guiTexture = guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }

    @Override
    public Identifier getGUITexture() {
        return guiTexture;
    }
}
