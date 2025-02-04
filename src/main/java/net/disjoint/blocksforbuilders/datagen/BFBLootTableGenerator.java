package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BFBLootTableGenerator extends FabricBlockLootTableProvider {
    public BFBLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BIRCH_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.ACACIA_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.WARPED_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WARPED_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CHERRY_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WILLOW_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.PALM_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WILLOW_BOOKSHELF));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF));

        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, slabDrops(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB));
        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
        addDrop(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        addDrop(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE);

        addDrop(BlocksForBuildersBlocks.QUARTZ_WALL);
        addDrop(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL);
        addDrop(BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS);
        addDrop(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, slabDrops(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB));
        addDrop(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL);

        addDrop(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_PROPAGULE, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, Blocks.PALE_OAK_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.PALM_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, BlocksForBuildersBlocks.ORANGE_OAK_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 0.0f));

        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_DOOR, doorDrops(BlocksForBuildersBlocks.GHOSTWOOD_DOOR));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, leavesDrops(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_LOG);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_SLAB, slabDrops(BlocksForBuildersBlocks.GHOSTWOOD_SLAB));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);

        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_DOOR, doorDrops(BlocksForBuildersBlocks.SCORCHWOOD_DOOR));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_HANGING_SIGN, drops(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_LOG);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_SIGN, drops(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_SLAB, slabDrops(BlocksForBuildersBlocks.SCORCHWOOD_SLAB));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_WALL_SIGN, drops(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);

        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, doorDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.025f));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, slabDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);

        addDrop(BlocksForBuildersBlocks.WILLOW_BUTTON);
        addDrop(BlocksForBuildersBlocks.WILLOW_DOOR, doorDrops(BlocksForBuildersBlocks.WILLOW_DOOR));
        addDrop(BlocksForBuildersBlocks.WILLOW_FENCE);
        addDrop(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.WILLOW_HANGING_SIGN, drops(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.WILLOW_LEAVES, leavesDrops(BlocksForBuildersBlocks.WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.WILLOW_LOG);
        addDrop(BlocksForBuildersBlocks.WILLOW_PLANKS);
        addDrop(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.WILLOW_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.WILLOW_SAPLING));
        addDrop(BlocksForBuildersBlocks.WILLOW_SIGN, drops(BlocksForBuildersItems.WILLOW_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.WILLOW_SLAB, slabDrops(BlocksForBuildersBlocks.WILLOW_SLAB));
        addDrop(BlocksForBuildersBlocks.WILLOW_STAIRS);
        addDrop(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.WILLOW_WALL_SIGN, drops(BlocksForBuildersItems.WILLOW_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.WILLOW_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        addDrop(BlocksForBuildersBlocks.PALM_BUTTON);
        addDrop(BlocksForBuildersBlocks.PALM_DOOR, doorDrops(BlocksForBuildersBlocks.PALM_DOOR));
        addDrop(BlocksForBuildersBlocks.PALM_FENCE);
        addDrop(BlocksForBuildersBlocks.PALM_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.PALM_HANGING_SIGN, drops(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.PALM_LEAVES, leavesDrops(BlocksForBuildersBlocks.PALM_LEAVES, BlocksForBuildersBlocks.PALM_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.PALM_LOG);
        addDrop(BlocksForBuildersBlocks.PALM_PLANKS);
        addDrop(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.PALM_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_PALM_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.PALM_SAPLING));
        addDrop(BlocksForBuildersBlocks.PALM_SIGN, drops(BlocksForBuildersItems.PALM_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.PALM_SLAB, slabDrops(BlocksForBuildersBlocks.PALM_SLAB));
        addDrop(BlocksForBuildersBlocks.PALM_STAIRS);
        addDrop(BlocksForBuildersBlocks.PALM_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.PALM_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.PALM_WALL_SIGN, drops(BlocksForBuildersItems.PALM_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.PALM_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);

        addDrop(BlocksForBuildersBlocks.MAPLE_BUTTON);
        addDrop(BlocksForBuildersBlocks.MAPLE_DOOR, doorDrops(BlocksForBuildersBlocks.MAPLE_DOOR));
        addDrop(BlocksForBuildersBlocks.MAPLE_FENCE);
        addDrop(BlocksForBuildersBlocks.MAPLE_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.MAPLE_HANGING_SIGN, drops(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.MAPLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.MAPLE_LOG);
        addDrop(BlocksForBuildersBlocks.MAPLE_PLANKS);
        addDrop(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.MAPLE_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.MAPLE_SAPLING));
        addDrop(BlocksForBuildersBlocks.MAPLE_SIGN, drops(BlocksForBuildersItems.MAPLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.MAPLE_SLAB, slabDrops(BlocksForBuildersBlocks.MAPLE_SLAB));
        addDrop(BlocksForBuildersBlocks.MAPLE_STAIRS);
        addDrop(BlocksForBuildersBlocks.MAPLE_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.MAPLE_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.MAPLE_WALL_SIGN, drops(BlocksForBuildersItems.MAPLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.MAPLE_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);

        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, doorDrops(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_HANGING_SIGN, drops(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN, drops(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, slabDrops(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_SIGN, drops(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM));

        addDrop(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, leavesDrops(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));
        addDrop(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES, oakLeavesDrops(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES, BlocksForBuildersBlocks.ORANGE_OAK_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_ORANGE_OAK_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING));
        addDrop(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, leavesDrops(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING);
        addDrop(BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING));

        addDrop(BlocksForBuildersBlocks.GRIMSTONE);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_SLAB, slabDrops(BlocksForBuildersBlocks.GRIMSTONE_SLAB));
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_WALL);
        addDrop(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
        addDrop(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
        addDrop(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
        addDrop(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, slabDrops(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB));
        addDrop(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        addDrop(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, slabDrops(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB));
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_TILES);
        addDrop(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS);
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, slabDrops(BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB));
        addDrop(BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL);

        addDrop(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS);

        addDrop(BlocksForBuildersBlocks.HAY_STAIRS);
        addDrop(BlocksForBuildersBlocks.HAY_SLAB, slabDrops(BlocksForBuildersBlocks.HAY_SLAB));

        addDrop(BlocksForBuildersBlocks.BAMBOO_THATCH);
        addDrop(BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS);
        addDrop(BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, slabDrops(BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB));
        addDrop(BlocksForBuildersBlocks.BAMBOO_THATCH_RUG);
        addDrop(BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG);

        addDrop(BlocksForBuildersBlocks.SCORCHED_GRASS, silkTouchAltDrops(BlocksForBuildersBlocks.SCORCHED_GRASS, Blocks.DIRT, 1.0f, 1.0f));
        addDrop(BlocksForBuildersBlocks.ASHEN_CARPET);
    }
    public LootTable.Builder bookshelfDrops(Block drop) {
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(Items.BOOK).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0f, 3.0f))))));
    }
    public LootTable.Builder silkTouchAltDrops(Block block, Block drop, float minDrops, float maxDrops) {
        return this.dropsWithSilkTouch(block, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(drop).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))));
    }
}
