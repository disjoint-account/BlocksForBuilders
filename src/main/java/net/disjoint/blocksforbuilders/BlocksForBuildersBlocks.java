package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallSignBlock;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBSaplingGenerators;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.*;

public class BlocksForBuildersBlocks {
    public static final BlockSetType GHOSTWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_set"));
    public static final BlockSetType SCORCHWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_set"));
    public static final BlockSetType WILLOW_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "willow_set"));
    public static final BlockSetType GREEN_JUNGLE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_set"));
    public static final BlockSetType GREEN_BAMBOO_SET = BlockSetTypeBuilder.copyOf(BlockSetType.BAMBOO).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_set"));
    public static final WoodType GHOSTWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood"), GHOSTWOOD_SET);
    public static final WoodType SCORCHWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood"), SCORCHWOOD_SET);
    public static final WoodType WILLOW = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "willow"), WILLOW_SET);
    public static final WoodType GREEN_JUNGLE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle"), GREEN_JUNGLE_SET);
    public static final WoodType GREEN_BAMBOO = WoodTypeBuilder.copyOf(WoodType.BAMBOO).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo"), GREEN_BAMBOO_SET);

    public static final Block GREEN_JUNGLE_LOG = registerBlock("green_jungle_log",
            PillarBlock::new, AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
    public static final Block STRIPPED_GREEN_JUNGLE_LOG = registerBlock("stripped_green_jungle_log",
            PillarBlock::new, AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_WOOD = registerBlock("green_jungle_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
    public static final Block STRIPPED_GREEN_JUNGLE_WOOD = registerBlock("stripped_green_jungle_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_LEAVES = registerBlock("green_jungle_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(JUNGLE_LEAVES).mapColor(MapColor.LIME));
    public static final Block FALLEN_GREEN_JUNGLE_LEAVES = registerBlock("fallen_green_jungle_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GREEN_JUNGLE_LEAVES).mapColor(MapColor.LIME).nonOpaque());
    public static final Block GREEN_JUNGLE_SAPLING = registerSaplingBlock("green_jungle_sapling", BFBSaplingGenerators.GREEN_JUNGLE, JUNGLE_SAPLING);
    public static final Block POTTED_GREEN_JUNGLE_SAPLING = registerFlowerPotBlock("potted_green_jungle_sapling", GREEN_JUNGLE_SAPLING, POTTED_JUNGLE_SAPLING);
    public static final Block GREEN_JUNGLE_PLANKS = registerBlock("green_jungle_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_STAIRS = registerStairsBlock("green_jungle_stairs", GREEN_JUNGLE_PLANKS);
    public static final Block GREEN_JUNGLE_SLAB = registerBlock("green_jungle_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_FENCE = registerBlock("green_jungle_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_FENCE_GATE = registerFenceGateBlock("green_jungle_fence_gate", WoodType.JUNGLE, GREEN_JUNGLE_FENCE, MapColor.DARK_GREEN);
    public static final Block GREEN_JUNGLE_BUTTON = registerButtonBlock("green_jungle_button", BlockSetType.JUNGLE, 15, JUNGLE_BUTTON);
    public static final Block GREEN_JUNGLE_PRESSURE_PLATE = registerPressurePlateBlock("green_jungle_pressure_plate", BlockSetType.JUNGLE, JUNGLE_PRESSURE_PLATE);
    public static final Block GREEN_JUNGLE_DOOR = registerDoorBlock("green_jungle_door",BlockSetType.JUNGLE, JUNGLE_DOOR);
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerTrapdoorBlock("green_jungle_trapdoor", BlockSetType.JUNGLE, JUNGLE_TRAPDOOR);
    public static final Block GREEN_JUNGLE_SIGN = registerSignBlock("green_jungle_sign", settings -> new BFBSignBlock("green_jungle", GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_SIGN));
    public static final Block GREEN_JUNGLE_WALL_SIGN = registerSignBlock("green_jungle_wall_sign", settings -> new BFBWallSignBlock("green_jungle", GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_WALL_SIGN));
    public static final Block GREEN_JUNGLE_HANGING_SIGN = registerSignBlock("green_jungle_hanging_sign", settings -> new BFBHangingSignBlock("green_jungle", GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_HANGING_SIGN));
    public static final Block GREEN_JUNGLE_WALL_HANGING_SIGN = registerSignBlock("green_jungle_hanging_wall_sign", settings -> new BFBWallHangingSignBlock("green_jungle", GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_WALL_HANGING_SIGN));
   
    public static final Block GHOSTWOOD_LOG = registerBlock("ghostwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block STRIPPED_GHOSTWOOD_LOG = registerBlock("stripped_ghostwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_WOOD = registerBlock("ghostwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block STRIPPED_GHOSTWOOD_WOOD = registerBlock("stripped_ghostwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_LEAVES = registerBlock("ghostwood_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(AZALEA_LEAVES).mapColor(MapColor.DULL_PINK));
    public static final Block FALLEN_GHOSTWOOD_LEAVES = registerBlock("fallen_ghostwood_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GHOSTWOOD_LEAVES).mapColor(MapColor.DULL_PINK).nonOpaque());
    public static final Block GHOSTWOOD_SAPLING = registerSaplingBlock("ghostwood_sapling", BFBSaplingGenerators.GHOSTWOOD, OAK_SAPLING);
    public static final Block POTTED_GHOSTWOOD_SAPLING = registerFlowerPotBlock("potted_ghostwood_sapling", GHOSTWOOD_SAPLING, POTTED_OAK_SAPLING);
    public static final Block GHOSTWOOD_PLANKS = registerBlock("ghostwood_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_STAIRS = registerStairsBlock("ghostwood_stairs", GHOSTWOOD_PLANKS);
    public static final Block GHOSTWOOD_SLAB = registerBlock("ghostwood_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_FENCE = registerBlock("ghostwood_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_FENCE_GATE = registerFenceGateBlock("ghostwood_fence_gate", WoodType.OAK, GHOSTWOOD_FENCE, MapColor.WHITE_GRAY);
    public static final Block GHOSTWOOD_BUTTON = registerButtonBlock("ghostwood_button", BlockSetType.OAK, 15, OAK_BUTTON);
    public static final Block GHOSTWOOD_PRESSURE_PLATE = registerPressurePlateBlock("ghostwood_pressure_plate", BlockSetType.OAK, OAK_PRESSURE_PLATE);
    public static final Block GHOSTWOOD_DOOR = registerDoorBlock("ghostwood_door",BlockSetType.OAK, OAK_DOOR);
    public static final Block GHOSTWOOD_TRAPDOOR = registerTrapdoorBlock("ghostwood_trapdoor", BlockSetType.OAK, OAK_TRAPDOOR);
    public static final Block GHOSTWOOD_SIGN = registerSignBlock("ghostwood_sign", settings -> new BFBSignBlock("ghostwood", GHOSTWOOD, settings), AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block GHOSTWOOD_WALL_SIGN = registerSignBlock("ghostwood_wall_sign", settings -> new BFBWallSignBlock("ghostwood", GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN));
    public static final Block GHOSTWOOD_HANGING_SIGN = registerSignBlock("ghostwood_hanging_sign", settings -> new BFBHangingSignBlock("ghostwood", GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN));
    public static final Block GHOSTWOOD_WALL_HANGING_SIGN = registerSignBlock("ghostwood_hanging_wall_sign", settings -> new BFBWallHangingSignBlock("ghostwood", GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN));

    public static final Block SCORCHWOOD_LOG = registerBlock("scorchwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.BLACK));
    public static final Block STRIPPED_SCORCHWOOD_LOG = registerBlock("stripped_scorchwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_WOOD = registerBlock("scorchwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.BLACK));
    public static final Block STRIPPED_SCORCHWOOD_WOOD = registerBlock("stripped_scorchwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_SAPLING = registerSaplingBlock("scorchwood_sapling", BFBSaplingGenerators.SCORCHWOOD, OAK_SAPLING);
    public static final Block POTTED_SCORCHWOOD_SAPLING = registerFlowerPotBlock("potted_scorchwood_sapling", SCORCHWOOD_SAPLING, POTTED_OAK_SAPLING);
    public static final Block SCORCHWOOD_PLANKS = registerBlock("scorchwood_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_STAIRS = registerStairsBlock("scorchwood_stairs", SCORCHWOOD_PLANKS);
    public static final Block SCORCHWOOD_SLAB = registerBlock("scorchwood_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_FENCE = registerBlock("scorchwood_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_FENCE_GATE = registerFenceGateBlock("scorchwood_fence_gate", WoodType.OAK, SCORCHWOOD_FENCE, MapColor.BLACK);
    public static final Block SCORCHWOOD_BUTTON = registerButtonBlock("scorchwood_button", BlockSetType.OAK, 15, OAK_BUTTON);
    public static final Block SCORCHWOOD_PRESSURE_PLATE = registerPressurePlateBlock("scorchwood_pressure_plate", BlockSetType.OAK, OAK_PRESSURE_PLATE);
    public static final Block SCORCHWOOD_DOOR = registerDoorBlock("scorchwood_door",BlockSetType.OAK, OAK_DOOR);
    public static final Block SCORCHWOOD_TRAPDOOR = registerTrapdoorBlock("scorchwood_trapdoor", BlockSetType.OAK, OAK_TRAPDOOR);
    public static final Block SCORCHWOOD_SIGN = registerSignBlock("scorchwood_sign", settings -> new BFBSignBlock("scorchwood", SCORCHWOOD, settings), AbstractBlock.Settings.copy(Blocks.OAK_SIGN));
    public static final Block SCORCHWOOD_WALL_SIGN = registerSignBlock("scorchwood_wall_sign", settings -> new BFBWallSignBlock("scorchwood", SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN));
    public static final Block SCORCHWOOD_HANGING_SIGN = registerSignBlock("scorchwood_hanging_sign", settings -> new BFBHangingSignBlock("scorchwood", SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN));
    public static final Block SCORCHWOOD_WALL_HANGING_SIGN = registerSignBlock("scorchwood_hanging_wall_sign", settings -> new BFBWallHangingSignBlock("scorchwood", SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN));

    public static final Block WILLOW_LOG = registerBlock("willow_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PALE_GREEN));
    public static final Block FALLEN_WILLOW_LEAVES = registerBlock("fallen_willow_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(WILLOW_LEAVES).mapColor(MapColor.PALE_GREEN).nonOpaque());
    public static final Block WILLOW_SAPLING = registerSaplingBlock("willow_sapling", BFBSaplingGenerators.WILLOW, OAK_SAPLING);
    public static final Block POTTED_WILLOW_SAPLING = registerFlowerPotBlock("potted_willow_sapling", WILLOW_SAPLING, POTTED_OAK_SAPLING);
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_STAIRS = registerStairsBlock("willow_stairs", WILLOW_PLANKS);
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_FENCE_GATE = registerFenceGateBlock("willow_fence_gate", WoodType.OAK, WILLOW_FENCE, MapColor.LICHEN_GREEN);
    public static final Block WILLOW_BUTTON = registerButtonBlock("willow_button", BlockSetType.OAK, 15, OAK_BUTTON);
    public static final Block WILLOW_PRESSURE_PLATE = registerPressurePlateBlock("willow_pressure_plate", BlockSetType.OAK, OAK_PRESSURE_PLATE);
    public static final Block WILLOW_DOOR = registerDoorBlock("willow_door",BlockSetType.OAK, OAK_DOOR);
    public static final Block WILLOW_TRAPDOOR = registerTrapdoorBlock("willow_trapdoor", BlockSetType.OAK, OAK_TRAPDOOR);
    public static final Block WILLOW_SIGN = registerSignBlock("willow_sign", settings -> new BFBSignBlock("willow", WILLOW, settings), AbstractBlock.Settings.copy(OAK_SIGN));
    public static final Block WILLOW_WALL_SIGN = registerSignBlock("willow_wall_sign", settings -> new BFBWallSignBlock("willow", WILLOW, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN));
    public static final Block WILLOW_HANGING_SIGN = registerSignBlock("willow_hanging_sign", settings -> new BFBHangingSignBlock("willow", WILLOW, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN));
    public static final Block WILLOW_WALL_HANGING_SIGN = registerSignBlock("willow_hanging_wall_sign", settings -> new BFBWallHangingSignBlock("willow", WILLOW, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN));
    
    public static final Block GREEN_BAMBOO_PLANKS = registerBlock("green_bamboo_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_STAIRS = registerStairsBlock("green_bamboo_stairs", GREEN_BAMBOO_PLANKS);
    public static final Block GREEN_BAMBOO_SLAB = registerBlock("green_bamboo_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_FENCE = registerBlock("green_bamboo_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_FENCE).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_FENCE_GATE = registerFenceGateBlock("green_bamboo_fence_gate", WoodType.BAMBOO, GREEN_BAMBOO_FENCE, MapColor.DARK_GREEN);
    public static final Block GREEN_BAMBOO_BUTTON = registerButtonBlock("green_bamboo_button", BlockSetType.BAMBOO, 15, BAMBOO_BUTTON);
    public static final Block GREEN_BAMBOO_PRESSURE_PLATE = registerPressurePlateBlock("green_bamboo_pressure_plate", BlockSetType.BAMBOO, BAMBOO_PRESSURE_PLATE);
    public static final Block GREEN_BAMBOO_DOOR = registerDoorBlock("green_bamboo_door",BlockSetType.BAMBOO, BAMBOO_DOOR);
    public static final Block GREEN_BAMBOO_TRAPDOOR = registerTrapdoorBlock("green_bamboo_trapdoor", BlockSetType.BAMBOO, BAMBOO_TRAPDOOR);
    public static final Block GREEN_BAMBOO_SIGN = registerSignBlock("green_bamboo_sign", settings -> new BFBSignBlock("green_bamboo", GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(Blocks.BAMBOO_SIGN));
    public static final Block GREEN_BAMBOO_WALL_SIGN = registerSignBlock("green_bamboo_wall_sign", settings -> new BFBWallSignBlock("green_bamboo", GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(BAMBOO_WALL_SIGN));
    public static final Block GREEN_BAMBOO_HANGING_SIGN = registerSignBlock("green_bamboo_hanging_sign", settings -> new BFBHangingSignBlock("green_bamboo", GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(BAMBOO_HANGING_SIGN));
    public static final Block GREEN_BAMBOO_WALL_HANGING_SIGN = registerSignBlock("green_bamboo_hanging_wall_sign", settings -> new BFBWallHangingSignBlock("green_bamboo", GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(BAMBOO_WALL_HANGING_SIGN));
  
    public static final Block RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(OAK_LEAVES).mapColor(MapColor.DARK_RED));
    public static final Block FALLEN_RED_OAK_LEAVES = registerBlock("fallen_red_oak_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(RED_OAK_LEAVES).mapColor(MapColor.DARK_RED).nonOpaque());
    public static final Block RED_OAK_SAPLING = registerSaplingBlock("red_oak_sapling", BFBSaplingGenerators.RED_OAK, OAK_SAPLING);
    public static final Block POTTED_RED_OAK_SAPLING = registerFlowerPotBlock("potted_red_oak_sapling", RED_OAK_SAPLING, POTTED_OAK_SAPLING);
    public static final Block GOLD_ACACIA_LEAVES = registerBlock("gold_acacia_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW));
    public static final Block FALLEN_GOLD_ACACIA_LEAVES = registerBlock("fallen_gold_acacia_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque());
    public static final Block GOLD_ACACIA_SAPLING = registerSaplingBlock("gold_acacia_sapling", BFBSaplingGenerators.GOLD_ACACIA, ACACIA_SAPLING);
    public static final Block POTTED_GOLD_ACACIA_SAPLING = registerFlowerPotBlock("potted_gold_acacia_sapling", GOLD_ACACIA_SAPLING, POTTED_ACACIA_SAPLING);
    public static final Block ORANGE_OAK_LEAVES = registerBlock("orange_oak_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.ORANGE));
    public static final Block FALLEN_ORANGE_OAK_LEAVES = registerBlock("fallen_orange_oak_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(ORANGE_OAK_LEAVES).mapColor(MapColor.ORANGE).nonOpaque());
    public static final Block ORANGE_OAK_SAPLING = registerSaplingBlock("orange_oak_sapling", BFBSaplingGenerators.ORANGE_OAK, OAK_SAPLING);
    public static final Block POTTED_ORANGE_OAK_SAPLING = registerFlowerPotBlock("potted_orange_oak_sapling", ORANGE_OAK_SAPLING, POTTED_OAK_SAPLING);
    public static final Block YELLOW_BIRCH_LEAVES = registerBlock("yellow_birch_leaves",
            LeavesBlock::new, AbstractBlock.Settings.copy(BIRCH_LEAVES).mapColor(MapColor.YELLOW));
    public static final Block FALLEN_YELLOW_BIRCH_LEAVES = registerBlock("fallen_yellow_birch_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(YELLOW_BIRCH_LEAVES).mapColor(MapColor.YELLOW).nonOpaque());
    public static final Block YELLOW_BIRCH_SAPLING = registerSaplingBlock("yellow_birch_sapling", BFBSaplingGenerators.YELLOW_BIRCH, BIRCH_SAPLING);
    public static final Block POTTED_YELLOW_BIRCH_SAPLING = registerFlowerPotBlock("potted_yellow_birch_sapling", YELLOW_BIRCH_SAPLING, POTTED_BIRCH_SAPLING);

    public static final Block FALLEN_OAK_LEAVES = registerBlock("fallen_oak_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(OAK_LEAVES).nonOpaque());
    public static final Block FALLEN_BIRCH_LEAVES = registerBlock("fallen_birch_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(BIRCH_LEAVES).nonOpaque());
    public static final Block FALLEN_SPRUCE_LEAVES = registerBlock("fallen_spruce_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(SPRUCE_LEAVES).nonOpaque());
    public static final Block FALLEN_JUNGLE_LEAVES = registerBlock("fallen_jungle_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(JUNGLE_LEAVES).nonOpaque());
    public static final Block FALLEN_DARK_OAK_LEAVES = registerBlock("fallen_dark_oak_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(DARK_OAK_LEAVES).nonOpaque());
    public static final Block FALLEN_ACACIA_LEAVES = registerBlock("fallen_acacia_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(ACACIA_LEAVES).nonOpaque());
    public static final Block FALLEN_AZALEA_LEAVES = registerBlock("fallen_azalea_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(AZALEA_LEAVES).nonOpaque());
    public static final Block FALLEN_FLOWERING_AZALEA_LEAVES = registerBlock("fallen_flowering_azalea_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(FLOWERING_AZALEA_LEAVES).nonOpaque());
    public static final Block FALLEN_MANGROVE_LEAVES = registerBlock("fallen_mangrove_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(MANGROVE_LEAVES).nonOpaque());
    public static final Block FALLEN_CHERRY_LEAVES = registerBlock("fallen_cherry_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(CHERRY_LEAVES).nonOpaque());
    public static final Block FALLEN_PALE_OAK_LEAVES = registerBlock("fallen_pale_oak_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(PALE_OAK_LEAVES).nonOpaque());
   
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.SPRUCE_BROWN));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DULL_PINK));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.BROWN));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.ORANGE));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.RED));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_AQUA));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_RED));
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PINK));
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALE_OAK_BOOKSHELF = registerBlock("pale_oak_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
    public static final Block GREEN_JUNGLE_BOOKSHELF = registerBlock("green_jungle_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN));
    public static final Block GHOSTWOOD_BOOKSHELF = registerBlock("ghostwood_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.WHITE_GRAY));
    public static final Block SCORCHWOOD_BOOKSHELF = registerBlock("scorchwood_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.BLACK));
    public static final Block WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_GREEN));
    public static final Block GREEN_BAMBOO_BOOKSHELF = registerBlock("green_bamboo_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN));
   
    public static final Block HAY_STAIRS = registerStairsBlock("hay_stairs", HAY_BLOCK);
    public static final Block HAY_SLAB = registerBlock("hay_slab",
            DirectionalSlab::new, AbstractBlock.Settings.copy(HAY_BLOCK).mapColor(MapColor.YELLOW));
   
    public static final Block SMOOTH_STONE_STAIRS = registerStairsBlock("smooth_stone_stairs", SMOOTH_STONE);
  
    public static final Block BLACK_NETHER_BRICKS = registerBlock("black_nether_bricks",
            Block::new, AbstractBlock.Settings.copy(NETHER_BRICKS).mapColor(MapColor.BLACK));
    public static final Block CHISELED_BLACK_NETHER_BRICKS = registerBlock("chiseled_black_nether_bricks",
            Block::new, AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.BLACK));
    public static final Block CRACKED_BLACK_NETHER_BRICKS = registerBlock("cracked_black_nether_bricks",
            Block::new, AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.BLACK));
    public static final Block BLACK_NETHER_BRICK_STAIRS = registerStairsBlock("black_nether_brick_stairs", BLACK_NETHER_BRICKS);
    public static final Block BLACK_NETHER_BRICK_SLAB = registerBlock("black_nether_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB).mapColor(MapColor.BLACK));
    public static final Block BLACK_NETHER_BRICK_WALL = registerBlock("black_nether_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_WALL).mapColor(MapColor.BLACK));
    public static final Block BLACK_NETHER_BRICK_FENCE = registerBlock("black_nether_brick_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK));
    public static final Block BLACK_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("black_nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.BLACK);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            Block::new, AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.RED));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            Block::new, AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.RED));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("red_nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.RED);
    public static final Block NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.DARK_RED);
  
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            WallBlock::new, AbstractBlock.Settings.copy(QUARTZ_BLOCK).mapColor(MapColor.OFF_WHITE));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(QUARTZ_BRICKS).mapColor(MapColor.OFF_WHITE));
    public static final Block QUARTZ_BRICK_STAIRS = registerStairsBlock("quartz_brick_stairs", QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            DirectionalSlab::new, AbstractBlock.Settings.copy(QUARTZ_SLAB).mapColor(MapColor.OFF_WHITE));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SMOOTH_QUARTZ).mapColor(MapColor.OFF_WHITE));

    public static final Block GRIMSTONE = registerBlock("grimstone",
            Block::new, AbstractBlock.Settings.copy(COBBLED_DEEPSLATE));
    public static final Block GRIMSTONE_STAIRS = registerStairsBlock("grimstone_stairs", GRIMSTONE);
    public static final Block GRIMSTONE_SLAB = registerBlock("grimstone_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(COBBLED_DEEPSLATE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_WALL = registerBlock("grimstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(COBBLED_DEEPSLATE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block CHISELED_GRIMSTONE = registerBlock("chiseled_grimstone",
            Block::new, AbstractBlock.Settings.copy(CHISELED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE = registerBlock("polished_grimstone",
            Block::new, AbstractBlock.Settings.copy(POLISHED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE_STAIRS = registerStairsBlock("polished_grimstone_stairs", POLISHED_GRIMSTONE);
    public static final Block POLISHED_GRIMSTONE_SLAB = registerBlock("polished_grimstone_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE_WALL = registerBlock("polished_grimstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            Block::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_STAIRS = registerStairsBlock("grimstone_brick_stairs", GRIMSTONE_BRICKS);
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILES = registerBlock("grimstone_tiles",
            DirectionalBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_STAIRS = registerStairsBlock("grimstone_tile_stairs", GRIMSTONE_TILES);
    public static final Block GRIMSTONE_TILE_SLAB = registerBlock("grimstone_tile_slab",
            DirectionalSlab::new, AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_WALL = registerBlock("grimstone_tile_wall",
            WallBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_TILE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));

    public static final Block BAMBOO_MOSAIC_RUG = registerBlock("bamboo_mosaic_rug",
            CarpetBlock::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH = registerBlock("bamboo_thatch",
            PillarBlock::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH_STAIRS = registerStairsBlock("bamboo_thatch_stairs", BAMBOO_THATCH);
    public static final Block BAMBOO_THATCH_SLAB = registerBlock("bamboo_thatch_slab",
            DirectionalSlab::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH_RUG = registerBlock("bamboo_thatch_rug",
            DirectionalCarpet::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));

    public static final Block SCORCHED_DIRT = registerBlock("scorched_dirt",
            SnowyBlock::new, AbstractBlock.Settings.copy(DIRT).mapColor(MapColor.TERRACOTTA_GRAY));
    public static final Block ASHEN_CARPET = registerBlock("ashen_carpet",
            CarpetBlock::new, AbstractBlock.Settings.copy(MOSS_CARPET).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.TERRACOTTA_BLACK));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name));
    }
    private static Block registerStairsBlock(String name, Block base) {
        return registerBlock(name, settings -> new StairsBlock(base.getDefaultState(), settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerSignBlock(String name, Function<AbstractBlock.Settings, Block> function,
                                         AbstractBlock.Settings settings) {
        return Registry.register(Registries.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name), function.apply(settings.registryKey(keyOf(name))));
    }
    private static Block registerDoorBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new DoorBlock(woodType, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerTrapdoorBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new TrapdoorBlock(woodType, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerFenceGateBlock(String name, WoodType woodType, Block base, MapColor color) {
        return registerBlock(name, settings -> new FenceGateBlock(woodType, settings), AbstractBlock.Settings.copy(base).mapColor(color));
    }
    private static Block registerButtonBlock(String name, BlockSetType woodType, int duration, Block base) {
        return registerBlock(name, settings -> new ButtonBlock(woodType, duration, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerPressurePlateBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new PressurePlateBlock(woodType, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new FlowerPotBlock(content, settings), AbstractBlock.Settings.copy(base));
    }
    private static Block registerSaplingBlock(String name, SaplingGenerator generator, Block base) {
        return registerBlock(name, settings -> new SaplingBlock(generator, settings), AbstractBlock.Settings.copy(base));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(BlocksForBuilders.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Registry.register(Registries.ITEM, key, new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(key)));
    }
    public static void registerModBlocks() {
        BlocksForBuilders.LOGGER.info("Registering blocks for " + BlocksForBuilders.MOD_ID);
    }
}
