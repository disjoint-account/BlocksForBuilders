package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.sign_blocks.BFBWallSignBlock;
import net.disjoint.blocksforbuilders.world.feature.tree.GhostwoodSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.GoldAcaciaSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.GreenJungleSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.RedOakSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.Blocks.NETHER_BRICK_FENCE;

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
            new GreenLeafBlock());
    public static final Block FALLEN_GREEN_JUNGLE_LEAVES = registerBlock("fallen_green_jungle_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GREEN_JUNGLE_LEAVES).mapColor(MapColor.LIME).nonOpaque()));
    public static final Block GREEN_JUNGLE_SAPLING = registerBlock("green_jungle_sapling",
            new BFBSaplingBlock(GreenJungleSaplingGenerator.GREEN_JUNGLE, AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING)));
    public static final Block POTTED_GREEN_JUNGLE_SAPLING = registerBlock("potted_green_jungle_sapling",
            new FlowerPotBlock(GREEN_JUNGLE_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GREEN_JUNGLE_PLANKS = registerBlock("green_jungle_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_STAIRS = registerBlock("green_jungle_stairs",
            new BFBStairs(GREEN_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_STAIRS).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_SLAB = registerBlock("green_jungle_slab",
            new BFBSlab(GREEN_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_FENCE = registerBlock("green_jungle_fence",
            new BFBFence(GREEN_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_FENCE_GATE = registerBlock("green_jungle_fence_gate",
            new BFBFenceGate(GREEN_JUNGLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE_GATE).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_BUTTON = registerBlock("green_jungle_button",
            new WoodButton());
    public static final Block GREEN_JUNGLE_PRESSURE_PLATE = registerBlock("green_jungle_pressure_plate",
            new WoodPressurePlate());
    public static final Block GREEN_JUNGLE_DOOR = registerBlock("green_jungle_door",
            new DoorBlock( BlockSetType.JUNGLE, AbstractBlock.Settings.copy(JUNGLE_DOOR).mapColor(MapColor.DARK_GREEN)));
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerBlock("green_jungle_trapdoor",
            new TrapdoorBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.copy(JUNGLE_TRAPDOOR).mapColor(MapColor.DARK_GREEN)));
    private static final Identifier GREEN_JUNGLE_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/green_jungle");
    public static final Block GREEN_JUNGLE_SIGN = registerBlock("green_jungle_sign",
            new BFBSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block GREEN_JUNGLE_WALL_SIGN = registerBlock("green_jungle_wall_sign",
            new BFBWallSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, WoodType.JUNGLE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    private static final Identifier GREEN_JUNGLE_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/green_jungle");
    private static final Identifier GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/green_jungle");
    public static final Block GREEN_JUNGLE_HANGING_SIGN = registerBlock("green_jungle_hanging_sign",
            new BFBHangingSignBlock(GREEN_JUNGLE_HANGING_SIGN_TEXTURE, GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(OAK_HANGING_SIGN)));
    public static final Block GREEN_JUNGLE_WALL_HANGING_SIGN = registerBlock("green_jungle_wall_hanging_sign",
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
            new LilacLeafBlock());
    public static final Block FALLEN_GHOSTWOOD_LEAVES = registerBlock("fallen_ghostwood_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GHOSTWOOD_LEAVES).mapColor(MapColor.DULL_PINK).nonOpaque()));
    public static final Block GHOSTWOOD_SAPLING = registerBlock("ghostwood_sapling",
            new BFBSaplingBlock(GhostwoodSaplingGenerator.GHOSTWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_GHOSTWOOD_SAPLING = registerBlock("potted_ghostwood_sapling",
            new FlowerPotBlock(GHOSTWOOD_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GHOSTWOOD_PLANKS = registerBlock("ghostwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_STAIRS = registerBlock("ghostwood_stairs",
            new BFBStairs(GHOSTWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_SLAB = registerBlock("ghostwood_slab",
            new BFBSlab(GHOSTWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_FENCE = registerBlock("ghostwood_fence",
            new BFBFence(GHOSTWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_FENCE_GATE = registerBlock("ghostwood_fence_gate",
            new BFBFenceGate(GHOSTWOOD_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_BUTTON = registerBlock("ghostwood_button",
            new WoodButton());
    public static final Block GHOSTWOOD_PRESSURE_PLATE = registerBlock("ghostwood_pressure_plate",
            new WoodPressurePlate());
    public static final Block GHOSTWOOD_DOOR = registerBlock("ghostwood_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_DOOR).mapColor(MapColor.WHITE_GRAY)));
    public static final Block GHOSTWOOD_TRAPDOOR = registerBlock("ghostwood_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(OAK_TRAPDOOR).mapColor(MapColor.WHITE_GRAY)));
    private static final Identifier GHOSTWOOD_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/ghostwood");
    public static final Block GHOSTWOOD_SIGN = registerBlock("ghostwood_sign",
            new BFBSignBlock(GHOSTWOOD_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block GHOSTWOOD_WALL_SIGN = registerBlock("ghostwood_wall_sign",
            new BFBWallSignBlock(GHOSTWOOD_SIGN_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    private static final Identifier GHOSTWOOD_HANGING_SIGN_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "entity/signs/hanging/ghostwood");
    private static final Identifier GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/ghostwood");
    public static final Block GHOSTWOOD_HANGING_SIGN = registerBlock("ghostwood_hanging_sign",
            new BFBHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, AbstractBlock.Settings.copy(OAK_HANGING_SIGN)));
    public static final Block GHOSTWOOD_WALL_HANGING_SIGN = registerBlock("ghostwood_wall_hanging_sign",
            new BFBWallHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block RED_OAK_LEAVES = registerBlock("red_oak_leaves",
            new RedLeafBlock());
    public static final Block FALLEN_RED_OAK_LEAVES = registerBlock("fallen_red_oak_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(RED_OAK_LEAVES).mapColor(MapColor.DARK_RED).nonOpaque()));
    public static final Block RED_OAK_SAPLING = registerBlock("red_oak_sapling",
            new BFBSaplingBlock(RedOakSaplingGenerator.RED_OAK, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_RED_OAK_SAPLING = registerBlock("potted_red_oak_sapling",
            new FlowerPotBlock(RED_OAK_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
    public static final Block GOLD_ACACIA_LEAVES = registerBlock("gold_acacia_leaves",
            new GoldLeafBlock());
    public static final Block FALLEN_GOLD_ACACIA_LEAVES = registerBlock("fallen_gold_acacia_leaves",
            new FallenLeavesBlock(AbstractBlock.Settings.copy(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque()));
    public static final Block GOLD_ACACIA_SAPLING = registerBlock("gold_acacia_sapling",
            new BFBSaplingBlock(GoldAcaciaSaplingGenerator.GOLD_ACACIA, AbstractBlock.Settings.copy(ACACIA_SAPLING)));
    public static final Block POTTED_GOLD_ACACIA_SAPLING = registerBlock("potted_gold_acacia_sapling",
            new FlowerPotBlock(GOLD_ACACIA_SAPLING, AbstractBlock.Settings.copy(POTTED_OAK_SAPLING)));
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
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW)));
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.SPRUCE_BROWN)));
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DULL_PINK)));
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.BROWN)));
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.ORANGE)));
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.RED)));
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_AQUA)));
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_RED)));
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PINK)));
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW)));
    public static final Block GREEN_JUNGLE_BOOKSHELF = registerBlock("green_jungle_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN)));
    public static final Block GHOSTWOOD_BOOKSHELF = registerBlock("ghostwood_bookshelf",
            new BFBBookshelf(AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.WHITE_GRAY)));
    public static final Block SMOOTH_STONE_STAIRS = registerBlock("smooth_stone_stairs",
            new BFBStairs(SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block BLACK_NETHER_BRICKS = registerBlock("black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block CHISELED_BLACK_NETHER_BRICKS = registerBlock("chiseled_black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block CRACKED_BLACK_NETHER_BRICKS = registerBlock("cracked_black_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_STAIRS = registerBlock("black_nether_brick_stairs",
            new BFBStairs(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_STAIRS).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_SLAB = registerBlock("black_nether_brick_slab",
            new BFBSlab(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_SLAB).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_WALL = registerBlock("black_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_WALL).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_FENCE = registerBlock("black_nether_brick_fence",
            new BFBFence(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK)));
    public static final Block BLACK_NETHER_BRICK_FENCE_GATE = registerBlock("black_nether_brick_fence_gate",
            new BFBFenceGate(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CHISELED_NETHER_BRICKS).mapColor(MapColor.RED)));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            new Block(AbstractBlock.Settings.copy(CRACKED_NETHER_BRICKS).mapColor(MapColor.RED)));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            new BFBFence(NETHER_BRICK_FENCE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED)));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_nether_brick_fence_gate",
            new BFBFenceGate(NETHER_BRICK_FENCE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED)));
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlock("nether_brick_fence_gate",
            new BFBFenceGate(NETHER_BRICK_FENCE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.DARK_RED)));
    public static final Block PAPER_LANTERN = registerBlock("paper_lantern",
            new HangingLanternBlock());
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
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
