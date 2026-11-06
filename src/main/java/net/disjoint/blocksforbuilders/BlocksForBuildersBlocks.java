package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.signstuff.SignBlockHelper;
import net.disjoint.blocksforbuilders.util.particles.BFBParticleTypes;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersPlacedFeatures;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBSaplingGenerators;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.CookingFuel;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.ColorRGBA;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.providers.number.floats.ContextFloatProviders;
import net.minecraft.world.level.storage.loot.providers.number.floats.ResolvableFloat;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProvider;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.minecraft.world.level.storage.loot.providers.number.ints.ResolvableInt;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.*;

public class BlocksForBuildersBlocks {
    public static final BlockSetType GHOSTWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood_set"));
    public static final BlockSetType SCORCHWOOD_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood_set"));
    public static final BlockSetType WILLOW_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow_set"));
    public static final BlockSetType PALM_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm_set"));
    public static final BlockSetType MAPLE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_set"));
    public static final BlockSetType BEECH_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_set"));
    public static final BlockSetType PINE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine_set"));
    public static final BlockSetType CEDAR_SET = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar_set"));
    public static final BlockSetType GREEN_JUNGLE_SET = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle_set"));
    public static final BlockSetType GREEN_BAMBOO_SET = BlockSetTypeBuilder.copyOf(BlockSetType.BAMBOO).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo_set"));
    public static final WoodType GHOSTWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood"), GHOSTWOOD_SET);
    public static final WoodType SCORCHWOOD = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood"), SCORCHWOOD_SET);
    public static final WoodType WILLOW = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow"), WILLOW_SET);
    public static final WoodType PALM = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm"), PALM_SET);
    public static final WoodType MAPLE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple"), MAPLE_SET);
    public static final WoodType BEECH = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech"), BEECH_SET);
    public static final WoodType PINE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine"), PINE_SET);
    public static final WoodType CEDAR = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar"), CEDAR_SET);
    public static final WoodType GREEN_JUNGLE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle"), GREEN_JUNGLE_SET);
    public static final WoodType GREEN_BAMBOO = WoodTypeBuilder.copyOf(WoodType.BAMBOO).register(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo"), GREEN_BAMBOO_SET);

    public static final Block GREEN_JUNGLE_LOG = registerBlock("green_jungle_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LOG).mapColor(MapColor.PLANT), 300);
    public static final Block STRIPPED_GREEN_JUNGLE_LOG = registerBlock("stripped_green_jungle_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LOG).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_JUNGLE_WOOD = registerBlock("green_jungle_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LOG).mapColor(MapColor.PLANT), 300);
    public static final Block STRIPPED_GREEN_JUNGLE_WOOD = registerBlock("stripped_green_jungle_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LOG).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_JUNGLE_LEAVES = registerLeafBlock("green_jungle_leaves", 0.01f, BFBParticleTypes.GREEN_JUNGLE_LEAVES, JUNGLE_LEAVES, MapColor.COLOR_LIGHT_GREEN);
    public static final Block FALLEN_GREEN_JUNGLE_LEAVES = registerBlock("fallen_green_jungle_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(GREEN_JUNGLE_LEAVES).mapColor(MapColor.COLOR_LIGHT_GREEN).noOcclusion());
    public static final Block GREEN_JUNGLE_HEDGE = registerBlock("green_jungle_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(GREEN_JUNGLE_LEAVES));
    public static final Block GREEN_JUNGLE_SAPLING = registerSaplingBlock("green_jungle_sapling", BFBSaplingGenerators.GREEN_JUNGLE, JUNGLE_SAPLING);
    public static final Block POTTED_GREEN_JUNGLE_SAPLING = registerFlowerPotBlock("potted_green_jungle_sapling", GREEN_JUNGLE_SAPLING, POTTED_JUNGLE_SAPLING);
    public static final Block GREEN_JUNGLE_PLANKS = registerBlock("green_jungle_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_JUNGLE_STAIRS = registerStairsBlock("green_jungle_stairs", 300, GREEN_JUNGLE_PLANKS);
    public static final Block GREEN_JUNGLE_SLAB = registerBlock("green_jungle_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SLAB).mapColor(MapColor.PLANT), 150);
    public static final Block GREEN_JUNGLE_FENCE = registerBlock("green_jungle_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_FENCE).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_JUNGLE_FENCE_GATE = registerFenceGateBlock("green_jungle_fence_gate", GREEN_JUNGLE, GREEN_JUNGLE_FENCE, 300, MapColor.PLANT);
    public static final Block GREEN_JUNGLE_BUTTON = registerButtonBlock("green_jungle_button", GREEN_JUNGLE_SET, 100, 15, JUNGLE_BUTTON);
    public static final Block GREEN_JUNGLE_PRESSURE_PLATE = registerPressurePlateBlock("green_jungle_pressure_plate", GREEN_JUNGLE_SET, 300, JUNGLE_PRESSURE_PLATE);
    public static final Block GREEN_JUNGLE_DOOR = registerDoorBlock("green_jungle_door", GREEN_JUNGLE_SET, 200, JUNGLE_DOOR);
    public static final Block GREEN_JUNGLE_TRAPDOOR = registerTrapdoorBlock("green_jungle_trapdoor", GREEN_JUNGLE_SET, 300, JUNGLE_TRAPDOOR);
    public static final Block GREEN_JUNGLE_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle_sign"),
            settings -> new StandingSignBlock(GREEN_JUNGLE, settings), BlockBehaviour.Properties.ofFullCopy(JUNGLE_SIGN).mapColor(MapColor.PLANT));
    public static final Block GREEN_JUNGLE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle_wall_sign"),
            settings -> new WallSignBlock(GREEN_JUNGLE, settings), BlockBehaviour.Properties.ofFullCopy(JUNGLE_WALL_SIGN).mapColor(MapColor.PLANT).overrideLootTable(GREEN_JUNGLE_SIGN.getLootTable()));
    public static final Block GREEN_JUNGLE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle_hanging_sign"),
            settings -> new CeilingHangingSignBlock(GREEN_JUNGLE, settings), BlockBehaviour.Properties.ofFullCopy(JUNGLE_HANGING_SIGN).mapColor(MapColor.PLANT));
    public static final Block GREEN_JUNGLE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_jungle_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GREEN_JUNGLE, settings), BlockBehaviour.Properties.ofFullCopy(JUNGLE_WALL_HANGING_SIGN).mapColor(MapColor.PLANT).overrideLootTable(GREEN_JUNGLE_HANGING_SIGN.getLootTable()));
    public static final Block GREEN_JUNGLE_SHELF = registerBlock("green_jungle_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SHELF).mapColor(MapColor.PLANT), 300);
   
    public static final Block GHOSTWOOD_LOG = registerBlock("ghostwood_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOL), 300);
    public static final Block STRIPPED_GHOSTWOOD_LOG = registerBlock("stripped_ghostwood_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOL), 300);
    public static final Block GHOSTWOOD_WOOD = registerBlock("ghostwood_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOL), 300);
    public static final Block STRIPPED_GHOSTWOOD_WOOD = registerBlock("stripped_ghostwood_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOL), 300);
    public static final Block GHOSTWOOD_LEAVES = registerLeafBlock("ghostwood_leaves", 0.01f, BFBParticleTypes.GHOSTWOOD_LEAVES, Blocks.AZALEA_LEAVES, MapColor.CRIMSON_STEM);
    public static final Block FALLEN_GHOSTWOOD_LEAVES = registerBlock("fallen_ghostwood_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(GHOSTWOOD_LEAVES).mapColor(MapColor.CRIMSON_STEM).noOcclusion());
    public static final Block GHOSTWOOD_HEDGE = registerBlock("ghostwood_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(GHOSTWOOD_LEAVES));
    public static final Block GHOSTWOOD_SAPLING = registerSaplingBlock("ghostwood_sapling", BFBSaplingGenerators.GHOSTWOOD, OAK_SAPLING);
    public static final Block POTTED_GHOSTWOOD_SAPLING = registerFlowerPotBlock("potted_ghostwood_sapling", GHOSTWOOD_SAPLING, POTTED_OAK_SAPLING);
    public static final Block GHOSTWOOD_PLANKS = registerBlock("ghostwood_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOL), 300);
    public static final Block GHOSTWOOD_STAIRS = registerStairsBlock("ghostwood_stairs", 300, GHOSTWOOD_PLANKS);
    public static final Block GHOSTWOOD_SLAB = registerBlock("ghostwood_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.WOOL), 150);
    public static final Block GHOSTWOOD_FENCE = registerBlock("ghostwood_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.WOOL), 300);
    public static final Block GHOSTWOOD_FENCE_GATE = registerFenceGateBlock("ghostwood_fence_gate", GHOSTWOOD, GHOSTWOOD_FENCE, 300, MapColor.WOOL);
    public static final Block GHOSTWOOD_BUTTON = registerButtonBlock("ghostwood_button", GHOSTWOOD_SET, 100, 15, OAK_BUTTON);
    public static final Block GHOSTWOOD_PRESSURE_PLATE = registerPressurePlateBlock("ghostwood_pressure_plate", GHOSTWOOD_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block GHOSTWOOD_DOOR = registerDoorBlock("ghostwood_door", GHOSTWOOD_SET, 200, OAK_DOOR);
    public static final Block GHOSTWOOD_TRAPDOOR = registerTrapdoorBlock("ghostwood_trapdoor", GHOSTWOOD_SET, 300, OAK_TRAPDOOR);
    public static final Block GHOSTWOOD_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood_sign"),
            settings -> new StandingSignBlock(GHOSTWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.WOOL));
    public static final Block GHOSTWOOD_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood_wall_sign"),
            settings -> new WallSignBlock(GHOSTWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.WOOL).overrideLootTable(GHOSTWOOD_SIGN.getLootTable()));
    public static final Block GHOSTWOOD_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood_hanging_sign"),
            settings -> new CeilingHangingSignBlock(GHOSTWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.WOOL));
    public static final Block GHOSTWOOD_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "ghostwood_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GHOSTWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.WOOL).overrideLootTable(GHOSTWOOD_HANGING_SIGN.getLootTable()));
    public static final Block GHOSTWOOD_SHELF = registerBlock("ghostwood_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.WOOL), 300);

    public static final Block SCORCHWOOD_LOG = registerBlock("scorchwood_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_BLACK));
    public static final Block STRIPPED_SCORCHWOOD_LOG = registerBlock("stripped_scorchwood_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_WOOD = registerBlock("scorchwood_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_BLACK));
    public static final Block STRIPPED_SCORCHWOOD_WOOD = registerBlock("stripped_scorchwood_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_SAPLING = registerSaplingBlock("scorchwood_sapling", BFBSaplingGenerators.SCORCHWOOD, OAK_SAPLING);
    public static final Block POTTED_SCORCHWOOD_SAPLING = registerFlowerPotBlock("potted_scorchwood_sapling", SCORCHWOOD_SAPLING, POTTED_OAK_SAPLING);
    public static final Block SCORCHWOOD_PLANKS = registerBlock("scorchwood_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_STAIRS = registerStairsBlock("scorchwood_stairs", SCORCHWOOD_PLANKS);
    public static final Block SCORCHWOOD_SLAB = registerBlock("scorchwood_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_FENCE = registerBlock("scorchwood_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_FENCE_GATE = registerFenceGateBlock("scorchwood_fence_gate", SCORCHWOOD, SCORCHWOOD_FENCE, MapColor.COLOR_BLACK);
    public static final Block SCORCHWOOD_BUTTON = registerButtonBlock("scorchwood_button", SCORCHWOOD_SET, 15, OAK_BUTTON);
    public static final Block SCORCHWOOD_PRESSURE_PLATE = registerPressurePlateBlock("scorchwood_pressure_plate", SCORCHWOOD_SET, OAK_PRESSURE_PLATE);
    public static final Block SCORCHWOOD_DOOR = registerDoorBlock("scorchwood_door", SCORCHWOOD_SET, OAK_DOOR);
    public static final Block SCORCHWOOD_TRAPDOOR = registerTrapdoorBlock("scorchwood_trapdoor", SCORCHWOOD_SET, OAK_TRAPDOOR);
    public static final Block SCORCHWOOD_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood_sign"),
            settings -> new StandingSignBlock(SCORCHWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood_wall_sign"),
            settings -> new WallSignBlock(SCORCHWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.COLOR_BLACK).overrideLootTable(SCORCHWOOD_SIGN.getLootTable()));
    public static final Block SCORCHWOOD_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood_hanging_sign"),
            settings -> new CeilingHangingSignBlock(SCORCHWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.COLOR_BLACK));
    public static final Block SCORCHWOOD_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "scorchwood_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(SCORCHWOOD, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.COLOR_BLACK).overrideLootTable(SCORCHWOOD_HANGING_SIGN.getLootTable()));
    public static final Block SCORCHWOOD_SHELF = registerBlock("scorchwood_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.COLOR_BLACK));

    public static final Block WILLOW_LOG = registerBlock("willow_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.DIRT), 300);
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.GLOW_LICHEN), 300);
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.DIRT), 300);
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.GLOW_LICHEN), 300);
    public static final Block WILLOW_LEAVES = registerLeafBlock("willow_leaves", 0.01f, BFBParticleTypes.WILLOW_LEAVES, Blocks.OAK_LEAVES, MapColor.GRASS);
    public static final Block FALLEN_WILLOW_LEAVES = registerBlock("fallen_willow_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(WILLOW_LEAVES).mapColor(MapColor.GRASS).noOcclusion());
    public static final Block WILLOW_HEDGE = registerBlock("willow_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(WILLOW_LEAVES));
    public static final Block WILLOW_SAPLING = registerSaplingBlock("willow_sapling", BFBSaplingGenerators.WILLOW, OAK_SAPLING);
    public static final Block POTTED_WILLOW_SAPLING = registerFlowerPotBlock("potted_willow_sapling", WILLOW_SAPLING, POTTED_OAK_SAPLING);
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.GLOW_LICHEN), 300);
    public static final Block WILLOW_STAIRS = registerStairsBlock("willow_stairs", 300, WILLOW_PLANKS);
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.GLOW_LICHEN), 150);
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.GLOW_LICHEN), 300);
    public static final Block WILLOW_FENCE_GATE = registerFenceGateBlock("willow_fence_gate", WILLOW, WILLOW_FENCE, 300, MapColor.GLOW_LICHEN);
    public static final Block WILLOW_BUTTON = registerButtonBlock("willow_button", WILLOW_SET, 100, 15, OAK_BUTTON);
    public static final Block WILLOW_PRESSURE_PLATE = registerPressurePlateBlock("willow_pressure_plate", WILLOW_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block WILLOW_DOOR = registerDoorBlock("willow_door", WILLOW_SET, 200, OAK_DOOR);
    public static final Block WILLOW_TRAPDOOR = registerTrapdoorBlock("willow_trapdoor", WILLOW_SET, 300, OAK_TRAPDOOR);
    public static final Block WILLOW_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow_sign"),
            settings -> new StandingSignBlock(WILLOW, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.GLOW_LICHEN));
    public static final Block WILLOW_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow_wall_sign"),
            settings -> new WallSignBlock(WILLOW, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.GLOW_LICHEN).overrideLootTable(WILLOW_SIGN.getLootTable()));
    public static final Block WILLOW_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow_hanging_sign"),
            settings -> new CeilingHangingSignBlock(WILLOW, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.GLOW_LICHEN));
    public static final Block WILLOW_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "willow_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(WILLOW, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.GLOW_LICHEN).overrideLootTable(WILLOW_HANGING_SIGN.getLootTable()));
    public static final Block WILLOW_SHELF = registerBlock("willow_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.GLOW_LICHEN), 300);

    public static final Block PALM_LOG = registerBlock("palm_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.SAND), 300);
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.SAND), 300);
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.SAND), 300);
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.SAND), 300);
    public static final Block PALM_LEAVES = registerBlock("palm_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            settings -> new PalmLeavesBlock(settings, 0.01f, BFBParticleTypes.PALM_LEAVES), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.byId(1)));
    public static final Block FALLEN_PALM_LEAVES = registerBlock("fallen_palm_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(PALM_LEAVES).mapColor(MapColor.byId(1)).noOcclusion());
    public static final Block PALM_HEDGE = registerBlock("palm_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(PALM_LEAVES));
    public static final Block COCONUT = registerCoconutBlock("coconut", MapColor.DIRT);
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.SAND), 300);
    public static final Block PALM_STAIRS = registerStairsBlock("palm_stairs", 300, PALM_PLANKS);
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.SAND) , 150);
    public static final Block PALM_FENCE = registerBlock("palm_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.SAND), 300);
    public static final Block PALM_FENCE_GATE = registerFenceGateBlock("palm_fence_gate", PALM, PALM_FENCE, 300, MapColor.SAND);
    public static final Block PALM_BUTTON = registerButtonBlock("palm_button", PALM_SET, 100, 15, OAK_BUTTON);
    public static final Block PALM_PRESSURE_PLATE = registerPressurePlateBlock("palm_pressure_plate", PALM_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block PALM_DOOR = registerDoorBlock("palm_door", PALM_SET, 200, OAK_DOOR);
    public static final Block PALM_TRAPDOOR = registerTrapdoorBlock("palm_trapdoor", PALM_SET, 300, OAK_TRAPDOOR);
    public static final Block PALM_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm_sign"),
            settings -> new StandingSignBlock(PALM, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.SAND));
    public static final Block PALM_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm_wall_sign"),
            settings -> new WallSignBlock(PALM, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.SAND).overrideLootTable(PALM_SIGN.getLootTable()));
    public static final Block PALM_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm_hanging_sign"),
            settings -> new CeilingHangingSignBlock(PALM, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.SAND));
    public static final Block PALM_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "palm_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(PALM, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.SAND).overrideLootTable(PALM_HANGING_SIGN.getLootTable()));
    public static final Block PALM_SHELF = registerBlock("palm_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.SAND), 300);

    public static final Block MAPLE_LOG = registerBlock("maple_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED), 300);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.RAW_IRON), 300);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED), 300);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.RAW_IRON), 300);
    public static final Block FALLEN_MAPLE_LEAVES = registerBlock("fallen_maple_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(RED_POPLAR_LEAVES).mapColor(MapColor.NETHER).noOcclusion());
    public static final Block MAPLE_HEDGE = registerBlock("maple_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(RED_POPLAR_LEAVES));
    public static final Block MAPLE_SAPLING = registerSaplingBlock("maple_sapling", BFBSaplingGenerators.MAPLE, OAK_SAPLING);
    public static final Block POTTED_MAPLE_SAPLING = registerFlowerPotBlock("potted_maple_sapling", MAPLE_SAPLING, POTTED_OAK_SAPLING);
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.RAW_IRON), 300);
    public static final Block MAPLE_STAIRS = registerStairsBlock("maple_stairs", 300, MAPLE_PLANKS);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.RAW_IRON), 150);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.RAW_IRON), 300);
    public static final Block MAPLE_FENCE_GATE = registerFenceGateBlock("maple_fence_gate", MAPLE, MAPLE_FENCE, 300, MapColor.RAW_IRON);
    public static final Block MAPLE_BUTTON = registerButtonBlock("maple_button", MAPLE_SET, 100, 15, OAK_BUTTON);
    public static final Block MAPLE_PRESSURE_PLATE = registerPressurePlateBlock("maple_pressure_plate", MAPLE_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block MAPLE_DOOR = registerDoorBlock("maple_door", MAPLE_SET, 200, OAK_DOOR);
    public static final Block MAPLE_TRAPDOOR = registerTrapdoorBlock("maple_trapdoor", MAPLE_SET, 300, OAK_TRAPDOOR);
    public static final Block MAPLE_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_sign"),
            settings -> new StandingSignBlock(MAPLE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.RAW_IRON));
    public static final Block MAPLE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_wall_sign"),
            settings -> new WallSignBlock(MAPLE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.RAW_IRON).overrideLootTable(MAPLE_SIGN.getLootTable()));
    public static final Block MAPLE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_hanging_sign"),
            settings -> new CeilingHangingSignBlock(MAPLE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.RAW_IRON));
    public static final Block MAPLE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(MAPLE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.RAW_IRON).overrideLootTable(MAPLE_HANGING_SIGN.getLootTable()));
    public static final Block MAPLE_SHELF = registerBlock("maple_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.RAW_IRON), 300);

    public static final Block BEECH_LOG = registerBlock("beech_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_WHITE), 300);
    public static final Block STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block BEECH_WOOD = registerBlock("beech_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_WHITE), 300);
    public static final Block STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block FALLEN_BEECH_LEAVES = registerBlock("fallen_beech_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(ORANGE_POPLAR_LEAVES).mapColor(MapColor.COLOR_ORANGE).noOcclusion());
    public static final Block BEECH_HEDGE = registerBlock("beech_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(ORANGE_POPLAR_LEAVES));
    public static final Block BEECH_SAPLING = registerSaplingBlock("beech_sapling", BFBSaplingGenerators.BEECH, OAK_SAPLING);
    public static final Block POTTED_BEECH_SAPLING = registerFlowerPotBlock("potted_beech_sapling", BEECH_SAPLING, POTTED_OAK_SAPLING);
    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block BEECH_STAIRS = registerStairsBlock("beech_stairs", 300, BEECH_PLANKS);
    public static final Block BEECH_SLAB = registerBlock("beech_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.COLOR_ORANGE), 150);
    public static final Block BEECH_FENCE = registerBlock("beech_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block BEECH_FENCE_GATE = registerFenceGateBlock("beech_fence_gate", BEECH, BEECH_FENCE, 300, MapColor.COLOR_ORANGE);
    public static final Block BEECH_BUTTON = registerButtonBlock("beech_button", BEECH_SET, 100, 15, OAK_BUTTON);
    public static final Block BEECH_PRESSURE_PLATE = registerPressurePlateBlock("beech_pressure_plate", BEECH_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block BEECH_DOOR = registerDoorBlock("beech_door", BEECH_SET, 200, OAK_DOOR);
    public static final Block BEECH_TRAPDOOR = registerTrapdoorBlock("beech_trapdoor", BEECH_SET, 300, OAK_TRAPDOOR);
    public static final Block BEECH_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_sign"),
            settings -> new StandingSignBlock(BEECH, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.COLOR_ORANGE));
    public static final Block BEECH_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_wall_sign"),
            settings -> new WallSignBlock(BEECH, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.COLOR_ORANGE).overrideLootTable(BEECH_SIGN.getLootTable()));
    public static final Block BEECH_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_hanging_sign"),
            settings -> new CeilingHangingSignBlock(BEECH, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.COLOR_ORANGE));
    public static final Block BEECH_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(BEECH, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.COLOR_ORANGE).overrideLootTable(BEECH_HANGING_SIGN.getLootTable()));
    public static final Block BEECH_SHELF = registerBlock("beech_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.COLOR_ORANGE), 300);

    public static final Block PINE_LOG = registerBlock("pine_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED), 300);
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_RED), 300);
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block PINE_LEAVES = registerNoParticleLeafBlock("pine_leaves", Blocks.SPRUCE_LEAVES, MapColor.TERRACOTTA_GREEN);
    public static final Block FALLEN_PINE_LEAVES = registerBlock("fallen_pine_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(PINE_LEAVES).mapColor(MapColor.TERRACOTTA_GREEN).noOcclusion());
    public static final Block PINE_HEDGE = registerBlock("pine_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(PINE_LEAVES));
    public static final Block PINE_SAPLING = registerSaplingBlock("pine_sapling", BFBSaplingGenerators.PINE, OAK_SAPLING);
    public static final Block POTTED_PINE_SAPLING = registerFlowerPotBlock("potted_pine_sapling", PINE_SAPLING, POTTED_OAK_SAPLING);
    public static final Block PINE_PLANKS = registerBlock("pine_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block PINE_STAIRS = registerStairsBlock("pine_stairs", 300, PINE_PLANKS);
    public static final Block PINE_SLAB = registerBlock("pine_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.TERRACOTTA_BROWN), 150);
    public static final Block PINE_FENCE = registerBlock("pine_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block PINE_FENCE_GATE = registerFenceGateBlock("pine_fence_gate", PINE, PINE_FENCE, 300, MapColor.TERRACOTTA_BROWN);
    public static final Block PINE_BUTTON = registerButtonBlock("pine_button", PINE_SET, 100, 15, OAK_BUTTON);
    public static final Block PINE_PRESSURE_PLATE = registerPressurePlateBlock("pine_pressure_plate", PINE_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block PINE_DOOR = registerDoorBlock("pine_door", PINE_SET, 200, OAK_DOOR);
    public static final Block PINE_TRAPDOOR = registerTrapdoorBlock("pine_trapdoor", PINE_SET, 300, OAK_TRAPDOOR);
    public static final Block PINE_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine_sign"),
            settings -> new StandingSignBlock(PINE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine_wall_sign"),
            settings -> new WallSignBlock(PINE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.TERRACOTTA_BROWN).overrideLootTable(PINE_SIGN.getLootTable()));
    public static final Block PINE_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine_hanging_sign"),
            settings -> new CeilingHangingSignBlock(PINE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BROWN));
    public static final Block PINE_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pine_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(PINE, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BROWN).overrideLootTable(PINE_HANGING_SIGN.getLootTable()));
    public static final Block PINE_SHELF = registerBlock("pine_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.TERRACOTTA_BROWN), 300);

    public static final Block CEDAR_LOG = registerBlock("cedar_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_LIGHT_GRAY), 300);
    public static final Block STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOD), 300);
    public static final Block CEDAR_WOOD = registerBlock("cedar_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.COLOR_LIGHT_GRAY), 300);
    public static final Block STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LOG).mapColor(MapColor.WOOD), 300);
    public static final Block CEDAR_LEAVES = registerNoParticleLeafBlock("cedar_leaves", Blocks.OAK_LEAVES, MapColor.byId(7));
    public static final Block FALLEN_CEDAR_LEAVES = registerBlock("fallen_cedar_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(CEDAR_LEAVES).mapColor(MapColor.WOOD).noOcclusion());
    public static final Block CEDAR_HEDGE = registerBlock("cedar_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(CEDAR_LEAVES));
    public static final Block CEDAR_SAPLING = registerSaplingBlock("cedar_sapling", BFBSaplingGenerators.CEDAR, OAK_SAPLING);
    public static final Block POTTED_CEDAR_SAPLING = registerFlowerPotBlock("potted_cedar_sapling", CEDAR_SAPLING, POTTED_OAK_SAPLING);
    public static final Block CEDAR_PLANKS = registerBlock("cedar_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD), 300);
    public static final Block CEDAR_STAIRS = registerStairsBlock("cedar_stairs", 300, CEDAR_PLANKS);
    public static final Block CEDAR_SLAB = registerBlock("cedar_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB).mapColor(MapColor.WOOD), 150);
    public static final Block CEDAR_FENCE = registerBlock("cedar_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE).mapColor(MapColor.WOOD), 300);
    public static final Block CEDAR_FENCE_GATE = registerFenceGateBlock("cedar_fence_gate", CEDAR, CEDAR_FENCE, 300, MapColor.WOOD);
    public static final Block CEDAR_BUTTON = registerButtonBlock("cedar_button", CEDAR_SET, 100, 15, OAK_BUTTON);
    public static final Block CEDAR_PRESSURE_PLATE = registerPressurePlateBlock("cedar_pressure_plate", CEDAR_SET, 300, OAK_PRESSURE_PLATE);
    public static final Block CEDAR_DOOR = registerDoorBlock("cedar_door", CEDAR_SET, 200, OAK_DOOR);
    public static final Block CEDAR_TRAPDOOR = registerTrapdoorBlock("cedar_trapdoor", CEDAR_SET, 300, OAK_TRAPDOOR);
    public static final Block CEDAR_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar_sign"),
            settings -> new StandingSignBlock(CEDAR, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.WOOD));
    public static final Block CEDAR_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar_wall_sign"),
            settings -> new WallSignBlock(CEDAR, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.WOOD).overrideLootTable(CEDAR_SIGN.getLootTable()));
    public static final Block CEDAR_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar_hanging_sign"),
            settings -> new CeilingHangingSignBlock(CEDAR, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.WOOD));
    public static final Block CEDAR_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "cedar_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(CEDAR, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_HANGING_SIGN).mapColor(MapColor.WOOD).overrideLootTable(CEDAR_HANGING_SIGN.getLootTable()));
    public static final Block CEDAR_SHELF = registerBlock("cedar_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF).mapColor(MapColor.WOOD), 300);

    public static final Block GREEN_BAMBOO_PLANKS = registerBlock("green_bamboo_planks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_BAMBOO_STAIRS = registerStairsBlock("green_bamboo_stairs", 300, GREEN_BAMBOO_PLANKS);
    public static final Block GREEN_BAMBOO_SLAB = registerBlock("green_bamboo_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SLAB).mapColor(MapColor.PLANT), 150);
    public static final Block GREEN_BAMBOO_FENCE = registerBlock("green_bamboo_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_FENCE).mapColor(MapColor.PLANT), 300);
    public static final Block GREEN_BAMBOO_FENCE_GATE = registerFenceGateBlock("green_bamboo_fence_gate", GREEN_BAMBOO, GREEN_BAMBOO_FENCE, 300, MapColor.PLANT);
    public static final Block GREEN_BAMBOO_BUTTON = registerButtonBlock("green_bamboo_button", GREEN_BAMBOO_SET, 100, 15, BAMBOO_BUTTON);
    public static final Block GREEN_BAMBOO_PRESSURE_PLATE = registerPressurePlateBlock("green_bamboo_pressure_plate", GREEN_BAMBOO_SET, 300, BAMBOO_PRESSURE_PLATE);
    public static final Block GREEN_BAMBOO_DOOR = registerDoorBlock("green_bamboo_door", GREEN_BAMBOO_SET, 200, BAMBOO_DOOR);
    public static final Block GREEN_BAMBOO_TRAPDOOR = registerTrapdoorBlock("green_bamboo_trapdoor", GREEN_BAMBOO_SET, 300, BAMBOO_TRAPDOOR);
    public static final Block GREEN_BAMBOO_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo_sign"),
            settings -> new StandingSignBlock(GREEN_BAMBOO, settings), BlockBehaviour.Properties.ofFullCopy(OAK_SIGN).mapColor(MapColor.PLANT));
    public static final Block GREEN_BAMBOO_WALL_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo_wall_sign"),
            settings -> new WallSignBlock(GREEN_BAMBOO, settings), BlockBehaviour.Properties.ofFullCopy(OAK_WALL_SIGN).mapColor(MapColor.PLANT).overrideLootTable(GREEN_BAMBOO_SIGN.getLootTable()));
    public static final Block GREEN_BAMBOO_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo_hanging_sign"),
            settings -> new CeilingHangingSignBlock(GREEN_BAMBOO, settings), BlockBehaviour.Properties.ofFullCopy(OAK_HANGING_SIGN).mapColor(MapColor.PLANT));
    public static final Block GREEN_BAMBOO_WALL_HANGING_SIGN = SignBlockHelper.registerSignBlock(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "green_bamboo_wall_hanging_sign"),
            settings -> new WallHangingSignBlock(GREEN_BAMBOO, settings), BlockBehaviour.Properties.ofFullCopy(BAMBOO_WALL_HANGING_SIGN).mapColor(MapColor.PLANT).overrideLootTable(GREEN_BAMBOO_HANGING_SIGN.getLootTable()));
    public static final Block GREEN_BAMBOO_SHELF = registerBlock("green_bamboo_shelf",
            ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_SHELF).mapColor(MapColor.PLANT), 300);

    public static final Block GOLD_ACACIA_LEAVES = registerLeafBlock("gold_acacia_leaves", 0.02f, BFBParticleTypes.GOLD_ACACIA_LEAVES, Blocks.ACACIA_LEAVES, MapColor.TERRACOTTA_YELLOW);
    public static final Block FALLEN_GOLD_ACACIA_LEAVES = registerBlock("fallen_gold_acacia_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(GOLD_ACACIA_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW).noOcclusion());
    public static final Block GOLD_ACACIA_HEDGE = registerBlock("gold_acacia_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(GOLD_ACACIA_LEAVES));
    public static final Block GOLD_ACACIA_SAPLING = registerSaplingBlock("gold_acacia_sapling", BFBSaplingGenerators.GOLD_ACACIA, ACACIA_SAPLING);
    public static final Block POTTED_GOLD_ACACIA_SAPLING = registerFlowerPotBlock("potted_gold_acacia_sapling", GOLD_ACACIA_SAPLING, POTTED_ACACIA_SAPLING);


    public static final Block FALLEN_OAK_LEAVES = registerBlock("fallen_oak_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LEAVES).noOcclusion());
    public static final Block FALLEN_BIRCH_LEAVES = registerBlock("fallen_birch_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LEAVES).noOcclusion());
    public static final Block FALLEN_SPRUCE_LEAVES = registerBlock("fallen_spruce_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LEAVES).noOcclusion());
    public static final Block FALLEN_JUNGLE_LEAVES = registerBlock("fallen_jungle_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LEAVES).noOcclusion());
    public static final Block FALLEN_DARK_OAK_LEAVES = registerBlock("fallen_dark_oak_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(DARK_OAK_LEAVES).noOcclusion());
    public static final Block FALLEN_ACACIA_LEAVES = registerBlock("fallen_acacia_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(ACACIA_LEAVES).noOcclusion());
    public static final Block FALLEN_AZALEA_LEAVES = registerBlock("fallen_azalea_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(AZALEA_LEAVES).noOcclusion());
    public static final Block FALLEN_FLOWERING_AZALEA_LEAVES = registerBlock("fallen_flowering_azalea_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES).noOcclusion());
    public static final Block FALLEN_MANGROVE_LEAVES = registerBlock("fallen_mangrove_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(MANGROVE_LEAVES).noOcclusion());
    public static final Block FALLEN_CHERRY_LEAVES = registerBlock("fallen_cherry_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(CHERRY_LEAVES).noOcclusion());
    public static final Block FALLEN_PALE_OAK_LEAVES = registerBlock("fallen_pale_oak_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(PALE_OAK_LEAVES).noOcclusion());
    public static final Block FALLEN_POPLAR_LEAVES = registerBlock("fallen_poplar_leaves", ContextIntProviders.COMPOSTABLE_LOW,
            FallenLeavesBlock::new, BlockBehaviour.Properties.ofFullCopy(YELLOW_POPLAR_LEAVES).mapColor(MapColor.COLOR_YELLOW).noOcclusion());

    public static final Block OAK_HEDGE = registerBlock("oak_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(OAK_LEAVES));
    public static final Block BIRCH_HEDGE = registerBlock("birch_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(BIRCH_LEAVES));
    public static final Block SPRUCE_HEDGE = registerBlock("spruce_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(SPRUCE_LEAVES));
    public static final Block JUNGLE_HEDGE = registerBlock("jungle_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(JUNGLE_LEAVES));
    public static final Block ACACIA_HEDGE = registerBlock("acacia_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(ACACIA_LEAVES));
    public static final Block DARK_OAK_HEDGE = registerBlock("dark_oak_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(DARK_OAK_LEAVES));
    public static final Block AZALEA_HEDGE = registerBlock("azalea_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_HEDGE = registerBlock("flowering_azalea_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(FLOWERING_AZALEA_LEAVES));
    public static final Block MANGROVE_HEDGE = registerBlock("mangrove_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(MANGROVE_LEAVES));
    public static final Block CHERRY_HEDGE = registerBlock("cherry_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(CHERRY_LEAVES));
    public static final Block PALE_OAK_HEDGE = registerBlock("pale_oak_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(PALE_OAK_LEAVES));
    public static final Block POPLAR_HEDGE = registerBlock("poplar_hedge", ContextIntProviders.COMPOSTABLE_LOW,
            HedgeBlock::new, BlockBehaviour.Properties.ofFullCopy(YELLOW_POPLAR_LEAVES));
   
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.SAND), 300);
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.PODZOL), 300);
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.CRIMSON_STEM), 300);
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_BROWN), 300);
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_RED), 300);
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.WARPED_STEM), 300);
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.NETHER), 300);
    public static final Block CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_PINK), 300);
    public static final Block BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.SAND), 300);
    public static final Block PALE_OAK_BOOKSHELF = registerBlock("pale_oak_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.SAND), 300);
    public static final Block POPLAR_BOOKSHELF = registerBlock("poplar_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_LIGHT_GRAY), 300);
    public static final Block GREEN_JUNGLE_BOOKSHELF = registerBlock("green_jungle_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.PLANT), 300);
    public static final Block GHOSTWOOD_BOOKSHELF = registerBlock("ghostwood_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.WOOL), 300);
    public static final Block SCORCHWOOD_BOOKSHELF = registerBlock("scorchwood_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_BLACK), 300);
    public static final Block WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.GRASS), 300);
    public static final Block PALM_BOOKSHELF = registerBlock("palm_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.SAND), 300);
    public static final Block MAPLE_BOOKSHELF = registerBlock("maple_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.RAW_IRON), 300);
    public static final Block BEECH_BOOKSHELF = registerBlock("beech_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.COLOR_ORANGE), 300);
    public static final Block PINE_BOOKSHELF = registerBlock("pine_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block CEDAR_BOOKSHELF = registerBlock("cedar_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.TERRACOTTA_BROWN), 300);
    public static final Block GREEN_BAMBOO_BOOKSHELF = registerBlock("green_bamboo_bookshelf",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BOOKSHELF).mapColor(MapColor.PLANT), 300);
   
    public static final Block HAY_STAIRS = registerStairsBlock("hay_stairs", HAY_BLOCK, ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH);
    public static final Block HAY_SLAB = registerBlock("hay_slab", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            PillarSlab::new, BlockBehaviour.Properties.ofFullCopy(HAY_BLOCK).mapColor(MapColor.COLOR_YELLOW));
    public static final Block HAY_RUG = registerBlock("hay_rug", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            DirectionalCarpet::new, BlockBehaviour.Properties.ofFullCopy(HAY_BLOCK).mapColor(MapColor.COLOR_YELLOW));
   
    public static final Block SMOOTH_STONE_STAIRS = registerStairsBlock("smooth_stone_stairs", SMOOTH_STONE);
    public static final Block SMOOTH_STONE_WALL = registerBlock("smooth_stone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE));
    public static final Block CRACKED_SMOOTH_STONE_BRICKS = registerBlock("cracked_smooth_stone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICK_STAIRS = registerStairsBlock("smooth_stone_brick_stairs", SMOOTH_STONE);
    public static final Block SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE));
    public static final Block SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_stone_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_STONE));

    public static final Block BLACK_NETHER_BRICKS = registerBlock("black_nether_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(NETHER_BRICKS).mapColor(MapColor.COLOR_BLACK));
    public static final Block CHISELED_BLACK_NETHER_BRICKS = registerBlock("chiseled_black_nether_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_NETHER_BRICKS).mapColor(MapColor.COLOR_BLACK));
    public static final Block CRACKED_BLACK_NETHER_BRICKS = registerBlock("cracked_black_nether_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CRACKED_NETHER_BRICKS).mapColor(MapColor.COLOR_BLACK));
    public static final Block BLACK_NETHER_BRICK_STAIRS = registerStairsBlock("black_nether_brick_stairs", BLACK_NETHER_BRICKS);
    public static final Block BLACK_NETHER_BRICK_SLAB = registerBlock("black_nether_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_SLAB).mapColor(MapColor.COLOR_BLACK));
    public static final Block BLACK_NETHER_BRICK_WALL = registerBlock("black_nether_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_WALL).mapColor(MapColor.COLOR_BLACK));
    public static final Block BLACK_NETHER_BRICK_FENCE = registerBlock("black_nether_brick_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.COLOR_BLACK));
    public static final Block BLACK_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("black_nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.COLOR_BLACK);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_NETHER_BRICKS).mapColor(MapColor.COLOR_RED));
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CRACKED_NETHER_BRICKS).mapColor(MapColor.COLOR_RED));
    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("red_nether_brick_fence",
            FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICK_FENCE).mapColor(MapColor.COLOR_RED));
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("red_nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.COLOR_RED);
    public static final Block NETHER_BRICK_FENCE_GATE = registerFenceGateBlock("nether_brick_fence_gate", WoodType.OAK, NETHER_BRICK_FENCE, MapColor.NETHER);
  
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK).mapColor(MapColor.QUARTZ));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS).mapColor(MapColor.QUARTZ));
    public static final Block QUARTZ_BRICK_STAIRS = registerStairsBlock("quartz_brick_stairs", QUARTZ_BRICKS);
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            DirectionalSlab::new, BlockBehaviour.Properties.ofFullCopy(QUARTZ_SLAB).mapColor(MapColor.QUARTZ));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ).mapColor(MapColor.QUARTZ));

    public static final Block GRIMSTONE = registerBlock("grimstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_STAIRS = registerStairsBlock("grimstone_stairs", GRIMSTONE);
    public static final Block GRIMSTONE_SLAB = registerBlock("grimstone_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_WALL = registerBlock("grimstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block CHISELED_GRIMSTONE = registerBlock("chiseled_grimstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE = registerBlock("polished_grimstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE_STAIRS = registerStairsBlock("polished_grimstone_stairs", POLISHED_GRIMSTONE);
    public static final Block POLISHED_GRIMSTONE_SLAB = registerBlock("polished_grimstone_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block POLISHED_GRIMSTONE_WALL = registerBlock("polished_grimstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DEEPSLATE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICKS = registerBlock("grimstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block CRACKED_GRIMSTONE_BRICKS = registerBlock("cracked_grimstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CRACKED_DEEPSLATE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_STAIRS = registerStairsBlock("grimstone_brick_stairs", GRIMSTONE_BRICKS);
    public static final Block GRIMSTONE_BRICK_SLAB = registerBlock("grimstone_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_BRICK_WALL = registerBlock("grimstone_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILES = registerBlock("grimstone_tiles",
            DirectionalBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block CRACKED_GRIMSTONE_TILES = registerBlock("cracked_grimstone_tiles",
            DirectionalBlock::new, BlockBehaviour.Properties.ofFullCopy(CRACKED_DEEPSLATE_TILES).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_STAIRS = registerStairsBlock("grimstone_tile_stairs", GRIMSTONE_TILES);
    public static final Block GRIMSTONE_TILE_SLAB = registerBlock("grimstone_tile_slab",
            PillarSlab::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final Block GRIMSTONE_TILE_WALL = registerBlock("grimstone_tile_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(DEEPSLATE_TILE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE));

    public static final Block ANTIGORITE = registerBlock("antigorite",
            Block::new, BlockBehaviour.Properties.ofFullCopy(ANDESITE).mapColor(MapColor.COLOR_GREEN));
    public static final Block ANTIGORITE_STAIRS = registerStairsBlock("antigorite_stairs", ANTIGORITE);
    public static final Block ANTIGORITE_SLAB = registerBlock("antigorite_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(ANDESITE_SLAB).mapColor(MapColor.COLOR_GREEN));
    public static final Block ANTIGORITE_WALL = registerBlock("antigorite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(ANDESITE_WALL).mapColor(MapColor.COLOR_GREEN));
    public static final Block POLISHED_ANTIGORITE = registerBlock("polished_antigorite",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE).mapColor(MapColor.COLOR_GREEN));
    public static final Block POLISHED_ANTIGORITE_STAIRS = registerStairsBlock("polished_antigorite_stairs", POLISHED_ANTIGORITE);
    public static final Block POLISHED_ANTIGORITE_SLAB = registerBlock("polished_antigorite_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE_SLAB).mapColor(MapColor.COLOR_GREEN));
    public static final Block POLISHED_ANTIGORITE_WALL = registerBlock("polished_antigorite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE).mapColor(MapColor.COLOR_GREEN));
    public static final Block ANTIGORITE_BRICKS = registerBlock("antigorite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANTIGORITE));
    public static final Block ANTIGORITE_BRICK_STAIRS = registerStairsBlock("antigorite_brick_stairs", POLISHED_ANTIGORITE_STAIRS);
    public static final Block ANTIGORITE_BRICK_SLAB = registerBlock("antigorite_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANTIGORITE_SLAB));
    public static final Block ANTIGORITE_BRICK_WALL = registerBlock("antigorite_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANTIGORITE_WALL));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE));
    public static final Block GRANITE_BRICK_STAIRS = registerStairsBlock("granite_brick_stairs", POLISHED_GRANITE_STAIRS);
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE_SLAB));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_GRANITE_WALL));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE));
    public static final Block DIORITE_BRICK_STAIRS = registerStairsBlock("diorite_brick_stairs", POLISHED_DIORITE_STAIRS);
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE_SLAB));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_DIORITE_WALL));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE));
    public static final Block ANDESITE_BRICK_STAIRS = registerStairsBlock("andesite_brick_stairs", POLISHED_ANDESITE_STAIRS);
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE_SLAB));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_ANDESITE_WALL));

    public static final Block LIGHT_TUFF = registerBlock("light_tuff",
            Block::new, BlockBehaviour.Properties.ofFullCopy(TUFF).mapColor(MapColor.GLOW_LICHEN));
    public static final Block LIGHT_TUFF_STAIRS = registerStairsBlock("light_tuff_stairs", TUFF_STAIRS, MapColor.GLOW_LICHEN);
    public static final Block LIGHT_TUFF_SLAB = registerBlock("light_tuff_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_SLAB).mapColor(MapColor.GLOW_LICHEN));
    public static final Block LIGHT_TUFF_WALL = registerBlock("light_tuff_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_WALL).mapColor(MapColor.GLOW_LICHEN));
    public static final Block CHISELED_LIGHT_TUFF = registerBlock("chiseled_light_tuff",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_TUFF).mapColor(MapColor.GLOW_LICHEN));
    public static final Block POLISHED_LIGHT_TUFF = registerBlock("polished_light_tuff",
            Block::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF).mapColor(MapColor.GLOW_LICHEN));
    public static final Block POLISHED_LIGHT_TUFF_STAIRS = registerStairsBlock("polished_light_tuff_stairs", POLISHED_TUFF, MapColor.GLOW_LICHEN);
    public static final Block POLISHED_LIGHT_TUFF_SLAB = registerBlock("polished_light_tuff_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_SLAB).mapColor(MapColor.GLOW_LICHEN));
    public static final Block POLISHED_LIGHT_TUFF_WALL = registerBlock("polished_light_tuff_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(POLISHED_TUFF_WALL).mapColor(MapColor.GLOW_LICHEN));
    public static final Block LIGHT_TUFF_BRICKS = registerBlock("light_tuff_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(TUFF_BRICKS).mapColor(MapColor.GLOW_LICHEN));
    public static final Block LIGHT_TUFF_BRICK_STAIRS = registerStairsBlock("light_tuff_brick_stairs", TUFF_BRICK_STAIRS, MapColor.GLOW_LICHEN);
    public static final Block LIGHT_TUFF_BRICK_SLAB = registerBlock("light_tuff_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_BRICK_SLAB).mapColor(MapColor.GLOW_LICHEN));
    public static final Block LIGHT_TUFF_BRICK_WALL = registerBlock("light_tuff_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(TUFF_BRICK_WALL).mapColor(MapColor.GLOW_LICHEN));
    public static final Block CHISELED_LIGHT_TUFF_BRICKS = registerBlock("chiseled_light_tuff_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_TUFF_BRICKS).mapColor(MapColor.GLOW_LICHEN));

    public static final Block CALCITE_STAIRS = registerStairsBlock("calcite_stairs", CALCITE);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block POLISHED_CALCITE_STAIRS = registerStairsBlock("polished_calcite_stairs", CALCITE);
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block CALCITE_BRICK_STAIRS = registerStairsBlock("calcite_brick_stairs", CALCITE);
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(CALCITE));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_SANDSTONE));
    public static final Block CUT_SANDSTONE_STAIRS = registerStairsBlock("cut_sandstone_stairs", CUT_SANDSTONE);
    public static final Block CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE));
    public static final Block SANDSTONE_BRICK_STAIRS = registerStairsBlock("sandstone_brick_stairs", SANDSTONE_STAIRS);
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE_SLAB));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SANDSTONE_WALL));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_RED_SANDSTONE));
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairsBlock("cut_red_sandstone_stairs", CUT_RED_SANDSTONE);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerStairsBlock("red_sandstone_brick_stairs", RED_SANDSTONE_STAIRS);
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CUT_RED_SANDSTONE_SLAB));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(RED_SANDSTONE_WALL));

    public static final Block DARK_SAND = registerBlock("dark_sand", settings -> new SandBlock(new ColorRGBA(14406560), settings),
            BlockBehaviour.Properties.ofFullCopy(SAND).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE = registerBlock("dark_sandstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(SANDSTONE).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE_STAIRS = registerStairsBlock("dark_sandstone_stairs", SANDSTONE_STAIRS, MapColor.WOOD);
    public static final Block DARK_SANDSTONE_SLAB = registerBlock("dark_sandstone_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(SANDSTONE_SLAB).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE_WALL = registerBlock("dark_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(SANDSTONE_WALL).mapColor(MapColor.WOOD));
    public static final Block CHISELED_DARK_SANDSTONE = registerBlock("chiseled_dark_sandstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CHISELED_SANDSTONE).mapColor(MapColor.WOOD));
    public static final Block SMOOTH_DARK_SANDSTONE = registerBlock("smooth_dark_sandstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_SANDSTONE).mapColor(MapColor.WOOD));
    public static final Block SMOOTH_DARK_SANDSTONE_STAIRS = registerStairsBlock("smooth_dark_sandstone_stairs", SMOOTH_SANDSTONE_STAIRS, MapColor.WOOD);
    public static final Block SMOOTH_DARK_SANDSTONE_SLAB = registerBlock("smooth_dark_sandstone_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(SMOOTH_SANDSTONE_SLAB).mapColor(MapColor.WOOD));
    public static final Block SMOOTH_DARK_SANDSTONE_WALL = registerBlock("smooth_dark_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL).mapColor(MapColor.WOOD));
    public static final Block CUT_DARK_SANDSTONE = registerBlock("cut_dark_sandstone",
            Block::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE).mapColor(MapColor.WOOD));
    public static final Block CUT_DARK_SANDSTONE_STAIRS = registerStairsBlock("cut_dark_sandstone_stairs", BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, MapColor.WOOD);
    public static final Block CUT_DARK_SANDSTONE_SLAB = registerBlock("cut_dark_sandstone_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(CUT_SANDSTONE_SLAB).mapColor(MapColor.WOOD));
    public static final Block CUT_DARK_SANDSTONE_WALL = registerBlock("cut_dark_sandstone_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(BlocksForBuildersBlocks.CUT_SANDSTONE_WALL).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE_BRICKS = registerBlock("dark_sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BlocksForBuildersBlocks.SANDSTONE_BRICKS).mapColor(MapColor.WOOD));
    public static final Block CRACKED_DARK_SANDSTONE_BRICKS = registerBlock("cracked_dark_sandstone_bricks",
            Block::new, BlockBehaviour.Properties.ofFullCopy(BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE_BRICK_STAIRS = registerStairsBlock("dark_sandstone_brick_stairs", SANDSTONE_BRICK_STAIRS, MapColor.WOOD);
    public static final Block DARK_SANDSTONE_BRICK_SLAB = registerBlock("dark_sandstone_brick_slab",
            SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(SANDSTONE_BRICK_SLAB).mapColor(MapColor.WOOD));
    public static final Block DARK_SANDSTONE_BRICK_WALL = registerBlock("dark_sandstone_brick_wall",
            WallBlock::new, BlockBehaviour.Properties.ofFullCopy(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL).mapColor(MapColor.WOOD));

    public static final Block BAMBOO_MOSAIC_RUG = registerBlock("bamboo_mosaic_rug",
            CarpetBlock::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_MOSAIC));
    public static final Block BAMBOO_THATCH = registerBlock("bamboo_thatch",
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(HAY_BLOCK));
    public static final Block BAMBOO_THATCH_STAIRS = registerStairsBlock("bamboo_thatch_stairs", BAMBOO_THATCH, ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH);
    public static final Block BAMBOO_THATCH_SLAB = registerBlock("bamboo_thatch_slab", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            PillarSlab::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_THATCH));
    public static final Block BAMBOO_THATCH_RUG = registerBlock("bamboo_thatch_rug", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            DirectionalCarpet::new, BlockBehaviour.Properties.ofFullCopy(BAMBOO_THATCH));

    public static final Block COCONUT_THATCH = registerBlock("coconut_thatch", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(HAY_BLOCK));
    public static final Block COCONUT_THATCH_STAIRS = registerStairsBlock("coconut_thatch_stairs", COCONUT_THATCH, ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH);
    public static final Block COCONUT_THATCH_SLAB = registerBlock("coconut_thatch_slab", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            PillarSlab::new, BlockBehaviour.Properties.ofFullCopy(COCONUT_THATCH));
    public static final Block COCONUT_THATCH_RUG = registerBlock("coconut_thatch_rug", ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH,
            DirectionalCarpet::new, BlockBehaviour.Properties.ofFullCopy(COCONUT_THATCH));

    public static final Block SCORCHED_GRASS = registerBlock("scorched_grass", settings -> new ScorchedGrassBlock(BlocksForBuildersPlacedFeatures.SCORCHWOOD_SAPLING_PLACED_KEY, settings),
            BlockBehaviour.Properties.ofFullCopy(DIRT).mapColor(MapColor.TERRACOTTA_GRAY));
    public static final Block ASHEN_CARPET = registerBlock("ashen_carpet", ContextIntProviders.COMPOSTABLE_LOW,
            CarpetBlock::new, BlockBehaviour.Properties.ofFullCopy(MOSS_CARPET).sound(SoundType.GRASS).mapColor(MapColor.TERRACOTTA_BLACK));

    public static final Block HUMUS_GRASS = registerBlock("humus_grass", GrassBlock::new,
            BlockBehaviour.Properties.ofFullCopy(GRASS_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return registerBlock(name, true, factory, settings);
    }
    private static Block registerBlock(String name, ResourceKey<ContextIntProvider> compostConstant, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return registerBlock(name, compostConstant, true, factory, settings);
    }
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, int fuelConstant) {
        return registerBlock(name, true, fuelConstant, factory, settings);
    }
    private static Block registerBlock(String name, ResourceKey<ContextIntProvider> compostConstant, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, int fuelConstant) {
        return registerBlock(name, compostConstant, true, fuelConstant, factory, settings);
    }
    private static Block registerBlock(String name, boolean createItem, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block); }
        return block;
    }
    private static Block registerBlock(String name, ResourceKey<ContextIntProvider> compostConstant, boolean createItem, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, compostConstant, block); }
        return block;
    }
    private static Block registerBlock(String name, boolean createItem, int fuelConstant, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, block, fuelConstant); }
        return block;
    }
    private static Block registerBlock(String name, ResourceKey<ContextIntProvider> compostConstant, boolean createItem, int fuelConstant, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = Blocks.register(keyOf(name), factory, settings);
        if (createItem) { registerBlockItem(name, compostConstant, block, fuelConstant); }
        return block;
    }
    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }
    private static Block registerLeafBlock(String name, float particleChance, ParticleOptions particleEffect, Block base, MapColor mapColor) {
        return registerBlock(name, ContextIntProviders.COMPOSTABLE_LOW, settings -> new UntintedParticleLeavesBlock(particleChance, particleEffect, AmbientLeavesBlockSoundPlayer.noAmbientSound(), settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(mapColor));
    }
    private static Block registerNoParticleLeafBlock(String name, Block base, MapColor mapColor) {
        return registerBlock(name, settings -> new LeavesBlock(AmbientLeavesBlockSoundPlayer.noAmbientSound(), settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(mapColor));
    }
    private static Block registerStairsBlock(String name, Block base) {
        return registerStairsBlock(name, base, base.defaultMapColor());
    }
    private static Block registerStairsBlock(String name, Block base, ResourceKey<ContextIntProvider> compostConstant) {
        return registerStairsBlock(name, base, base.defaultMapColor(), compostConstant);
    }
    private static Block registerStairsBlock(String name, int fuelConstant, Block base) {
        return registerStairsBlock(name, fuelConstant, base, base.defaultMapColor());
    }
    private static Block registerStairsBlock(String name, Block base, MapColor color) {
        return registerBlock(name, settings -> new StairBlock(base.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(color));
    }
    private static Block registerStairsBlock(String name, int fuelConstant, Block base, MapColor color) {
        return registerBlock(name, settings -> new StairBlock(base.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(color), fuelConstant);
    }
    private static Block registerStairsBlock(String name, Block base, MapColor color, ResourceKey<ContextIntProvider> compostConstant) {
        return registerBlock(name, compostConstant, settings -> new StairBlock(base.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(color));
    }
    private static Block registerDoorBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new DoorBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerDoorBlock(String name, BlockSetType woodType, int fuelConstant, Block base) {
        return registerBlock(name, settings -> new DoorBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base), fuelConstant);
    }
    private static Block registerTrapdoorBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new TrapDoorBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerTrapdoorBlock(String name, BlockSetType woodType, int fuelConstant, Block base) {
        return registerBlock(name, settings -> new TrapDoorBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base), fuelConstant);
    }
    private static Block registerFenceGateBlock(String name, WoodType woodType, Block base, MapColor color) {
        return registerBlock(name, settings -> new FenceGateBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(color));
    }
    private static Block registerFenceGateBlock(String name, WoodType woodType, Block base, int fuelConstant, MapColor color) {
        return registerBlock(name, settings -> new FenceGateBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base).mapColor(color), fuelConstant);
    }
    private static Block registerButtonBlock(String name, BlockSetType woodType, int duration, Block base) {
        return registerBlock(name, settings -> new ButtonBlock(woodType, duration, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerButtonBlock(String name, BlockSetType woodType, int fuelConstant, int duration, Block base) {
        return registerBlock(name, settings -> new ButtonBlock(woodType, duration, settings), BlockBehaviour.Properties.ofFullCopy(base), fuelConstant);
    }
    private static Block registerPressurePlateBlock(String name, BlockSetType woodType, Block base) {
        return registerBlock(name, settings -> new PressurePlateBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerPressurePlateBlock(String name, BlockSetType woodType, int fuelConstant, Block base) {
        return registerBlock(name, settings -> new PressurePlateBlock(woodType, settings), BlockBehaviour.Properties.ofFullCopy(base), fuelConstant);
    }
    private static Block registerFlowerPotBlock(String name, Block content, Block base) {
        return registerBlock(name, false, settings -> new FlowerPotBlock(content, settings), BlockBehaviour.Properties.ofFullCopy(base));
    }
    private static Block registerSaplingBlock(String name, TreeGrower generator, Block base) {
        return registerBlock(name, ContextIntProviders.COMPOSTABLE_LOW, settings -> new SaplingBlock(generator, settings), BlockBehaviour.Properties.ofFullCopy(base), 100);
    }
    private static Block registerCoconutBlock(String name, MapColor mapColor) {
        return registerBlock(name, false,settings -> new CoconutBlock(BFBSaplingGenerators.PALM, settings), BlockBehaviour.Properties.of().mapColor(mapColor).randomTicks().instabreak().sound(SoundType.BAMBOO).pushReaction(PushReaction.POPPED));
    }
    private static void registerBlockItem(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties().useBlockDescriptionPrefix().setId(key)));
    }
    private static void registerBlockItem(String name,  ResourceKey<ContextIntProvider> constant, Block block) {
        registerCompostableBlockItem(name, block, constant);
    }
    private static void registerBlockItem(String name, Block block, int fuelInt) {
        registerFuelBlockItem(name, block, fuelInt);
    }
    private static void registerBlockItem(String name, ResourceKey<ContextIntProvider> compostConstant, Block block, int fuelInt) {
        registerCompostableFuelBlockItem(name, block, compostConstant, fuelInt);
    }
    private static void registerCompostableBlockItem(String name, Block block, ResourceKey<ContextIntProvider> compostConstant) {
        Identifier id = Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties().compostable(compostConstant).useBlockDescriptionPrefix().setId(key)));
    }
    private static void registerFuelBlockItem(String name, Block block, int constant) {
        Identifier id = Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties()
                .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(constant), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))
                .useBlockDescriptionPrefix().setId(key)));
    }
    private static void registerCompostableFuelBlockItem(String name, Block block, ResourceKey<ContextIntProvider> compostConstant, int fuelConstant) {
        Identifier id = Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Registry.register(BuiltInRegistries.ITEM, key, new BlockItem(block, new net.minecraft.world.item.Item.Properties()
                .compostable(compostConstant)
                .component(DataComponents.COOKING_FUEL, new CookingFuel(new ResolvableInt.Constant(fuelConstant), ResolvableFloat.fromKey(ContextFloatProviders.COOKING_DEFAULT_SPEED_MULTIPLIER)))
                .useBlockDescriptionPrefix().setId(key)));
    }

    public static ResourceKey<Block> getResourceKey(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        BlocksForBuilders.LOGGER.info("Registering blocks for " + BlocksForBuilders.MOD_ID);
    }
}
