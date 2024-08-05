package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBWallSignBlock extends WallSignBlock implements BFBSign {
    private final Identifier texture;

    public BFBWallSignBlock(Identifier texture, WoodType woodType, Settings settings) {
        super(WoodType.OAK, settings);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
