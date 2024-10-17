package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.util.BFBTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> CHARCOAL_SMELTABLES = List.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG,
                BlocksForBuildersBlocks.GHOSTWOOD_WOOD,
                BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG,
                BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD,
                BlocksForBuildersBlocks.GREEN_JUNGLE_LOG,
                BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD,
                BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG,
                BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD,
                BlocksForBuildersBlocks.WILLOW_LOG,
                BlocksForBuildersBlocks.WILLOW_WOOD,
                BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG,
                BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);

        List<ItemConvertible> BLACKNB = List.of(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        List<ItemConvertible> REDNB = List.of(Blocks.RED_NETHER_BRICKS);

        offerSmelting(exporter, CHARCOAL_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL, 0.1f, 200, "charcoal");
        offerSmelting(exporter, BLACKNB, RecipeCategory.MISC, BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS, 0.1f, 200, "cracked_black_nether_bricks");
        offerSmelting(exporter, REDNB, RecipeCategory.MISC, BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS, 0.1f, 200, "cracked_red_nether_bricks");

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, 1);

        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.WILLOW_BOOKSHELF, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerBookshelfRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

        offerNetherFenceRecipe(exporter, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        offerNetherFenceGateRecipe(exporter, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        offerNetherSlabRecipe(exporter, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        offerNetherStairsRecipe(exporter, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        offerNetherWallRecipe(exporter, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .group("nether_bricks")
                .pattern("BW")
                .pattern("WB")
                .input('B', Items.NETHER_BRICK)
                .input('W', Items.BLACK_DYE)
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter);
        offerChiseledRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
        offerChiseledRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);
        offerNetherFenceRecipe(exporter, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
        offerNetherFenceGateRecipe(exporter, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
        offerNetherFenceGateRecipe(exporter, BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        offerStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, BlocksForBuildersBlocks.RED_OAK_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, BlocksForBuildersBlocks.ORANGE_OAK_LEAVES);
        offerFallenLeavesRecipe(exporter, BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);

        offerBoatRecipe(exporter, BlocksForBuildersItems.GHOSTWOOD_BOAT, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerButtonRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_BUTTON, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerChestBoatRecipe(exporter, BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, BlocksForBuildersItems.GHOSTWOOD_BOAT);
        offerDoorRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_DOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerFenceRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_FENCE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerFenceGateRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerHangingSignRecipe(exporter, BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                .group("planks")
                .input(BFBTags.Items.GHOSTWOOD_LOGS)
                .criterion("has_ghostwood_tag", conditionsFromTag(BFBTags.Items.GHOSTWOOD_LOGS))
                .offerTo(exporter);
        offerWoodenPressurePlateRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerSignRecipe(exporter, BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM, BlocksForBuildersBlocks.GHOSTWOOD_SIGN);
        offerWoodenSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_SLAB, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerWoodenStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_STAIRS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerTrapdoorRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.GHOSTWOOD_LOG);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);

        offerBoatRecipe(exporter, BlocksForBuildersItems.WILLOW_BOAT, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerButtonRecipe(exporter, BlocksForBuildersBlocks.WILLOW_BUTTON, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerChestBoatRecipe(exporter, BlocksForBuildersItems.WILLOW_CHEST_BOAT, BlocksForBuildersItems.WILLOW_BOAT);
        offerDoorRecipe(exporter, BlocksForBuildersBlocks.WILLOW_DOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerFenceRecipe(exporter, BlocksForBuildersBlocks.WILLOW_FENCE, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerFenceGateRecipe(exporter, BlocksForBuildersBlocks.WILLOW_FENCE_GATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerHangingSignRecipe(exporter, BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                .group("planks")
                .input(BFBTags.Items.WILLOW_LOGS)
                .criterion("has_willow_tag", conditionsFromTag(BFBTags.Items.WILLOW_LOGS))
                .offerTo(exporter);
        offerWoodenPressurePlateRecipe(exporter, BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerSignRecipe(exporter, BlocksForBuildersItems.WILLOW_SIGN_ITEM, BlocksForBuildersBlocks.WILLOW_SIGN);
        offerWoodenSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_SLAB, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerWoodenStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_STAIRS, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerTrapdoorRecipe(exporter, BlocksForBuildersBlocks.WILLOW_TRAPDOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.WILLOW_LOG);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);

        offerBoatRecipe(exporter, BlocksForBuildersItems.GREEN_JUNGLE_BOAT, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerButtonRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerChestBoatRecipe(exporter, BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, BlocksForBuildersItems.GREEN_JUNGLE_BOAT);
        offerDoorRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerFenceRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerFenceGateRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerHangingSignRecipe(exporter, BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                .group("planks")
                .input(BFBTags.Items.GREEN_JUNGLE_LOGS)
                .criterion("has_green_jungle_tag", conditionsFromTag(BFBTags.Items.GREEN_JUNGLE_LOGS))
                .offerTo(exporter);
        offerWoodenPressurePlateRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerSignRecipe(exporter, BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN);
        offerWoodenSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerWoodenStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerTrapdoorRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
        offerWoodRecipe(exporter, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);

        offerBoatRecipe(exporter, BlocksForBuildersItems.GREEN_BAMBOO_RAFT, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerButtonRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerChestBoatRecipe(exporter, BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, BlocksForBuildersItems.GREEN_BAMBOO_RAFT);
        offerDoorRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerFenceRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerFenceGateRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerHangingSignRecipe(exporter, BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM, Blocks.BAMBOO_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 4)
                .group("planks")
                .pattern("WW")
                .pattern("WW")
                .input('W', Blocks.BAMBOO_BLOCK)
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter);
        offerWoodenPressurePlateRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerSignRecipe(exporter, BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN);
        offerWoodenSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerWoodenStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        offerTrapdoorRecipe(exporter, BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

        offerStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);

        offerStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

        offerStairsRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_STAIRS, Blocks.HAY_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_SLAB, Blocks.HAY_BLOCK);
    }

    public static void offerSignRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 3)
                .group("wooden_sign")
                .input('#', input)
                .input('X', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 3)
                .group("wooden_fence")
                .input('#', input)
                .input('X', Items.STICK)
                .pattern("#X#")
                .pattern("#X#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .group("wooden_fence_gate")
                .input('#', input)
                .input('X', Items.STICK)
                .pattern("X#X")
                .pattern("X#X")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerNetherFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .group("nether_fence_gate")
                .input('#', input)
                .input('X', Items.NETHER_BRICK)
                .pattern("X#X")
                .pattern("X#X")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter);
    }
    public static void offerNetherFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 3)
                .group("nether_fence")
                .input('#', input)
                .input('X', Items.NETHER_BRICK)
                .pattern("#X#")
                .pattern("#X#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter);
    }
    public static void offerNetherSlabRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .group("nether_brick_slab")
                .input('#', input)
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerNetherStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .group("nether_brick_stairs")
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerNetherWallRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 6)
                .group("nether_brick_wall")
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerStairsRecipe(RecipeExporter exporter, RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(Category, output, 4)
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerWoodenStairsRecipe(RecipeExporter exporter, RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(Category, output, 4)
                .group("wooden_stairs")
                .input('#', input)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerWoodenSlabRecipe(RecipeExporter exporter, RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(Category, output, 6)
                .group("wooden_slab")
                .input('#', input)
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerDoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 3)
                .group("wooden_door")
                .input('#', input)
                .pattern(" ##")
                .pattern(" ##")
                .pattern(" ##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerTrapdoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 2)
                .group("wooden_trapdoor")
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerWoodenPressurePlateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .group("wooden_pressure_plate")
                .input('#', input)
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .input(input)
                .group("wooden_button")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void offerWoodRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .group("bark")
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerChiseledRecipe(RecipeExporter exporter, RecipeCategory Category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(Category, output, 1)
                .group("chiseled_nether_bricks")
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
    public static void offerBookshelfRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .group("bookshelf")
                .input('#', input)
                .input('X', Items.BOOK)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }
    public static void offerFallenLeavesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, output, 3)
                .group("fallen_leaves")
                .input('#', input)
                .pattern("##")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
}