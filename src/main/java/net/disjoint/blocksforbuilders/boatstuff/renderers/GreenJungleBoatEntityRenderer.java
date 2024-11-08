package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GreenJungleBoatEntityRenderer extends BoatEntityRenderer {
    public static final EntityModelLayer GREEN_JUNGLE_BOAT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "boat/green_jungle"), "main");
    private final Identifier texture;

    public GreenJungleBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, GREEN_JUNGLE_BOAT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/boat/green_jungle.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}