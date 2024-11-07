package net.disjoint.blocksforbuilders.signstuff.sign_blocks;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.signstuff.util.BFBHangingSign;
import net.disjoint.blocksforbuilders.signstuff.util.BlockSettingsLock;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class BFBWallHangingSignBlock extends WallHangingSignBlock implements BFBHangingSign {
    private final String texture;

    public BFBWallHangingSignBlock(String texture, WoodType woodType, Settings settings) {
        super(woodType, settings);
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
