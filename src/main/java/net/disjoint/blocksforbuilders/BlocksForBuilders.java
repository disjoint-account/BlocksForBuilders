package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.util.BlocksForBuildersLootTableModifiers;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.disjoint.blocksforbuilders.world.feature.tree.GhostwoodSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.GoldAcaciaSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.RedOakSaplingGenerator;
import net.disjoint.blocksforbuilders.world.gen.BlocksForBuildersWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.*;

public class BlocksForBuilders implements ModInitializer {
	public static final ItemGroup BLOCKSFORBUILDERS = FabricItemGroupBuilder.create(
					new Identifier("blocksforbuilders", "general"))
			.icon(() -> new ItemStack(BlocksForBuilders.GHOSTWOOD_PLANKS))
			.build();

	public static final String MOD_ID = "blocksforbuilders";

	public static final PillarBlock GHOSTWOOD_LOG = new WoodLog();
	public static final PillarBlock STRIPPED_GHOSTWOOD_LOG = new WoodLog();
	public static final PillarBlock GHOSTWOOD_WOOD = new WoodLog();
	public static final PillarBlock STRIPPED_GHOSTWOOD_WOOD = new WoodLog();
	public static final LeavesBlock GHOSTWOOD_LEAVES = new LilacLeafBlock();
	public static final Block GHOSTWOOD_SAPLING = new BFBSaplingBlock(new GhostwoodSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));
	public static final Block GHOSTWOOD_PLANKS = new WoodBlock();
	public static final StairsBlock GHOSTWOOD_STAIRS = new BFBStairs(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE_GRAY));
	public static final SlabBlock GHOSTWOOD_SLAB = new BFBSlab(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY));
	public static final FenceBlock GHOSTWOOD_FENCE = new BFBFence(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY));
	public static final FenceGateBlock GHOSTWOOD_FENCE_GATE = new BFBFenceGate(GHOSTWOOD_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE_GRAY));
	public static final WoodenButtonBlock GHOSTWOOD_BUTTON = new WoodButton();
	public static final PressurePlateBlock GHOSTWOOD_PRESSURE_PLATE = new WoodPressurePlate();
	public static final DoorBlock GHOSTWOOD_DOOR = new WoodDoor();
	public static final TrapdoorBlock GHOSTWOOD_TRAPDOOR = new WoodTrapdoor();
	private static final Identifier GHOSTWOOD_SIGN_TEXTURE = new Identifier(BlocksForBuilders.MOD_ID, "entity/signs/ghostwood");
	public static final WoodSignBlock GHOSTWOOD_SIGN = new WoodSignBlock(GHOSTWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN));
	public static final WoodSignWall GHOSTWOOD_WALL_SIGN = new WoodSignWall(GHOSTWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN));
	public static final Item GHOSTWOOD_SIGN_ITEM = new SignItem(new Item.Settings().maxCount(16).group(BlocksForBuilders.BLOCKSFORBUILDERS), GHOSTWOOD_SIGN, GHOSTWOOD_WALL_SIGN);
	public static final LeavesBlock RED_OAK_LEAVES = new RedLeafBlock();
	public static final Block RED_OAK_SAPLING = new BFBSaplingBlock(new RedOakSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));
	public static final LeavesBlock GOLD_ACACIA_LEAVES = new GoldLeafBlock();
	public static final Block GOLD_ACACIA_SAPLING = new BFBSaplingBlock(new GoldAcaciaSaplingGenerator(), FabricBlockSettings.copy(Blocks.ACACIA_SAPLING));
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
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		BlocksForBuildersConfiguredFeatures.registerConfiguredFeatures();
		BlocksForBuildersWorldGen.generateBlocksForBuildersWorldGen();
		BlocksForBuildersLootTableModifiers.modifyLootTables();

		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_log"), GHOSTWOOD_LOG);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_log"), new BlockItem(GHOSTWOOD_LOG, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "stripped_ghostwood_log"), STRIPPED_GHOSTWOOD_LOG);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "stripped_ghostwood_log"), new BlockItem(STRIPPED_GHOSTWOOD_LOG, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_wood"), GHOSTWOOD_WOOD);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_wood"), new BlockItem(GHOSTWOOD_WOOD, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "stripped_ghostwood_wood"), STRIPPED_GHOSTWOOD_WOOD);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "stripped_ghostwood_wood"), new BlockItem(STRIPPED_GHOSTWOOD_WOOD, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_leaves"), GHOSTWOOD_LEAVES);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_leaves"), new BlockItem(GHOSTWOOD_LEAVES, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_sapling"), GHOSTWOOD_SAPLING);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_sapling"), new BlockItem(GHOSTWOOD_SAPLING, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_planks"), GHOSTWOOD_PLANKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_planks"), new BlockItem(GHOSTWOOD_PLANKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_slab"), GHOSTWOOD_SLAB);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_slab"), new BlockItem(GHOSTWOOD_SLAB, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_stairs"), GHOSTWOOD_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_stairs"), new BlockItem(GHOSTWOOD_STAIRS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_fence"), GHOSTWOOD_FENCE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_fence"), new BlockItem(GHOSTWOOD_FENCE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_fence_gate"), GHOSTWOOD_FENCE_GATE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_fence_gate"), new BlockItem(GHOSTWOOD_FENCE_GATE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_button"), GHOSTWOOD_BUTTON);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_button"), new BlockItem(GHOSTWOOD_BUTTON, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_pressure_plate"), GHOSTWOOD_PRESSURE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_pressure_plate"), new BlockItem(GHOSTWOOD_PRESSURE_PLATE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_door"), GHOSTWOOD_DOOR);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_door"), new BlockItem(GHOSTWOOD_DOOR, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_trapdoor"), GHOSTWOOD_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_trapdoor"), new BlockItem(GHOSTWOOD_TRAPDOOR, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_sign"), GHOSTWOOD_SIGN);
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "ghostwood_wall_sign"), GHOSTWOOD_WALL_SIGN);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "ghostwood_sign"), GHOSTWOOD_SIGN_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "red_oak_leaves"), RED_OAK_LEAVES);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "red_oak_leaves"), new BlockItem(RED_OAK_LEAVES, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "red_oak_sapling"), RED_OAK_SAPLING);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "red_oak_sapling"), new BlockItem(RED_OAK_SAPLING, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "gold_acacia_leaves"), GOLD_ACACIA_LEAVES);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "gold_acacia_leaves"), new BlockItem(GOLD_ACACIA_LEAVES, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "gold_acacia_sapling"), GOLD_ACACIA_SAPLING);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "gold_acacia_sapling"), new BlockItem(GOLD_ACACIA_SAPLING, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_bricks"), BLACK_NETHER_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_bricks"), new BlockItem(BLACK_NETHER_BRICKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "chiseled_black_nether_bricks"), CHISELED_BLACK_NETHER_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "chiseled_black_nether_bricks"), new BlockItem(CHISELED_BLACK_NETHER_BRICKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "cracked_black_nether_bricks"), CRACKED_BLACK_NETHER_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "cracked_black_nether_bricks"), new BlockItem(CRACKED_BLACK_NETHER_BRICKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_stairs"), BLACK_NETHER_BRICK_STAIRS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_stairs"), new BlockItem(BLACK_NETHER_BRICK_STAIRS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_slab"), BLACK_NETHER_BRICK_SLAB);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_slab"), new BlockItem(BLACK_NETHER_BRICK_SLAB, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_wall"), BLACK_NETHER_BRICK_WALL);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_wall"), new BlockItem(BLACK_NETHER_BRICK_WALL, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_fence"), BLACK_NETHER_BRICK_FENCE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_fence"), new BlockItem(BLACK_NETHER_BRICK_FENCE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "black_nether_brick_fence_gate"), BLACK_NETHER_BRICK_FENCE_GATE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "black_nether_brick_fence_gate"), new BlockItem(BLACK_NETHER_BRICK_FENCE_GATE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "chiseled_red_nether_bricks"), CHISELED_RED_NETHER_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "chiseled_red_nether_bricks"), new BlockItem(CHISELED_RED_NETHER_BRICKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "cracked_red_nether_bricks"), CRACKED_RED_NETHER_BRICKS);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "cracked_red_nether_bricks"), new BlockItem(CRACKED_RED_NETHER_BRICKS, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "red_nether_brick_fence"), RED_NETHER_BRICK_FENCE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "red_nether_brick_fence"), new BlockItem(RED_NETHER_BRICK_FENCE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "red_nether_brick_fence_gate"), RED_NETHER_BRICK_FENCE_GATE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "red_nether_brick_fence_gate"), new BlockItem(RED_NETHER_BRICK_FENCE_GATE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));
		Registry.register(Registry.BLOCK, new Identifier("blocksforbuilders", "nether_brick_fence_gate"), NETHER_BRICK_FENCE_GATE);
		Registry.register(Registry.ITEM, new Identifier("blocksforbuilders", "nether_brick_fence_gate"), new BlockItem(NETHER_BRICK_FENCE_GATE, new Item.Settings().group(BlocksForBuilders.BLOCKSFORBUILDERS)));

		Instance.init();
	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

}


