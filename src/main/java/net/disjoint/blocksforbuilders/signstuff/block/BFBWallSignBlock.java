package net.disjoint.blocksforbuilders.signstuff.block;

import net.disjoint.blocksforbuilders.signstuff.BFBSign;
import net.disjoint.blocksforbuilders.signstuff.BlockSettingsLock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBWallSignBlock extends WallSignBlock implements BFBSign {
    private final Identifier texture;

    public BFBWallSignBlock(Identifier texture, Settings settings) {
        super(BlockSettingsLock.lock(settings), WoodType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
