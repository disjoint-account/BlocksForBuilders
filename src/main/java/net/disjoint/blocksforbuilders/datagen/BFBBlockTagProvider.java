package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BFBBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BFBBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF,
                        BlocksForBuildersBlocks.SPRUCE_BOOKSHELF,
                        BlocksForBuildersBlocks.JUNGLE_BOOKSHELF,
                        BlocksForBuildersBlocks.ACACIA_BOOKSHELF,
                        BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF,
                        BlocksForBuildersBlocks.CRIMSON_BOOKSHELF,
                        BlocksForBuildersBlocks.WARPED_BOOKSHELF,
                        BlocksForBuildersBlocks.MANGROVE_BOOKSHELF,
                        BlocksForBuildersBlocks.CHERRY_BOOKSHELF,
                        BlocksForBuildersBlocks.BAMBOO_BOOKSHELF,
                        BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF,
                        BlocksForBuildersBlocks.WILLOW_BOOKSHELF);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.WILLOW_LEAVES,
                        BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES,
                        BlocksForBuildersBlocks.RED_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICKS,
                        BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS,
                        BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE,
                        BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS,
                        BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS,
                        BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE,
                        BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE,
                        BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN,
                        BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN,
                        BlocksForBuildersBlocks.WILLOW_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR,
                        BlocksForBuildersBlocks.GHOSTWOOD_DOOR,
                        BlocksForBuildersBlocks.WILLOW_DOOR);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .add(BlocksForBuildersBlocks.BIRCH_BOOKSHELF,
                        BlocksForBuildersBlocks.SPRUCE_BOOKSHELF,
                        BlocksForBuildersBlocks.JUNGLE_BOOKSHELF,
                        BlocksForBuildersBlocks.ACACIA_BOOKSHELF,
                        BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF,
                        BlocksForBuildersBlocks.CRIMSON_BOOKSHELF,
                        BlocksForBuildersBlocks.WARPED_BOOKSHELF,
                        BlocksForBuildersBlocks.MANGROVE_BOOKSHELF,
                        BlocksForBuildersBlocks.CHERRY_BOOKSHELF,
                        BlocksForBuildersBlocks.BAMBOO_BOOKSHELF,
                        BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF,
                        BlocksForBuildersBlocks.WILLOW_BOOKSHELF);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE,
                        BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE,
                        BlocksForBuildersBlocks.WILLOW_FENCE_GATE,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE,
                        BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(BlocksForBuildersBlocks.GHOSTWOOD_FENCE,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE,
                        BlocksForBuildersBlocks.WILLOW_FENCE,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE,
                        BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.GHOSTWOOD_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES,
                        BlocksForBuildersBlocks.WILLOW_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES,
                        BlocksForBuildersBlocks.RED_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES,
                        BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES,
                        BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG,
                        BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD,
                        BlocksForBuildersBlocks.GHOSTWOOD_LOG,
                        BlocksForBuildersBlocks.GHOSTWOOD_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG,
                        BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD,
                        BlocksForBuildersBlocks.WILLOW_LOG,
                        BlocksForBuildersBlocks.WILLOW_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG,
                        BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS,
                        BlocksForBuildersBlocks.GHOSTWOOD_PLANKS,
                        BlocksForBuildersBlocks.WILLOW_PLANKS);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING,
                        BlocksForBuildersBlocks.GHOSTWOOD_SAPLING,
                        BlocksForBuildersBlocks.WILLOW_SAPLING,
                        BlocksForBuildersBlocks.RED_OAK_SAPLING,
                        BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB,
                        BlocksForBuildersBlocks.GHOSTWOOD_SLAB,
                        BlocksForBuildersBlocks.WILLOW_SLAB,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS,
                        BlocksForBuildersBlocks.GHOSTWOOD_STAIRS,
                        BlocksForBuildersBlocks.WILLOW_STAIRS,
                        BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS,
                        BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN,
                        BlocksForBuildersBlocks.GHOSTWOOD_SIGN);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR,
                        BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR,
                        BlocksForBuildersBlocks.WILLOW_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN,
                        BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN,
                        BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN,
                        BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN,
                        BlocksForBuildersBlocks.WILLOW_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON,
                        BlocksForBuildersBlocks.GHOSTWOOD_BUTTON,
                        BlocksForBuildersBlocks.WILLOW_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR,
                        BlocksForBuildersBlocks.GHOSTWOOD_DOOR,
                        BlocksForBuildersBlocks.WILLOW_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE,
                        BlocksForBuildersBlocks.GHOSTWOOD_FENCE,
                        BlocksForBuildersBlocks.WILLOW_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE,
                        BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE,
                        BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB,
                        BlocksForBuildersBlocks.GHOSTWOOD_SLAB,
                        BlocksForBuildersBlocks.WILLOW_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS,
                        BlocksForBuildersBlocks.GHOSTWOOD_STAIRS,
                        BlocksForBuildersBlocks.WILLOW_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR,
                        BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR,
                        BlocksForBuildersBlocks.WILLOW_TRAPDOOR);

    }
}