package net.disjoint.blocksforbuilders;

import net.minecraft.block.WallSignBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.SignType;

public class WoodSignWall extends WallSignBlock implements WoodSign {
    private final Identifier texture;

    public WoodSignWall(Identifier texture, Settings settings) {
        super(settings, SignType.OAK);
        this.texture = texture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}