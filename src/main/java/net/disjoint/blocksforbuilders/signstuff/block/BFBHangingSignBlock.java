package net.disjoint.blocksforbuilders.signstuff.block;

import net.disjoint.blocksforbuilders.signstuff.BFBHangingSign;
import net.disjoint.blocksforbuilders.signstuff.BlockSettingsLock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBHangingSignBlock extends HangingSignBlock implements BFBHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;

    public BFBHangingSignBlock(Identifier texture, Identifier guiTexture, Settings settings) {
        super(BlockSettingsLock.lock(settings), WoodType.OAK);
        this.texture = texture;
        this.guiTexture = guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }

    @Override
    public Identifier getGuiTexture() {
        return guiTexture;
    }
}
