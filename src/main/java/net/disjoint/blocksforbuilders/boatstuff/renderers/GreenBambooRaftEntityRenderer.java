package net.disjoint.blocksforbuilders.boatstuff.renderers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.RaftEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GreenBambooRaftEntityRenderer extends RaftEntityRenderer {
    public static final EntityModelLayer GREEN_BAMBOO_RAFT = new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "raft/green_bamboo"), "main");
    private final Identifier texture;

    public GreenBambooRaftEntityRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, GREEN_BAMBOO_RAFT);
        texture = Identifier.of(BlocksForBuilders.MOD_ID, "textures/entity/raft/green_bamboo.png");
    }
    public Identifier getTexture() {
        return texture;
    }
}