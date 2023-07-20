package net.disjoint.blocksforbuilders.signstuff.block;

import net.disjoint.blocksforbuilders.signstuff.BFBSign;
import net.disjoint.blocksforbuilders.signstuff.BlockSettingsLock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBSignBlock extends SignBlock implements BFBSign {
    private final Identifier texture;

    public BFBSignBlock(Identifier texture, Settings settings) {
        super(BlockSettingsLock.lock(settings), WoodType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
