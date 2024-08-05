package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBSignBlock extends SignBlock implements BFBSign {
    private final Identifier texture;

    public BFBSignBlock(Identifier texture, WoodType woodType, Settings settings) {
        super(WoodType.OAK, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
