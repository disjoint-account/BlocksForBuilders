package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.registry.*;

import static net.disjoint.blocksforbuilders.BlocksForBuilders.*;

public class Instance {

    public static void init() {
        {
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.RED_OAK_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, 30, 20);
        }
        {
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.WILLOW_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.WILLOW_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.RED_OAK_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, 0.30f);
        }
        {
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, 300);
            FuelRegistry.INSTANCE.add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, 300);
        }
        addStrippables();

    }

    public static void addStrippables() {
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GHOSTWOOD_LOG, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.WILLOW_LOG, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        }
    }
