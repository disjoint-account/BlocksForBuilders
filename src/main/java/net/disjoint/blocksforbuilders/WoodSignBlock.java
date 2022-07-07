package net.disjoint.blocksforbuilders;

import net.minecraft.block.SignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class WoodSignBlock extends SignBlock implements WoodSign {
    private final Identifier texture;

    public WoodSignBlock(Identifier texture, Settings settings) {
        super(settings, SignType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}