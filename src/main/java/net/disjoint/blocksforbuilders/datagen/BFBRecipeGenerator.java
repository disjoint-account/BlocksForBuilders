package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.util.BFBTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.ACACIA_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.ACACIA_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.ACACIA_PLANKS), conditionsFromItem(Blocks.ACACIA_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "acacia_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BAMBOO_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.BAMBOO_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.BAMBOO_PLANKS), conditionsFromItem(Blocks.BAMBOO_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "bamboo_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BIRCH_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.BIRCH_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.BIRCH_PLANKS), conditionsFromItem(Blocks.BIRCH_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "birch_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE, 3)
                .pattern("BNB")
                .pattern("BNB")
                .input('B', BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .input('N', Items.NETHER_BRICK)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS))
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_brick_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE)
                .pattern("BNB")
                .pattern("BNB")
                .input('B', Items.NETHER_BRICK)
                .input('N', BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS))
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_brick_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, 6)
                .pattern("BBB")
                .input('B', BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_brick_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, 4)
                .pattern("  B")
                .pattern(" BB")
                .pattern("BBB")
                .input('B', BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_brick_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_brick_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                .pattern("BW")
                .pattern("WB")
                .input('B', Items.NETHER_BRICK)
                .input('W', Items.BLACK_DYE)
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "black_nether_bricks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS)
                .pattern("B")
                .pattern("B")
                .input('B', BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB)
                .criterion(hasItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB), conditionsFromItem(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "chiseled_black_nether_bricks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS)
                .pattern("B")
                .pattern("B")
                .input('B', Blocks.RED_NETHER_BRICK_SLAB)
                .criterion(hasItem(Blocks.RED_NETHER_BRICK_SLAB), conditionsFromItem(Blocks.RED_NETHER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "chiseled_red_nether_bricks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.CHERRY_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.CHERRY_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.CHERRY_PLANKS), conditionsFromItem(Blocks.CHERRY_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "cherry_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.CRIMSON_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.CRIMSON_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.CRIMSON_PLANKS), conditionsFromItem(Blocks.CRIMSON_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "crimson_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.DARK_OAK_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.DARK_OAK_PLANKS), conditionsFromItem(Blocks.DARK_OAK_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "dark_oak_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.ACACIA_LEAVES)
                .criterion(hasItem(Blocks.ACACIA_LEAVES), conditionsFromItem(Blocks.ACACIA_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_acacia_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.AZALEA_LEAVES)
                .criterion(hasItem(Blocks.AZALEA_LEAVES), conditionsFromItem(Blocks.AZALEA_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_azalea_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.BIRCH_LEAVES)
                .criterion(hasItem(Blocks.BIRCH_LEAVES), conditionsFromItem(Blocks.BIRCH_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_birch_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.CHERRY_LEAVES)
                .criterion(hasItem(Blocks.CHERRY_LEAVES), conditionsFromItem(Blocks.CHERRY_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_cherry_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.DARK_OAK_LEAVES)
                .criterion(hasItem(Blocks.DARK_OAK_LEAVES), conditionsFromItem(Blocks.DARK_OAK_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_dark_oak_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.FLOWERING_AZALEA_LEAVES)
                .criterion(hasItem(Blocks.FLOWERING_AZALEA_LEAVES), conditionsFromItem(Blocks.FLOWERING_AZALEA_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_flowering_azalea_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.GHOSTWOOD_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_ghostwood_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_gold_acacia_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_green_jungle_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.JUNGLE_LEAVES)
                .criterion(hasItem(Blocks.JUNGLE_LEAVES), conditionsFromItem(Blocks.JUNGLE_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_jungle_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.MANGROVE_LEAVES)
                .criterion(hasItem(Blocks.MANGROVE_LEAVES), conditionsFromItem(Blocks.MANGROVE_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_mangrove_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.OAK_LEAVES)
                .criterion(hasItem(Blocks.OAK_LEAVES), conditionsFromItem(Blocks.OAK_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_oak_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_ORANGE_OAK_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.ORANGE_OAK_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_orange_oak_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_RED_OAK_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.RED_OAK_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.RED_OAK_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.RED_OAK_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_red_oak_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, 3)
                .pattern("LL")
                .input('L', Blocks.SPRUCE_LEAVES)
                .criterion(hasItem(Blocks.SPRUCE_LEAVES), conditionsFromItem(Blocks.SPRUCE_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_spruce_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.WILLOW_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_willow_leaves"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GHOSTWOOD_BOAT)
                .pattern("P P")
                .pattern("PPP")
                .input('P', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_bookshelf"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_BUTTON)
                .input(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT)
                .pattern("C")
                .pattern("B")
                .input('C', Blocks.CHEST)
                .input('B', BlocksForBuildersItems.GHOSTWOOD_BOAT)
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .criterion(hasItem(BlocksForBuildersItems.GHOSTWOOD_BOAT), conditionsFromItem(BlocksForBuildersItems.GHOSTWOOD_BOAT))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_chest_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_DOOR, 3)
                .pattern("WW")
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_FENCE, 3)
                .pattern("WSW")
                .pattern("WSW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE)
                .pattern("SWS")
                .pattern("SWS")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM, 6)
                .pattern("C C")
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG)
                .input('C', Blocks.CHAIN)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG))
                .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_hanging_sign"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                .input(BlocksForBuildersBlocks.GHOSTWOOD_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_LOG), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_planks_1"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_planks_2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                .input(BlocksForBuildersBlocks.GHOSTWOOD_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_WOOD), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_planks_3"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_planks_4"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE)
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM, 3)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" S ")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_SLAB, 6)
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_STAIRS, 4)
                .pattern("  W")
                .pattern(" WW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR, 2)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GHOSTWOOD_WOOD, 3)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GHOSTWOOD_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.GHOSTWOOD_LOG), conditionsFromItem(BlocksForBuildersBlocks.GHOSTWOOD_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_JUNGLE_BOAT)
                .pattern("P P")
                .pattern("PPP")
                .input('P', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_bookshelf"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON)
                .input(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT)
                .pattern("C")
                .pattern("B")
                .input('C', Blocks.CHEST)
                .input('B', BlocksForBuildersItems.GREEN_JUNGLE_BOAT)
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .criterion(hasItem(BlocksForBuildersItems.GREEN_JUNGLE_BOAT), conditionsFromItem(BlocksForBuildersItems.GREEN_JUNGLE_BOAT))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_chest_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, 3)
                .pattern("WW")
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE, 3)
                .pattern("WSW")
                .pattern("WSW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE)
                .pattern("SWS")
                .pattern("SWS")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM, 6)
                .pattern("C C")
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG)
                .input('C', Blocks.CHAIN)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG))
                .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_hanging_sign"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                .input(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_planks_1"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_planks_2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                .input(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_planks_3"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_planks_4"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE)
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM, 3)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" S ")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, 6)
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS, 4)
                .pattern("  W")
                .pattern(" WW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, 2)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, 3)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GREEN_JUNGLE_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG), conditionsFromItem(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_BAMBOO_RAFT)
                .pattern("P P")
                .pattern("PPP")
                .input('P', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_bookshelf"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON)
                .input(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT)
                .pattern("C")
                .pattern("B")
                .input('C', Blocks.CHEST)
                .input('B', BlocksForBuildersItems.GREEN_BAMBOO_RAFT)
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .criterion(hasItem(BlocksForBuildersItems.GREEN_BAMBOO_RAFT), conditionsFromItem(BlocksForBuildersItems.GREEN_BAMBOO_RAFT))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_chest_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, 3)
                .pattern("WW")
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE, 3)
                .pattern("WSW")
                .pattern("WSW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE)
                .pattern("SWS")
                .pattern("SWS")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 4)
                .pattern("SS")
                .pattern("SS")
                .input('S', Blocks.BAMBOO_BLOCK)
                .criterion(hasItem(Blocks.BAMBOO_BLOCK), conditionsFromItem(Blocks.BAMBOO_BLOCK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_planks"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE)
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM, 3)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" S ")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, 6)
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS, 4)
                .pattern("  W")
                .pattern(" WW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, 2)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.JUNGLE_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.JUNGLE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.JUNGLE_PLANKS), conditionsFromItem(Blocks.JUNGLE_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "jungle_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Blocks.LECTERN)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .input('S', ItemTags.WOODEN_SLABS)
                .input('B', BFBTags.Items.BOOKSHELVES)
                .criterion("has_my_tag", conditionsFromTag(ItemTags.WOODEN_SLABS))
                .criterion("has_my_tag", conditionsFromTag(BFBTags.Items.BOOKSHELVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "lectern"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.MANGROVE_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.MANGROVE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.MANGROVE_PLANKS), conditionsFromItem(Blocks.MANGROVE_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "mangrove_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("BNB")
                .pattern("BNB")
                .input('N', Blocks.NETHER_BRICKS)
                .input('B', Items.NETHER_BRICK)
                .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
                .criterion(hasItem(Items.NETHER_BRICK), conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "nether_brick_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', Blocks.QUARTZ_BRICKS)
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "quartz_brick_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, 4)
                .pattern("  B")
                .pattern(" BB")
                .pattern("BBB")
                .input('B', Blocks.QUARTZ_BRICKS)
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "quartz_brick_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, 6)
                .pattern("BBB")
                .input('B', Blocks.QUARTZ_BRICKS)
                .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "quartz_brick_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', Blocks.QUARTZ_BLOCK)
                .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "quartz_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, 4)
                .pattern("  S")
                .pattern(" SS")
                .pattern("SSS")
                .input('S', Blocks.SMOOTH_STONE)
                .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "smooth_stone_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, 6)
                .pattern("BBB")
                .pattern("BBB")
                .input('B', Blocks.SMOOTH_QUARTZ)
                .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "smooth_quartz_wall"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.SPRUCE_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.SPRUCE_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.SPRUCE_PLANKS), conditionsFromItem(Blocks.SPRUCE_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "spruce_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "stripped_ghostwood_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "stripped_green_jungle_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "stripped_willow_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WARPED_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', Blocks.WARPED_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(Blocks.WARPED_PLANKS), conditionsFromItem(Blocks.WARPED_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "warped_bookshelf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.WILLOW_BOAT)
                .pattern("P P")
                .pattern("PPP")
                .input('P', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_BOOKSHELF)
                .pattern("WWW")
                .pattern("BBB")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .input('B', Items.BOOK)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .criterion(hasItem(Items.BOOK), conditionsFromItem(Items.BOOK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_bookshelf"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_BUTTON)
                .input(BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_button"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.WILLOW_CHEST_BOAT)
                .pattern("C")
                .pattern("B")
                .input('C', Blocks.CHEST)
                .input('B', BlocksForBuildersItems.WILLOW_BOAT)
                .criterion(hasItem(Blocks.CHEST), conditionsFromItem(Blocks.CHEST))
                .criterion(hasItem(BlocksForBuildersItems.WILLOW_BOAT), conditionsFromItem(BlocksForBuildersItems.WILLOW_BOAT))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_chest_boat"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_DOOR, 3)
                .pattern("WW")
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_door"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_FENCE, 3)
                .pattern("WSW")
                .pattern("WSW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_FENCE_GATE)
                .pattern("SWS")
                .pattern("SWS")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_fence_gate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM, 6)
                .pattern("C C")
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG)
                .input('C', Blocks.CHAIN)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG))
                .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_hanging_sign"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                .input(BlocksForBuildersBlocks.WILLOW_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_LOG), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_planks_1"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_planks_2"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                .input(BlocksForBuildersBlocks.WILLOW_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_WOOD), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_planks_3"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                .input(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD)
                .criterion(hasItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD), conditionsFromItem(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_planks_4"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE)
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_pressure_plate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersItems.WILLOW_SIGN_ITEM, 3)
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" S ")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .input('S', Items.STICK)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_sign"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_SLAB, 6)
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_slab"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_STAIRS, 4)
                .pattern("  W")
                .pattern(" WW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_stairs"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_TRAPDOOR, 2)
                .pattern("WWW")
                .pattern("WWW")
                .input('W', BlocksForBuildersBlocks.WILLOW_PLANKS)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_PLANKS), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_PLANKS))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.WILLOW_WOOD, 3)
                .pattern("WW")
                .pattern("WW")
                .input('W', BlocksForBuildersBlocks.WILLOW_LOG)
                .criterion(hasItem(BlocksForBuildersBlocks.WILLOW_LOG), conditionsFromItem(BlocksForBuildersBlocks.WILLOW_LOG))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "willow_wood"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, 3)
                .pattern("LL")
                .input('L', BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES)
                .criterion(hasItem(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES), conditionsFromItem(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES))
                .offerTo(exporter, Identifier.of(BlocksForBuilders.MOD_ID, "fallen_yellow_birch_leaves"));

    }
}