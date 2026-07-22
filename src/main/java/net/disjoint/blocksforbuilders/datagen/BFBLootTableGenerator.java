package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.concurrent.CompletableFuture;

public class BFBLootTableGenerator extends FabricBlockLootSubProvider {
    public BFBLootTableGenerator(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BIRCH_BOOKSHELF));
        add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF));
        add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF));
        add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.ACACIA_BOOKSHELF));
        add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF));
        add(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF));
        add(BlocksForBuildersBlocks.WARPED_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WARPED_BOOKSHELF));
        add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF));
        add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CHERRY_BOOKSHELF));
        add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF));
        add(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF));
        add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF));
        add(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF));
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF));
        add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WILLOW_BOOKSHELF));
        add(BlocksForBuildersBlocks.PALM_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.PALM_BOOKSHELF));
        add(BlocksForBuildersBlocks.MAPLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.MAPLE_BOOKSHELF));
        add(BlocksForBuildersBlocks.BEECH_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BEECH_BOOKSHELF));
        add(BlocksForBuildersBlocks.PINE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.PINE_BOOKSHELF));
        add(BlocksForBuildersBlocks.CEDAR_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CEDAR_BOOKSHELF));
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF));

        dropSelf(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
        dropSelf(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
        add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
        dropSelf(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        dropSelf(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE);
        dropSelf(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE);
        dropSelf(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE);

        dropSelf(BlocksForBuildersBlocks.QUARTZ_WALL);
        dropSelf(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL);

        add(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_PROPAGULE, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_SAPLING, 0.0f));
        add(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, Blocks.PALE_OAK_SAPLING, 0.0f));

        dropSelf(BlocksForBuildersBlocks.OAK_HEDGE);
        dropSelf(BlocksForBuildersBlocks.BIRCH_HEDGE);
        dropSelf(BlocksForBuildersBlocks.SPRUCE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.JUNGLE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.DARK_OAK_HEDGE);
        dropSelf(BlocksForBuildersBlocks.ACACIA_HEDGE);
        dropSelf(BlocksForBuildersBlocks.AZALEA_HEDGE);
        dropSelf(BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE);
        dropSelf(BlocksForBuildersBlocks.MANGROVE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.CHERRY_HEDGE);
        dropSelf(BlocksForBuildersBlocks.PALE_OAK_HEDGE);

        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
        add(BlocksForBuildersBlocks.GHOSTWOOD_DOOR, createDoorTable(BlocksForBuildersBlocks.GHOSTWOOD_DOOR));
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
        add(BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 0.0f));
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_HEDGE);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_LOG);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING));
        add(BlocksForBuildersBlocks.GHOSTWOOD_SIGN, createSingleItemTable(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GHOSTWOOD_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GHOSTWOOD_SLAB));
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_SHELF);
        add(BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);

        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
        add(BlocksForBuildersBlocks.SCORCHWOOD_DOOR, createDoorTable(BlocksForBuildersBlocks.SCORCHWOOD_DOOR));
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
        add(BlocksForBuildersBlocks.SCORCHWOOD_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_LOG);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING));
        add(BlocksForBuildersBlocks.SCORCHWOOD_SIGN, createSingleItemTable(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM));
        add(BlocksForBuildersBlocks.SCORCHWOOD_SLAB, createSlabItemTable(BlocksForBuildersBlocks.SCORCHWOOD_SLAB));
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_SHELF);
        add(BlocksForBuildersBlocks.SCORCHWOOD_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.SCORCHWOOD_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);

        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, createDoorTable(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR));
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.025f));
        add(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING));
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB));
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF);
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);

        dropSelf(BlocksForBuildersBlocks.WILLOW_BUTTON);
        add(BlocksForBuildersBlocks.WILLOW_DOOR, createDoorTable(BlocksForBuildersBlocks.WILLOW_DOOR));
        dropSelf(BlocksForBuildersBlocks.WILLOW_FENCE);
        dropSelf(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
        add(BlocksForBuildersBlocks.WILLOW_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.WILLOW_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.WILLOW_HEDGE);
        dropSelf(BlocksForBuildersBlocks.WILLOW_LOG);
        dropSelf(BlocksForBuildersBlocks.WILLOW_PLANKS);
        dropSelf(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.WILLOW_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.WILLOW_SAPLING));
        add(BlocksForBuildersBlocks.WILLOW_SIGN, createSingleItemTable(BlocksForBuildersItems.WILLOW_SIGN_ITEM));
        add(BlocksForBuildersBlocks.WILLOW_SLAB, createSlabItemTable(BlocksForBuildersBlocks.WILLOW_SLAB));
        dropSelf(BlocksForBuildersBlocks.WILLOW_STAIRS);
        dropSelf(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.WILLOW_SHELF);
        add(BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.WILLOW_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.WILLOW_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.WILLOW_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        dropSelf(BlocksForBuildersBlocks.PALM_BUTTON);
        add(BlocksForBuildersBlocks.PALM_DOOR, createDoorTable(BlocksForBuildersBlocks.PALM_DOOR));
        dropSelf(BlocksForBuildersBlocks.PALM_FENCE);
        dropSelf(BlocksForBuildersBlocks.PALM_FENCE_GATE);
        add(BlocksForBuildersBlocks.PALM_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.COCONUT, 0.0f));
        dropSelf(BlocksForBuildersBlocks.PALM_HEDGE);
        dropSelf(BlocksForBuildersBlocks.PALM_LOG);
        dropSelf(BlocksForBuildersBlocks.PALM_PLANKS);
        dropSelf(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE);
        add(BlocksForBuildersBlocks.PALM_SIGN, createSingleItemTable(BlocksForBuildersItems.PALM_SIGN_ITEM));
        add(BlocksForBuildersBlocks.PALM_SLAB, createSlabItemTable(BlocksForBuildersBlocks.PALM_SLAB));
        dropSelf(BlocksForBuildersBlocks.PALM_STAIRS);
        dropSelf(BlocksForBuildersBlocks.PALM_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.PALM_SHELF);
        add(BlocksForBuildersBlocks.PALM_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.PALM_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.PALM_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.PALM_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);

        dropSelf(BlocksForBuildersBlocks.MAPLE_BUTTON);
        add(BlocksForBuildersBlocks.MAPLE_DOOR, createDoorTable(BlocksForBuildersBlocks.MAPLE_DOOR));
        dropSelf(BlocksForBuildersBlocks.MAPLE_FENCE);
        dropSelf(BlocksForBuildersBlocks.MAPLE_FENCE_GATE);
        add(BlocksForBuildersBlocks.MAPLE_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.MAPLE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.MAPLE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.MAPLE_LOG);
        dropSelf(BlocksForBuildersBlocks.MAPLE_PLANKS);
        dropSelf(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.MAPLE_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.MAPLE_SAPLING));
        add(BlocksForBuildersBlocks.MAPLE_SIGN, createSingleItemTable(BlocksForBuildersItems.MAPLE_SIGN_ITEM));
        add(BlocksForBuildersBlocks.MAPLE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.MAPLE_SLAB));
        dropSelf(BlocksForBuildersBlocks.MAPLE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.MAPLE_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.MAPLE_SHELF);
        add(BlocksForBuildersBlocks.MAPLE_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.MAPLE_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.MAPLE_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.MAPLE_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);

        dropSelf(BlocksForBuildersBlocks.BEECH_BUTTON);
        add(BlocksForBuildersBlocks.BEECH_DOOR, createDoorTable(BlocksForBuildersBlocks.BEECH_DOOR));
        dropSelf(BlocksForBuildersBlocks.BEECH_FENCE);
        dropSelf(BlocksForBuildersBlocks.BEECH_FENCE_GATE);
        add(BlocksForBuildersBlocks.BEECH_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.BEECH_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.BEECH_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.BEECH_HEDGE);
        dropSelf(BlocksForBuildersBlocks.BEECH_LOG);
        dropSelf(BlocksForBuildersBlocks.BEECH_PLANKS);
        dropSelf(BlocksForBuildersBlocks.BEECH_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.BEECH_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_BEECH_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.BEECH_SAPLING));
        add(BlocksForBuildersBlocks.BEECH_SIGN, createSingleItemTable(BlocksForBuildersItems.BEECH_SIGN_ITEM));
        add(BlocksForBuildersBlocks.BEECH_SLAB, createSlabItemTable(BlocksForBuildersBlocks.BEECH_SLAB));
        dropSelf(BlocksForBuildersBlocks.BEECH_STAIRS);
        dropSelf(BlocksForBuildersBlocks.BEECH_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.BEECH_SHELF);
        add(BlocksForBuildersBlocks.BEECH_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.BEECH_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.BEECH_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.BEECH_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.BEECH_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);

        dropSelf(BlocksForBuildersBlocks.PINE_BUTTON);
        add(BlocksForBuildersBlocks.PINE_DOOR, createDoorTable(BlocksForBuildersBlocks.PINE_DOOR));
        dropSelf(BlocksForBuildersBlocks.PINE_FENCE);
        dropSelf(BlocksForBuildersBlocks.PINE_FENCE_GATE);
        add(BlocksForBuildersBlocks.PINE_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.PINE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.PINE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.PINE_LEAVES, BlocksForBuildersBlocks.PINE_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlocksForBuildersBlocks.PINE_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.PINE_HEDGE);
        dropSelf(BlocksForBuildersBlocks.PINE_LOG);
        dropSelf(BlocksForBuildersBlocks.PINE_PLANKS);
        dropSelf(BlocksForBuildersBlocks.PINE_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.PINE_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_PINE_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.PINE_SAPLING));
        add(BlocksForBuildersBlocks.PINE_SIGN, createSingleItemTable(BlocksForBuildersItems.PINE_SIGN_ITEM));
        add(BlocksForBuildersBlocks.PINE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.PINE_SLAB));
        dropSelf(BlocksForBuildersBlocks.PINE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.PINE_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.PINE_SHELF);
        add(BlocksForBuildersBlocks.PINE_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.PINE_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.PINE_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.PINE_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.PINE_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_PINE_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);

        dropSelf(BlocksForBuildersBlocks.CEDAR_BUTTON);
        add(BlocksForBuildersBlocks.CEDAR_DOOR, createDoorTable(BlocksForBuildersBlocks.CEDAR_DOOR));
        dropSelf(BlocksForBuildersBlocks.CEDAR_FENCE);
        dropSelf(BlocksForBuildersBlocks.CEDAR_FENCE_GATE);
        add(BlocksForBuildersBlocks.CEDAR_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.CEDAR_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.CEDAR_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.CEDAR_HEDGE);
        dropSelf(BlocksForBuildersBlocks.CEDAR_LOG);
        dropSelf(BlocksForBuildersBlocks.CEDAR_PLANKS);
        dropSelf(BlocksForBuildersBlocks.CEDAR_PRESSURE_PLATE);
        dropSelf(BlocksForBuildersBlocks.CEDAR_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_CEDAR_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.CEDAR_SAPLING));
        add(BlocksForBuildersBlocks.CEDAR_SIGN, createSingleItemTable(BlocksForBuildersItems.CEDAR_SIGN_ITEM));
        add(BlocksForBuildersBlocks.CEDAR_SLAB, createSlabItemTable(BlocksForBuildersBlocks.CEDAR_SLAB));
        dropSelf(BlocksForBuildersBlocks.CEDAR_STAIRS);
        dropSelf(BlocksForBuildersBlocks.CEDAR_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.CEDAR_SHELF);
        add(BlocksForBuildersBlocks.CEDAR_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.CEDAR_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.CEDAR_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.CEDAR_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.CEDAR_WOOD);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);
        dropSelf(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);

        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, createDoorTable(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR));
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM));
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB));
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);
        dropSelf(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF);
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_HANGING_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM));
        add(BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_SIGN, createSingleItemTable(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM));

        add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE);
        dropSelf(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));
        add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 0.05f));
        add(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, createLeavesDrops(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 0.0f));
        dropSelf(BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE);
        dropSelf(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING);
        add(BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, createPotFlowerItemTable(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING));

        dropSelf(BlocksForBuildersBlocks.GRIMSTONE);
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
        add(BlocksForBuildersBlocks.GRIMSTONE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GRIMSTONE_SLAB));
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
        dropSelf(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
        dropSelf(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
        add(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB));
        dropSelf(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_TILES);
        dropSelf(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES);
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS);
        add(BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB));
        dropSelf(BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL);

        dropSelf(BlocksForBuildersBlocks.ANTIGORITE);
        dropSelf(BlocksForBuildersBlocks.ANTIGORITE_STAIRS);
        add(BlocksForBuildersBlocks.ANTIGORITE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.ANTIGORITE_SLAB));
        dropSelf(BlocksForBuildersBlocks.ANTIGORITE_WALL);
        dropSelf(BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
        dropSelf(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS);
        add(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB));
        dropSelf(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL);
        dropSelf(BlocksForBuildersBlocks.ANTIGORITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.CALCITE_STAIRS);
        add(BlocksForBuildersBlocks.CALCITE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.CALCITE_SLAB));
        dropSelf(BlocksForBuildersBlocks.CALCITE_WALL);
        dropSelf(BlocksForBuildersBlocks.POLISHED_CALCITE);
        dropSelf(BlocksForBuildersBlocks.POLISHED_CALCITE_STAIRS);
        add(BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB));
        dropSelf(BlocksForBuildersBlocks.POLISHED_CALCITE_WALL);
        dropSelf(BlocksForBuildersBlocks.CALCITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_CALCITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.CALCITE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.CALCITE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.CALCITE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF);
        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF_STAIRS);
        add(BlocksForBuildersBlocks.LIGHT_TUFF_SLAB, createSlabItemTable(BlocksForBuildersBlocks.LIGHT_TUFF_SLAB));
        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF_WALL);
        dropSelf(BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF);
        dropSelf(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
        dropSelf(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_STAIRS);
        add(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB, createSlabItemTable(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB));
        dropSelf(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_WALL);
        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS);
        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS);

        dropSelf(BlocksForBuildersBlocks.POLISHED_GRANITE_WALL);
        dropSelf(BlocksForBuildersBlocks.GRANITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.GRANITE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.GRANITE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.GRANITE_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.POLISHED_DIORITE_WALL);
        dropSelf(BlocksForBuildersBlocks.DIORITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.DIORITE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.DIORITE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.DIORITE_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(BlocksForBuildersBlocks.ANDESITE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.ANDESITE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_STONE_WALL);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_SMOOTH_STONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.CUT_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS);
        dropSelf(BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL);

        dropSelf(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL);
        dropSelf(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.DARK_SAND);
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE);
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE_STAIRS);
        add(BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB));
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
        dropSelf(BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_STAIRS);
        add(BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_SLAB));
        dropSelf(BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE);
        dropSelf(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS);
        add(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, createSlabItemTable(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB));
        dropSelf(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL);
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.CRACKED_DARK_SANDSTONE_BRICKS);
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS);
        add(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB, createSlabItemTable(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB));
        dropSelf(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL);

        dropSelf(BlocksForBuildersBlocks.HAY_STAIRS);
        add(BlocksForBuildersBlocks.HAY_SLAB, createSlabItemTable(BlocksForBuildersBlocks.HAY_SLAB));
        dropSelf(BlocksForBuildersBlocks.HAY_RUG);

        dropSelf(BlocksForBuildersBlocks.BAMBOO_THATCH);
        dropSelf(BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS);
        add(BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, createSlabItemTable(BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB));
        dropSelf(BlocksForBuildersBlocks.BAMBOO_THATCH_RUG);
        dropSelf(BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG);

        dropSelf(BlocksForBuildersBlocks.COCONUT_THATCH);
        dropSelf(BlocksForBuildersBlocks.COCONUT_THATCH_STAIRS);
        add(BlocksForBuildersBlocks.COCONUT_THATCH_SLAB, createSlabItemTable(BlocksForBuildersBlocks.COCONUT_THATCH_SLAB));
        dropSelf(BlocksForBuildersBlocks.COCONUT_THATCH_RUG);

        add(BlocksForBuildersBlocks.SCORCHED_GRASS, silkTouchAltDrops(BlocksForBuildersBlocks.SCORCHED_GRASS, Blocks.DIRT, 1.0f, 1.0f));
        dropSelf(BlocksForBuildersBlocks.ASHEN_CARPET);
    }
    public LootTable.Builder bookshelfDrops(Block drop) {
        return this.createSilkTouchDispatchTable(drop, this.applyExplosionDecay(
                drop,
                LootItem.lootTableItem(Items.BOOK)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 3.0F)))
        ));
    }
    public LootTable.Builder silkTouchAltDrops(Block block, Block drop, float minDrops, float maxDrops) {
        return this.createSilkTouchDispatchTable(block, this.applyExplosionDecay(
                drop,
                LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
        ));
    }
}
