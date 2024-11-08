package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GhostwoodChestBoatEntityRenderer extends BoatEntityRenderer {
    public static final EntityModelLayer GHOSTWOOD_CHEST_BOAT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_boat/ghostwood"), "main");
    private final Identifier texture;

    public GhostwoodChestBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, GHOSTWOOD_CHEST_BOAT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/chest_boat/ghostwood.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}