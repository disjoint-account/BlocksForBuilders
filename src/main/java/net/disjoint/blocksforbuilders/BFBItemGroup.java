package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BFBItemGroup {
    public static ItemGroup BLOCKSFORBUILDERS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlocksForBuilders.MOD_ID, "blocksforbuilders"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocksforbuilders"))
                    .icon(() -> new ItemStack(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)).entries((displayContext, entries) -> {
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_SLAB);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_DOOR);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GHOSTWOOD_BOAT);
                        entries.add(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.WILLOW_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(BlocksForBuildersBlocks.WILLOW_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
                        entries.add(BlocksForBuildersBlocks.WILLOW_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES);
                        entries.add(BlocksForBuildersBlocks.WILLOW_SAPLING);
                        entries.add(BlocksForBuildersBlocks.WILLOW_PLANKS);
                        entries.add(BlocksForBuildersBlocks.WILLOW_STAIRS);
                        entries.add(BlocksForBuildersBlocks.WILLOW_SLAB);
                        entries.add(BlocksForBuildersBlocks.WILLOW_FENCE);
                        entries.add(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.WILLOW_BUTTON);
                        entries.add(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.WILLOW_DOOR);
                        entries.add(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.WILLOW_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.WILLOW_BOAT);
                        entries.add(BlocksForBuildersItems.WILLOW_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GREEN_JUNGLE_BOAT);
                        entries.add(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.RED_OAK_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES);
                        entries.add(BlocksForBuildersBlocks.RED_OAK_SAPLING);
                        entries.add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);
                        entries.add(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES);
                        entries.add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.WARPED_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
                        entries.add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
                        entries.add(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);
                        entries.add(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE);
                        entries.add(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE);

                    }).build());
    public static void registerItemGroups() {
        BlocksForBuilders.LOGGER.info("Registering Item Groups for " + BlocksForBuilders.MOD_ID);
    }
}

