package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.signstuff.util.BFBSign;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBWallSignBlock extends WallSignBlock implements BFBSign {
    private final String texture;

    public BFBWallSignBlock(String texture ,WoodType woodType, Settings settings) {
        super(woodType, settings);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/" + texture);
    }
}