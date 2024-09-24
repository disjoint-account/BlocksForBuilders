package net.disjoint.blocksforbuilders.boatstuff.registry;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.boatstuff.client.BFBBoatClient;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BoatTypes {

    public static final Identifier GREEN_JUNGLE_ID = createBoatIdentifier("green_jungle");
    public static final RegistryKey<BFBBoatType> GREEN_JUNGLE = registerBoatRegistryKey(GREEN_JUNGLE_ID);

    public static final Identifier GHOSTWOOD_ID = createBoatIdentifier("ghostwood");
    public static final RegistryKey<BFBBoatType> GHOSTWOOD = registerBoatRegistryKey(GHOSTWOOD_ID);

    public static final Identifier WILLOW_ID = createBoatIdentifier("willow");
    public static final RegistryKey<BFBBoatType> WILLOW = registerBoatRegistryKey(WILLOW_ID);

    public static final Identifier GREEN_BAMBOO_ID = createBoatIdentifier("green_bamboo");
    public static final RegistryKey<BFBBoatType> GREEN_BAMBOO = registerBoatRegistryKey(GREEN_BAMBOO_ID);

    public static void registerBoatTypes() {
        registerBoatType(GREEN_JUNGLE_ID, BlocksForBuildersItems.GREEN_JUNGLE_BOAT, BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS.asItem());
        registerBoatType(GHOSTWOOD_ID, BlocksForBuildersItems.GHOSTWOOD_BOAT, BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS.asItem());
        registerBoatType(WILLOW_ID, BlocksForBuildersItems.WILLOW_BOAT, BlocksForBuildersItems.WILLOW_CHEST_BOAT, BlocksForBuildersBlocks.WILLOW_PLANKS.asItem());
    }

    public static void registerRaftTypes() {
        registerRaftType(GREEN_BAMBOO_ID, BlocksForBuildersItems.GREEN_BAMBOO_RAFT, BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS.asItem());
    }

    public static void registerBFBModelLayers() {
        BFBBoatClient.registerModelLayers(BoatTypes.GREEN_JUNGLE_ID, false);
        BFBBoatClient.registerModelLayers(BoatTypes.GHOSTWOOD_ID, false);
        BFBBoatClient.registerModelLayers(BoatTypes.WILLOW_ID, false);
        BFBBoatClient.registerModelLayers(BoatTypes.GREEN_BAMBOO_ID, true);
    }



    private static RegistryKey<BFBBoatType> registerBoatRegistryKey(Identifier identifier) {
        return BFBBoatTypeRegistry.createKey(identifier);
    }

    private static Identifier createBoatIdentifier(String name) {
        return Identifier.of(BlocksForBuilders.MOD_ID, name);
    }

    private static void registerBoatType(Identifier identifier, Item boatItem, Item chestBoatItem, Item baseBlock) {
        BFBBoatType bfbBoatType = new BFBBoatType.Builder().item(boatItem).chestItem(chestBoatItem).block(baseBlock).build();
        Registry.register(BFBBoatTypeRegistry.INSTANCE, identifier, bfbBoatType);
    }

    private static void registerRaftType(Identifier identifier, Item boatItem, Item chestBoatItem, Item baseBlock) {
        BFBBoatType bfbRaftType = new BFBBoatType.Builder().raft().item(boatItem).chestItem(chestBoatItem).block(baseBlock).build();
        Registry.register(BFBBoatTypeRegistry.INSTANCE, identifier, bfbRaftType);
    }


}