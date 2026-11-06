package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.item.v1.BlockTransformerHelper;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.api.registry.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;

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

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALM_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALM_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_PALM_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALM_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALM_LEAVES, 30, 60);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MAPLE_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MAPLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MAPLE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD, 5, 5);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BEECH_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BEECH_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BEECH_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD, 5, 5);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PINE_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PINE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_PINE_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PINE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PINE_LEAVES, 30, 60);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CEDAR_PLANKS, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CEDAR_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CEDAR_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD, 5, 5);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CEDAR_LEAVES, 30, 60);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 5, 20);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, 30, 60);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BAMBOO_THATCH, 5, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.COCONUT_THATCH, 5, 20);

            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.POPLAR_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PALM_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.MAPLE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.BEECH_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.PINE_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.CEDAR_BOOKSHELF, 30, 20);
            FlammableBlockRegistry.getDefaultInstance().add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, 30, 20);
        }
        addStrippables();
        unfoodify();
    }

    public static void unfoodify() {
        DefaultItemComponentEvents.MODIFY.register((modifyContext) -> {
            modifyContext.modify(Items.PUMPKIN_PIE, (builder) -> {
                builder.set(DataComponents.FOOD, null).set(DataComponents.CONSUMABLE, null).build();
            });
        });
    }

    public static void addStrippables() {
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.GHOSTWOOD_LOG, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.SCORCHWOOD_LOG, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.SCORCHWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.WILLOW_LOG, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.PALM_LOG, BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.PALM_WOOD, BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.MAPLE_LOG, BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.MAPLE_WOOD, BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.BEECH_LOG, BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.BEECH_WOOD, BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.PINE_LOG, BlocksForBuildersBlocks.STRIPPED_PINE_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.PINE_WOOD, BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.CEDAR_LOG, BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);
        BlockTransformerHelper.registerStripping(BlocksForBuildersBlocks.CEDAR_WOOD, BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);

    }
}
