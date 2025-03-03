package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BFBItemGroup {
    public static ItemGroup BLOCKSFORBUILDERS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlocksForBuilders.MOD_ID, "blocksforbuilders"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocksforbuilders"))
                    .icon(() -> new ItemStack(BlocksForBuildersBlocks.WILLOW_PLANKS)).entries((displayContext, entries) -> {
                        entries.add(BlocksForBuildersBlocks.WILLOW_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(BlocksForBuildersBlocks.WILLOW_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
                        entries.add(BlocksForBuildersBlocks.WILLOW_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES);
                        entries.add(BlocksForBuildersBlocks.WILLOW_HEDGE);
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
                        entries.add(BlocksForBuildersBlocks.PALM_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
                        entries.add(BlocksForBuildersBlocks.PALM_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);
                        entries.add(BlocksForBuildersBlocks.PALM_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES);
                        entries.add(BlocksForBuildersBlocks.PALM_HEDGE);
                        entries.add(BlocksForBuildersItems.COCONUT);
                        entries.add(BlocksForBuildersBlocks.PALM_PLANKS);
                        entries.add(BlocksForBuildersBlocks.PALM_STAIRS);
                        entries.add(BlocksForBuildersBlocks.PALM_SLAB);
                        entries.add(BlocksForBuildersBlocks.PALM_FENCE);
                        entries.add(BlocksForBuildersBlocks.PALM_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.PALM_BUTTON);
                        entries.add(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.PALM_DOOR);
                        entries.add(BlocksForBuildersBlocks.PALM_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.PALM_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.PALM_RAFT);
                        entries.add(BlocksForBuildersItems.PALM_CHEST_RAFT);
                        entries.add(BlocksForBuildersBlocks.MAPLE_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(BlocksForBuildersBlocks.MAPLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.MAPLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.MAPLE_HEDGE);
                        entries.add(BlocksForBuildersBlocks.MAPLE_SAPLING);
                        entries.add(BlocksForBuildersBlocks.MAPLE_PLANKS);
                        entries.add(BlocksForBuildersBlocks.MAPLE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.MAPLE_SLAB);
                        entries.add(BlocksForBuildersBlocks.MAPLE_FENCE);
                        entries.add(BlocksForBuildersBlocks.MAPLE_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.MAPLE_BUTTON);
                        entries.add(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.MAPLE_DOOR);
                        entries.add(BlocksForBuildersBlocks.MAPLE_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.MAPLE_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.MAPLE_BOAT);
                        entries.add(BlocksForBuildersItems.MAPLE_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.BEECH_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);
                        entries.add(BlocksForBuildersBlocks.BEECH_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);
                        entries.add(BlocksForBuildersBlocks.BEECH_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES);
                        entries.add(BlocksForBuildersBlocks.BEECH_HEDGE);
                        entries.add(BlocksForBuildersBlocks.BEECH_SAPLING);
                        entries.add(BlocksForBuildersBlocks.BEECH_PLANKS);
                        entries.add(BlocksForBuildersBlocks.BEECH_STAIRS);
                        entries.add(BlocksForBuildersBlocks.BEECH_SLAB);
                        entries.add(BlocksForBuildersBlocks.BEECH_FENCE);
                        entries.add(BlocksForBuildersBlocks.BEECH_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.BEECH_BUTTON);
                        entries.add(BlocksForBuildersBlocks.BEECH_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.BEECH_DOOR);
                        entries.add(BlocksForBuildersBlocks.BEECH_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.BEECH_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.BEECH_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.BEECH_BOAT);
                        entries.add(BlocksForBuildersItems.BEECH_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.PINE_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_PINE_LOG);
                        entries.add(BlocksForBuildersBlocks.PINE_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);
                        entries.add(BlocksForBuildersBlocks.PINE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.PINE_HEDGE);
                        entries.add(BlocksForBuildersBlocks.PINE_SAPLING);
                        entries.add(BlocksForBuildersBlocks.PINE_PLANKS);
                        entries.add(BlocksForBuildersBlocks.PINE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.PINE_SLAB);
                        entries.add(BlocksForBuildersBlocks.PINE_FENCE);
                        entries.add(BlocksForBuildersBlocks.PINE_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.PINE_BUTTON);
                        entries.add(BlocksForBuildersBlocks.PINE_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.PINE_DOOR);
                        entries.add(BlocksForBuildersBlocks.PINE_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.PINE_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.PINE_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.PINE_BOAT);
                        entries.add(BlocksForBuildersItems.PINE_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.CEDAR_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);
                        entries.add(BlocksForBuildersBlocks.CEDAR_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);
                        entries.add(BlocksForBuildersBlocks.CEDAR_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES);
                        entries.add(BlocksForBuildersBlocks.CEDAR_HEDGE);
                        entries.add(BlocksForBuildersBlocks.CEDAR_SAPLING);
                        entries.add(BlocksForBuildersBlocks.CEDAR_PLANKS);
                        entries.add(BlocksForBuildersBlocks.CEDAR_STAIRS);
                        entries.add(BlocksForBuildersBlocks.CEDAR_SLAB);
                        entries.add(BlocksForBuildersBlocks.CEDAR_FENCE);
                        entries.add(BlocksForBuildersBlocks.CEDAR_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.CEDAR_BUTTON);
                        entries.add(BlocksForBuildersBlocks.CEDAR_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.CEDAR_DOOR);
                        entries.add(BlocksForBuildersBlocks.CEDAR_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.CEDAR_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.CEDAR_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.CEDAR_BOAT);
                        entries.add(BlocksForBuildersItems.CEDAR_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_HEDGE);
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
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_SLAB);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_DOOR);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.SCORCHWOOD_BOAT);
                        entries.add(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE);
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
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);
                        entries.add(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM);
                        entries.add(BlocksForBuildersItems.GREEN_BAMBOO_RAFT);
                        entries.add(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT);
                        entries.add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE);
                        entries.add(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);
                        entries.add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);
                        entries.add(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES);
                        entries.add(BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE);
                        entries.add(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING);
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
                        entries.add(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES);
                        entries.add(BlocksForBuildersBlocks.OAK_HEDGE);
                        entries.add(BlocksForBuildersBlocks.BIRCH_HEDGE);
                        entries.add(BlocksForBuildersBlocks.SPRUCE_HEDGE);
                        entries.add(BlocksForBuildersBlocks.JUNGLE_HEDGE);
                        entries.add(BlocksForBuildersBlocks.DARK_OAK_HEDGE);
                        entries.add(BlocksForBuildersBlocks.ACACIA_HEDGE);
                        entries.add(BlocksForBuildersBlocks.AZALEA_HEDGE);
                        entries.add(BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE);
                        entries.add(BlocksForBuildersBlocks.MANGROVE_HEDGE);
                        entries.add(BlocksForBuildersBlocks.CHERRY_HEDGE);
                        entries.add(BlocksForBuildersBlocks.PALE_OAK_HEDGE);
                        entries.add(BlocksForBuildersBlocks.SCORCHED_GRASS);
                        entries.add(BlocksForBuildersBlocks.ASHEN_CARPET);
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
                        entries.add(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.PALM_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.MAPLE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.BEECH_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.PINE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.CEDAR_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_SLAB);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
                        entries.add(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                        entries.add(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB);
                        entries.add(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                        entries.add(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_TILES);
                        entries.add(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB);
                        entries.add(BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL);
                        entries.add(BlocksForBuildersBlocks.ANTIGORITE);
                        entries.add(BlocksForBuildersBlocks.ANTIGORITE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.ANTIGORITE_SLAB);
                        entries.add(BlocksForBuildersBlocks.ANTIGORITE_WALL);
                        entries.add(BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
                        entries.add(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB);
                        entries.add(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL);
                        entries.add(BlocksForBuildersBlocks.POLISHED_GRANITE_WALL);
                        entries.add(BlocksForBuildersBlocks.POLISHED_DIORITE_WALL);
                        entries.add(BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_THATCH);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_THATCH_RUG);
                        entries.add(BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG);
                        entries.add(BlocksForBuildersBlocks.COCONUT_THATCH);
                        entries.add(BlocksForBuildersBlocks.COCONUT_THATCH_STAIRS);
                        entries.add(BlocksForBuildersBlocks.COCONUT_THATCH_SLAB);
                        entries.add(BlocksForBuildersBlocks.COCONUT_THATCH_RUG);
                        entries.add(BlocksForBuildersBlocks.HAY_STAIRS);
                        entries.add(BlocksForBuildersBlocks.HAY_SLAB);
                        entries.add(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.CUT_SANDSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS);
                        entries.add(BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL);
                        entries.add(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
                        entries.add(BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS);
                        entries.add(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB);
                        entries.add(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL);
                        entries.add(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
                        entries.add(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS);
                        entries.add(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB);
                        entries.add(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL);
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
                        entries.add(BlocksForBuildersBlocks.QUARTZ_WALL);
                        entries.add(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL);
                        entries.add(BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS);
                        entries.add(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB);
                        entries.add(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL);
                        entries.add(BlocksForBuildersItems.SHEARED_COCONUT);
                        entries.add(BlocksForBuildersItems.EMPTY_COCONUT);
                        entries.add(BlocksForBuildersItems.SHEARED_EMPTY_COCONUT);
                        entries.add(BlocksForBuildersItems.COCONUT_HUSK);
                        entries.add(BlocksForBuildersItems.COCONUT_FIBER);
                        entries.add(Items.PUMPKIN_PIE);
                    }).build());
    public static void registerItemGroups() {
        BlocksForBuilders.LOGGER.info("Registering Item Groups for " + BlocksForBuilders.MOD_ID);
    }
}

