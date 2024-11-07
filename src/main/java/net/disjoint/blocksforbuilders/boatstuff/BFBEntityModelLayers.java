package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class BFBEntityModelLayers {
    public static final EntityModelLayer GHOSTWOOD_BOAT = registerMain("boat/ghostwood");
    public static final EntityModelLayer GHOSTWOOD_CHEST_BOAT = registerMain("chest_boat/ghostwood");
    public static final EntityModelLayer WILLOW_BOAT = registerMain("boat/willow");
    public static final EntityModelLayer WILLOW_CHEST_BOAT = registerMain("chest_boat/willow");
    public static final EntityModelLayer GREEN_JUNGLE_BOAT = registerMain("boat/green_jungle");
    public static final EntityModelLayer GREEN_JUNGLE_CHEST_BOAT = registerMain("chest_boat/green_jungle");
    public static final EntityModelLayer GREEN_BAMBOO_RAFT = registerMain("raft/green_bamboo");
    public static final EntityModelLayer GREEN_BAMBOO_CHEST_RAFT = registerMain("chest_raft/green_bamboo");

    private static EntityModelLayer registerMain(String id) {
        return new EntityModelLayer(Identifier.of(BlocksForBuilders.MOD_ID, id), "main");
    }
    public static void registerEntityModelLayers() {
    }
}