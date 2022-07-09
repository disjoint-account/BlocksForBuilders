package net.disjoint.blocksforbuilders.util;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class BlocksForBuildersLootTableModifiers {
    private static final Identifier SHIPWRECK_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier JUNGLE_TEMPLE_BASEMENT_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {

            if(SHIPWRECK_TREASURE_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3333f))
                        .with(ItemEntry.builder(BlocksForBuilders.GHOSTWOOD_SAPLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());
                supplier.pool(poolBuilder.build());
            }

                if(JUNGLE_TEMPLE_BASEMENT_CHEST_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.6f))
                            .with(ItemEntry.builder(BlocksForBuilders.GREEN_JUNGLE_SAPLING))
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)).build());
                    supplier.pool(poolBuilder.build());
                }
            }));
        }

}