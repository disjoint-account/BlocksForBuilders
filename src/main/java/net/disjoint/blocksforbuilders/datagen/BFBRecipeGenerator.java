package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.util.BFBTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.Items;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BFBRecipeGenerator extends FabricRecipeProvider {
    public BFBRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                List<ItemLike> CHARCOAL_SMELTABLES = List.of(BlocksForBuildersBlocks.GHOSTWOOD_LOG,
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
                        BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD,
                        BlocksForBuildersBlocks.PALM_LOG,
                        BlocksForBuildersBlocks.PALM_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_PALM_LOG,
                        BlocksForBuildersBlocks.STRIPPED_PALM_WOOD,
                        BlocksForBuildersBlocks.MAPLE_LOG,
                        BlocksForBuildersBlocks.MAPLE_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG,
                        BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD,
                        BlocksForBuildersBlocks.BEECH_LOG,
                        BlocksForBuildersBlocks.BEECH_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_BEECH_LOG,
                        BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD,
                        BlocksForBuildersBlocks.PINE_LOG,
                        BlocksForBuildersBlocks.PINE_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_PINE_LOG,
                        BlocksForBuildersBlocks.STRIPPED_PINE_WOOD,
                        BlocksForBuildersBlocks.CEDAR_LOG,
                        BlocksForBuildersBlocks.CEDAR_WOOD,
                        BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG,
                        BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD,
                        BlocksForBuildersItems.COCONUT_HUSK);

                List<ItemLike> NON_SCORCHWOOD_SAPLINGS = List.of(Items.OAK_SAPLING,
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
                        BlocksForBuildersItems.COCONUT,
                        BlocksForBuildersItems.EMPTY_COCONUT,
                        BlocksForBuildersItems.STRIPPED_COCONUT,
                        BlocksForBuildersItems.STRIPPED_EMPTY_COCONUT,
                        BlocksForBuildersBlocks.GHOSTWOOD_SAPLING,
                        BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING,
                        BlocksForBuildersBlocks.MAPLE_SAPLING,
                        BlocksForBuildersBlocks.BEECH_SAPLING,
                        BlocksForBuildersBlocks.PINE_SAPLING,
                        BlocksForBuildersBlocks.CEDAR_SAPLING,
                        BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING,
                        BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING);

                List<ItemLike> MOSS_CARPETS = List.of(Items.MOSS_CARPET,
                        Items.PALE_MOSS_CARPET);

                List<ItemLike> BLACKNB = List.of(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                List<ItemLike> REDNB = List.of(Blocks.RED_NETHER_BRICKS);
                List<ItemLike> GSBRICKS = List.of(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                List<ItemLike> GSTILES = List.of(BlocksForBuildersBlocks.GRIMSTONE_TILES);
                List<ItemLike> SANDBRICKS = List.of(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
                List<ItemLike> REDSANDBRICKS = List.of(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
                List<ItemLike> DARKSANDBRICKS = List.of(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);
                List<ItemLike> DARKSANDSTONE = List.of(BlocksForBuildersBlocks.DARK_SANDSTONE);
                List<ItemLike> SMOOTHSTONEBRICKS = List.of(BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
                List<ItemLike> CALCITEBRICKS = List.of(BlocksForBuildersBlocks.CALCITE_BRICKS);

                oreSmelting(CHARCOAL_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, Items.CHARCOAL, 0.1f, 200, "charcoal");
                oreSmelting(NON_SCORCHWOOD_SAPLINGS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, 0.1f, 200, "scorchwood_sapling");
                oreSmelting(MOSS_CARPETS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.ASHEN_CARPET, 0.1f, 200, "ashen_carpet");
                oreSmelting(BLACKNB, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS, 0.1f, 200, "cracked_black_nether_bricks");
                oreSmelting(REDNB, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS, 0.1f, 200, "cracked_red_nether_bricks");
                oreSmelting(GSBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS, 0.1f, 200, "cracked_grimstone_bricks");
                oreSmelting(GSTILES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES, 0.1f, 200, "cracked_grimstone_tiles");
                oreSmelting(SANDBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS, 0.1f, 200, "cracked_sandstone_bricks");
                oreSmelting(REDSANDBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_RED_SANDSTONE_BRICKS, 0.1f, 200, "cracked_red_sandstone_bricks");
                oreSmelting(DARKSANDSTONE, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE, 0.1f, 200, "smooth_dark_sandstone");
                oreSmelting(DARKSANDBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_DARK_SANDSTONE_BRICKS, 0.1f, 200, "cracked_dark_sandstone_bricks");
                oreSmelting(SMOOTHSTONEBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_SMOOTH_STONE_BRICKS, 0.1f, 200, "cracked_smooth_stone_bricks");
                oreSmelting(CALCITEBRICKS, RecipeCategory.MISC, CookingBookCategory.BLOCKS, BlocksForBuildersBlocks.CRACKED_CALCITE_BRICKS, 0.1f, 200, "cracked_calcite_bricks");

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_STAIRS, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_SLAB, BlocksForBuildersBlocks.ANTIGORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_WALL, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB, BlocksForBuildersBlocks.ANTIGORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICKS, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB, BlocksForBuildersBlocks.ANTIGORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL, BlocksForBuildersBlocks.ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICKS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL, BlocksForBuildersBlocks.POLISHED_ANTIGORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS, BlocksForBuildersBlocks.ANTIGORITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB, BlocksForBuildersBlocks.ANTIGORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL, BlocksForBuildersBlocks.ANTIGORITE_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_STAIRS, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_WALL, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_STAIRS, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_WALL, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICKS, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_SLAB, Blocks.CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_WALL, Blocks.CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_STAIRS, BlocksForBuildersBlocks.POLISHED_CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB, BlocksForBuildersBlocks.POLISHED_CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_CALCITE_WALL, BlocksForBuildersBlocks.POLISHED_CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICKS, BlocksForBuildersBlocks.POLISHED_CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS, BlocksForBuildersBlocks.POLISHED_CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_SLAB, BlocksForBuildersBlocks.POLISHED_CALCITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_WALL, BlocksForBuildersBlocks.POLISHED_CALCITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS, BlocksForBuildersBlocks.CALCITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_SLAB, BlocksForBuildersBlocks.CALCITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CALCITE_BRICK_WALL, BlocksForBuildersBlocks.CALCITE_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_WALL, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_WALL, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_STAIRS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_WALL, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICKS, Blocks.GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS, BlocksForBuildersBlocks.GRANITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_SLAB, BlocksForBuildersBlocks.GRANITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.GRANITE_BRICK_WALL, BlocksForBuildersBlocks.GRANITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICKS, Blocks.DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS, BlocksForBuildersBlocks.DIORITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_SLAB, BlocksForBuildersBlocks.DIORITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DIORITE_BRICK_WALL, BlocksForBuildersBlocks.DIORITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICKS, Blocks.ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS, BlocksForBuildersBlocks.ANDESITE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB, BlocksForBuildersBlocks.ANDESITE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.ANDESITE_BRICK_WALL, BlocksForBuildersBlocks.ANDESITE_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB, Blocks.SMOOTH_STONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS, Blocks.SMOOTH_STONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL, Blocks.SMOOTH_STONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, Blocks.SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_SANDSTONE_WALL, Blocks.SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL, Blocks.RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICKS, Blocks.SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS, Blocks.SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB, Blocks.SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL, Blocks.SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS, Blocks.CUT_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB, Blocks.CUT_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL, Blocks.CUT_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS, Blocks.RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.RED_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS, Blocks.CUT_RED_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB, Blocks.CUT_RED_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL, Blocks.CUT_RED_SANDSTONE, 1);

                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, 1);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, 2);
                stonecutterResultFromBase(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, 1);

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
                offerBookshelfRecipe(BlocksForBuildersBlocks.PALM_BOOKSHELF, BlocksForBuildersBlocks.PALM_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.MAPLE_BOOKSHELF, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.BEECH_BOOKSHELF, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.PINE_BOOKSHELF, BlocksForBuildersBlocks.PINE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.CEDAR_BOOKSHELF, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerBookshelfRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

                offerNetherFenceRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherSlabRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherStairsRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                offerNetherWallRecipe(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICKS)
                        .group("nether_bricks")
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.NETHER_BRICK)
                        .define('W', Items.DYE.black())
                        .unlockedBy(getHasName(Items.NETHER_BRICK), has(Items.NETHER_BRICK))
                        .save(output);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS, BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICK_SLAB);
                offerNetherFenceRecipe(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
                offerNetherFenceGateRecipe(BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);
                wall(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
                wall(RecipeCategory.MISC, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
                wall(RecipeCategory.MISC, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

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

                offerHedgeRecipe(BlocksForBuildersBlocks.OAK_HEDGE, Blocks.OAK_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.BIRCH_HEDGE, Blocks.BIRCH_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.ACACIA_HEDGE, Blocks.ACACIA_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.AZALEA_HEDGE, Blocks.AZALEA_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE, Blocks.FLOWERING_AZALEA_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.MANGROVE_HEDGE, Blocks.MANGROVE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.PALE_OAK_HEDGE, Blocks.PALE_OAK_LEAVES);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.GHOSTWOOD_HEDGE, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
                woodenBoat(BlocksForBuildersItems.GHOSTWOOD_BOAT, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                chestBoat(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, BlocksForBuildersItems.GHOSTWOOD_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.GHOSTWOOD_DOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GHOSTWOOD_FENCE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.GHOSTWOOD_LOGS)
                        .unlockedBy("has_ghostwood_tag", has(BFBTags.Items.GHOSTWOOD_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM, BlocksForBuildersBlocks.GHOSTWOOD_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_SLAB, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GHOSTWOOD_STAIRS, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
                shelf(BlocksForBuildersBlocks.GHOSTWOOD_SHELF, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.GHOSTWOOD_WOOD, BlocksForBuildersBlocks.GHOSTWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);

                woodenBoat(BlocksForBuildersItems.SCORCHWOOD_BOAT, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                chestBoat(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, BlocksForBuildersItems.SCORCHWOOD_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.SCORCHWOOD_DOOR, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.SCORCHWOOD_FENCE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.SCORCHWOOD_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG.asItem()));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.SCORCHWOOD_LOGS)
                        .unlockedBy("has_scorchwood_tag", has(BFBTags.Items.SCORCHWOOD_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.SCORCHWOOD_SIGN_ITEM, BlocksForBuildersBlocks.SCORCHWOOD_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_SLAB, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SCORCHWOOD_STAIRS, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
                shelf(BlocksForBuildersBlocks.SCORCHWOOD_SHELF, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.SCORCHWOOD_WOOD, BlocksForBuildersBlocks.SCORCHWOOD_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.WILLOW_HEDGE, BlocksForBuildersBlocks.WILLOW_LEAVES);
                woodenBoat(BlocksForBuildersItems.WILLOW_BOAT, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.WILLOW_BUTTON, BlocksForBuildersBlocks.WILLOW_PLANKS);
                chestBoat(BlocksForBuildersItems.WILLOW_CHEST_BOAT, BlocksForBuildersItems.WILLOW_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.WILLOW_DOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.WILLOW_FENCE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.WILLOW_FENCE_GATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.WILLOW_LOGS)
                        .unlockedBy("has_willow_tag", has(BFBTags.Items.WILLOW_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.WILLOW_SIGN_ITEM, BlocksForBuildersBlocks.WILLOW_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_SLAB, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.WILLOW_STAIRS, BlocksForBuildersBlocks.WILLOW_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.WILLOW_TRAPDOOR, BlocksForBuildersBlocks.WILLOW_PLANKS);
                shelf(BlocksForBuildersBlocks.WILLOW_SHELF, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.WILLOW_WOOD, BlocksForBuildersBlocks.WILLOW_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.PALM_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.PALM_HEDGE, BlocksForBuildersBlocks.PALM_LEAVES);
                woodenBoat(BlocksForBuildersItems.PALM_RAFT, BlocksForBuildersBlocks.PALM_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.PALM_BUTTON, BlocksForBuildersBlocks.PALM_PLANKS);
                chestBoat(BlocksForBuildersItems.PALM_CHEST_RAFT, BlocksForBuildersItems.PALM_RAFT);
                offerDoorRecipe(BlocksForBuildersBlocks.PALM_DOOR, BlocksForBuildersBlocks.PALM_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.PALM_FENCE, BlocksForBuildersBlocks.PALM_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.PALM_FENCE_GATE, BlocksForBuildersBlocks.PALM_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.PALM_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_PALM_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PALM_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.PALM_LOGS)
                        .unlockedBy("has_palm_tag", has(BFBTags.Items.PALM_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE, BlocksForBuildersBlocks.PALM_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.PALM_SIGN_ITEM, BlocksForBuildersBlocks.PALM_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PALM_SLAB, BlocksForBuildersBlocks.PALM_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PALM_STAIRS, BlocksForBuildersBlocks.PALM_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.PALM_TRAPDOOR, BlocksForBuildersBlocks.PALM_PLANKS);
                shelf(BlocksForBuildersBlocks.PALM_SHELF, BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.PALM_WOOD, BlocksForBuildersBlocks.PALM_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD, BlocksForBuildersBlocks.STRIPPED_PALM_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.MAPLE_HEDGE, BlocksForBuildersBlocks.MAPLE_LEAVES);
                woodenBoat(BlocksForBuildersItems.MAPLE_BOAT, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.MAPLE_BUTTON, BlocksForBuildersBlocks.MAPLE_PLANKS);
                chestBoat(BlocksForBuildersItems.MAPLE_CHEST_BOAT, BlocksForBuildersItems.MAPLE_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.MAPLE_DOOR, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.MAPLE_FENCE, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.MAPLE_FENCE_GATE, BlocksForBuildersBlocks.MAPLE_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.MAPLE_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.MAPLE_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.MAPLE_LOGS)
                        .unlockedBy("has_maple_tag", has(BFBTags.Items.MAPLE_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.MAPLE_SIGN_ITEM, BlocksForBuildersBlocks.MAPLE_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.MAPLE_SLAB, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.MAPLE_STAIRS, BlocksForBuildersBlocks.MAPLE_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.MAPLE_TRAPDOOR, BlocksForBuildersBlocks.MAPLE_PLANKS);
                shelf(BlocksForBuildersBlocks.MAPLE_SHELF, BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.MAPLE_WOOD, BlocksForBuildersBlocks.MAPLE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD, BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.BEECH_HEDGE, BlocksForBuildersBlocks.BEECH_LEAVES);
                woodenBoat(BlocksForBuildersItems.BEECH_BOAT, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.BEECH_BUTTON, BlocksForBuildersBlocks.BEECH_PLANKS);
                chestBoat(BlocksForBuildersItems.BEECH_CHEST_BOAT, BlocksForBuildersItems.BEECH_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.BEECH_DOOR, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.BEECH_FENCE, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.BEECH_FENCE_GATE, BlocksForBuildersBlocks.BEECH_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.BEECH_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BEECH_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.BEECH_LOGS)
                        .unlockedBy("has_beech_tag", has(BFBTags.Items.BEECH_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.BEECH_PRESSURE_PLATE, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.BEECH_SIGN_ITEM, BlocksForBuildersBlocks.BEECH_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BEECH_SLAB, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BEECH_STAIRS, BlocksForBuildersBlocks.BEECH_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.BEECH_TRAPDOOR, BlocksForBuildersBlocks.BEECH_PLANKS);
                shelf(BlocksForBuildersBlocks.BEECH_SHELF, BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.BEECH_WOOD, BlocksForBuildersBlocks.BEECH_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD, BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlocksForBuildersBlocks.PINE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.PINE_HEDGE, BlocksForBuildersBlocks.PINE_LEAVES);
                woodenBoat(BlocksForBuildersItems.PINE_BOAT, BlocksForBuildersBlocks.PINE_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.PINE_BUTTON, BlocksForBuildersBlocks.PINE_PLANKS);
                chestBoat(BlocksForBuildersItems.PINE_CHEST_BOAT, BlocksForBuildersItems.PINE_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.PINE_DOOR, BlocksForBuildersBlocks.PINE_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.PINE_FENCE, BlocksForBuildersBlocks.PINE_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.PINE_FENCE_GATE, BlocksForBuildersBlocks.PINE_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.PINE_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_PINE_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PINE_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.PINE_LOGS)
                        .unlockedBy("has_pine_tag", has(BFBTags.Items.PINE_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.PINE_PRESSURE_PLATE, BlocksForBuildersBlocks.PINE_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.PINE_SIGN_ITEM, BlocksForBuildersBlocks.PINE_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PINE_SLAB, BlocksForBuildersBlocks.PINE_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.PINE_STAIRS, BlocksForBuildersBlocks.PINE_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.PINE_TRAPDOOR, BlocksForBuildersBlocks.PINE_PLANKS);
                shelf(BlocksForBuildersBlocks.PINE_SHELF, BlocksForBuildersBlocks.STRIPPED_PINE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.PINE_WOOD, BlocksForBuildersBlocks.PINE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD, BlocksForBuildersBlocks.STRIPPED_PINE_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.CEDAR_HEDGE, BlocksForBuildersBlocks.CEDAR_LEAVES);
                woodenBoat(BlocksForBuildersItems.CEDAR_BOAT, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.CEDAR_BUTTON, BlocksForBuildersBlocks.CEDAR_PLANKS);
                chestBoat(BlocksForBuildersItems.CEDAR_CHEST_BOAT, BlocksForBuildersItems.CEDAR_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.CEDAR_DOOR, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.CEDAR_FENCE, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.CEDAR_FENCE_GATE, BlocksForBuildersBlocks.CEDAR_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.CEDAR_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CEDAR_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.CEDAR_LOGS)
                        .unlockedBy("has_cedar_tag", has(BFBTags.Items.CEDAR_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.CEDAR_PRESSURE_PLATE, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.CEDAR_SIGN_ITEM, BlocksForBuildersBlocks.CEDAR_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CEDAR_SLAB, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CEDAR_STAIRS, BlocksForBuildersBlocks.CEDAR_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.CEDAR_TRAPDOOR, BlocksForBuildersBlocks.CEDAR_PLANKS);
                shelf(BlocksForBuildersBlocks.CEDAR_SHELF, BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.CEDAR_WOOD, BlocksForBuildersBlocks.CEDAR_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD, BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
                woodenBoat(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                chestBoat(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, BlocksForBuildersItems.GREEN_JUNGLE_BOAT);
                offerDoorRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM, Ingredient.of(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG));
                shapeless(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, 4)
                        .group("planks")
                        .requires(BFBTags.Items.GREEN_JUNGLE_LOGS)
                        .unlockedBy("has_green_jungle_tag", has(BFBTags.Items.GREEN_JUNGLE_LOGS))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
                shelf(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.GREEN_JUNGLE_LOG);
                offerWoodRecipe(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);

                woodenBoat(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerButtonRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                chestBoat(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, BlocksForBuildersItems.GREEN_BAMBOO_RAFT);
                offerDoorRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerFenceRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerFenceGateRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                hangingSignBuilder(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM, Ingredient.of(Blocks.BAMBOO_BLOCK));
                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, 4)
                        .group("planks")
                        .pattern("WW")
                        .pattern("WW")
                        .define('W', Blocks.BAMBOO_BLOCK)
                        .unlockedBy(getHasName(Blocks.BAMBOO_BLOCK), has(Blocks.BAMBOO_BLOCK))
                        .save(output);
                offerWoodenPressurePlateRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerSignRecipe(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM, BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN);
                offerWoodenSlabRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerWoodenStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                offerTrapdoorRecipe(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
                shelf(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF, Blocks.BAMBOO_BLOCK);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);

                offerFallenLeavesRecipe(BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);
                offerHedgeRecipe(BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);

                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE, 3)
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.GUNPOWDER)
                        .define('W', Items.COBBLED_DEEPSLATE)
                        .unlockedBy(getHasName(Items.GUNPOWDER), has(Items.COBBLED_DEEPSLATE))
                        .save(output);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_SLAB, BlocksForBuildersBlocks.GRIMSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_WALL, BlocksForBuildersBlocks.GRIMSTONE);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE_SLAB);
                offerStoneRecipe(BlocksForBuildersBlocks.POLISHED_GRIMSTONE, BlocksForBuildersBlocks.GRIMSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerStoneRecipe(BlocksForBuildersBlocks.GRIMSTONE_BRICKS, BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerStoneRecipe(BlocksForBuildersBlocks.GRIMSTONE_TILES, BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES);

                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE, 2)
                        .group("antigorite")
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.IRON_INGOT)
                        .define('W', Items.COBBLESTONE)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output, String.valueOf(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "antigorite_from_iron")));
                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE, 2)
                        .group("antigorite")
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.COPPER_INGOT)
                        .define('W', Items.COBBLESTONE)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output, String.valueOf(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "antigorite_from_copper")));
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_STAIRS, BlocksForBuildersBlocks.ANTIGORITE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_SLAB, BlocksForBuildersBlocks.ANTIGORITE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_WALL, BlocksForBuildersBlocks.ANTIGORITE);
                offerStoneRecipe(BlocksForBuildersBlocks.POLISHED_ANTIGORITE, BlocksForBuildersBlocks.ANTIGORITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB, BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL, BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
                offerStoneRecipe(BlocksForBuildersBlocks.ANTIGORITE_BRICKS, BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS, BlocksForBuildersBlocks.ANTIGORITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB, BlocksForBuildersBlocks.ANTIGORITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL, BlocksForBuildersBlocks.ANTIGORITE_BRICKS);

                shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CALCITE, 3)
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.BONE_MEAL)
                        .define('W', Items.COBBLESTONE)
                        .unlockedBy(getHasName(Items.BONE_MEAL), has(Items.COBBLESTONE))
                        .save(output);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_STAIRS, Blocks.CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_SLAB, Blocks.CALCITE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_WALL, Blocks.CALCITE);
                offerStoneRecipe(BlocksForBuildersBlocks.POLISHED_CALCITE, Blocks.CALCITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_CALCITE_STAIRS, BlocksForBuildersBlocks.POLISHED_CALCITE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB, BlocksForBuildersBlocks.POLISHED_CALCITE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_CALCITE_WALL, BlocksForBuildersBlocks.POLISHED_CALCITE);
                offerStoneRecipe(BlocksForBuildersBlocks.CALCITE_BRICKS, BlocksForBuildersBlocks.POLISHED_CALCITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS, BlocksForBuildersBlocks.CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_BRICK_SLAB, BlocksForBuildersBlocks.CALCITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CALCITE_BRICK_WALL, BlocksForBuildersBlocks.CALCITE_BRICKS);

                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF, 3)
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.TUFF)
                        .define('W', Items.QUARTZ)
                        .unlockedBy(getHasName(Items.TUFF), has(Items.QUARTZ))
                        .save(output);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_WALL, BlocksForBuildersBlocks.LIGHT_TUFF);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF, BlocksForBuildersBlocks.LIGHT_TUFF_SLAB);
                offerStoneRecipe(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF, BlocksForBuildersBlocks.LIGHT_TUFF);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_STAIRS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_WALL, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
                offerStoneRecipe(BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL, BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS, BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB);

                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
                offerStoneRecipe(BlocksForBuildersBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS, BlocksForBuildersBlocks.GRANITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRANITE_BRICK_SLAB, BlocksForBuildersBlocks.GRANITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.GRANITE_BRICK_WALL, BlocksForBuildersBlocks.GRANITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
                offerStoneRecipe(BlocksForBuildersBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS, BlocksForBuildersBlocks.DIORITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DIORITE_BRICK_SLAB, BlocksForBuildersBlocks.DIORITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DIORITE_BRICK_WALL, BlocksForBuildersBlocks.DIORITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
                offerStoneRecipe(BlocksForBuildersBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS, BlocksForBuildersBlocks.ANDESITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB, BlocksForBuildersBlocks.ANDESITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.ANDESITE_BRICK_WALL, BlocksForBuildersBlocks.ANDESITE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
                offerStoneRecipe(BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS, Blocks.SMOOTH_STONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL, BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL, Blocks.SMOOTH_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, Blocks.CUT_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_SANDSTONE_WALL, Blocks.CUT_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL, Blocks.SMOOTH_RED_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS, Blocks.CUT_RED_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL, Blocks.CUT_RED_SANDSTONE);

                offerStoneRecipe(BlocksForBuildersBlocks.SANDSTONE_BRICKS, Blocks.CUT_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.SANDSTONE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.SANDSTONE_BRICKS);
                offerStoneRecipe(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS, Blocks.CUT_RED_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);

                shaped(RecipeCategory.MISC, BlocksForBuildersBlocks.DARK_SAND, 4)
                        .pattern("BW")
                        .pattern("WB")
                        .define('B', Items.DIRT)
                        .define('W', Items.SAND)
                        .unlockedBy(getHasName(Items.SAND), has(Items.DIRT))
                        .save(output);
                offerStoneRecipe(BlocksForBuildersBlocks.DARK_SANDSTONE, BlocksForBuildersBlocks.DARK_SAND);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE);
                offerChiseledRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE, BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
                offerStoneRecipe(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, BlocksForBuildersBlocks.DARK_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE);
                offerStoneRecipe(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL, BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);

                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_STAIRS, Blocks.HAY_BLOCK);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_SLAB, Blocks.HAY_BLOCK);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.HAY_RUG, Blocks.HAY_BLOCK);

                shaped(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH, 9)
                        .pattern("##")
                        .pattern("##")
                        .define('#', Blocks.STRIPPED_BAMBOO_BLOCK)
                        .unlockedBy(getHasName(Blocks.STRIPPED_BAMBOO_BLOCK), has(Blocks.STRIPPED_BAMBOO_BLOCK))
                        .save(output);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS, BlocksForBuildersBlocks.BAMBOO_THATCH);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, BlocksForBuildersBlocks.BAMBOO_THATCH);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_THATCH_RUG, BlocksForBuildersBlocks.BAMBOO_THATCH);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG, Blocks.BAMBOO_MOSAIC);

                shapeless(RecipeCategory.MISC, BlocksForBuildersItems.COCONUT_HUSK, 2)
                        .requires(BFBTags.Items.COCONUTS)
                        .unlockedBy("has_coconut_tag", has(BFBTags.Items.COCONUTS))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.BONE_MEAL, 1)
                        .group("bonemeal")
                        .requires(BlocksForBuildersItems.COCONUT_HUSK)
                        .unlockedBy(getHasName(BlocksForBuildersItems.COCONUT_HUSK), has(BlocksForBuildersItems.COCONUT_HUSK))
                        .save(output);

                shapeless(RecipeCategory.MISC, Items.DYE.brown(), 1)
                        .group("brown_dye")
                        .requires(BlocksForBuildersItems.COCONUT_FIBER)
                        .unlockedBy(getHasName(BlocksForBuildersItems.COCONUT_FIBER), has(BlocksForBuildersItems.COCONUT_FIBER))
                        .save(output);

                shaped(RecipeCategory.MISC, Items.STRING, 3)
                        .pattern("###")
                        .define('#', BlocksForBuildersItems.COCONUT_FIBER)
                        .unlockedBy(getHasName(BlocksForBuildersItems.COCONUT_FIBER), has(BlocksForBuildersItems.COCONUT_FIBER))
                        .save(output);

                shaped(RecipeCategory.TOOLS, Items.BUNDLE, 1)
                        .pattern("-")
                        .pattern("#")
                        .define('-', Items.STRING)
                        .define('#', BlocksForBuildersItems.COCONUT_FIBER)
                        .unlockedBy(getHasName(BlocksForBuildersItems.COCONUT_FIBER), has(BlocksForBuildersItems.COCONUT_FIBER))
                        .save(output);

                threeByThreePacker(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.COCONUT_THATCH, BlocksForBuildersItems.COCONUT_FIBER);
                offerStairsRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.COCONUT_THATCH_STAIRS, BlocksForBuildersBlocks.COCONUT_THATCH);
                slab(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.COCONUT_THATCH_SLAB, BlocksForBuildersBlocks.COCONUT_THATCH);
                offerAltCarpetRecipe(RecipeCategory.BUILDING_BLOCKS, BlocksForBuildersBlocks.COCONUT_THATCH_RUG, BlocksForBuildersBlocks.COCONUT_THATCH);
            }

            private void offerSignRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.MISC, result, 3)
                        .group("wooden_sign")
                        .define('#', input)
                        .define('X', Items.STICK)
                        .pattern("###")
                        .pattern("###")
                        .pattern(" X ")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerFenceRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.MISC, result, 3)
                        .group("wooden_fence")
                        .define('#', input)
                        .define('X', Items.STICK)
                        .pattern("#X#")
                        .pattern("#X#")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerFenceGateRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.REDSTONE, result, 1)
                        .group("wooden_fence_gate")
                        .define('#', input)
                        .define('X', Items.STICK)
                        .pattern("X#X")
                        .pattern("X#X")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerNetherFenceGateRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.REDSTONE, result, 1)
                        .group("nether_fence_gate")
                        .define('#', input)
                        .define('X', Items.NETHER_BRICK)
                        .pattern("X#X")
                        .pattern("X#X")
                        .unlockedBy(getHasName(input), has(input))
                        .unlockedBy(getHasName(Items.NETHER_BRICK), has(Items.NETHER_BRICK))
                        .save(output);
            }

            private void offerNetherFenceRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.MISC, result, 3)
                        .group("nether_fence")
                        .define('#', input)
                        .define('X', Items.NETHER_BRICK)
                        .pattern("#X#")
                        .pattern("#X#")
                        .unlockedBy(getHasName(input), has(input))
                        .unlockedBy(getHasName(Items.NETHER_BRICK), has(Items.NETHER_BRICK))
                        .save(output);
            }

            private void offerNetherSlabRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                        .group("nether_brick_slab")
                        .define('#', input)
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerNetherStairsRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                        .group("nether_brick_stairs")
                        .define('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerNetherWallRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.MISC, result, 6)
                        .group("nether_brick_wall")
                        .define('#', input)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerStairsRecipe(RecipeCategory Category, ItemLike result, ItemLike input) {
                shaped(Category, result, 4)
                        .define('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerWoodenStairsRecipe(RecipeCategory Category, ItemLike result, ItemLike input) {
                shaped(Category, result, 4)
                        .group("wooden_stairs")
                        .define('#', input)
                        .pattern("  #")
                        .pattern(" ##")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerWoodenSlabRecipe(RecipeCategory Category, ItemLike result, ItemLike input) {
                shaped(Category, result, 6)
                        .group("wooden_slab")
                        .define('#', input)
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerDoorRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.REDSTONE, result, 3)
                        .group("wooden_door")
                        .define('#', input)
                        .pattern(" ##")
                        .pattern(" ##")
                        .pattern(" ##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerTrapdoorRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.REDSTONE, result, 2)
                        .group("wooden_trapdoor")
                        .define('#', input)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerWoodenPressurePlateRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.REDSTONE, result, 1)
                        .group("wooden_pressure_plate")
                        .define('#', input)
                        .pattern("##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerButtonRecipe(ItemLike result, ItemLike input) {
                shapeless(RecipeCategory.REDSTONE, result, 1)
                        .requires(input)
                        .group("wooden_button")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerWoodRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.BUILDING_BLOCKS, result, 3)
                        .group("bark")
                        .define('#', input)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerChiseledRecipe(RecipeCategory Category, ItemLike result, ItemLike input) {
                shaped(Category, result, 1)
                        .group("chiseled_nether_bricks")
                        .define('#', input)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerBookshelfRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.BUILDING_BLOCKS, result, 1)
                        .group("bookshelf")
                        .define('#', input)
                        .define('X', Items.BOOK)
                        .pattern("###")
                        .pattern("XXX")
                        .pattern("###")
                        .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                        .save(output);
            }

            private void offerFallenLeavesRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.DECORATIONS, result, 3)
                        .group("fallen_leaves")
                        .define('#', input)
                        .pattern("##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerHedgeRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.DECORATIONS, result, 6)
                        .group("hedges")
                        .define('#', input)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerStoneRecipe(ItemLike result, ItemLike input) {
                shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                        .define('#', input)
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }

            private void offerAltCarpetRecipe(RecipeCategory Category, ItemLike result, ItemLike input) {
                shaped(Category, result, 3)
                        .define('#', input)
                        .pattern("##")
                        .unlockedBy(getHasName(input), has(input))
                        .save(output);
            }
        };
    }
    @Override
    public String getName() {
        return "Blocks for Builders Recipes";
    }
}