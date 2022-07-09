package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.registry.*;

import static net.disjoint.blocksforbuilders.BlocksForBuilders.*;
import static net.disjoint.blocksforbuilders.BlocksForBuilders.SAKURA_LEAVES;

public class Instance {

    public static void init() {
        {
            FlammableBlockRegistry.getDefaultInstance().add(SAKURA_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(SAKURA_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_SAKURA_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(SAKURA_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_SAKURA_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(SAKURA_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(GREEN_JUNGLE_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(GREEN_JUNGLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GREEN_JUNGLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GREEN_JUNGLE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GREEN_JUNGLE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GREEN_JUNGLE_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(RED_OAK_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(GOLD_ACACIA_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BIRCH_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(SPRUCE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(DARK_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(ACACIA_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(MANGROVE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(SAKURA_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(GREEN_JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_BOOKSHELF, 30, 20);
        }
        {
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.SAKURA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.SAKURA_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GREEN_JUNGLE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GREEN_JUNGLE_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GHOSTWOOD_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GHOSTWOOD_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.RED_OAK_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GOLD_ACACIA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GOLD_ACACIA_SAPLING, 0.30f);
        }
        {
            FuelRegistry.INSTANCE.add(BIRCH_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(SPRUCE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(JUNGLE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(DARK_OAK_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(ACACIA_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(MANGROVE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(SAKURA_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(GREEN_JUNGLE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(GHOSTWOOD_BOOKSHELF, 300);
        }
        addStrippables();

    }

    public static void addStrippables() {
        StrippableBlockRegistry.register(BlocksForBuilders.SAKURA_LOG, BlocksForBuilders.STRIPPED_SAKURA_LOG);
        StrippableBlockRegistry.register(SAKURA_WOOD, STRIPPED_SAKURA_WOOD);
        StrippableBlockRegistry.register(BlocksForBuilders.GREEN_JUNGLE_LOG, BlocksForBuilders.STRIPPED_GREEN_JUNGLE_LOG);
        StrippableBlockRegistry.register(GREEN_JUNGLE_WOOD, STRIPPED_GREEN_JUNGLE_WOOD);
        StrippableBlockRegistry.register(BlocksForBuilders.GHOSTWOOD_LOG, BlocksForBuilders.STRIPPED_GHOSTWOOD_LOG);
        StrippableBlockRegistry.register(GHOSTWOOD_WOOD, STRIPPED_GHOSTWOOD_WOOD);

        }
    }
