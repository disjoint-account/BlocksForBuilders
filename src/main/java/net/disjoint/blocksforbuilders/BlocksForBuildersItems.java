package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;

import java.util.function.Function;

import static net.disjoint.blocksforbuilders.BlocksForBuildersBlocks.*;

public class BlocksForBuildersItems {
    public static final Item GHOSTWOOD_SIGN_ITEM = registerItem("ghostwood_sign", settings ->  new StandingAndWallBlockItem(GHOSTWOOD_SIGN, GHOSTWOOD_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GHOSTWOOD_HANGING_SIGN_ITEM = registerItem("ghostwood_hanging_sign", settings ->  new HangingSignItem(GHOSTWOOD_HANGING_SIGN, GHOSTWOOD_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GHOSTWOOD_BOAT = registerItem("ghostwood_boat", (settings -> new BoatItem(BFBEntityTypes.GHOSTWOOD_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item GHOSTWOOD_CHEST_BOAT = registerItem("ghostwood_chest_boat", (settings -> new BoatItem(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item SCORCHWOOD_SIGN_ITEM = registerItem("scorchwood_sign", settings ->  new StandingAndWallBlockItem(SCORCHWOOD_SIGN, SCORCHWOOD_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item SCORCHWOOD_HANGING_SIGN_ITEM = registerItem("scorchwood_hanging_sign", settings ->  new HangingSignItem(SCORCHWOOD_HANGING_SIGN, SCORCHWOOD_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item SCORCHWOOD_BOAT = registerItem("scorchwood_boat", (settings -> new BoatItem(BFBEntityTypes.SCORCHWOOD_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item SCORCHWOOD_CHEST_BOAT = registerItem("scorchwood_chest_boat", (settings -> new BoatItem(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item WILLOW_SIGN_ITEM = registerItem("willow_sign", settings ->  new StandingAndWallBlockItem(WILLOW_SIGN, WILLOW_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item WILLOW_HANGING_SIGN_ITEM = registerItem("willow_hanging_sign", settings ->  new HangingSignItem(WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item WILLOW_BOAT = registerItem("willow_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item WILLOW_CHEST_BOAT = registerItem("willow_chest_boat", (settings -> new BoatItem(BFBEntityTypes.WILLOW_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item COCONUT = registerItem("coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build())
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item STRIPPED_COCONUT = registerItem("stripped_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build())
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item EMPTY_COCONUT = registerItem("empty_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build())
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item STRIPPED_EMPTY_COCONUT = registerItem("stripped_empty_coconut", settings -> new BlockItem(BlocksForBuildersBlocks.COCONUT, settings.stacksTo(64).food(new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build())
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item COCONUT_FIBER = registerItem("coconut_fiber", settings ->  new Item(settings.stacksTo(64)
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item COCONUT_HUSK = registerItem("coconut_husk", settings ->  new Item(settings.stacksTo(64)
            .compostable(ContextIntProviders.COMPOSTABLE_LOW)));
    public static final Item PALM_SIGN_ITEM = registerItem("palm_sign", settings ->  new StandingAndWallBlockItem(PALM_SIGN, PALM_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item PALM_HANGING_SIGN_ITEM = registerItem("palm_hanging_sign", settings ->  new HangingSignItem(PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item PALM_RAFT = registerItem("palm_raft", (settings -> new BoatItem(BFBEntityTypes.PALM_RAFT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item PALM_CHEST_RAFT = registerItem("palm_chest_raft", (settings -> new BoatItem(BFBEntityTypes.PALM_CHEST_RAFT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item MAPLE_SIGN_ITEM = registerItem("maple_sign", settings ->  new StandingAndWallBlockItem(MAPLE_SIGN, MAPLE_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item MAPLE_HANGING_SIGN_ITEM = registerItem("maple_hanging_sign", settings ->  new HangingSignItem(MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (settings -> new BoatItem(BFBEntityTypes.MAPLE_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (settings -> new BoatItem(BFBEntityTypes.MAPLE_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item BEECH_SIGN_ITEM = registerItem("beech_sign", settings ->  new StandingAndWallBlockItem(BEECH_SIGN, BEECH_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item BEECH_HANGING_SIGN_ITEM = registerItem("beech_hanging_sign", settings ->  new HangingSignItem(BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item BEECH_BOAT = registerItem("beech_boat", (settings -> new BoatItem(BFBEntityTypes.BEECH_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item BEECH_CHEST_BOAT = registerItem("beech_chest_boat", (settings -> new BoatItem(BFBEntityTypes.BEECH_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item PINE_SIGN_ITEM = registerItem("pine_sign", settings ->  new StandingAndWallBlockItem(PINE_SIGN, PINE_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item PINE_HANGING_SIGN_ITEM = registerItem("pine_hanging_sign", settings ->  new HangingSignItem(PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item PINE_BOAT = registerItem("pine_boat", (settings -> new BoatItem(BFBEntityTypes.PINE_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item PINE_CHEST_BOAT = registerItem("pine_chest_boat", (settings -> new BoatItem(BFBEntityTypes.PINE_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item CEDAR_SIGN_ITEM = registerItem("cedar_sign", settings ->  new StandingAndWallBlockItem(CEDAR_SIGN, CEDAR_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item CEDAR_HANGING_SIGN_ITEM = registerItem("cedar_hanging_sign", settings ->  new HangingSignItem(CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item CEDAR_BOAT = registerItem("cedar_boat", (settings -> new BoatItem(BFBEntityTypes.CEDAR_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item CEDAR_CHEST_BOAT = registerItem("cedar_chest_boat", (settings -> new BoatItem(BFBEntityTypes.CEDAR_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item GREEN_JUNGLE_SIGN_ITEM = registerItem("green_jungle_sign", settings ->  new StandingAndWallBlockItem(GREEN_JUNGLE_SIGN, GREEN_JUNGLE_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GREEN_JUNGLE_HANGING_SIGN_ITEM = registerItem("green_jungle_hanging_sign", settings ->  new HangingSignItem(GREEN_JUNGLE_HANGING_SIGN, GREEN_JUNGLE_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GREEN_JUNGLE_BOAT = registerItem("green_jungle_boat", (settings -> new BoatItem(BFBEntityTypes.GREEN_JUNGLE_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item GREEN_JUNGLE_CHEST_BOAT = registerItem("green_jungle_chest_boat", (settings -> new BoatItem(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static final Item GREEN_BAMBOO_SIGN_ITEM = registerItem("green_bamboo_sign", settings ->  new StandingAndWallBlockItem(GREEN_BAMBOO_SIGN, GREEN_BAMBOO_WALL_SIGN, Direction.DOWN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GREEN_BAMBOO_HANGING_SIGN_ITEM = registerItem("green_bamboo_hanging_sign", settings ->  new HangingSignItem(GREEN_BAMBOO_HANGING_SIGN, GREEN_BAMBOO_WALL_HANGING_SIGN, settings.stacksTo(16)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))));
    public static final Item GREEN_BAMBOO_RAFT = registerItem("green_bamboo_raft", (settings -> new BoatItem(BFBEntityTypes.GREEN_BAMBOO_RAFT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));
    public static final Item GREEN_BAMBOO_CHEST_RAFT = registerItem("green_bamboo_chest_raft", (settings -> new BoatItem(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT, settings.stacksTo(1)
            .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(1200), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER))))));

    public static void registerModItems() {
        BlocksForBuilders.LOGGER.info("Registering items for " + BlocksForBuilders.MOD_ID);
    }

    public static ResourceKey<Item> getResourceKey(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name), function.apply(new Item.Properties().setId(keyOfItem(name))));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }
}

