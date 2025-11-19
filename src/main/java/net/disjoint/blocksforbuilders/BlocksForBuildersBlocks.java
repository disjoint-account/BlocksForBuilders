package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.signstuff.SignBlockHelper;
import net.disjoint.blocksforbuilders.util.particles.BFBParticleTypes;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBSaplingGenerators;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.*;

public class BlocksForBuildersBlocks {
    public static final BlockSetType GHOSTWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_set"));
    public static final BlockSetType SCORCHWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_set"));
    public static final BlockSetType WILLOW_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "willow_set"));
    public static final BlockSetType PALM_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "palm_set"));
    public static final BlockSetType MAPLE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "maple_set"));
    public static final BlockSetType BEECH_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "beech_set"));
    public static final BlockSetType PINE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "pine_set"));
    public static final BlockSetType CEDAR_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "cedar_set"));
    public static final BlockSetType GREEN_JUNGLE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_set"));
    public static final BlockSetType GREEN_BAMBOO_SET = BlockSetTypeBuilder.copyOf(BlockSetType.BAMBOO).register(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_set"));
    public static final WoodType GHOSTWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood"), GHOSTWOOD_SET);
    public static final WoodType SCORCHWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood"), SCORCHWOOD_SET);
    public static final WoodType WILLOW = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "willow"), WILLOW_SET);
    public static final WoodType PALM = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "palm"), PALM_SET);
    public static final WoodType MAPLE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "maple"), MAPLE_SET);
    public static final WoodType BEECH = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "beech"), BEECH_SET);
    public static final WoodType PINE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "pine"), PINE_SET);
    public static final WoodType CEDAR = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(BlocksForBuilders.MOD_ID, "cedar"), CEDAR_SET);
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
    public static final Block GREEN_JUNGLE_LEAVES = registerLeafBlock("green_jungle_leaves", 0.01f, BFBParticleTypes.GREEN_JUNGLE_LEAVES, JUNGLE_LEAVES, MapColor.LIME);
    public static final Block FALLEN_GREEN_JUNGLE_LEAVES = registerBlock("fallen_green_jungle_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GREEN_JUNGLE_LEAVES).mapColor(MapColor.LIME).nonOpaque());
    public static final Block GREEN_JUNGLE_HEDGE = registerBlock("green_jungle_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(GREEN_JUNGLE_LEAVES));
    public static final Block GREEN_JUNGLE_SAPLING = registerSaplingBlock("green_jungle_sapling", BFBSaplingGenerators.GREEN_JUNGLE, JUNGLE_SAPLING);
    public static final Block POTTED_GREEN_JUNGLE_SAPLING = registerFlowerPotBlock("potted_green_jungle_sapling", GREEN_JUNGLE_SAPLING, POTTED_JUNGLE_SAPLING);
    public static final Block GREEN_JUNGLE_PLANKS = registerBlock("green_jungle_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_STAIRS = registerStairsBlock("green_jungle_stairs", GREEN_JUNGLE_PLANKS);
    public static final Block GREEN_JUNGLE_SLAB = registerBlock("green_jungle_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_FENCE = registerBlock("green_jungle_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_FENCE_GATE = registerFenceGateBlock("green_jungle_fence_gate", GREEN_JUNGLE, GREEN_JUNGLE_FENCE, MapColor.DARK_GREEN);
    public static final Block GREEN_JUNGLE_BUTTON = registerButtonBlock("green_jungle_button", GREEN_JUNGLE_SET, 15, JUNGLE_BUTTON);
    public static final Block GREEN_JUNGLE_PRESSURE_PLATE = registerPressurePlateBlock("green_jungle_pressure_plate", GREEN_JUNGLE_SET, JUNGLE_PRESSURE_PLATE);
    public static final Block GREEN_JUNGLE_DOOR = registerDoorBlock("green_jungle_door", GREEN_JUNGLE_SET, JUNGLE_DOOR);
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerTrapdoorBlock("green_jungle_trapdoor", GREEN_JUNGLE_SET, JUNGLE_TRAPDOOR);
    public static final Block GREEN_JUNGLE_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_sign"),
            settings -> new SignBlock(GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_wall_sign"),
            settings -> new WallSignBlock(GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_WALL_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_hanging_sign"),
            settings -> new HangingSignBlock(GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_HANGING_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_jungle_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GREEN_JUNGLE, settings), AbstractBlock.Settings.copy(JUNGLE_WALL_HANGING_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_JUNGLE_SHELF = registerBlock("green_jungle_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_SHELF).mapColor(MapColor.DARK_GREEN));
   
    public static final Block GHOSTWOOD_LOG = registerBlock("ghostwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block STRIPPED_GHOSTWOOD_LOG = registerBlock("stripped_ghostwood_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_WOOD = registerBlock("ghostwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block STRIPPED_GHOSTWOOD_WOOD = registerBlock("stripped_ghostwood_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_LEAVES = registerLeafBlock("ghostwood_leaves", 0.01f, BFBParticleTypes.GHOSTWOOD_LEAVES, Blocks.AZALEA_LEAVES, MapColor.DULL_PINK);
    public static final Block FALLEN_GHOSTWOOD_LEAVES = registerBlock("fallen_ghostwood_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GHOSTWOOD_LEAVES).mapColor(MapColor.DULL_PINK).nonOpaque());
    public static final Block GHOSTWOOD_HEDGE = registerBlock("ghostwood_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(GHOSTWOOD_LEAVES));
    public static final Block GHOSTWOOD_SAPLING = registerSaplingBlock("ghostwood_sapling", BFBSaplingGenerators.GHOSTWOOD, OAK_SAPLING);
    public static final Block POTTED_GHOSTWOOD_SAPLING = registerFlowerPotBlock("potted_ghostwood_sapling", GHOSTWOOD_SAPLING, POTTED_OAK_SAPLING);
    public static final Block GHOSTWOOD_PLANKS = registerBlock("ghostwood_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_STAIRS = registerStairsBlock("ghostwood_stairs", GHOSTWOOD_PLANKS);
    public static final Block GHOSTWOOD_SLAB = registerBlock("ghostwood_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_FENCE = registerBlock("ghostwood_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_FENCE_GATE = registerFenceGateBlock("ghostwood_fence_gate", GHOSTWOOD, GHOSTWOOD_FENCE, MapColor.WHITE_GRAY);
    public static final Block GHOSTWOOD_BUTTON = registerButtonBlock("ghostwood_button", GHOSTWOOD_SET, 15, OAK_BUTTON);
    public static final Block GHOSTWOOD_PRESSURE_PLATE = registerPressurePlateBlock("ghostwood_pressure_plate", GHOSTWOOD_SET, OAK_PRESSURE_PLATE);
    public static final Block GHOSTWOOD_DOOR = registerDoorBlock("ghostwood_door", GHOSTWOOD_SET, OAK_DOOR);
    public static final Block GHOSTWOOD_TRAPDOOR = registerTrapdoorBlock("ghostwood_trapdoor", GHOSTWOOD_SET, OAK_TRAPDOOR);
    public static final Block GHOSTWOOD_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_sign"),
            settings -> new SignBlock(GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_wall_sign"),
            settings -> new WallSignBlock(GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_hanging_sign"),
            settings -> new HangingSignBlock(GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "ghostwood_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GHOSTWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.WHITE_GRAY));
    public static final Block GHOSTWOOD_SHELF = registerBlock("ghostwood_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.WHITE_GRAY));

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
    public static final Block SCORCHWOOD_FENCE_GATE = registerFenceGateBlock("scorchwood_fence_gate", SCORCHWOOD, SCORCHWOOD_FENCE, MapColor.BLACK);
    public static final Block SCORCHWOOD_BUTTON = registerButtonBlock("scorchwood_button", SCORCHWOOD_SET, 15, OAK_BUTTON);
    public static final Block SCORCHWOOD_PRESSURE_PLATE = registerPressurePlateBlock("scorchwood_pressure_plate", SCORCHWOOD_SET, OAK_PRESSURE_PLATE);
    public static final Block SCORCHWOOD_DOOR = registerDoorBlock("scorchwood_door", SCORCHWOOD_SET, OAK_DOOR);
    public static final Block SCORCHWOOD_TRAPDOOR = registerTrapdoorBlock("scorchwood_trapdoor", SCORCHWOOD_SET, OAK_TRAPDOOR);
    public static final Block SCORCHWOOD_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_sign"),
            settings -> new SignBlock(SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_wall_sign"),
            settings -> new WallSignBlock(SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_hanging_sign"),
            settings -> new HangingSignBlock(SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "scorchwood_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(SCORCHWOOD, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.BLACK));
    public static final Block SCORCHWOOD_SHELF = registerBlock("scorchwood_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.BLACK));

    public static final Block WILLOW_LOG = registerBlock("willow_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.DIRT_BROWN));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_LEAVES = registerLeafBlock("willow_leaves", 0.01f, BFBParticleTypes.WILLOW_LEAVES, Blocks.OAK_LEAVES, MapColor.PALE_GREEN);
    public static final Block FALLEN_WILLOW_LEAVES = registerBlock("fallen_willow_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(WILLOW_LEAVES).mapColor(MapColor.PALE_GREEN).nonOpaque());
    public static final Block WILLOW_HEDGE = registerBlock("willow_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(WILLOW_LEAVES));
    public static final Block WILLOW_SAPLING = registerSaplingBlock("willow_sapling", BFBSaplingGenerators.WILLOW, OAK_SAPLING);
    public static final Block POTTED_WILLOW_SAPLING = registerFlowerPotBlock("potted_willow_sapling", WILLOW_SAPLING, POTTED_OAK_SAPLING);
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_STAIRS = registerStairsBlock("willow_stairs", WILLOW_PLANKS);
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_FENCE_GATE = registerFenceGateBlock("willow_fence_gate", WILLOW, WILLOW_FENCE, MapColor.LICHEN_GREEN);
    public static final Block WILLOW_BUTTON = registerButtonBlock("willow_button", WILLOW_SET, 15, OAK_BUTTON);
    public static final Block WILLOW_PRESSURE_PLATE = registerPressurePlateBlock("willow_pressure_plate", WILLOW_SET, OAK_PRESSURE_PLATE);
    public static final Block WILLOW_DOOR = registerDoorBlock("willow_door", WILLOW_SET, OAK_DOOR);
    public static final Block WILLOW_TRAPDOOR = registerTrapdoorBlock("willow_trapdoor", WILLOW_SET, OAK_TRAPDOOR);
    public static final Block WILLOW_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "willow_sign"),
            settings -> new SignBlock(WILLOW, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "willow_wall_sign"),
            settings -> new WallSignBlock(WILLOW, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "willow_hanging_sign"),
            settings -> new HangingSignBlock(WILLOW, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "willow_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(WILLOW, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.LICHEN_GREEN));
    public static final Block WILLOW_SHELF = registerBlock("willow_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.LICHEN_GREEN));

    public static final Block PALM_LOG = registerBlock("palm_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.PALE_YELLOW));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.PALE_YELLOW));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            settings -> new PalmLeavesBlock(settings, 0.01f, BFBParticleTypes.PALM_LEAVES), AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.get(1)));
    public static final Block FALLEN_PALM_LEAVES = registerBlock("fallen_palm_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(PALM_LEAVES).mapColor(MapColor.get(1)).nonOpaque());
    public static final Block PALM_HEDGE = registerBlock("palm_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(PALM_LEAVES));
    public static final Block COCONUT = registerCoconutBlock("coconut", MapColor.DIRT_BROWN);
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_STAIRS = registerStairsBlock("palm_stairs", PALM_PLANKS);
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_FENCE_GATE = registerFenceGateBlock("palm_fence_gate", PALM, PALM_FENCE, MapColor.PALE_YELLOW);
    public static final Block PALM_BUTTON = registerButtonBlock("palm_button", PALM_SET, 15, OAK_BUTTON);
    public static final Block PALM_PRESSURE_PLATE = registerPressurePlateBlock("palm_pressure_plate", PALM_SET, OAK_PRESSURE_PLATE);
    public static final Block PALM_DOOR = registerDoorBlock("palm_door", PALM_SET, OAK_DOOR);
    public static final Block PALM_TRAPDOOR = registerTrapdoorBlock("palm_trapdoor", PALM_SET, OAK_TRAPDOOR);
    public static final Block PALM_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "palm_sign"),
            settings -> new SignBlock(PALM, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "palm_wall_sign"),
            settings -> new WallSignBlock(PALM, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "palm_hanging_sign"),
            settings -> new HangingSignBlock(PALM, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "palm_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(PALM, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.PALE_YELLOW));
    public static final Block PALM_SHELF = registerBlock("palm_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.PALE_YELLOW));

    public static final Block MAPLE_LOG = registerBlock("maple_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_LEAVES = registerLeafBlock("maple_leaves", 0.1f, BFBParticleTypes.MAPLE_LEAVES, Blocks.OAK_LEAVES, MapColor.DARK_RED);
    public static final Block FALLEN_MAPLE_LEAVES = registerBlock("fallen_maple_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(MAPLE_LEAVES).mapColor(MapColor.DARK_RED).nonOpaque());
    public static final Block MAPLE_HEDGE = registerBlock("maple_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(MAPLE_LEAVES));
    public static final Block MAPLE_SAPLING = registerSaplingBlock("maple_sapling", BFBSaplingGenerators.MAPLE, OAK_SAPLING);
    public static final Block POTTED_MAPLE_SAPLING = registerFlowerPotBlock("potted_maple_sapling", MAPLE_SAPLING, POTTED_OAK_SAPLING);
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_STAIRS = registerStairsBlock("maple_stairs", MAPLE_PLANKS);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_FENCE_GATE = registerFenceGateBlock("maple_fence_gate", MAPLE, MAPLE_FENCE, MapColor.RAW_IRON_PINK);
    public static final Block MAPLE_BUTTON = registerButtonBlock("maple_button", MAPLE_SET, 15, OAK_BUTTON);
    public static final Block MAPLE_PRESSURE_PLATE = registerPressurePlateBlock("maple_pressure_plate", MAPLE_SET, OAK_PRESSURE_PLATE);
    public static final Block MAPLE_DOOR = registerDoorBlock("maple_door", MAPLE_SET, OAK_DOOR);
    public static final Block MAPLE_TRAPDOOR = registerTrapdoorBlock("maple_trapdoor", MAPLE_SET, OAK_TRAPDOOR);
    public static final Block MAPLE_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "maple_sign"),
            settings -> new SignBlock(MAPLE, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "maple_wall_sign"),
            settings -> new WallSignBlock(MAPLE, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "maple_hanging_sign"),
            settings -> new HangingSignBlock(MAPLE, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "maple_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(MAPLE, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block MAPLE_SHELF = registerBlock("maple_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.RAW_IRON_PINK));

    public static final Block BEECH_LOG = registerBlock("beech_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.ORANGE));
    public static final Block BEECH_WOOD = registerBlock("beech_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_WHITE));
    public static final Block STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.ORANGE));
    public static final Block BEECH_LEAVES = registerLeafBlock("beech_leaves", 0.1f, BFBParticleTypes.BEECH_LEAVES, Blocks.OAK_LEAVES, MapColor.ORANGE);
    public static final Block FALLEN_BEECH_LEAVES = registerBlock("fallen_beech_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(BEECH_LEAVES).mapColor(MapColor.ORANGE).nonOpaque());
    public static final Block BEECH_HEDGE = registerBlock("beech_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(BEECH_LEAVES));
    public static final Block BEECH_SAPLING = registerSaplingBlock("beech_sapling", BFBSaplingGenerators.BEECH, OAK_SAPLING);
    public static final Block POTTED_BEECH_SAPLING = registerFlowerPotBlock("potted_beech_sapling", BEECH_SAPLING, POTTED_OAK_SAPLING);
    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.ORANGE));
    public static final Block BEECH_STAIRS = registerStairsBlock("beech_stairs", BEECH_PLANKS);
    public static final Block BEECH_SLAB = registerBlock("beech_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.ORANGE));
    public static final Block BEECH_FENCE = registerBlock("beech_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.ORANGE));
    public static final Block BEECH_FENCE_GATE = registerFenceGateBlock("beech_fence_gate", BEECH, BEECH_FENCE, MapColor.ORANGE);
    public static final Block BEECH_BUTTON = registerButtonBlock("beech_button", BEECH_SET, 15, OAK_BUTTON);
    public static final Block BEECH_PRESSURE_PLATE = registerPressurePlateBlock("beech_pressure_plate", BEECH_SET, OAK_PRESSURE_PLATE);
    public static final Block BEECH_DOOR = registerDoorBlock("beech_door", BEECH_SET, OAK_DOOR);
    public static final Block BEECH_TRAPDOOR = registerTrapdoorBlock("beech_trapdoor", BEECH_SET, OAK_TRAPDOOR);
    public static final Block BEECH_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "beech_sign"),
            settings -> new SignBlock(BEECH, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.ORANGE));
    public static final Block BEECH_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "beech_wall_sign"),
            settings -> new WallSignBlock(BEECH, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.ORANGE));
    public static final Block BEECH_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "beech_hanging_sign"),
            settings -> new HangingSignBlock(BEECH, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.ORANGE));
    public static final Block BEECH_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "beech_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(BEECH, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.ORANGE));
    public static final Block BEECH_SHELF = registerBlock("beech_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.ORANGE));

    public static final Block PINE_LOG = registerBlock("pine_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_LEAVES = registerLeafBlock("pine_leaves", 0.01f, BFBParticleTypes.PINE_LEAVES, Blocks.SPRUCE_LEAVES, MapColor.TERRACOTTA_GREEN);
    public static final Block FALLEN_PINE_LEAVES = registerBlock("fallen_pine_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(PINE_LEAVES).mapColor(MapColor.TERRACOTTA_GREEN).nonOpaque());
    public static final Block PINE_HEDGE = registerBlock("pine_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(PINE_LEAVES));
    public static final Block PINE_SAPLING = registerSaplingBlock("pine_sapling", BFBSaplingGenerators.PINE, OAK_SAPLING);
    public static final Block POTTED_PINE_SAPLING = registerFlowerPotBlock("potted_pine_sapling", PINE_SAPLING, POTTED_OAK_SAPLING);
    public static final Block PINE_PLANKS = registerBlock("pine_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_STAIRS = registerStairsBlock("pine_stairs", PINE_PLANKS);
    public static final Block PINE_SLAB = registerBlock("pine_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_FENCE = registerBlock("pine_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_FENCE_GATE = registerFenceGateBlock("pine_fence_gate", PINE, PINE_FENCE, MapColor.TERRACOTTA_BROWN);
    public static final Block PINE_BUTTON = registerButtonBlock("pine_button", PINE_SET, 15, OAK_BUTTON);
    public static final Block PINE_PRESSURE_PLATE = registerPressurePlateBlock("pine_pressure_plate", PINE_SET, OAK_PRESSURE_PLATE);
    public static final Block PINE_DOOR = registerDoorBlock("pine_door", PINE_SET, OAK_DOOR);
    public static final Block PINE_TRAPDOOR = registerTrapdoorBlock("pine_trapdoor", PINE_SET, OAK_TRAPDOOR);
    public static final Block PINE_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "pine_sign"),
            settings -> new SignBlock(PINE, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "pine_wall_sign"),
            settings -> new WallSignBlock(PINE, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "pine_hanging_sign"),
            settings -> new HangingSignBlock(PINE, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "pine_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(PINE, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_SHELF = registerBlock("pine_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.TERRACOTTA_BROWN));

    public static final Block CEDAR_LOG = registerBlock("cedar_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LIGHT_GRAY));
    public static final Block STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_WOOD = registerBlock("cedar_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.LIGHT_GRAY));
    public static final Block STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            PillarBlock::new, AbstractBlock.Settings.copy(OAK_LOG).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_LEAVES = registerLeafBlock("cedar_leaves", 0.01f, BFBParticleTypes.CEDAR_LEAVES, Blocks.OAK_LEAVES, MapColor.get(7));
    public static final Block FALLEN_CEDAR_LEAVES = registerBlock("fallen_cedar_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(CEDAR_LEAVES).mapColor(MapColor.OAK_TAN).nonOpaque());
    public static final Block CEDAR_HEDGE = registerBlock("cedar_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(CEDAR_LEAVES));
    public static final Block CEDAR_SAPLING = registerSaplingBlock("cedar_sapling", BFBSaplingGenerators.CEDAR, OAK_SAPLING);
    public static final Block POTTED_CEDAR_SAPLING = registerFlowerPotBlock("potted_cedar_sapling", CEDAR_SAPLING, POTTED_OAK_SAPLING);
    public static final Block CEDAR_PLANKS = registerBlock("cedar_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_STAIRS = registerStairsBlock("cedar_stairs", CEDAR_PLANKS);
    public static final Block CEDAR_SLAB = registerBlock("cedar_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_FENCE = registerBlock("cedar_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_FENCE_GATE = registerFenceGateBlock("cedar_fence_gate", CEDAR, CEDAR_FENCE, MapColor.OAK_TAN);
    public static final Block CEDAR_BUTTON = registerButtonBlock("cedar_button", CEDAR_SET, 15, OAK_BUTTON);
    public static final Block CEDAR_PRESSURE_PLATE = registerPressurePlateBlock("cedar_pressure_plate", CEDAR_SET, OAK_PRESSURE_PLATE);
    public static final Block CEDAR_DOOR = registerDoorBlock("cedar_door", CEDAR_SET, OAK_DOOR);
    public static final Block CEDAR_TRAPDOOR = registerTrapdoorBlock("cedar_trapdoor", CEDAR_SET, OAK_TRAPDOOR);
    public static final Block CEDAR_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "cedar_sign"),
            settings -> new SignBlock(CEDAR, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "cedar_wall_sign"),
            settings -> new WallSignBlock(CEDAR, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "cedar_hanging_sign"),
            settings -> new HangingSignBlock(CEDAR, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "cedar_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(CEDAR, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.OAK_TAN));
    public static final Block CEDAR_SHELF = registerBlock("cedar_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SHELF).mapColor(MapColor.OAK_TAN));

    public static final Block GREEN_BAMBOO_PLANKS = registerBlock("green_bamboo_planks",
            Block::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_STAIRS = registerStairsBlock("green_bamboo_stairs", GREEN_BAMBOO_PLANKS);
    public static final Block GREEN_BAMBOO_SLAB = registerBlock("green_bamboo_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_SLAB).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_FENCE = registerBlock("green_bamboo_fence",
            FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_FENCE).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_FENCE_GATE = registerFenceGateBlock("green_bamboo_fence_gate", GREEN_BAMBOO, GREEN_BAMBOO_FENCE, MapColor.DARK_GREEN);
    public static final Block GREEN_BAMBOO_BUTTON = registerButtonBlock("green_bamboo_button", GREEN_BAMBOO_SET, 15, BAMBOO_BUTTON);
    public static final Block GREEN_BAMBOO_PRESSURE_PLATE = registerPressurePlateBlock("green_bamboo_pressure_plate", GREEN_BAMBOO_SET, BAMBOO_PRESSURE_PLATE);
    public static final Block GREEN_BAMBOO_DOOR = registerDoorBlock("green_bamboo_door", GREEN_BAMBOO_SET, BAMBOO_DOOR);
    public static final Block GREEN_BAMBOO_TRAPDOOR = registerTrapdoorBlock("green_bamboo_trapdoor", GREEN_BAMBOO_SET, BAMBOO_TRAPDOOR);
    public static final Block GREEN_BAMBOO_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_sign"),
            settings -> new SignBlock(GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(OAK_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_wall_sign"),
            settings -> new WallSignBlock(GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(OAK_WALL_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_hanging_sign"),
            settings -> new HangingSignBlock(GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(OAK_HANGING_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.of(BlocksForBuilders.MOD_ID, "green_bamboo_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GREEN_BAMBOO, settings), AbstractBlock.Settings.copy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.DARK_GREEN));
    public static final Block GREEN_BAMBOO_SHELF = registerBlock("green_bamboo_shelf",
            ShelfBlock::new, AbstractBlock.Settings.copy(BAMBOO_SHELF).mapColor(MapColor.DARK_GREEN));

    public static final Block GOLD_ACACIA_LEAVES = registerLeafBlock("gold_acacia_leaves", 0.02f, BFBParticleTypes.GOLD_ACACIA_LEAVES, Blocks.ACACIA_LEAVES, MapColor.TERRACOTTA_YELLOW);
    public static final Block FALLEN_GOLD_ACACIA_LEAVES = registerBlock("fallen_gold_acacia_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).nonOpaque());
    public static final Block GOLD_ACACIA_HEDGE = registerBlock("gold_acacia_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(GOLD_ACACIA_LEAVES));
    public static final Block GOLD_ACACIA_SAPLING = registerSaplingBlock("gold_acacia_sapling", BFBSaplingGenerators.GOLD_ACACIA, ACACIA_SAPLING);
    public static final Block POTTED_GOLD_ACACIA_SAPLING = registerFlowerPotBlock("potted_gold_acacia_sapling", GOLD_ACACIA_SAPLING, POTTED_ACACIA_SAPLING);
    public static final Block YELLOW_BIRCH_LEAVES = registerLeafBlock("yellow_birch_leaves", 0.1f, BFBParticleTypes.YELLOW_BIRCH_LEAVES, BIRCH_LEAVES, MapColor.YELLOW);
    public static final Block FALLEN_YELLOW_BIRCH_LEAVES = registerBlock("fallen_yellow_birch_leaves",
            FallenLeavesBlock::new, AbstractBlock.Settings.copy(YELLOW_BIRCH_LEAVES).mapColor(MapColor.YELLOW).nonOpaque());
    public static final Block YELLOW_BIRCH_HEDGE = registerBlock("yellow_birch_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(YELLOW_BIRCH_LEAVES));
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

    public static final Block OAK_HEDGE = registerBlock("oak_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(OAK_LEAVES));
    public static final Block BIRCH_HEDGE = registerBlock("birch_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(BIRCH_LEAVES));
    public static final Block SPRUCE_HEDGE = registerBlock("spruce_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(SPRUCE_LEAVES));
    public static final Block JUNGLE_HEDGE = registerBlock("jungle_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(JUNGLE_LEAVES));
    public static final Block ACACIA_HEDGE = registerBlock("acacia_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(ACACIA_LEAVES));
    public static final Block DARK_OAK_HEDGE = registerBlock("dark_oak_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(DARK_OAK_LEAVES));
    public static final Block AZALEA_HEDGE = registerBlock("azalea_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_HEDGE = registerBlock("flowering_azalea_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(FLOWERING_AZALEA_LEAVES));
    public static final Block MANGROVE_HEDGE = registerBlock("mangrove_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(MANGROVE_LEAVES));
    public static final Block CHERRY_HEDGE = registerBlock("cherry_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(CHERRY_LEAVES));
    public static final Block PALE_OAK_HEDGE = registerBlock("pale_oak_hedge",
            HedgeBlock::new, AbstractBlock.Settings.copy(PALE_OAK_LEAVES));
   
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
    public static final Block PALM_BOOKSHELF = registerBlock("palm_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.PALE_YELLOW));
    public static final Block MAPLE_BOOKSHELF = registerBlock("maple_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.RAW_IRON_PINK));
    public static final Block BEECH_BOOKSHELF = registerBlock("beech_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.ORANGE));
    public static final Block PINE_BOOKSHELF = registerBlock("pine_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block CEDAR_BOOKSHELF = registerBlock("cedar_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block GREEN_BAMBOO_BOOKSHELF = registerBlock("green_bamboo_bookshelf",
            Block::new, AbstractBlock.Settings.copy(BOOKSHELF).mapColor(MapColor.DARK_GREEN));
   
    public static final Block HAY_STAIRS = registerStairsBlock("hay_stairs", HAY_BLOCK);
    public static final Block HAY_SLAB = registerBlock("hay_slab",
            PillarSlab::new, AbstractBlock.Settings.copy(HAY_BLOCK).mapColor(MapColor.YELLOW));
    public static final Block HAY_RUG = registerBlock("hay_rug",
            DirectionalCarpet::new, AbstractBlock.Settings.copy(HAY_BLOCK).mapColor(MapColor.YELLOW));
   
    public static final Block SMOOTH_STONE_STAIRS = registerStairsBlock("smooth_stone_stairs", SMOOTH_STONE);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            Block::new, AbstractBlock.Settings.copy(SMOOTH_STONE));
    public static final Block CRACKED_SMOOTH_STONE_BRICKS = registerBlock("cracked_smooth_stone_bricks",
            Block::new, AbstractBlock.Settings.copy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICK_STAIRS = registerStairsBlock("smooth_stone_brick_stairs", SMOOTH_STONE);
    public static final Block SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SMOOTH_STONE));

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
            Block::new, AbstractBlock.Settings.copy(COBBLED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
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
    public static final Block CRACKED_GRIMSTONE_BRICKS = registerBlock("cracked_grimstone_bricks",
            Block::new, AbstractBlock.Settings.copy(CRACKED_DEEPSLATE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_STAIRS = registerStairsBlock("grimstone_brick_stairs", GRIMSTONE_BRICKS);
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILES = registerBlock("grimstone_tiles",
            DirectionalBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block CRACKED_GRIMSTONE_TILES = registerBlock("cracked_grimstone_tiles",
            DirectionalBlock::new, AbstractBlock.Settings.copy(CRACKED_DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_STAIRS = registerStairsBlock("grimstone_tile_stairs", GRIMSTONE_TILES);
    public static final Block GRIMSTONE_TILE_SLAB = registerBlock("grimstone_tile_slab",
            PillarSlab::new, AbstractBlock.Settings.copy(DEEPSLATE_TILE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_WALL = registerBlock("grimstone_tile_wall",
            WallBlock::new, AbstractBlock.Settings.copy(DEEPSLATE_TILE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));

    public static final Block ANTIGORITE = registerBlock("antigorite",
            Block::new, AbstractBlock.Settings.copy(ANDESITE).mapColor(MapColor.GREEN));
    public static final Block ANTIGORITE_STAIRS = registerStairsBlock("antigorite_stairs", ANTIGORITE);
    public static final Block ANTIGORITE_SLAB = registerBlock("antigorite_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(ANDESITE_SLAB).mapColor(MapColor.GREEN));
    public static final Block ANTIGORITE_WALL = registerBlock("antigorite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(ANDESITE_WALL).mapColor(MapColor.GREEN));
    public static final Block POLISHED_ANTIGORITE = registerBlock("polished_antigorite",
            Block::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE).mapColor(MapColor.GREEN));
    public static final Block POLISHED_ANTIGORITE_STAIRS = registerStairsBlock("polished_antigorite_stairs", POLISHED_ANTIGORITE);
    public static final Block POLISHED_ANTIGORITE_SLAB = registerBlock("polished_antigorite_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE_SLAB).mapColor(MapColor.GREEN));
    public static final Block POLISHED_ANTIGORITE_WALL = registerBlock("polished_antigorite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE).mapColor(MapColor.GREEN));
    public static final Block ANTIGORITE_BRICKS = registerBlock("antigorite_bricks",
            Block::new, AbstractBlock.Settings.copy(POLISHED_ANTIGORITE));
    public static final Block ANTIGORITE_BRICK_STAIRS = registerStairsBlock("antigorite_brick_stairs", POLISHED_ANTIGORITE_STAIRS);
    public static final Block ANTIGORITE_BRICK_SLAB = registerBlock("antigorite_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_ANTIGORITE_SLAB));
    public static final Block ANTIGORITE_BRICK_WALL = registerBlock("antigorite_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_ANTIGORITE_WALL));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_GRANITE));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            Block::new, AbstractBlock.Settings.copy(POLISHED_GRANITE));
    public static final Block GRANITE_BRICK_STAIRS = registerStairsBlock("granite_brick_stairs", POLISHED_GRANITE_STAIRS);
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_GRANITE_SLAB));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_GRANITE_WALL));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_DIORITE));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            Block::new, AbstractBlock.Settings.copy(POLISHED_DIORITE));
    public static final Block DIORITE_BRICK_STAIRS = registerStairsBlock("diorite_brick_stairs", POLISHED_DIORITE_STAIRS);
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_DIORITE_SLAB));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_DIORITE_WALL));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            Block::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE));
    public static final Block ANDESITE_BRICK_STAIRS = registerStairsBlock("andesite_brick_stairs", POLISHED_ANDESITE_STAIRS);
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE_SLAB));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_ANDESITE_WALL));

    public static final Block LIGHT_TUFF = registerBlock("light_tuff",
            Block::new, AbstractBlock.Settings.copy(TUFF).mapColor(MapColor.LICHEN_GREEN));
    public static final Block LIGHT_TUFF_STAIRS = registerStairsBlock("light_tuff_stairs", TUFF_STAIRS, MapColor.LICHEN_GREEN);
    public static final Block LIGHT_TUFF_SLAB = registerBlock("light_tuff_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(TUFF_SLAB).mapColor(MapColor.LICHEN_GREEN));
    public static final Block LIGHT_TUFF_WALL = registerBlock("light_tuff_wall",
            WallBlock::new, AbstractBlock.Settings.copy(TUFF_WALL).mapColor(MapColor.LICHEN_GREEN));
    public static final Block CHISELED_LIGHT_TUFF = registerBlock("chiseled_light_tuff",
            Block::new, AbstractBlock.Settings.copy(CHISELED_TUFF).mapColor(MapColor.LICHEN_GREEN));
    public static final Block POLISHED_LIGHT_TUFF = registerBlock("polished_light_tuff",
            Block::new, AbstractBlock.Settings.copy(POLISHED_TUFF).mapColor(MapColor.LICHEN_GREEN));
    public static final Block POLISHED_LIGHT_TUFF_STAIRS = registerStairsBlock("polished_light_tuff_stairs", POLISHED_TUFF, MapColor.LICHEN_GREEN);
    public static final Block POLISHED_LIGHT_TUFF_SLAB = registerBlock("polished_light_tuff_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(POLISHED_TUFF_SLAB).mapColor(MapColor.LICHEN_GREEN));
    public static final Block POLISHED_LIGHT_TUFF_WALL = registerBlock("polished_light_tuff_wall",
            WallBlock::new, AbstractBlock.Settings.copy(POLISHED_TUFF_WALL).mapColor(MapColor.LICHEN_GREEN));
    public static final Block LIGHT_TUFF_BRICKS = registerBlock("light_tuff_bricks",
            Block::new, AbstractBlock.Settings.copy(TUFF_BRICKS).mapColor(MapColor.LICHEN_GREEN));
    public static final Block LIGHT_TUFF_BRICK_STAIRS = registerStairsBlock("light_tuff_brick_stairs", TUFF_BRICK_STAIRS, MapColor.LICHEN_GREEN);
    public static final Block LIGHT_TUFF_BRICK_SLAB = registerBlock("light_tuff_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(TUFF_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN));
    public static final Block LIGHT_TUFF_BRICK_WALL = registerBlock("light_tuff_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(TUFF_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN));
    public static final Block CHISELED_LIGHT_TUFF_BRICKS = registerBlock("chiseled_light_tuff_bricks",
            Block::new, AbstractBlock.Settings.copy(CHISELED_TUFF_BRICKS).mapColor(MapColor.LICHEN_GREEN));

    public static final Block CALCITE_STAIRS = registerStairsBlock("calcite_stairs", CALCITE);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            Block::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block POLISHED_CALCITE_STAIRS = registerStairsBlock("polished_calcite_stairs", CALCITE);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            WallBlock::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            Block::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            Block::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block CALCITE_BRICK_STAIRS = registerStairsBlock("calcite_brick_stairs", CALCITE);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CALCITE));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(CALCITE));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SMOOTH_SANDSTONE));
    public static final Block CUT_SANDSTONE_STAIRS = registerStairsBlock("cut_sandstone_stairs", CUT_SANDSTONE);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(CUT_SANDSTONE));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(CUT_SANDSTONE));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(CUT_SANDSTONE));
    public static final Block SANDSTONE_BRICK_STAIRS = registerStairsBlock("sandstone_brick_stairs", SANDSTONE_STAIRS);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CUT_SANDSTONE_SLAB));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SANDSTONE_WALL));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SMOOTH_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairsBlock("cut_red_sandstone_stairs", CUT_RED_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(CUT_RED_SANDSTONE));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(CUT_RED_SANDSTONE));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(CUT_RED_SANDSTONE));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerStairsBlock("red_sandstone_brick_stairs", RED_SANDSTONE_STAIRS);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CUT_RED_SANDSTONE_SLAB));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(RED_SANDSTONE_WALL));

    public static final Block DARK_SAND = registerBlock("dark_sand",settings -> new SandBlock(new ColorCode(14406560), settings),
            AbstractBlock.Settings.copy(SAND).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE = registerBlock("dark_sandstone",
            Block::new, AbstractBlock.Settings.copy(SANDSTONE).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE_STAIRS = registerStairsBlock("dark_sandstone_stairs", SANDSTONE_STAIRS, MapColor.OAK_TAN);
    public static final Block DARK_SANDSTONE_SLAB = registerBlock("dark_sandstone_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(SANDSTONE_SLAB).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE_WALL = registerBlock("dark_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(SANDSTONE_WALL).mapColor(MapColor.OAK_TAN));
    public static final Block CHISELED_DARK_SANDSTONE = registerBlock("chiseled_dark_sandstone",
            Block::new, AbstractBlock.Settings.copy(CHISELED_SANDSTONE).mapColor(MapColor.OAK_TAN));
    public static final Block SMOOTH_DARK_SANDSTONE = registerBlock("smooth_dark_sandstone",
            Block::new, AbstractBlock.Settings.copy(SMOOTH_SANDSTONE).mapColor(MapColor.OAK_TAN));
    public static final Block SMOOTH_DARK_SANDSTONE_STAIRS = registerStairsBlock("smooth_dark_sandstone_stairs", SMOOTH_SANDSTONE_STAIRS, MapColor.OAK_TAN);
    public static final Block SMOOTH_DARK_SANDSTONE_SLAB = registerBlock("smooth_dark_sandstone_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(SMOOTH_SANDSTONE_SLAB).mapColor(MapColor.OAK_TAN));
    public static final Block SMOOTH_DARK_SANDSTONE_WALL = registerBlock("smooth_dark_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL).mapColor(MapColor.OAK_TAN));
    public static final Block CUT_DARK_SANDSTONE = registerBlock("cut_dark_sandstone",
            Block::new, AbstractBlock.Settings.copy(CUT_SANDSTONE).mapColor(MapColor.OAK_TAN));
    public static final Block CUT_DARK_SANDSTONE_STAIRS = registerStairsBlock("cut_dark_sandstone_stairs", BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, MapColor.OAK_TAN);
    public static final Block CUT_DARK_SANDSTONE_SLAB = registerBlock("cut_dark_sandstone_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(CUT_SANDSTONE_SLAB).mapColor(MapColor.OAK_TAN));
    public static final Block CUT_DARK_SANDSTONE_WALL = registerBlock("cut_dark_sandstone_wall",
            WallBlock::new, AbstractBlock.Settings.copy(BlocksForBuildersBlocks.CUT_SANDSTONE_WALL).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE_BRICKS = registerBlock("dark_sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(BlocksForBuildersBlocks.SANDSTONE_BRICKS).mapColor(MapColor.OAK_TAN));
    public static final Block CRACKED_DARK_SANDSTONE_BRICKS = registerBlock("cracked_dark_sandstone_bricks",
            Block::new, AbstractBlock.Settings.copy(BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE_BRICK_STAIRS = registerStairsBlock("dark_sandstone_brick_stairs", SANDSTONE_BRICK_STAIRS, MapColor.OAK_TAN);
    public static final Block DARK_SANDSTONE_BRICK_SLAB = registerBlock("dark_sandstone_brick_slab",
            SlabBlock::new, AbstractBlock.Settings.copy(SANDSTONE_BRICK_SLAB).mapColor(MapColor.OAK_TAN));
    public static final Block DARK_SANDSTONE_BRICK_WALL = registerBlock("dark_sandstone_brick_wall",
            WallBlock::new, AbstractBlock.Settings.copy(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL).mapColor(MapColor.OAK_TAN));

    public static final Block BAMBOO_MOSAIC_RUG = registerBlock("bamboo_mosaic_rug",
            CarpetBlock::new, AbstractBlock.Settings.copy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH = registerBlock("bamboo_thatch",
            PillarBlock::new, AbstractBlock.Settings.copy(HAY_BLOCK));
    public static final Block BAMBOO_THATCH_STAIRS = registerStairsBlock("bamboo_thatch_stairs", BAMBOO_THATCH);
    public static final Block BAMBOO_THATCH_SLAB = registerBlock("bamboo_thatch_slab",
            PillarSlab::new, AbstractBlock.Settings.copy(BAMBOO_THATCH));
    public static final Block BAMBOO_THATCH_RUG = registerBlock("bamboo_thatch_rug",
            DirectionalCarpet::new, AbstractBlock.Settings.copy(BAMBOO_THATCH));

    public static final Block COCONUT_THATCH = registerBlock("coconut_thatch",
            PillarBlock::new, AbstractBlock.Settings.copy(HAY_BLOCK));
    public static final Block COCONUT_THATCH_STAIRS = registerStairsBlock("coconut_thatch_stairs", COCONUT_THATCH);
    public static final Block COCONUT_THATCH_SLAB = registerBlock("coconut_thatch_slab",
            PillarSlab::new, AbstractBlock.Settings.copy(COCONUT_THATCH));
    public static final Block COCONUT_THATCH_RUG = registerBlock("coconut_thatch_rug",
            DirectionalCarpet::new, AbstractBlock.Settings.copy(COCONUT_THATCH));

    public static final Block SCORCHED_GRASS = registerBlock("scorched_grass",settings -> new ScorchedGrassBlock(BlocksForBuildersConfiguredFeatures.SCORCHWOOD_SAPLING_KEY, settings),
            AbstractBlock.Settings.copy(DIRT).mapColor(MapColor.TERRACOTTA_GRAY));
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
    private static Block registerLeafBlock(String name, float particleChance, ParticleEffect particleEffect, Block base, MapColor mapColor) {
        return registerBlock(name, settings -> new UntintedParticleLeavesBlock(particleChance, particleEffect, settings), AbstractBlock.Settings.copy(base).mapColor(mapColor));
    }
    private static Block registerStairsBlock(String name, Block base) {
        return registerStairsBlock(name, base, base.getDefaultMapColor());
    }
    private static Block registerStairsBlock(String name, Block base, MapColor color) {
        return registerBlock(name, settings -> new StairsBlock(base.getDefaultState(), settings), AbstractBlock.Settings.copy(base).mapColor(color));
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
    private static Block registerCoconutBlock(String name, MapColor mapColor) {
        return registerBlock(name, false,settings -> new CoconutBlock(BFBSaplingGenerators.PALM, settings), AbstractBlock.Settings.create().mapColor(mapColor).ticksRandomly().breakInstantly().sounds(BlockSoundGroup.BAMBOO).pistonBehavior(PistonBehavior.DESTROY));
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
