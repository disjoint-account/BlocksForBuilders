package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.item.BFBBoatItem;
import net.disjoint.blocksforbuilders.boatstuff.registry.BoatTypes;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.disjoint.blocksforbuilders.BlocksForBuildersBlocks.*;
import static net.disjoint.blocksforbuilders.boatstuff.item.BFBBoatItem.registerBoatDispenserBehavior;

public class BlocksForBuildersItems {
    public static final Item GREEN_JUNGLE_SIGN_ITEM = registerItem("green_jungle_sign",
            new SignItem(GREEN_JUNGLE_SIGN, GREEN_JUNGLE_WALL_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GREEN_JUNGLE_HANGING_SIGN_ITEM = registerItem("green_jungle_hanging_sign",
            new SignItem(GREEN_JUNGLE_HANGING_SIGN, GREEN_JUNGLE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GREEN_JUNGLE_BOAT = registerBoatItem("green_jungle_boat", BoatTypes.GREEN_JUNGLE, false, new Item.Settings().maxCount(1));
    public static final Item GREEN_JUNGLE_CHEST_BOAT = registerBoatItem("green_jungle_chest_boat", BoatTypes.GREEN_JUNGLE, true, new Item.Settings().maxCount(1));

    public static final Item GHOSTWOOD_SIGN_ITEM = registerItem("ghostwood_sign",
            new SignItem(GHOSTWOOD_SIGN, GHOSTWOOD_WALL_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GHOSTWOOD_HANGING_SIGN_ITEM = registerItem("ghostwood_hanging_sign",
            new SignItem(GHOSTWOOD_HANGING_SIGN, GHOSTWOOD_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GHOSTWOOD_BOAT = registerBoatItem("ghostwood_boat", BoatTypes.GHOSTWOOD, false, new Item.Settings().maxCount(1));
    public static final Item GHOSTWOOD_CHEST_BOAT = registerBoatItem("ghostwood_chest_boat", BoatTypes.GHOSTWOOD, true, new Item.Settings().maxCount(1));

    public static final Item WILLOW_SIGN_ITEM = registerItem("willow_sign",
            new SignItem(WILLOW_SIGN, WILLOW_WALL_SIGN, new Item.Settings().maxCount(16)));
    public static final Item WILLOW_HANGING_SIGN_ITEM = registerItem("willow_hanging_sign",
            new SignItem(WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));
    public static final Item WILLOW_BOAT = registerBoatItem("willow_boat", BoatTypes.WILLOW, false, new Item.Settings().maxCount(1));
    public static final Item WILLOW_CHEST_BOAT = registerBoatItem("willow_chest_boat", BoatTypes.WILLOW, true, new Item.Settings().maxCount(1));

    public static final Item GREEN_BAMBOO_SIGN_ITEM = registerItem("green_bamboo_sign",
            new SignItem(GREEN_BAMBOO_SIGN, GREEN_BAMBOO_WALL_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GREEN_BAMBOO_HANGING_SIGN_ITEM = registerItem("green_bamboo_hanging_sign",
            new SignItem(GREEN_BAMBOO_HANGING_SIGN, GREEN_BAMBOO_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));
    public static final Item GREEN_BAMBOO_RAFT = registerBoatItem("green_bamboo_raft", BoatTypes.GREEN_BAMBOO, false, new Item.Settings().maxCount(1));
    public static final Item GREEN_BAMBOO_CHEST_RAFT = registerBoatItem("green_bamboo_chest_raft", BoatTypes.GREEN_BAMBOO, true, new Item.Settings().maxCount(1));

    private static Item registerBoatItem(String name, RegistryKey<BFBBoatType> boatType, boolean chest, Item.Settings settings) {
        Item item = new BFBBoatItem(chest, boatType, settings);
        Registry.register(Registries.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name), item);
        registerBoatDispenserBehavior(item, boatType, chest);
        return item;
    }
    public static void registerModItems() {
        BlocksForBuilders.LOGGER.info("Registering items for " + BlocksForBuilders.MOD_ID);
        }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name), item);
    }
}
