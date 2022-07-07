package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.registry.*;

import static net.disjoint.blocksforbuilders.BlocksForBuilders.*;

public class Instance {

    public static void init() {
        {
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GHOSTWOOD_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(STRIPPED_GHOSTWOOD_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(GHOSTWOOD_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(RED_OAK_LEAVES, 30, 60);
            FlammableBlockRegistry.getDefaultInstance().add(GOLD_ACACIA_LEAVES, 30, 60);
        }
        {
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GHOSTWOOD_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GHOSTWOOD_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.RED_OAK_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.RED_OAK_SAPLING, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GOLD_ACACIA_LEAVES, 0.30f);
            CompostingChanceRegistry.INSTANCE.add(BlocksForBuilders.GOLD_ACACIA_SAPLING, 0.30f);
        }
        addStrippables();

    }

    public static void addStrippables() {
            StrippableBlockRegistry.register(BlocksForBuilders.GHOSTWOOD_LOG, BlocksForBuilders.STRIPPED_GHOSTWOOD_LOG);
            StrippableBlockRegistry.register(GHOSTWOOD_WOOD, STRIPPED_GHOSTWOOD_WOOD);

        }
    }
