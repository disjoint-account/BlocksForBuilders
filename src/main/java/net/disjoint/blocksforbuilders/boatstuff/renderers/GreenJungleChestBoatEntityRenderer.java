package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GreenJungleChestBoatEntityRenderer extends BoatEntityRenderer {
    public static final EntityModelLayer GREEN_JUNGLE_CHEST_BOAT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_boat/green_jungle"), "main");
    private final Identifier texture;

    public GreenJungleChestBoatEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, GREEN_JUNGLE_CHEST_BOAT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/chest_boat/green_jungle.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}