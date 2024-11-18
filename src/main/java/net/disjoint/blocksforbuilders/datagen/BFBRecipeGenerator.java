package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.util.BFBTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BFBRecipeGenerator extends FabricRecipeProvider {
    public BFBRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            public void generate() {
                List<ItemConvertible> CHARCOAL_SMELTABLES = List.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG,
                        BlocksForBuildersBlocks.GHOSTWOOD_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG,
                        BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD,
                        BlocksForBuildersBlocks.SCORCHWOOD_LOG,
                        BlocksForBuildersBlocks.SCORCHWOOD_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG,
                        BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_LOG,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG,
                        BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD,
                        BlocksForBuildersBlocks.WILLOW_LOG,
                        BlocksForBuildersBlocks.WILLOW_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG,
                        BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

                List<ItemConvertible> NON_SCORCHWOOD_SAPLINGS = List.of(Items.OAK_SAPLING,
                        Items.BIRCH_SAPLING,
                        Items.SPRUCE_SAPLING,
                        Items.JUNGLE_SAPLING,
                        Items.ACACIA_SAPLING,
                        Items.DARK_OAK_SAPLING,
                        Items.AZALEA,
                        Items.FLOWERING_AZALEA,
                        Items.MANGROVE_PROPAGULE,
                        Items.CHERRY_SAPLING,
                        Items.PALE_OAK_SAPLING,
                        BlocksForBuildersBlocks.WILLOW_SAPLING,
                        BlocksForBuildersBlocks.GHOSTWOOD_SAPLING,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING,
                        BlocksForBuildersBlocks.RED_OAK_SAPLING,
                        BlocksForBuildersBlocks.ORANGE_OAK_SAPLING,
                        BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING,
                        BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING);

                List<ItemConvertible> MOSS_CARPETS = List.of(Items.MOSS_CARPET,
                        Items.PALE_MOSS_CARPET);

                List<ItemConvertible> BLACKNB = List.of(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                List<ItemConvertible> REDNB = List.of(Blocks.RED_NETHER_BRICKS);

                offerSmelting(CHARCOAL_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL, 0.1f, 200, "charcoal");
                offerSmelting(NON_SCORCHWOOD_SAPLINGS, RecipeCategory.MISC, BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, 0.1f, 200, "scorchwood_sapling");
                offerSmelting(MOSS_CARPETS, RecipeCategory.MISC, BlocksForBuildersBlocks.ASHEN_CARPET, 0.1f, 200, "ashen_carpet");
                offerSmelting(BLACKNB, RecipeCategory.MISC, BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS, 0.1f, 200, "cracked_black_nether_bricks");
                offerSmelting(REDNB, RecipeCategory.MISC, BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS, 0.1f, 200, "cracked_red_nether_bricks");

                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ, 1);
                offerStonecuttingRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, 1);

                offerBookshelfRecipe(BlocksForBuildersBlocks.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, Blocks.PALE_OAK_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.WILLOW_BOOKSHELF, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

                offerNetherFenceRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherSlabRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherStairsRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherWallRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                createShaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                        .group("nether_bricks")
                        .pattern("BW")
                        .pattern("WB")
                        .input('B', Items.NETHER_BRICK)
                        .input('W', Items.BLACK_DYE)
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(exporter);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);
                offerNetherFenceRecipe(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);
                offerWallRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                offerWallRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
                offerWallRecipe(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, Blocks.PALE_OAK_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, BlocksForBuildersBlocks.RED_OAK_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, BlocksForBuildersBlocks.ORANGE_OAK_LEAVES);
                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);

                offerBoatRecipe(BlocksForBuildersItems.GHOSTWOOD_BOAT, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerChestBoatRecipe(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, BlocksForBuildersItems.GHOSTWOOD_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.GHOSTWOOD_DOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GHOSTWOOD_FENCE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerHangingSignRecipe(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                        .group("planks")
                        .input(BFBTags.Items.GHOSTWOOD_LOGS)
                        .criterion("has_ghostwood_tag", conditionsFromTag(BFBTags.Items.GHOSTWOOD_LOGS))
                        .offerTo(exporter);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM, BlocksForBuildersBlocks.GHOSTWOOD_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_SLAB, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_STAIRS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerWoodRecipe(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.GHOSTWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);

                offerBoatRecipe(BlocksForBuildersItems.SCORCHWOOD_BOAT, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerChestBoatRecipe(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, BlocksForBuildersItems.SCORCHWOOD_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.SCORCHWOOD_DOOR, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.SCORCHWOOD_FENCE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerHangingSignRecipe(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, 4)
                        .group("planks")
                        .input(BFBTags.Items.SCORCHWOOD_LOGS)
                        .criterion("has_scorchwood_tag", conditionsFromTag(BFBTags.Items.SCORCHWOOD_LOGS))
                        .offerTo(exporter);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM, BlocksForBuildersBlocks.SCORCHWOOD_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_SLAB, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_STAIRS, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerWoodRecipe(BlocksForBuildersBlocks.SCORCHWOOD_WOOD, BlocksForBuildersBlocks.SCORCHWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);

                offerBoatRecipe(BlocksForBuildersItems.WILLOW_BOAT, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.WILLOW_BUTTON, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerChestBoatRecipe(BlocksForBuildersItems.WILLOW_CHEST_BOAT, BlocksForBuildersItems.WILLOW_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.WILLOW_DOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.WILLOW_FENCE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.WILLOW_FENCE_GATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerHangingSignRecipe(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                        .group("planks")
                        .input(BFBTags.Items.WILLOW_LOGS)
                        .criterion("has_willow_tag", conditionsFromTag(BFBTags.Items.WILLOW_LOGS))
                        .offerTo(exporter);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.WILLOW_SIGN_ITEM, BlocksForBuildersBlocks.WILLOW_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_SLAB, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_STAIRS, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.WILLOW_TRAPDOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerWoodRecipe(BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.WILLOW_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);

                offerBoatRecipe(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerChestBoatRecipe(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, BlocksForBuildersItems.GREEN_JUNGLE_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerHangingSignRecipe(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                        .group("planks")
                        .input(BFBTags.Items.GREEN_JUNGLE_LOGS)
                        .criterion("has_green_jungle_tag", conditionsFromTag(BFBTags.Items.GREEN_JUNGLE_LOGS))
                        .offerTo(exporter);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerWoodRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);

                offerBoatRecipe(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerChestBoatRecipe(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, BlocksForBuildersItems.GREEN_BAMBOO_RAFT);
                offerDoorRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerHangingSignRecipe(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM, Blocks.BAMBOO_BLOCK);
                createShaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 4)
                        .group("planks")
                        .pattern("WW")
                        .pattern("WW")
                        .input('W', Blocks.BAMBOO_BLOCK)
                        .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                        .offerTo(exporter);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE, 3)
                        .pattern("BW")
                        .pattern("WB")
                        .input('B', Items.GUNPOWDER)
                        .input('W', Items.COBBLED_DEEPSLATE)
                        .criterion(hasItem(Items.COBBLED_DEEPSLATE), conditionsFromItem(Items.COBBLED_DEEPSLATE))
                        .offerTo(exporter);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE_SLAB);
                offerStoneRecipe(BlocksForBuildersBlocks.POLISHED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerStoneRecipe(BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerStoneRecipe(BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES);
                offerWallRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_STAIRS, Blocks.HAY_BLOCK);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_SLAB, Blocks.HAY_BLOCK);

                createShaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH, 9)
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.STRIPPED_BAMBOO_BLOCK)
                        .criterion(hasItem(Blocks.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Blocks.STRIPPED_BAMBOO_BLOCK))
                        .offerTo(exporter);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS, BlocksForBuildersBlocks.BAMBOO_THATCH);
                offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, BlocksForBuildersBlocks.BAMBOO_THATCH);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_RUG, BlocksForBuildersBlocks.BAMBOO_THATCH);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG, Blocks.BAMBOO_MOSAIC);
            }

            private void offerSignRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 3)
                        .group("wooden_sign")
                        .input('#', input)
                        .input('X', Items.STICK)
                        .pattern("###")
                        .pattern("###")
                        .pattern(" X ")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerFenceRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 3)
                        .group("wooden_fence")
                        .input('#', input)
                        .input('X', Items.STICK)
                        .pattern("#X#")
                        .pattern("#X#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerFenceGateRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output, 1)
                        .group("wooden_fence_gate")
                        .input('#', input)
                        .input('X', Items.STICK)
                        .pattern("X#X")
                        .pattern("X#X")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerNetherFenceGateRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output, 1)
                        .group("nether_fence_gate")
                        .input('#', input)
                        .input('X', Items.NETHER_BRICK)
                        .pattern("X#X")
                        .pattern("X#X")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(exporter);
            }

            private void offerNetherFenceRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 3)
                        .group("nether_fence")
                        .input('#', input)
                        .input('X', Items.NETHER_BRICK)
                        .pattern("#X#")
                        .pattern("#X#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                        .offerTo(exporter);
            }

            private void offerNetherSlabRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                        .group("nether_brick_slab")
                        .input('#', input)
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerNetherStairsRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .group("nether_brick_stairs")
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerNetherWallRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.MISC, output, 6)
                        .group("nether_brick_wall")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerStairsRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 4)
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerWoodenStairsRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 4)
                        .group("wooden_stairs")
                        .input('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerWoodenSlabRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 6)
                        .group("wooden_slab")
                        .input('#', input)
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerDoorRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output, 3)
                        .group("wooden_door")
                        .input('#', input)
                        .pattern(" ##")
                        .pattern(" ##")
                        .pattern(" ##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerTrapdoorRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output, 2)
                        .group("wooden_trapdoor")
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerWoodenPressurePlateRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.REDSTONE, output, 1)
                        .group("wooden_pressure_plate")
                        .input('#', input)
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerButtonRecipe(ItemConvertible output, ItemConvertible input) {
                createShapeless(RecipeCategory.REDSTONE, output, 1)
                        .input(input)
                        .group("wooden_button")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerWoodRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 3)
                        .group("bark")
                        .input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerChiseledRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 1)
                        .group("chiseled_nether_bricks")
                        .input('#', input)
                        .pattern("#")
                        .pattern("#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerBookshelfRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                        .group("bookshelf")
                        .input('#', input)
                        .input('X', Items.BOOK)
                        .pattern("###")
                        .pattern("XXX")
                        .pattern("###")
                        .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                        .offerTo(exporter);
            }

            private void offerFallenLeavesRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.DECORATIONS, output, 3)
                        .group("fallen_leaves")
                        .input('#', input)
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerStoneRecipe(ItemConvertible output, ItemConvertible input) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void offerAltCarpetRecipe(RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
                createShaped(Category, output, 3)
                        .input('#', input)
                        .pattern("##")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }
        };
    }
    @Override
    public String getName() {
        return "Blocks for Builders Recipes";
    }
}