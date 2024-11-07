package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBSignBlock extends SignBlock implements BFBSign {
    private final String texture;

    public BFBSignBlock(String texture, WoodType woodType, Settings settings) {
        super(woodType, BlockSettingsLock.lock(settings));
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/" + texture);
    }
}