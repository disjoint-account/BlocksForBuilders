package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BFBLootTableGenerator extends FabricBlockLootTableProvider {
    public BFBLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.WARPED_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.WARPED_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, Items.BOOK, 3, 3));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, bookshelfDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, Items.BOOK, 3, 3));

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
        addDrop(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, BlocksForBuildersBlocks.RED_OAK_SAPLING, 0.0f));
        addDrop(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, leavesDrops(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.0f));

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
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_SLAB, slabDrops(BlocksForBuildersBlocks.GHOSTWOOD_SLAB));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN, drops(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);

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
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, slabDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN, drops(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM));
        addDrop(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        addDrop(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);

        addDrop(BlocksForBuildersBlocks.RED_OAK_LEAVES, oakLeavesDrops(BlocksForBuildersBlocks.RED_OAK_LEAVES, BlocksForBuildersBlocks.RED_OAK_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.RED_OAK_SAPLING);
        addDrop(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, leavesDrops(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, 0.05f));
        addDrop(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);

        addDrop(BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING));
        addDrop(BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING));
        addDrop(BlocksForBuildersBlocks.POTTED_RED_OAK_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.RED_OAK_SAPLING));
        addDrop(BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, pottedPlantDrops(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));

        addDrop(BlocksForBuildersBlocks.PAPER_LANTERN);

        addDrop(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS);

    }
    public LootTable.Builder bookshelfDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))));
    }
}
