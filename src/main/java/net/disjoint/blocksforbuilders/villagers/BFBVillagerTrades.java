package net.disjoint.blocksforbuilders.villagers;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class BFBVillagerTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerWanderingTraderOffers(1, (factories) -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.WILLOW_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersItems.COCONUT, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.MAPLE_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.BEECH_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.PINE_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.CEDAR_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 1), 3, 0, 0f
            ));
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(Items.EMERALD, 5),
                    new ItemStack(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 1), 3, 0, 0f
            ));
        });
    }
}
