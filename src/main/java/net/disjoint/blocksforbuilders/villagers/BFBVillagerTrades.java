package net.disjoint.blocksforbuilders.villagers;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffers.Factory;
import net.minecraft.village.TradeOffers.SellItemFactory;

import java.util.ArrayList;

public class BFBVillagerTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerWanderingTraderOffers((consumer)-> {
            ArrayList<Factory> trades = new ArrayList<>();

            trades.add(new SellItemFactory(BlocksForBuildersBlocks.WILLOW_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersItems.COCONUT, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.MAPLE_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.BEECH_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.PINE_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.CEDAR_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 5, 1, 3, 0));
            trades.add(new SellItemFactory(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 5, 1, 3, 0));
            consumer.pool(Identifier.of(BlocksForBuilders.MOD_ID), 1, trades);
        });
    }
}
