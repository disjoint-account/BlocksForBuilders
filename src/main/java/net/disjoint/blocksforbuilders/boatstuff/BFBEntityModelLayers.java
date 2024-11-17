package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.RaftEntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BFBEntityModelLayers {

    public static void registerEntityModelLayers() {
        registerEntityRenderer(BFBEntityTypes.GHOSTWOOD_BOAT, registerBoatModelLayer("ghostwood"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("ghostwood")));
        registerEntityRenderer(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT, registerChestBoatModelLayer("ghostwood"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("ghostwood")));
        registerEntityRenderer(BFBEntityTypes.SCORCHWOOD_BOAT, registerBoatModelLayer("scorchwood"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("scorchwood")));
        registerEntityRenderer(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT, registerChestBoatModelLayer("scorchwood"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("scorchwood")));
        registerEntityRenderer(BFBEntityTypes.WILLOW_BOAT, registerBoatModelLayer("willow"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("willow")));
        registerEntityRenderer(BFBEntityTypes.WILLOW_CHEST_BOAT, registerChestBoatModelLayer("willow"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("willow")));
        registerEntityRenderer(BFBEntityTypes.GREEN_JUNGLE_BOAT, registerBoatModelLayer("green_jungle"), BoatEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerBoatModelLayer("green_jungle")));
        registerEntityRenderer(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT, registerChestBoatModelLayer("green_jungle"), BoatEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestBoatModelLayer("green_jungle")));
        registerEntityRenderer(BFBEntityTypes.GREEN_BAMBOO_RAFT, registerRaftModelLayer("green_bamboo"), RaftEntityModel::getTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerRaftModelLayer("green_bamboo")));
        registerEntityRenderer(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT, registerChestRaftModelLayer("green_bamboo"), RaftEntityModel::getChestTexturedModelData,
                ctx -> new BoatEntityRenderer(ctx, registerChestRaftModelLayer("green_bamboo")));
    }
    private static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> entityType, EntityModelLayer modelLayer, EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider, EntityRendererFactory<T> entityRendererFactory) {
        EntityModelLayerRegistry.registerModelLayer(modelLayer, texturedModelDataProvider);
        EntityRendererRegistry.register(entityType, entityRendererFactory);
    }

    private static EntityModelLayer registerBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "boat/" + id), "main");
    }

    private static EntityModelLayer registerChestBoatModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_boat/" + id), "main");
    }

    private static EntityModelLayer registerRaftModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "raft/" + id), "main");
    }

    private static EntityModelLayer registerChestRaftModelLayer(String id) {
        return new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, "chest_raft/" + id), "main");
    }
}