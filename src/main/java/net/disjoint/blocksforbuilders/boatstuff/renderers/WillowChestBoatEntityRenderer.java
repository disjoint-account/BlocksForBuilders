package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class WillowChestBoatEntityRenderer extends BoatEntityRenderer {
    public static final EntityModelLayer WILLOW_CHEST_BOAT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_boat/willow"), "main");
    private final Identifier texture;

    public WillowChestBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, WILLOW_CHEST_BOAT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/chest_boat/willow.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}