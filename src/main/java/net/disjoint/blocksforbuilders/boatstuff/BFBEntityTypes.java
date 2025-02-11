package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.entity.vehicle.ChestRaftEntity;
import net.minecraft.entity.vehicle.RaftEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class BFBEntityTypes {
    public static final EntityType<BoatEntity> WILLOW_BOAT = register("willow_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.WILLOW_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> WILLOW_CHEST_BOAT = register("willow_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.WILLOW_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<RaftEntity> PALM_RAFT = register("palm_raft",
            EntityType.Builder.create(getRaftFactory(() -> BlocksForBuildersItems.PALM_RAFT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestRaftEntity> PALM_CHEST_RAFT = register("palm_chest_raft",
            EntityType.Builder.create(getChestRaftFactory(() -> BlocksForBuildersItems.PALM_CHEST_RAFT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> MAPLE_BOAT = register("maple_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.MAPLE_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> MAPLE_CHEST_BOAT = register("maple_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.MAPLE_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> BEECH_BOAT = register("beech_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.BEECH_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> BEECH_CHEST_BOAT = register("beech_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.BEECH_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> PINE_BOAT = register("pine_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.PINE_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> PINE_CHEST_BOAT = register("pine_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.PINE_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> GHOSTWOOD_BOAT = register("ghostwood_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.GHOSTWOOD_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> GHOSTWOOD_CHEST_BOAT = register("ghostwood_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> SCORCHWOOD_BOAT = register("scorchwood_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.SCORCHWOOD_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> SCORCHWOOD_CHEST_BOAT = register("scorchwood_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<BoatEntity> GREEN_JUNGLE_BOAT = register("green_jungle_boat",
            EntityType.Builder.create(getBoatFactory(() -> BlocksForBuildersItems.GREEN_JUNGLE_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestBoatEntity> GREEN_JUNGLE_CHEST_BOAT = register("green_jungle_chest_boat",
            EntityType.Builder.create(getChestBoatFactory(() -> BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    public static final EntityType<RaftEntity> GREEN_BAMBOO_RAFT = register("green_bamboo_raft",
            EntityType.Builder.create(getRaftFactory(() -> BlocksForBuildersItems.GREEN_BAMBOO_RAFT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));
    public static final EntityType<ChestRaftEntity> GREEN_BAMBOO_CHEST_RAFT = register("green_bamboo_chest_raft",
            EntityType.Builder.create(getChestRaftFactory(() -> BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT), SpawnGroup.MISC).dropsNothing().dimensions(1.375f, 0.5625f).eyeHeight(0.5625f).maxTrackingRange(10));

    private static EntityType.EntityFactory<BoatEntity> getBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new BoatEntity(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestBoatEntity> getChestBoatFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestBoatEntity(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<RaftEntity> getRaftFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new RaftEntity(type, world, itemSupplier);
    }

    private static EntityType.EntityFactory<ChestRaftEntity> getChestRaftFactory(Supplier<Item> itemSupplier) {
        return (type, world) -> new ChestRaftEntity(type, world, itemSupplier);
    }

    private static RegistryKey<EntityType<?>> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(BlocksForBuilders.MOD_ID, id));
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, keyOf(id), type.build(keyOf(id)));
    }

    public static void registerEntityTypes() {
    }
}
