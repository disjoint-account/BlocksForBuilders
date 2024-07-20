package net.disjoint.blocksforbuilders;

import com.google.common.reflect.Reflection;
import net.disjoint.blocksforbuilders.signstuff.block.BFBHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.block.BFBSignBlock;
import net.disjoint.blocksforbuilders.signstuff.block.BFBWallHangingSignBlock;
import net.disjoint.blocksforbuilders.signstuff.block.BFBWallSignBlock;
import net.disjoint.blocksforbuilders.util.BlocksForBuildersLootTableModifiers;
import net.disjoint.blocksforbuilders.world.feature.tree.*;
import net.disjoint.blocksforbuilders.world.gen.BlocksForBuildersWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.*;

public class BlocksForBuilders implements ModInitializer {

	public static final String MOD_ID = "blocksforbuilders";

	public static final PillarBlock GREEN_JUNGLE_LOG = new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
	public static final PillarBlock STRIPPED_GREEN_JUNGLE_LOG = new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
	public static final PillarBlock GREEN_JUNGLE_WOOD = new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
	public static final PillarBlock STRIPPED_GREEN_JUNGLE_WOOD = new PillarBlock(FabricBlockSettings.copyOf(JUNGLE_LOG).mapColor(MapColor.DARK_GREEN));
	public static final LeavesBlock GREEN_JUNGLE_LEAVES = new GreenLeafBlock();
	public static final FallenLeavesBlock FALLEN_GREEN_JUNGLE_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(GREEN_JUNGLE_LEAVES).mapColor(MapColor.LIME).nonOpaque());
	public static final Block GREEN_JUNGLE_SAPLING = new BFBSaplingBlock(new GreenJungleSaplingGenerator(), FabricBlockSettings.copy(Blocks.JUNGLE_SAPLING));
	public static final Block POTTED_GREEN_JUNGLE_SAPLING = new FlowerPotBlock(GREEN_JUNGLE_SAPLING, FabricBlockSettings.copyOf(POTTED_OAK_SAPLING));
	public static final Block GREEN_JUNGLE_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DARK_GREEN));
	public static final StairsBlock GREEN_JUNGLE_STAIRS = new BFBStairs(GREEN_JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS).mapColor(MapColor.DARK_GREEN));
	public static final SlabBlock GREEN_JUNGLE_SLAB = new BFBSlab(GREEN_JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB).mapColor(MapColor.DARK_GREEN));
	public static final FenceBlock GREEN_JUNGLE_FENCE = new BFBFence(GREEN_JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE).mapColor(MapColor.DARK_GREEN));
	public static final FenceGateBlock GREEN_JUNGLE_FENCE_GATE = new BFBFenceGate(GREEN_JUNGLE_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE).mapColor(MapColor.DARK_GREEN));
	public static final ButtonBlock GREEN_JUNGLE_BUTTON = new WoodButton();
	public static final PressurePlateBlock GREEN_JUNGLE_PRESSURE_PLATE = new WoodPressurePlate();
	public static final DoorBlock GREEN_JUNGLE_DOOR = new DoorBlock(FabricBlockSettings.copyOf(JUNGLE_DOOR).mapColor(MapColor.DARK_GREEN), BlockSetType.OAK);
	public static final TrapdoorBlock GREEN_JUNGLE_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(JUNGLE_TRAPDOOR).mapColor(MapColor.DARK_GREEN), BlockSetType.OAK);
	private static final Identifier GREEN_JUNGLE_SIGN_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "entity/signs/green_jungle");
	public static final BFBSignBlock GREEN_JUNGLE_SIGN = new BFBSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
	public static final BFBWallSignBlock GREEN_JUNGLE_WALL_SIGN = new BFBWallSignBlock(GREEN_JUNGLE_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
	public static final Item GREEN_JUNGLE_SIGN_ITEM = new SignItem(new Item.Settings().maxCount(16), GREEN_JUNGLE_SIGN, GREEN_JUNGLE_WALL_SIGN);
	private static final Identifier GREEN_JUNGLE_HANGING_SIGN_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "entity/signs/hanging/green_jungle");
	private static final Identifier GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/green_jungle");
	public static final BFBHangingSignBlock GREEN_JUNGLE_HANGING_SIGN = new BFBHangingSignBlock(GREEN_JUNGLE_HANGING_SIGN_TEXTURE, GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(OAK_HANGING_SIGN));
	public static final BFBWallHangingSignBlock GREEN_JUNGLE_WALL_HANGING_SIGN = new BFBWallHangingSignBlock(GREEN_JUNGLE_HANGING_SIGN_TEXTURE, GREEN_JUNGLE_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN));
	public static final Item GREEN_JUNGLE_HANGING_SIGN_ITEM = new SignItem(new Item.Settings().maxCount(16), GREEN_JUNGLE_HANGING_SIGN, GREEN_JUNGLE_WALL_HANGING_SIGN);
	public static final PillarBlock GHOSTWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
	public static final PillarBlock STRIPPED_GHOSTWOOD_LOG = new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
	public static final PillarBlock GHOSTWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
	public static final PillarBlock STRIPPED_GHOSTWOOD_WOOD = new PillarBlock(FabricBlockSettings.copyOf(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
	public static final LeavesBlock GHOSTWOOD_LEAVES = new LilacLeafBlock();
	public static final FallenLeavesBlock FALLEN_GHOSTWOOD_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(GHOSTWOOD_LEAVES).mapColor(MapColor.DULL_PINK).nonOpaque());
	public static final Block GHOSTWOOD_SAPLING = new BFBSaplingBlock(new GhostwoodSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));
	public static final Block POTTED_GHOSTWOOD_SAPLING = new FlowerPotBlock(GHOSTWOOD_SAPLING, FabricBlockSettings.copyOf(POTTED_OAK_SAPLING));
	public static final Block GHOSTWOOD_PLANKS = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY));
	public static final StairsBlock GHOSTWOOD_STAIRS = new BFBStairs(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE_GRAY));
	public static final SlabBlock GHOSTWOOD_SLAB = new BFBSlab(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY));
	public static final FenceBlock GHOSTWOOD_FENCE = new BFBFence(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY));
	public static final FenceGateBlock GHOSTWOOD_FENCE_GATE = new BFBFenceGate(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE_GRAY));
	public static final ButtonBlock GHOSTWOOD_BUTTON = new WoodButton();
	public static final PressurePlateBlock GHOSTWOOD_PRESSURE_PLATE = new WoodPressurePlate();
	public static final DoorBlock GHOSTWOOD_DOOR = new DoorBlock(FabricBlockSettings.copyOf(OAK_DOOR).mapColor(MapColor.WHITE_GRAY), BlockSetType.OAK);
	public static final TrapdoorBlock GHOSTWOOD_TRAPDOOR = new TrapdoorBlock(FabricBlockSettings.copyOf(OAK_TRAPDOOR).mapColor(MapColor.WHITE_GRAY), BlockSetType.OAK);
	private static final Identifier GHOSTWOOD_SIGN_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "entity/signs/ghostwood");
	public static final BFBSignBlock GHOSTWOOD_SIGN = new BFBSignBlock(GHOSTWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
	public static final BFBWallSignBlock GHOSTWOOD_WALL_SIGN = new BFBWallSignBlock(GHOSTWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
	public static final Item GHOSTWOOD_SIGN_ITEM = new SignItem(new Item.Settings().maxCount(16), GHOSTWOOD_SIGN, GHOSTWOOD_WALL_SIGN);
	private static final Identifier GHOSTWOOD_HANGING_SIGN_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "entity/signs/hanging/ghostwood");
	private static final Identifier GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "textures/gui/hanging_signs/ghostwood");
	public static final BFBHangingSignBlock GHOSTWOOD_HANGING_SIGN = new BFBHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(OAK_HANGING_SIGN));
	public static final BFBWallHangingSignBlock GHOSTWOOD_WALL_HANGING_SIGN = new BFBWallHangingSignBlock(GHOSTWOOD_HANGING_SIGN_TEXTURE, GHOSTWOOD_HANGING_SIGN_GUI_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN));
	public static final Item GHOSTWOOD_HANGING_SIGN_ITEM = new SignItem(new Item.Settings().maxCount(16), GHOSTWOOD_HANGING_SIGN, GHOSTWOOD_WALL_HANGING_SIGN);
	public static final LeavesBlock RED_OAK_LEAVES = new RedLeafBlock();
	public static final FallenLeavesBlock FALLEN_RED_OAK_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(RED_OAK_LEAVES).mapColor(MapColor.DARK_RED).nonOpaque());
	public static final Block RED_OAK_SAPLING = new BFBSaplingBlock(new RedOakSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));
	public static final Block POTTED_RED_OAK_SAPLING = new FlowerPotBlock(RED_OAK_SAPLING, FabricBlockSettings.copyOf(POTTED_OAK_SAPLING));
	public static final LeavesBlock GOLD_ACACIA_LEAVES = new GoldLeafBlock();
	public static final FallenLeavesBlock FALLEN_GOLD_ACACIA_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque());
	public static final Block GOLD_ACACIA_SAPLING = new BFBSaplingBlock(new GoldAcaciaSaplingGenerator(), FabricBlockSettings.copy(Blocks.ACACIA_SAPLING));
	public static final Block POTTED_GOLD_ACACIA_SAPLING = new FlowerPotBlock(GOLD_ACACIA_SAPLING, FabricBlockSettings.copyOf(POTTED_OAK_SAPLING));
	public static final FallenLeavesBlock FALLEN_OAK_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(OAK_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_BIRCH_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(BIRCH_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_SPRUCE_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(SPRUCE_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_JUNGLE_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(JUNGLE_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_DARK_OAK_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(DARK_OAK_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_ACACIA_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(ACACIA_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_AZALEA_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(AZALEA_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_FLOWERING_AZALEA_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(FLOWERING_AZALEA_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_MANGROVE_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(MANGROVE_LEAVES).nonOpaque());
	public static final FallenLeavesBlock FALLEN_CHERRY_LEAVES = new FallenLeavesBlock(FabricBlockSettings.copyOf(CHERRY_LEAVES).nonOpaque());
	public static final Block BIRCH_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
	public static final Block SPRUCE_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.SPRUCE_BROWN));
	public static final Block JUNGLE_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.DULL_PINK));
	public static final Block DARK_OAK_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.BROWN));
	public static final Block ACACIA_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.ORANGE));
	public static final Block CRIMSON_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.RED));
	public static final Block WARPED_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.DARK_AQUA));
	public static final Block MANGROVE_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.DARK_RED));
	public static final Block CHERRY_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.PINK));
	public static final Block BAMBOO_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
	public static final Block GREEN_JUNGLE_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.DARK_GREEN));
	public static final Block GHOSTWOOD_BOOKSHELF = new BFBBookshelf(FabricBlockSettings.copyOf(BOOKSHELF).mapColor(MapColor.WHITE_GRAY));
	public static final StairsBlock SMOOTH_STONE_STAIRS = new BFBStairs(SMOOTH_STONE.getDefaultState(),FabricBlockSettings.copyOf(STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY));
	public static final Block BLACK_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(NETHER_BRICKS).mapColor(MapColor.BLACK));
	public static final Block CHISELED_BLACK_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(CHISELED_NETHER_BRICKS).mapColor(MapColor.BLACK));
	public static final Block CRACKED_BLACK_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS).mapColor(MapColor.BLACK));
	public static final StairsBlock BLACK_NETHER_BRICK_STAIRS = new BFBStairs(BLACK_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_STAIRS).mapColor(MapColor.BLACK));
	public static final SlabBlock BLACK_NETHER_BRICK_SLAB = new BFBSlab(BLACK_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_SLAB).mapColor(MapColor.BLACK));
	public static final WallBlock BLACK_NETHER_BRICK_WALL = new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_WALL).mapColor(MapColor.BLACK));
	public static final FenceBlock BLACK_NETHER_BRICK_FENCE = new BFBFence(BLACK_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK));
	public static final FenceGateBlock BLACK_NETHER_BRICK_FENCE_GATE = new BFBFenceGate(BLACK_NETHER_BRICKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.BLACK));
	public static final Block CHISELED_RED_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(CHISELED_NETHER_BRICKS).mapColor(MapColor.RED));
	public static final Block CRACKED_RED_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(CRACKED_NETHER_BRICKS).mapColor(MapColor.RED));
	public static final FenceBlock RED_NETHER_BRICK_FENCE = new BFBFence(NETHER_BRICK_FENCE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED));
	public static final FenceGateBlock RED_NETHER_BRICK_FENCE_GATE = new BFBFenceGate(NETHER_BRICK_FENCE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.RED));
	public static final FenceGateBlock NETHER_BRICK_FENCE_GATE = new BFBFenceGate(NETHER_BRICK_FENCE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.DARK_RED));
	public static final LanternBlock PAPER_LANTERN = new HangingLanternBlock();

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		BlocksForBuildersWorldGen.generateBlocksForBuildersWorldGen();
		BlocksForBuildersLootTableModifiers.modifyLootTables();
		BFBItemGroup.registerItemGroups();
		Reflection.initialize(BFBEntities.class);

		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_log"), GREEN_JUNGLE_LOG);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_log"), new BlockItem(GREEN_JUNGLE_LOG, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "stripped_green_jungle_log"), STRIPPED_GREEN_JUNGLE_LOG);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "stripped_green_jungle_log"), new BlockItem(STRIPPED_GREEN_JUNGLE_LOG, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_wood"), GREEN_JUNGLE_WOOD);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_wood"), new BlockItem(GREEN_JUNGLE_WOOD, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "stripped_green_jungle_wood"), STRIPPED_GREEN_JUNGLE_WOOD);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "stripped_green_jungle_wood"), new BlockItem(STRIPPED_GREEN_JUNGLE_WOOD, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_leaves"), GREEN_JUNGLE_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_leaves"), new BlockItem(GREEN_JUNGLE_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_green_jungle_leaves"), FALLEN_GREEN_JUNGLE_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_green_jungle_leaves"), new BlockItem(FALLEN_GREEN_JUNGLE_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_sapling"), GREEN_JUNGLE_SAPLING);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_sapling"), new BlockItem(GREEN_JUNGLE_SAPLING, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "potted_green_jungle_sapling"), POTTED_GREEN_JUNGLE_SAPLING);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_planks"), GREEN_JUNGLE_PLANKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_planks"), new BlockItem(GREEN_JUNGLE_PLANKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_slab"), GREEN_JUNGLE_SLAB);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_slab"), new BlockItem(GREEN_JUNGLE_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_stairs"), GREEN_JUNGLE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_stairs"), new BlockItem(GREEN_JUNGLE_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_fence"), GREEN_JUNGLE_FENCE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_fence"), new BlockItem(GREEN_JUNGLE_FENCE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_fence_gate"), GREEN_JUNGLE_FENCE_GATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_fence_gate"), new BlockItem(GREEN_JUNGLE_FENCE_GATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_button"), GREEN_JUNGLE_BUTTON);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_button"), new BlockItem(GREEN_JUNGLE_BUTTON, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_pressure_plate"), GREEN_JUNGLE_PRESSURE_PLATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_pressure_plate"), new BlockItem(GREEN_JUNGLE_PRESSURE_PLATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_door"), GREEN_JUNGLE_DOOR);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_door"), new BlockItem(GREEN_JUNGLE_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_trapdoor"), GREEN_JUNGLE_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_trapdoor"), new BlockItem(GREEN_JUNGLE_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_sign"), GREEN_JUNGLE_SIGN);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_wall_sign"), GREEN_JUNGLE_WALL_SIGN);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_sign"), GREEN_JUNGLE_SIGN_ITEM);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_hanging_sign"), GREEN_JUNGLE_HANGING_SIGN);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_wall_hanging_sign"), GREEN_JUNGLE_WALL_HANGING_SIGN);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_hanging_sign"), GREEN_JUNGLE_HANGING_SIGN_ITEM);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_log"), GHOSTWOOD_LOG);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_log"), new BlockItem(GHOSTWOOD_LOG, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "stripped_ghostwood_log"), STRIPPED_GHOSTWOOD_LOG);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "stripped_ghostwood_log"), new BlockItem(STRIPPED_GHOSTWOOD_LOG, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_wood"), GHOSTWOOD_WOOD);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_wood"), new BlockItem(GHOSTWOOD_WOOD, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "stripped_ghostwood_wood"), STRIPPED_GHOSTWOOD_WOOD);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "stripped_ghostwood_wood"), new BlockItem(STRIPPED_GHOSTWOOD_WOOD, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_leaves"), GHOSTWOOD_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_leaves"), new BlockItem(GHOSTWOOD_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_ghostwood_leaves"), FALLEN_GHOSTWOOD_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_ghostwood_leaves"), new BlockItem(FALLEN_GHOSTWOOD_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_sapling"), GHOSTWOOD_SAPLING);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_sapling"), new BlockItem(GHOSTWOOD_SAPLING, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "potted_ghostwood_sapling"), POTTED_GHOSTWOOD_SAPLING);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_planks"), GHOSTWOOD_PLANKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_planks"), new BlockItem(GHOSTWOOD_PLANKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_slab"), GHOSTWOOD_SLAB);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_slab"), new BlockItem(GHOSTWOOD_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_stairs"), GHOSTWOOD_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_stairs"), new BlockItem(GHOSTWOOD_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_fence"), GHOSTWOOD_FENCE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_fence"), new BlockItem(GHOSTWOOD_FENCE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_fence_gate"), GHOSTWOOD_FENCE_GATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_fence_gate"), new BlockItem(GHOSTWOOD_FENCE_GATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_button"), GHOSTWOOD_BUTTON);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_button"), new BlockItem(GHOSTWOOD_BUTTON, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_pressure_plate"), GHOSTWOOD_PRESSURE_PLATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_pressure_plate"), new BlockItem(GHOSTWOOD_PRESSURE_PLATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_door"), GHOSTWOOD_DOOR);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_door"), new BlockItem(GHOSTWOOD_DOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_trapdoor"), GHOSTWOOD_TRAPDOOR);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_trapdoor"), new BlockItem(GHOSTWOOD_TRAPDOOR, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_sign"), GHOSTWOOD_SIGN);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_wall_sign"), GHOSTWOOD_WALL_SIGN);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_sign"), GHOSTWOOD_SIGN_ITEM);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_hanging_sign"), GHOSTWOOD_HANGING_SIGN);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_wall_hanging_sign"), GHOSTWOOD_WALL_HANGING_SIGN);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_hanging_sign"), GHOSTWOOD_HANGING_SIGN_ITEM);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "red_oak_leaves"), RED_OAK_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "red_oak_leaves"), new BlockItem(RED_OAK_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_red_oak_leaves"), FALLEN_RED_OAK_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_red_oak_leaves"), new BlockItem(FALLEN_RED_OAK_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "red_oak_sapling"), RED_OAK_SAPLING);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "red_oak_sapling"), new BlockItem(RED_OAK_SAPLING, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "potted_red_oak_sapling"), POTTED_RED_OAK_SAPLING);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "gold_acacia_leaves"), GOLD_ACACIA_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "gold_acacia_leaves"), new BlockItem(GOLD_ACACIA_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_gold_acacia_leaves"), FALLEN_GOLD_ACACIA_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_gold_acacia_leaves"), new BlockItem(FALLEN_GOLD_ACACIA_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "gold_acacia_sapling"), GOLD_ACACIA_SAPLING);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "gold_acacia_sapling"), new BlockItem(GOLD_ACACIA_SAPLING, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "potted_gold_acacia_sapling"), POTTED_GOLD_ACACIA_SAPLING);
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_oak_leaves"), FALLEN_OAK_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_oak_leaves"), new BlockItem(FALLEN_OAK_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_birch_leaves"), FALLEN_BIRCH_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_birch_leaves"), new BlockItem(FALLEN_BIRCH_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_spruce_leaves"), FALLEN_SPRUCE_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_spruce_leaves"), new BlockItem(FALLEN_SPRUCE_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_jungle_leaves"), FALLEN_JUNGLE_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_jungle_leaves"), new BlockItem(FALLEN_JUNGLE_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_dark_oak_leaves"), FALLEN_DARK_OAK_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_dark_oak_leaves"), new BlockItem(FALLEN_DARK_OAK_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_acacia_leaves"), FALLEN_ACACIA_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_acacia_leaves"), new BlockItem(FALLEN_ACACIA_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_azalea_leaves"), FALLEN_AZALEA_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_azalea_leaves"), new BlockItem(FALLEN_AZALEA_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_flowering_azalea_leaves"), FALLEN_FLOWERING_AZALEA_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_flowering_azalea_leaves"), new BlockItem(FALLEN_FLOWERING_AZALEA_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_mangrove_leaves"), FALLEN_MANGROVE_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_mangrove_leaves"), new BlockItem(FALLEN_MANGROVE_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "fallen_cherry_leaves"), FALLEN_CHERRY_LEAVES);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "fallen_cherry_leaves"), new BlockItem(FALLEN_CHERRY_LEAVES, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "birch_bookshelf"), BIRCH_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "birch_bookshelf"), new BlockItem(BIRCH_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "spruce_bookshelf"), SPRUCE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "spruce_bookshelf"), new BlockItem(SPRUCE_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "jungle_bookshelf"), JUNGLE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "jungle_bookshelf"), new BlockItem(JUNGLE_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "dark_oak_bookshelf"), DARK_OAK_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "dark_oak_bookshelf"), new BlockItem(DARK_OAK_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "acacia_bookshelf"), ACACIA_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "acacia_bookshelf"), new BlockItem(ACACIA_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "crimson_bookshelf"), CRIMSON_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "crimson_bookshelf"), new BlockItem(CRIMSON_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "warped_bookshelf"), WARPED_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "warped_bookshelf"), new BlockItem(WARPED_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "mangrove_bookshelf"), MANGROVE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "mangrove_bookshelf"), new BlockItem(MANGROVE_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "cherry_bookshelf"), CHERRY_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "cherry_bookshelf"), new BlockItem(CHERRY_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "bamboo_bookshelf"), BAMBOO_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "bamboo_bookshelf"), new BlockItem(BAMBOO_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "green_jungle_bookshelf"), GREEN_JUNGLE_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "green_jungle_bookshelf"), new BlockItem(GREEN_JUNGLE_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "ghostwood_bookshelf"), GHOSTWOOD_BOOKSHELF);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "ghostwood_bookshelf"), new BlockItem(GHOSTWOOD_BOOKSHELF, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "smooth_stone_stairs"), SMOOTH_STONE_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "smooth_stone_stairs"), new BlockItem(SMOOTH_STONE_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_bricks"), BLACK_NETHER_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_bricks"), new BlockItem(BLACK_NETHER_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "chiseled_black_nether_bricks"), CHISELED_BLACK_NETHER_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "chiseled_black_nether_bricks"), new BlockItem(CHISELED_BLACK_NETHER_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "cracked_black_nether_bricks"), CRACKED_BLACK_NETHER_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "cracked_black_nether_bricks"), new BlockItem(CRACKED_BLACK_NETHER_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_stairs"), BLACK_NETHER_BRICK_STAIRS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_stairs"), new BlockItem(BLACK_NETHER_BRICK_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_slab"), BLACK_NETHER_BRICK_SLAB);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_slab"), new BlockItem(BLACK_NETHER_BRICK_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_wall"), BLACK_NETHER_BRICK_WALL);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_wall"), new BlockItem(BLACK_NETHER_BRICK_WALL, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_fence"), BLACK_NETHER_BRICK_FENCE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_fence"), new BlockItem(BLACK_NETHER_BRICK_FENCE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_fence_gate"), BLACK_NETHER_BRICK_FENCE_GATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_fence_gate"), new BlockItem(BLACK_NETHER_BRICK_FENCE_GATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "chiseled_red_nether_bricks"), CHISELED_RED_NETHER_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "chiseled_red_nether_bricks"), new BlockItem(CHISELED_RED_NETHER_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "cracked_red_nether_bricks"), CRACKED_RED_NETHER_BRICKS);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "cracked_red_nether_bricks"), new BlockItem(CRACKED_RED_NETHER_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "red_nether_brick_fence"), RED_NETHER_BRICK_FENCE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "red_nether_brick_fence"), new BlockItem(RED_NETHER_BRICK_FENCE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "red_nether_brick_fence_gate"), RED_NETHER_BRICK_FENCE_GATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "red_nether_brick_fence_gate"), new BlockItem(RED_NETHER_BRICK_FENCE_GATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "nether_brick_fence_gate"), NETHER_BRICK_FENCE_GATE);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "nether_brick_fence_gate"), new BlockItem(NETHER_BRICK_FENCE_GATE, new Item.Settings()));
		Registry.register(Registries.BLOCK, new Identifier("blocksforbuilders", "paper_lantern"), PAPER_LANTERN);
		Registry.register(Registries.ITEM, new Identifier("blocksforbuilders", "paper_lantern"), new BlockItem(PAPER_LANTERN, new Item.Settings()));

		Instance.init();
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

}


