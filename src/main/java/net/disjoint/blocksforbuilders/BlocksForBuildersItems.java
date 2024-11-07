package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.disjoint.blocksforbuilders.BlocksForBuildersBlocks.*;

public class BlocksForBuildersItems {
    public static final Item GHOSTWOOD_SIGN_ITEM = registerItem("ghostwood_sign", settings ->  new SignItem(GHOSTWOOD_SIGN, GHOSTWOOD_WALL_SIGN, settings.maxCount(16)));
    public static final Item GHOSTWOOD_HANGING_SIGN_ITEM = registerItem("ghostwood_hanging_sign", settings ->  new SignItem(GHOSTWOOD_HANGING_SIGN, GHOSTWOOD_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item GHOSTWOOD_BOAT = registerItem("ghostwood_boat", (settings -> new BoatItem(BFBEntityTypes.GHOSTWOOD_BOAT, settings.maxCount(1))));
    public static final Item GHOSTWOOD_CHEST_BOAT = registerItem("ghostwood_chest_boat", (settings -> new BoatItem(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT, settings.maxCount(1))));

    public static final Item WILLOW_SIGN_ITEM = registerItem("willow_sign", settings ->  new SignItem(WILLOW_SIGN, WILLOW_WALL_SIGN, settings.maxCount(16)));
    public static final Item WILLOW_HANGING_SIGN_ITEM = registerItem("willow_hanging_sign", settings ->  new SignItem(WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item WILLOW_BOAT = registerItem("willow_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_BOAT, settings.maxCount(1))));
    public static final Item WILLOW_CHEST_BOAT = registerItem("willow_chest_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_CHEST_BOAT, settings.maxCount(1))));

    public static final Item GREEN_JUNGLE_SIGN_ITEM = registerItem("green_jungle_sign", settings ->  new SignItem(GREEN_JUNGLE_SIGN, GREEN_JUNGLE_WALL_SIGN, settings.maxCount(16)));
    public static final Item GREEN_JUNGLE_HANGING_SIGN_ITEM = registerItem("green_jungle_hanging_sign", settings ->  new SignItem(GREEN_JUNGLE_HANGING_SIGN, GREEN_JUNGLE_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item GREEN_JUNGLE_BOAT = registerItem("green_jungle_boat", (settings -> new BoatItem(BFBEntityTypes.GREEN_JUNGLE_BOAT, settings.maxCount(1))));
    public static final Item GREEN_JUNGLE_CHEST_BOAT = registerItem("green_jungle_chest_boat", (settings -> new BoatItem(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT, settings.maxCount(1))));

    public static final Item GREEN_BAMBOO_SIGN_ITEM = registerItem("green_bamboo_sign", settings ->  new SignItem(GREEN_BAMBOO_SIGN, GREEN_BAMBOO_WALL_SIGN, settings.maxCount(16)));
    public static final Item GREEN_BAMBOO_HANGING_SIGN_ITEM = registerItem("green_bamboo_hanging_sign", settings ->  new SignItem(GREEN_BAMBOO_HANGING_SIGN, GREEN_BAMBOO_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item GREEN_BAMBOO_RAFT = registerItem("green_bamboo_raft", (settings -> new BoatItem(BFBEntityTypes.GREEN_BAMBOO_RAFT, settings.maxCount(1))));
    public static final Item GREEN_BAMBOO_CHEST_RAFT = registerItem("green_bamboo_chest_raft", (settings -> new BoatItem(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT, settings.maxCount(1))));

    public static void registerModItems() {
        BlocksForBuilders.LOGGER.info("Registering items for " + BlocksForBuilders.MOD_ID);
        }

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name), function.apply(new Item.Settings().registryKey(keyOfItem(name))));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }
}

