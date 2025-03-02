package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
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

    public static final Item SCORCHWOOD_SIGN_ITEM = registerItem("scorchwood_sign", settings ->  new SignItem(SCORCHWOOD_SIGN, SCORCHWOOD_WALL_SIGN, settings.maxCount(16)));
    public static final Item SCORCHWOOD_HANGING_SIGN_ITEM = registerItem("scorchwood_hanging_sign", settings ->  new SignItem(SCORCHWOOD_HANGING_SIGN, SCORCHWOOD_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item SCORCHWOOD_BOAT = registerItem("scorchwood_boat", (settings -> new BoatItem(BFBEntityTypes.SCORCHWOOD_BOAT, settings.maxCount(1))));
    public static final Item SCORCHWOOD_CHEST_BOAT = registerItem("scorchwood_chest_boat", (settings -> new BoatItem(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT, settings.maxCount(1))));

    public static final Item WILLOW_SIGN_ITEM = registerItem("willow_sign", settings ->  new SignItem(WILLOW_SIGN, WILLOW_WALL_SIGN, settings.maxCount(16)));
    public static final Item WILLOW_HANGING_SIGN_ITEM = registerItem("willow_hanging_sign", settings ->  new SignItem(WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item WILLOW_BOAT = registerItem("willow_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_BOAT, settings.maxCount(1))));
    public static final Item WILLOW_CHEST_BOAT = registerItem("willow_chest_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_CHEST_BOAT, settings.maxCount(1))));

    public static final Item COCONUT = registerItem("coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.maxCount(64).food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item SHEARED_COCONUT = registerItem("sheared_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.maxCount(64).food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item MILKED_COCONUT = registerItem("milked_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.maxCount(64).food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item SHEARED_MILKED_COCONUT = registerItem("sheared_milked_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.maxCount(64).food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
    public static final Item COCONUT_FIBER = registerItem("coconut_fiber", settings ->  new Item(settings.maxCount(64)));
    public static final Item COCONUT_HUSK = registerItem("coconut_husk", settings ->  new Item(settings.maxCount(64)));
    public static final Item PALM_SIGN_ITEM = registerItem("palm_sign", settings ->  new SignItem(PALM_SIGN, PALM_WALL_SIGN, settings.maxCount(16)));
    public static final Item PALM_HANGING_SIGN_ITEM = registerItem("palm_hanging_sign", settings ->  new SignItem(PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item PALM_RAFT = registerItem("palm_raft", (settings -> new BoatItem(BFBEntityTypes.PALM_RAFT, settings.maxCount(1))));
    public static final Item PALM_CHEST_RAFT = registerItem("palm_chest_raft", (settings -> new BoatItem(BFBEntityTypes.PALM_CHEST_RAFT, settings.maxCount(1))));

    public static final Item MAPLE_SIGN_ITEM = registerItem("maple_sign", settings ->  new SignItem(MAPLE_SIGN, MAPLE_WALL_SIGN, settings.maxCount(16)));
    public static final Item MAPLE_HANGING_SIGN_ITEM = registerItem("maple_hanging_sign", settings ->  new SignItem(MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (settings -> new BoatItem(BFBEntityTypes.MAPLE_BOAT, settings.maxCount(1))));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (settings -> new BoatItem(BFBEntityTypes.MAPLE_CHEST_BOAT, settings.maxCount(1))));

    public static final Item BEECH_SIGN_ITEM = registerItem("beech_sign", settings ->  new SignItem(BEECH_SIGN, BEECH_WALL_SIGN, settings.maxCount(16)));
    public static final Item BEECH_HANGING_SIGN_ITEM = registerItem("beech_hanging_sign", settings ->  new SignItem(BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item BEECH_BOAT = registerItem("beech_boat", (settings -> new BoatItem(BFBEntityTypes.BEECH_BOAT, settings.maxCount(1))));
    public static final Item BEECH_CHEST_BOAT = registerItem("beech_chest_boat", (settings -> new BoatItem(BFBEntityTypes.BEECH_CHEST_BOAT, settings.maxCount(1))));

    public static final Item PINE_SIGN_ITEM = registerItem("pine_sign", settings ->  new SignItem(PINE_SIGN, PINE_WALL_SIGN, settings.maxCount(16)));
    public static final Item PINE_HANGING_SIGN_ITEM = registerItem("pine_hanging_sign", settings ->  new SignItem(PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item PINE_BOAT = registerItem("pine_boat", (settings -> new BoatItem(BFBEntityTypes.PINE_BOAT, settings.maxCount(1))));
    public static final Item PINE_CHEST_BOAT = registerItem("pine_chest_boat", (settings -> new BoatItem(BFBEntityTypes.PINE_CHEST_BOAT, settings.maxCount(1))));

    public static final Item CEDAR_SIGN_ITEM = registerItem("cedar_sign", settings ->  new SignItem(CEDAR_SIGN, CEDAR_WALL_SIGN, settings.maxCount(16)));
    public static final Item CEDAR_HANGING_SIGN_ITEM = registerItem("cedar_hanging_sign", settings ->  new SignItem(CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN, settings.maxCount(16)));
    public static final Item CEDAR_BOAT = registerItem("cedar_boat", (settings -> new BoatItem(BFBEntityTypes.CEDAR_BOAT, settings.maxCount(1))));
    public static final Item CEDAR_CHEST_BOAT = registerItem("cedar_chest_boat", (settings -> new BoatItem(BFBEntityTypes.CEDAR_CHEST_BOAT, settings.maxCount(1))));

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

