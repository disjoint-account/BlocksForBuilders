package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.registry.*;

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
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SCORCHWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SCORCHWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.RED_OAK_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BAMBOO_THATCH, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, 30, 20);
        }
        {
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.WILLOW_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.WILLOW_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.RED_OAK_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 0.30f);
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
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.HAY_STAIRS, 0.85f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuildersBlocks.HAY_SLAB, 0.85f);
        }
        {
            FuelRegistryEvents.BUILD.register((builder, context) -> {
                        builder.add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.BAMBOO_THATCH, 60000 / context.baseSmeltTime());
                        builder.add(BlocksForBuildersBlocks.BAMBOO_THATCH_RUG, context.baseSmeltTime() / 2);
                        builder.add(BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG, context.baseSmeltTime() / 2);
                    });
                    addStrippables();
        }
    }

    public static void addStrippables() {
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GHOSTWOOD_LOG, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.SCORCHWOOD_LOG, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.SCORCHWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.WILLOW_LOG, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        }
    }
