package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallSignBlock;
import net.disjoint.blocksforbuilders.world.feature.tree.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.*;

public class BlocksForBuildersBlocks {

    public static final Block GREEN_JUNGLE_LOG = registerBlock("green_jungle_log",
            new PillarBlock(AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN)));
    public static final Block STRIPPED_GREEN_JUNGLE_LOG = registerBlock("stripped_green_jungle_log",
            new PillarBlock(AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_WOOD = registerBlock("green_jungle_wood",
            new PillarBlock(AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN)));
    public static final Block STRIPPED_GREEN_JUNGLE_WOOD = registerBlock("stripped_green_jungle_wood",
            new PillarBlock(AbstractBlock.Settings.copy(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_LEAVES = registerBlock("green_jungle_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(JUNGLE_LEAVES).mapColor(MapColor.LIME)));
    public static final Block FALLEN_GREEN_JUNGLE_LEAVES = registerBlock("fallen_green_jungle_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GREEN_JUNGLE_LEAVES).mapColor(MapColor.LIME).nonOpaque()));
    public static final Block GREEN_JUNGLE_SAPLING = registerBlock("green_jungle_sapling",
            new SaplingBlock(GreenJungleSaplingGenerator.GREEN_JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING)));
    public static final Block POTTED_GREEN_JUNGLE_SAPLING = registerBlock("potted_green_jungle_sapling", false,
            new FlowerPotBlock(GREEN_JUNGLE_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GREEN_JUNGLE_PLANKS = registerBlock("green_jungle_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_STAIRS = registerBlock("green_jungle_stairs",
            new StairsBlock(GREEN_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_STAIRS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_SLAB = registerBlock("green_jungle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_FENCE = registerBlock("green_jungle_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_FENCE_GATE = registerBlock("green_jungle_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE_GATE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_BUTTON = registerBlock("green_jungle_button",
            new ButtonBlock(BlockSetType.JUNGLE, 15, copy(JUNGLE_BUTTON)));
    public static final Block GREEN_JUNGLE_PRESSURE_PLATE = registerBlock("green_jungle_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, copy(JUNGLE_PRESSURE_PLATE)));
    public static final Block GREEN_JUNGLE_DOOR = registerBlock("green_jungle_door",
            new DoorBlock( BlockSetType.JUNGLE, AbstractBlock.Settings.copy(JUNGLE_DOOR).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerBlock("green_jungle_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(JUNGLE_TRAPDOOR).mapColor(MapColor.DARK_GREEN)));
    private static final Identifier GREEN_JUNGLE_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/green_jungle");
    public static final Block GREEN_JUNGLE_SIGN = registerBlock("green_jungle_sign", false,
            new BFBSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SIGN)));
    public static final Block GREEN_JUNGLE_WALL_SIGN = registerBlock("green_jungle_wall_sign", false,
            new BFBWallSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SIGN)));
    private static final Identifier GREEN_JUNGLE_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/green_jungle");
    private static final Identifier GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/green_jungle");
    public static final Block GREEN_JUNGLE_HANGING_SIGN = registerBlock("green_jungle_hanging_sign", false,
            new BFBHangingSignBlock(GREEN_JUNGLE_HANGING_SIGN_TEXTURE, GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(OAK_HANGING_SIGN)));
    public static final Block GREEN_JUNGLE_WALL_HANGING_SIGN = registerBlock("green_jungle_wall_hanging_sign", false,
            new BFBWallHangingSignBlock(GREEN_JUNGLE_HANGING_SIGN_TEXTURE, GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE, WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
   
    public static final Block GHOSTWOOD_LOG = registerBlock("ghostwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY)));
    public static final Block STRIPPED_GHOSTWOOD_LOG = registerBlock("stripped_ghostwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_WOOD = registerBlock("ghostwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY)));
    public static final Block STRIPPED_GHOSTWOOD_WOOD = registerBlock("stripped_ghostwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_LEAVES = registerBlock("ghostwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(AZALEA_LEAVES).mapColor(MapColor.DULL_PINK)));
    public static final Block FALLEN_GHOSTWOOD_LEAVES = registerBlock("fallen_ghostwood_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GHOSTWOOD_LEAVES).mapColor(MapColor.DULL_PINK).nonOpaque()));
    public static final Block GHOSTWOOD_SAPLING = registerBlock("ghostwood_sapling",
            new SaplingBlock(GhostwoodSaplingGenerator.GHOSTWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_GHOSTWOOD_SAPLING = registerBlock("potted_ghostwood_sapling", false,
            new FlowerPotBlock(GHOSTWOOD_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GHOSTWOOD_PLANKS = registerBlock("ghostwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_STAIRS = registerBlock("ghostwood_stairs",
            new StairsBlock(GHOSTWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_SLAB = registerBlock("ghostwood_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_FENCE = registerBlock("ghostwood_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_FENCE_GATE = registerBlock("ghostwood_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_BUTTON = registerBlock("ghostwood_button",
            new ButtonBlock(BlockSetType.OAK, 15, copy(OAK_BUTTON)));
    public static final Block GHOSTWOOD_PRESSURE_PLATE = registerBlock("ghostwood_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, copy(OAK_PRESSURE_PLATE)));
    public static final Block GHOSTWOOD_DOOR = registerBlock("ghostwood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_TRAPDOOR = registerBlock("ghostwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR).mapColor(MapColor.WHITE_GRAY)));
    private static final Identifier GHOSTWOOD_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/ghostwood");
    public static final Block GHOSTWOOD_SIGN = registerBlock("ghostwood_sign", false,
            new BFBSignBlock(GHOSTWOOD_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block GHOSTWOOD_WALL_SIGN = registerBlock("ghostwood_wall_sign", false,
            new BFBWallSignBlock(GHOSTWOOD_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    private static final Identifier GHOSTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/ghostwood");
    private static final Identifier GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/ghostwood");
    public static final Block GHOSTWOOD_HANGING_SIGN = registerBlock("ghostwood_hanging_sign", false,
            new BFBHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(OAK_HANGING_SIGN)));
    public static final Block GHOSTWOOD_WALL_HANGING_SIGN = registerBlock("ghostwood_wall_hanging_sign", false,
            new BFBWallHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
  
    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN)));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN)));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.PALE_GREEN)));
    public static final Block FALLEN_WILLOW_LEAVES = registerBlock("fallen_willow_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(WILLOW_LEAVES).mapColor(MapColor.PALE_GREEN).nonOpaque()));
    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling",
            new SaplingBlock(WillowSaplingGenerator.WILLOW, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WILLOW_SAPLING = registerBlock("potted_willow_sapling", false,
            new FlowerPotBlock(WILLOW_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs",
            new StairsBlock(WILLOW_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_BUTTON = registerBlock("willow_button",
            new ButtonBlock(BlockSetType.OAK, 15, copy(OAK_BUTTON)));
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, copy(OAK_PRESSURE_PLATE)));
    public static final Block WILLOW_DOOR = registerBlock("willow_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR).mapColor(MapColor.LICHEN_GREEN)));
    private static final Identifier WILLOW_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/willow");
    public static final Block WILLOW_SIGN = registerBlock("willow_sign", false,
            new BFBSignBlock(WILLOW_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WILLOW_WALL_SIGN = registerBlock("willow_wall_sign", false,
            new BFBWallSignBlock(WILLOW_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    private static final Identifier WILLOW_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/willow");
    private static final Identifier WILLOW_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/willow");
    public static final Block WILLOW_HANGING_SIGN = registerBlock("willow_hanging_sign", false,
            new BFBHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE, WILLOW_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(OAK_HANGING_SIGN)));
    public static final Block WILLOW_WALL_HANGING_SIGN = registerBlock("willow_wall_hanging_sign", false,
            new BFBWallHangingSignBlock(WILLOW_HANGING_SIGN_TEXTURE, WILLOW_HANGING_SIGN_GUI_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    
    public static final Block GREEN_BAMBOO_PLANKS = registerBlock("green_bamboo_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_STAIRS = registerBlock("green_bamboo_stairs",
            new StairsBlock(GREEN_BAMBOO_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BAMBOO_STAIRS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_SLAB = registerBlock("green_bamboo_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_FENCE = registerBlock("green_bamboo_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_FENCE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_FENCE_GATE = registerBlock("green_bamboo_fence_gate",
            new FenceGateBlock(WoodType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_FENCE_GATE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_BUTTON = registerBlock("green_bamboo_button",
            new ButtonBlock(BlockSetType.BAMBOO, 15, copy(BAMBOO_BUTTON)));
    public static final Block GREEN_BAMBOO_PRESSURE_PLATE = registerBlock("green_bamboo_pressure_plate",
            new PressurePlateBlock(BlockSetType.BAMBOO, copy(BAMBOO_PRESSURE_PLATE)));
    public static final Block GREEN_BAMBOO_DOOR = registerBlock("green_bamboo_door",
            new DoorBlock( BlockSetType.BAMBOO, AbstractBlock.Settings.copy(BAMBOO_DOOR).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_BAMBOO_TRAPDOOR = registerBlock("green_bamboo_trapdoor",
            new TrapdoorBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(BAMBOO_TRAPDOOR).mapColor(MapColor.DARK_GREEN)));
    private static final Identifier GREEN_BAMBOO_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/green_bamboo");
    public static final Block GREEN_BAMBOO_SIGN = registerBlock("green_bamboo_sign", false,
            new BFBSignBlock(GREEN_BAMBOO_SIGN_TEXTURE, WoodType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_SIGN)));
    public static final Block GREEN_BAMBOO_WALL_SIGN = registerBlock("green_bamboo_wall_sign", false,
            new BFBWallSignBlock(GREEN_BAMBOO_SIGN_TEXTURE, WoodType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_SIGN)));
    private static final Identifier GREEN_BAMBOO_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/green_bamboo");
    private static final Identifier GREEN_BAMBOO_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/green_bamboo");
    public static final Block GREEN_BAMBOO_HANGING_SIGN = registerBlock("green_bamboo_hanging_sign", false,
            new BFBHangingSignBlock(GREEN_BAMBOO_HANGING_SIGN_TEXTURE, GREEN_BAMBOO_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(BAMBOO_HANGING_SIGN)));
    public static final Block GREEN_BAMBOO_WALL_HANGING_SIGN = registerBlock("green_bamboo_wall_hanging_sign", false,
            new BFBWallHangingSignBlock(GREEN_BAMBOO_HANGING_SIGN_TEXTURE, GREEN_BAMBOO_HANGING_SIGN_GUI_TEXTURE, WoodType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_HANGING_SIGN)));
  
    public static final Block RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES).mapColor(MapColor.DARK_RED)));
    public static final Block FALLEN_RED_OAK_LEAVES = registerBlock("fallen_red_oak_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(RED_OAK_LEAVES).mapColor(MapColor.DARK_RED).nonOpaque()));
    public static final Block RED_OAK_SAPLING = registerBlock("red_oak_sapling",
            new SaplingBlock(RedOakSaplingGenerator.RED_OAK, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_RED_OAK_SAPLING = registerBlock("potted_red_oak_sapling", false,
            new FlowerPotBlock(RED_OAK_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GOLD_ACACIA_LEAVES = registerBlock("gold_acacia_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block FALLEN_GOLD_ACACIA_LEAVES = registerBlock("fallen_gold_acacia_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block GOLD_ACACIA_SAPLING = registerBlock("gold_acacia_sapling",
            new SaplingBlock(GoldAcaciaSaplingGenerator.GOLD_ACACIA, AbstractBlock.Settings.copy(ACACIA_SAPLING)));
    public static final Block POTTED_GOLD_ACACIA_SAPLING = registerBlock("potted_gold_acacia_sapling", false,
            new FlowerPotBlock(GOLD_ACACIA_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block ORANGE_OAK_LEAVES = registerBlock("orange_oak_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.ORANGE)));
    public static final Block FALLEN_ORANGE_OAK_LEAVES = registerBlock("fallen_orange_oak_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(ORANGE_OAK_LEAVES).mapColor(MapColor.ORANGE).nonOpaque()));
    public static final Block ORANGE_OAK_SAPLING = registerBlock("orange_oak_sapling",
            new SaplingBlock(OrangeOakSaplingGenerator.ORANGE_OAK, AbstractBlock.Settings.copy(OAK_SAPLING)));
    public static final Block POTTED_ORANGE_OAK_SAPLING = registerBlock("potted_orange_oak_sapling", false,
            new FlowerPotBlock(ORANGE_OAK_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block YELLOW_BIRCH_LEAVES = registerBlock("yellow_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(BIRCH_LEAVES).mapColor(MapColor.YELLOW)));
    public static final Block FALLEN_YELLOW_BIRCH_LEAVES = registerBlock("fallen_yellow_birch_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(YELLOW_BIRCH_LEAVES).mapColor(MapColor.YELLOW).nonOpaque()));
    public static final Block YELLOW_BIRCH_SAPLING = registerBlock("yellow_birch_sapling",
            new SaplingBlock(YellowBirchSaplingGenerator.YELLOW_BIRCH, AbstractBlock.Settings.copy(BIRCH_SAPLING)));
    public static final Block POTTED_YELLOW_BIRCH_SAPLING = registerBlock("potted_yellow_birch_sapling", false,
            new FlowerPotBlock(YELLOW_BIRCH_SAPLING, AbstractBlock.Settings.copy(POTTED_BIRCH_SAPLING)));
   
    public static final Block FALLEN_OAK_LEAVES = registerBlock("fallen_oak_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(OAK_LEAVES).nonOpaque()));
    public static final Block FALLEN_BIRCH_LEAVES = registerBlock("fallen_birch_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(BIRCH_LEAVES).nonOpaque()));
    public static final Block FALLEN_SPRUCE_LEAVES = registerBlock("fallen_spruce_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(SPRUCE_LEAVES).nonOpaque()));
    public static final Block FALLEN_JUNGLE_LEAVES = registerBlock("fallen_jungle_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(JUNGLE_LEAVES).nonOpaque()));
    public static final Block FALLEN_DARK_OAK_LEAVES = registerBlock("fallen_dark_oak_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(DARK_OAK_LEAVES).nonOpaque()));
    public static final Block FALLEN_ACACIA_LEAVES = registerBlock("fallen_acacia_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(ACACIA_LEAVES).nonOpaque()));
    public static final Block FALLEN_AZALEA_LEAVES = registerBlock("fallen_azalea_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(AZALEA_LEAVES).nonOpaque()));
    public static final Block FALLEN_FLOWERING_AZALEA_LEAVES = registerBlock("fallen_flowering_azalea_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(FLOWERING_AZALEA_LEAVES).nonOpaque()));
    public static final Block FALLEN_MANGROVE_LEAVES = registerBlock("fallen_mangrove_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(MANGROVE_LEAVES).nonOpaque()));
    public static final Block FALLEN_CHERRY_LEAVES = registerBlock("fallen_cherry_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(CHERRY_LEAVES).nonOpaque()));
   
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DULL_PINK)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.BROWN)));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.ORANGE)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.RED)));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_AQUA)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_RED)));
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PINK)));
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW)));
    public static final Block GREEN_JUNGLE_BOOKSHELF = registerBlock("green_jungle_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN)));
    public static final Block GHOSTWOOD_BOOKSHELF = registerBlock("ghostwood_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.WHITE_GRAY)));
    public static final Block WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_GREEN)));
    public static final Block GREEN_BAMBOO_BOOKSHELF = registerBlock("green_bamboo_bookshelf",
            new Block(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN)));
   
    public static final Block HAY_STAIRS = registerBlock("hay_stairs",
            new StairsBlock(HAY_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(HAY_BLOCK).mapColor(MapColor.YELLOW)));
    public static final Block HAY_SLAB = registerBlock("hay_slab",
            new DirectionalSlab(AbstractBlock.Settings.copy(HAY_BLOCK).mapColor(MapColor.YELLOW)));
   
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new StairsBlock(SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY)));
  
    public static final Block BLACK_NETHER_BRICKS = registerBlock("black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block CHISELED_BLACK_NETHER_BRICKS = registerBlock("chiseled_black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block CRACKED_BLACK_NETHER_BRICKS = registerBlock("cracked_black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_STAIRS = registerBlock("black_nether_brick_stairs",
            new StairsBlock(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_STAIRS).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_SLAB = registerBlock("black_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_WALL = registerBlock("black_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_WALL).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_FENCE = registerBlock("black_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_FENCE_GATE = registerBlock("black_nether_brick_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.RED)));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.RED)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED)));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.DARK_RED)));
  
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(QUARTZ_BLOCK).mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(QUARTZ_BRICKS).mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(QUARTZ_STAIRS).mapColor(MapColor.OFF_WHITE)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new DirectionalSlab(AbstractBlock.Settings.copy(QUARTZ_SLAB).mapColor(MapColor.OFF_WHITE)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_QUARTZ).mapColor(MapColor.OFF_WHITE)));

    public static final Block GRIMSTONE = registerBlock("grimstone",
            new Block(AbstractBlock.Settings.copy(DEEPSLATE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block POLISHED_GRIMSTONE = registerBlock("polished_grimstone",
            new Block(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block POLISHED_GRIMSTONE_STAIRS = registerBlock("polished_grimstone_stairs",
            new StairsBlock(POLISHED_GRIMSTONE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_STAIRS).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block POLISHED_GRIMSTONE_SLAB = registerBlock("polished_grimstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block POLISHED_GRIMSTONE_WALL = registerBlock("polished_grimstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_DEEPSLATE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            new Block(AbstractBlock.Settings.copy(DEEPSLATE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_BRICK_STAIRS = registerBlock("grimstone_brick_stairs",
            new StairsBlock(GRIMSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DEEPSLATE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_TILES = registerBlock("grimstone_tiles",
            new DirectionalBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_TILE_STAIRS = registerBlock("grimstone_tile_stairs",
            new StairsBlock(GRIMSTONE_TILES.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE_TILE_STAIRS).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_TILE_SLAB = registerBlock("grimstone_tile_slab",
            new DirectionalSlab(AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block GRIMSTONE_TILE_WALL = registerBlock("grimstone_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(DEEPSLATE_TILE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).sounds(BlockSoundGroup.NETHER_BRICKS)));

    private static Block registerBlock(String name, Block block) {
        return registerBlock(name, true, block);
    }
    private static Block registerBlock(String name, boolean createItem, Block block) {
        if (createItem) { registerBlockItem(name, block); }
        return Registry.register(Registries.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        BlocksForBuilders.LOGGER.info("Registering blocks for " + BlocksForBuilders.MOD_ID);
    }
}
