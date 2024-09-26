package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.util.BFBTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BFBItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public BFBItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BFBTags.Items.BOOKSHELVES)
                .add(Items.BOOKSHELF)
                .add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.WARPED_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF.asItem());

        getOrCreateTagBuilder(BFBTags.Items.GHOSTWOOD_LOGS)
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD.asItem());

        getOrCreateTagBuilder(BFBTags.Items.WILLOW_LOGS)
                .add(BlocksForBuildersBlocks.WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(BFBTags.Items.GREEN_JUNGLE_LOGS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_BOAT)
                .add(BlocksForBuildersItems.GHOSTWOOD_BOAT)
                .add(BlocksForBuildersItems.WILLOW_BOAT)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_RAFT);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT)
                .add(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT)
                .add(BlocksForBuildersItems.WILLOW_CHEST_BOAT)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT);

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_DOOR.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE.asItem())
                .add(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.RED_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.RED_OAK_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING.asItem());

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM)
                .add(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM)
                .add(BlocksForBuildersItems.WILLOW_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM);

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_SLAB.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB.asItem())
                .add(BlocksForBuildersBlocks.HAY_SLAB.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.HAY_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_WALL.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL.asItem())
                .add(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_TRAPDOOR.asItem());

        getOrCreateTagBuilder(BFBTags.Items.BFB_TAG)
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR.asItem())
                .add(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM)
                .add(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.GHOSTWOOD_BOAT)
                .add(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT)
                .add(BlocksForBuildersBlocks.WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_SLAB.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_FENCE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_DOOR.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_TRAPDOOR.asItem())
                .add(BlocksForBuildersItems.WILLOW_SIGN_ITEM)
                .add(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.WILLOW_BOAT)
                .add(BlocksForBuildersItems.WILLOW_CHEST_BOAT)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD.asItem())
                .add(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR.asItem())
                .add(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_BOAT)
                .add(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT)
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR.asItem())
                .add(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_RAFT)
                .add(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT)
                .add(BlocksForBuildersBlocks.RED_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.RED_OAK_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES.asItem())
                .add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.ACACIA_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.WARPED_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.CHERRY_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.WILLOW_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF.asItem())
                .add(BlocksForBuildersBlocks.HAY_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.HAY_SLAB.asItem())
                .add(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS.asItem())
                .add(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS.asItem())
                .add(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE.asItem())
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS.asItem())
                .add(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS.asItem())
                .add(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE.asItem())
                .add(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_WALL.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS.asItem())
                .add(BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB.asItem())
                .add(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL.asItem());
    }
}