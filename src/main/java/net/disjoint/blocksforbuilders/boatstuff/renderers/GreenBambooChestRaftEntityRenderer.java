package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.RaftEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GreenBambooChestRaftEntityRenderer extends RaftEntityRenderer {
    public static final EntityModelLayer GREEN_BAMBOO_CHEST_RAFT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_raft/green_bamboo"), "main");
    private final Identifier texture;

    public GreenBambooChestRaftEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, GREEN_BAMBOO_CHEST_RAFT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/chest_raft/green_bamboo.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}