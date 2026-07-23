package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.vehicle.boat.ChestRaft;
import net.minecraft.world.entity.vehicle.boat.Raft;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

import java.util.function.Supplier;

public class BFBEntityTypes {
    public static final EntityType<Boat> WILLOW_BOAT = register("willow_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.WILLOW_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> WILLOW_CHEST_BOAT = register("willow_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.WILLOW_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Raft> PALM_RAFT = register("palm_raft",
            EntityType.Builder.of(getRaftFactory(() -> BlocksForBuildersItems.PALM_RAFT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestRaft> PALM_CHEST_RAFT = register("palm_chest_raft",
            EntityType.Builder.of(getChestRaftFactory(() -> BlocksForBuildersItems.PALM_CHEST_RAFT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> MAPLE_BOAT = register("maple_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.MAPLE_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> MAPLE_CHEST_BOAT = register("maple_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.MAPLE_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> BEECH_BOAT = register("beech_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.BEECH_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> BEECH_CHEST_BOAT = register("beech_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.BEECH_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> PINE_BOAT = register("pine_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.PINE_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> PINE_CHEST_BOAT = register("pine_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.PINE_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> CEDAR_BOAT = register("cedar_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.CEDAR_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> CEDAR_CHEST_BOAT = register("cedar_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.CEDAR_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> GHOSTWOOD_BOAT = register("ghostwood_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.GHOSTWOOD_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> GHOSTWOOD_CHEST_BOAT = register("ghostwood_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> SCORCHWOOD_BOAT = register("scorchwood_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.SCORCHWOOD_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> SCORCHWOOD_CHEST_BOAT = register("scorchwood_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Boat> GREEN_JUNGLE_BOAT = register("green_jungle_boat",
            EntityType.Builder.of(getBoatFactory(() -> BlocksForBuildersItems.GREEN_JUNGLE_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestBoat> GREEN_JUNGLE_CHEST_BOAT = register("green_jungle_chest_boat",
            EntityType.Builder.of(getChestBoatFactory(() -> BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    public static final EntityType<Raft> GREEN_BAMBOO_RAFT = register("green_bamboo_raft",
            EntityType.Builder.of(getRaftFactory(() -> BlocksForBuildersItems.GREEN_BAMBOO_RAFT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));
    public static final EntityType<ChestRaft> GREEN_BAMBOO_CHEST_RAFT = register("green_bamboo_chest_raft",
            EntityType.Builder.of(getChestRaftFactory(() -> BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT), MobCategory.MISC).noLootTable().sized(1.375f, 0.5625f).eyeHeight(0.5625f).clientTrackingRange(10));

    private static EntityType.EntityFactory<Boat> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new Boat(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestBoat> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoat(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<Raft> getRaftFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new Raft(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestRaft> getChestRaftFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestRaft(type, world, itemSupplier);
    }

    private static ResourceKey<EntityType<?>> keyOf(String id) {
        return ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, id));
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, keyOf(id), type.build(keyOf(id)));
    }

    public static ResourceKey<EntityType<?>> getResourceKey(EntityType<?> entityType) {
        return BuiltInRegistries.ENTITY_TYPE.getResourceKey(entityType).get();
    }

    public static void registerEntityTypes() {
        BlocksForBuilders.LOGGER.info("Registering Boats for " + BlocksForBuilders.MOD_ID);
    }
}
