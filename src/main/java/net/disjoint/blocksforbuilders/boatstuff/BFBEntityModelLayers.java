package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.RaftModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class BFBEntityModelLayers {

    public static void registerEntityModelLayers() {
        registerEntityRenderer(BFBEntityTypes.GHOSTWOOD_BOAT, registerBoatModelLayer("ghostwood"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("ghostwood")));
        registerEntityRenderer(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT, registerChestBoatModelLayer("ghostwood"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("ghostwood")));

        registerEntityRenderer(BFBEntityTypes.SCORCHWOOD_BOAT, registerBoatModelLayer("scorchwood"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("scorchwood")));
        registerEntityRenderer(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT, registerChestBoatModelLayer("scorchwood"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("scorchwood")));

        registerEntityRenderer(BFBEntityTypes.WILLOW_BOAT, registerBoatModelLayer("willow"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("willow")));
        registerEntityRenderer(BFBEntityTypes.WILLOW_CHEST_BOAT, registerChestBoatModelLayer("willow"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("willow")));

        registerEntityRenderer(BFBEntityTypes.PALM_RAFT, registerRaftModelLayer("palm"), RaftModel::createRaftModel,
                ctx -> new BoatRenderer(ctx, registerRaftModelLayer("palm")));
        registerEntityRenderer(BFBEntityTypes.PALM_CHEST_RAFT, registerChestRaftModelLayer("palm"), RaftModel::createChestRaftModel,
                ctx -> new BoatRenderer(ctx, registerChestRaftModelLayer("palm")));

        registerEntityRenderer(BFBEntityTypes.MAPLE_BOAT, registerBoatModelLayer("maple"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("maple")));
        registerEntityRenderer(BFBEntityTypes.MAPLE_CHEST_BOAT, registerChestBoatModelLayer("maple"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("maple")));

        registerEntityRenderer(BFBEntityTypes.BEECH_BOAT, registerBoatModelLayer("beech"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("beech")));
        registerEntityRenderer(BFBEntityTypes.BEECH_CHEST_BOAT, registerChestBoatModelLayer("beech"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("beech")));

        registerEntityRenderer(BFBEntityTypes.PINE_BOAT, registerBoatModelLayer("pine"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("pine")));
        registerEntityRenderer(BFBEntityTypes.PINE_CHEST_BOAT, registerChestBoatModelLayer("pine"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("pine")));

        registerEntityRenderer(BFBEntityTypes.CEDAR_BOAT, registerBoatModelLayer("cedar"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("cedar")));
        registerEntityRenderer(BFBEntityTypes.CEDAR_CHEST_BOAT, registerChestBoatModelLayer("cedar"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("cedar")));

        registerEntityRenderer(BFBEntityTypes.GREEN_JUNGLE_BOAT, registerBoatModelLayer("green_jungle"), BoatModel::createBoatModel,
                ctx -> new BoatRenderer(ctx, registerBoatModelLayer("green_jungle")));
        registerEntityRenderer(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT, registerChestBoatModelLayer("green_jungle"), BoatModel::createChestBoatModel,
                ctx -> new BoatRenderer(ctx, registerChestBoatModelLayer("green_jungle")));

        registerEntityRenderer(BFBEntityTypes.GREEN_BAMBOO_RAFT, registerRaftModelLayer("green_bamboo"), RaftModel::createRaftModel,
                ctx -> new BoatRenderer(ctx, registerRaftModelLayer("green_bamboo")));
        registerEntityRenderer(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT, registerChestRaftModelLayer("green_bamboo"), RaftModel::createChestRaftModel,
                ctx -> new BoatRenderer(ctx, registerChestRaftModelLayer("green_bamboo")));
    }
    private static <T extends Entity> void registerEntityRenderer(EntityType<? extends T> entityType, ModelLayerLocation modelLayer, ModelLayerRegistry.TexturedLayerDefinitionProvider texturedModelDataProvider, EntityRendererProvider<T> entityRendererFactory) {
        ModelLayerRegistry.registerModelLayer(modelLayer, texturedModelDataProvider);
        EntityRendererRegistry.register(entityType, entityRendererFactory);
    }
    private static ModelLayerLocation registerBoatModelLayer(String id) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "boat/" + id), "main");
    }
    private static ModelLayerLocation registerChestBoatModelLayer(String id) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "chest_boat/" + id), "main");
    }
    private static ModelLayerLocation registerRaftModelLayer(String id) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "raft/" + id), "main");
    }
    private static ModelLayerLocation registerChestRaftModelLayer(String id) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "chest_raft/" + id), "main");
    }
}