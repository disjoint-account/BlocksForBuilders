package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.util.BlocksForBuildersLootTableModifiers;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.disjoint.blocksforbuilders.world.feature.tree.GhostwoodSaplingGenerator;
import net.disjoint.blocksforbuilders.world.feature.tree.RedOakSaplingGenerator;
import net.disjoint.blocksforbuilders.world.gen.BlocksForBuildersWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	public static final StairsBlock GHOSTWOOD_STAIRS = new WoodStairs(GHOSTWOOD_PLANKS);
	public static final SlabBlock GHOSTWOOD_SLAB = new WoodSlab();
	public static final WoodFence GHOSTWOOD_FENCE = new WoodFence();
	public static final WoodFenceGate GHOSTWOOD_FENCE_GATE = new WoodFenceGate();
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
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		BlocksForBuildersConfiguredFeatures.registerConfiguredFeatures();
		BlocksForBuildersWorldGen.generateBlocksForBuildersWorldGen();
		BlocksForBuildersLootTableModifiers.modifyLootTables();
		Instance.init();

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

	}

	public static Identifier id(String name) {
		return new Identifier(MOD_ID, name);
	}

}


