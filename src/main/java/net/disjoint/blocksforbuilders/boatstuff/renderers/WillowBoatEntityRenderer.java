package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class WillowBoatEntityRenderer extends BoatEntityRenderer {
    public static final EntityModelLayer WILLOW_BOAT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "boat/willow"), "main");
    private final Identifier texture;

    public WillowBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, WILLOW_BOAT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/boat/willow.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}