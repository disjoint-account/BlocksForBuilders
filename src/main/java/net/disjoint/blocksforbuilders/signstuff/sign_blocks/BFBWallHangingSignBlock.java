package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.signstuff.util.BFBHangingSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBWallHangingSignBlock extends WallHangingSignBlock implements BFBHangingSign {
    private final Identifier texture;
    private final Identifier guiTexture;

    public BFBWallHangingSignBlock(Identifier texture, Identifier guiTexture, WoodType woodType, Settings settings) {
        super(WoodType.OAK, settings);
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
