package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.PumpkinPie;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.ConstantTintSource;
import net.minecraft.client.render.model.json.ModelVariant;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import java.util.Optional;

import static net.minecraft.client.data.BlockStateModelGenerator.createSingletonBlockState;
import static net.minecraft.client.data.BlockStateModelGenerator.createWallBlockState;

public class BFBModelProvider extends FabricModelProvider {
    public BFBModelProvider(FabricDataOutput output) {
        super(output);
    }
    ConstantTintSource standardTint = new ConstantTintSource(-12012264);

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ghostwoodTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool scorchwoodTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.WILLOW_PLANKS);
        BlockStateModelGenerator.BlockTexturePool palmTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.PALM_PLANKS);
        BlockStateModelGenerator.BlockTexturePool mapleTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.MAPLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool beechTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.BEECH_PLANKS);
        BlockStateModelGenerator.BlockTexturePool pineTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.PINE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cedarTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.CEDAR_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenJungleTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenBambooTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool blackNetherBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grimstoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GRIMSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedGrimstoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
        BlockStateModelGenerator.BlockTexturePool grimstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool antigoriteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.ANTIGORITE);
        BlockStateModelGenerator.BlockTexturePool polishedAntigoriteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
        BlockStateModelGenerator.BlockTexturePool smoothStoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool sandstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redSandstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkSandstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_HEDGE, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        ghostwoodTexturePool.stairs(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        ghostwoodTexturePool.slab(BlocksForBuildersBlocks.GHOSTWOOD_SLAB);
        ghostwoodTexturePool.fence(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
        ghostwoodTexturePool.fenceGate(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
        ghostwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
        ghostwoodTexturePool.button(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GHOSTWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, BlocksForBuildersBlocks.GHOSTWOOD_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG, BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        scorchwoodTexturePool.stairs(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
        scorchwoodTexturePool.slab(BlocksForBuildersBlocks.SCORCHWOOD_SLAB);
        scorchwoodTexturePool.fence(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
        scorchwoodTexturePool.fenceGate(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
        scorchwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
        scorchwoodTexturePool.button(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.SCORCHWOOD_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, BlocksForBuildersBlocks.SCORCHWOOD_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG, BlocksForBuildersBlocks.SCORCHWOOD_HANGING_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.WILLOW_LOG).log(BlocksForBuildersBlocks.WILLOW_LOG).wood(BlocksForBuildersBlocks.WILLOW_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).log(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).wood(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.WILLOW_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_HEDGE, BlocksForBuildersBlocks.WILLOW_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.WILLOW_SAPLING, BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.CrossType.TINTED);
        willowTexturePool.stairs(BlocksForBuildersBlocks.WILLOW_STAIRS);
        willowTexturePool.slab(BlocksForBuildersBlocks.WILLOW_SLAB);
        willowTexturePool.fence(BlocksForBuildersBlocks.WILLOW_FENCE);
        willowTexturePool.fenceGate(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
        willowTexturePool.pressurePlate(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
        willowTexturePool.button(BlocksForBuildersBlocks.WILLOW_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.WILLOW_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_PLANKS, BlocksForBuildersBlocks.WILLOW_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG, BlocksForBuildersBlocks.WILLOW_HANGING_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_BOOKSHELF, BlocksForBuildersBlocks.WILLOW_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.PALM_LOG).log(BlocksForBuildersBlocks.PALM_LOG).wood(BlocksForBuildersBlocks.PALM_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).log(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.PALM_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.PALM_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_HEDGE, BlocksForBuildersBlocks.PALM_LEAVES);
        registerCoconut(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT, BlocksForBuildersItems.COCONUT, BlocksForBuildersItems.EMPTY_COCONUT, BlocksForBuildersItems.STRIPPED_COCONUT, BlocksForBuildersItems.STRIPPED_EMPTY_COCONUT);
        palmTexturePool.stairs(BlocksForBuildersBlocks.PALM_STAIRS);
        palmTexturePool.slab(BlocksForBuildersBlocks.PALM_SLAB);
        palmTexturePool.fence(BlocksForBuildersBlocks.PALM_FENCE);
        palmTexturePool.fenceGate(BlocksForBuildersBlocks.PALM_FENCE_GATE);
        palmTexturePool.pressurePlate(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE);
        palmTexturePool.button(BlocksForBuildersBlocks.PALM_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.PALM_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.PALM_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_PLANKS, BlocksForBuildersBlocks.PALM_SIGN, BlocksForBuildersBlocks.PALM_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_PALM_LOG, BlocksForBuildersBlocks.PALM_HANGING_SIGN, BlocksForBuildersBlocks.PALM_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_BOOKSHELF, BlocksForBuildersBlocks.PALM_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.MAPLE_LOG).log(BlocksForBuildersBlocks.MAPLE_LOG).wood(BlocksForBuildersBlocks.MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).log(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.MAPLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_HEDGE, BlocksForBuildersBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.MAPLE_SAPLING, BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.CrossType.TINTED);
        mapleTexturePool.stairs(BlocksForBuildersBlocks.MAPLE_STAIRS);
        mapleTexturePool.slab(BlocksForBuildersBlocks.MAPLE_SLAB);
        mapleTexturePool.fence(BlocksForBuildersBlocks.MAPLE_FENCE);
        mapleTexturePool.fenceGate(BlocksForBuildersBlocks.MAPLE_FENCE_GATE);
        mapleTexturePool.pressurePlate(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE);
        mapleTexturePool.button(BlocksForBuildersBlocks.MAPLE_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.MAPLE_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_PLANKS, BlocksForBuildersBlocks.MAPLE_SIGN, BlocksForBuildersBlocks.MAPLE_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG, BlocksForBuildersBlocks.MAPLE_HANGING_SIGN, BlocksForBuildersBlocks.MAPLE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_BOOKSHELF, BlocksForBuildersBlocks.MAPLE_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.BEECH_LOG).log(BlocksForBuildersBlocks.BEECH_LOG).wood(BlocksForBuildersBlocks.BEECH_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).log(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).wood(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.BEECH_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_HEDGE, BlocksForBuildersBlocks.BEECH_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.BEECH_SAPLING, BlocksForBuildersBlocks.POTTED_BEECH_SAPLING, BlockStateModelGenerator.CrossType.TINTED);
        beechTexturePool.stairs(BlocksForBuildersBlocks.BEECH_STAIRS);
        beechTexturePool.slab(BlocksForBuildersBlocks.BEECH_SLAB);
        beechTexturePool.fence(BlocksForBuildersBlocks.BEECH_FENCE);
        beechTexturePool.fenceGate(BlocksForBuildersBlocks.BEECH_FENCE_GATE);
        beechTexturePool.pressurePlate(BlocksForBuildersBlocks.BEECH_PRESSURE_PLATE);
        beechTexturePool.button(BlocksForBuildersBlocks.BEECH_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.BEECH_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.BEECH_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_PLANKS, BlocksForBuildersBlocks.BEECH_SIGN, BlocksForBuildersBlocks.BEECH_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG, BlocksForBuildersBlocks.BEECH_HANGING_SIGN, BlocksForBuildersBlocks.BEECH_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_BOOKSHELF, BlocksForBuildersBlocks.BEECH_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.PINE_LOG).log(BlocksForBuildersBlocks.PINE_LOG).wood(BlocksForBuildersBlocks.PINE_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).log(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.PINE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlocksForBuildersBlocks.PINE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_HEDGE, BlocksForBuildersBlocks.PINE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.PINE_SAPLING, BlocksForBuildersBlocks.POTTED_PINE_SAPLING, BlockStateModelGenerator.CrossType.TINTED);
        pineTexturePool.stairs(BlocksForBuildersBlocks.PINE_STAIRS);
        pineTexturePool.slab(BlocksForBuildersBlocks.PINE_SLAB);
        pineTexturePool.fence(BlocksForBuildersBlocks.PINE_FENCE);
        pineTexturePool.fenceGate(BlocksForBuildersBlocks.PINE_FENCE_GATE);
        pineTexturePool.pressurePlate(BlocksForBuildersBlocks.PINE_PRESSURE_PLATE);
        pineTexturePool.button(BlocksForBuildersBlocks.PINE_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.PINE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.PINE_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_PLANKS, BlocksForBuildersBlocks.PINE_SIGN, BlocksForBuildersBlocks.PINE_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_PINE_LOG, BlocksForBuildersBlocks.PINE_HANGING_SIGN, BlocksForBuildersBlocks.PINE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_BOOKSHELF, BlocksForBuildersBlocks.PINE_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.CEDAR_LOG).log(BlocksForBuildersBlocks.CEDAR_LOG).wood(BlocksForBuildersBlocks.CEDAR_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).log(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).wood(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.CEDAR_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_HEDGE, BlocksForBuildersBlocks.CEDAR_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.CEDAR_SAPLING, BlocksForBuildersBlocks.POTTED_CEDAR_SAPLING, BlockStateModelGenerator.CrossType.TINTED);
        cedarTexturePool.stairs(BlocksForBuildersBlocks.CEDAR_STAIRS);
        cedarTexturePool.slab(BlocksForBuildersBlocks.CEDAR_SLAB);
        cedarTexturePool.fence(BlocksForBuildersBlocks.CEDAR_FENCE);
        cedarTexturePool.fenceGate(BlocksForBuildersBlocks.CEDAR_FENCE_GATE);
        cedarTexturePool.pressurePlate(BlocksForBuildersBlocks.CEDAR_PRESSURE_PLATE);
        cedarTexturePool.button(BlocksForBuildersBlocks.CEDAR_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.CEDAR_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.CEDAR_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_PLANKS, BlocksForBuildersBlocks.CEDAR_SIGN, BlocksForBuildersBlocks.CEDAR_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG, BlocksForBuildersBlocks.CEDAR_HANGING_SIGN, BlocksForBuildersBlocks.CEDAR_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_BOOKSHELF, BlocksForBuildersBlocks.CEDAR_PLANKS);

        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        greenJungleTexturePool.stairs(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        greenJungleTexturePool.slab(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB);
        greenJungleTexturePool.fence(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
        greenJungleTexturePool.fenceGate(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
        greenJungleTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
        greenJungleTexturePool.button(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);

        greenBambooTexturePool.stairs(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
        greenBambooTexturePool.slab(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB);
        greenBambooTexturePool.customFence(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
        greenBambooTexturePool.customFenceGate(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
        greenBambooTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
        greenBambooTexturePool.button(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN, BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(Blocks.BAMBOO_BLOCK, BlocksForBuildersBlocks.GREEN_BAMBOO_HANGING_SIGN, BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);

        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.PALE_OAK_BOOKSHELF, Blocks.PALE_OAK_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
        blackNetherBricksTexturePool.stairs(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
        blackNetherBricksTexturePool.slab(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
        blackNetherBricksTexturePool.fence(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
        blackNetherBricksTexturePool.fenceGate(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
        blackNetherBricksTexturePool.wall(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);
        registerParityFence(blockStateModelGenerator, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
        registerParityFenceGate(blockStateModelGenerator, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
        registerParityFenceGate(blockStateModelGenerator, BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_WALL, Identifier.ofVanilla("block/" + "quartz_block_side"));
        registerDirectionalStairs(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, true);
        registerDirectionalSlab(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, true);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Identifier.ofVanilla("block/" + "quartz_block_bottom"));

        grimstoneTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
        grimstoneTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_SLAB);
        grimstoneTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
        polishedGrimstoneTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
        polishedGrimstoneTexturePool.slab(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB);
        polishedGrimstoneTexturePool.wall(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS);
        grimstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        grimstoneBricksTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB);
        grimstoneBricksTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
        registerDirectionalBlock(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILES);
        registerDirectionalBlock(blockStateModelGenerator, BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES);
        registerGrimstoneStyleStairs(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES, false);
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES);

        antigoriteTexturePool.stairs(BlocksForBuildersBlocks.ANTIGORITE_STAIRS);
        antigoriteTexturePool.slab(BlocksForBuildersBlocks.ANTIGORITE_SLAB);
        antigoriteTexturePool.wall(BlocksForBuildersBlocks.ANTIGORITE_WALL);
        polishedAntigoriteTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS);
        polishedAntigoriteTexturePool.slab(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB);
        polishedAntigoriteTexturePool.wall(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        registerParityStairs(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_SMOOTH_STONE_BRICKS);
        smoothStoneBricksTexturePool.stairs(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS);
        smoothStoneBricksTexturePool.slab(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB);
        smoothStoneBricksTexturePool.wall(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL, Identifier.ofVanilla("block/sandstone_top"));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, Identifier.ofVanilla("block/sandstone_top"), getId(Blocks.CUT_SANDSTONE), Identifier.ofVanilla("block/sandstone_top"));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_SANDSTONE_WALL, Identifier.ofVanilla("block/sandstone_top"), getId(Blocks.CUT_SANDSTONE), Identifier.ofVanilla("block/sandstone_top"));
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL, Identifier.ofVanilla("block/red_sandstone_top"));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS, Identifier.ofVanilla("block/red_sandstone_top"), getId(Blocks.CUT_RED_SANDSTONE), Identifier.ofVanilla("block/red_sandstone_top"));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL, Identifier.ofVanilla("block/red_sandstone_top"), getId(Blocks.CUT_RED_SANDSTONE), Identifier.ofVanilla("block/red_sandstone_top"));

        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS);
        sandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        redSandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.DARK_SAND);
        registerManualBottomTop(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_STAIRS, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"));
        registerManualSlab(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_WALL, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"));
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE));
        registerManualCubeAll(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerParityStairs(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_STAIRS, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerParitySlab(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_SLAB, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_WALL, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerManualSlab(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL, Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.of(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_DARK_SANDSTONE_BRICKS);
        darkSandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS);
        darkSandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB);
        darkSandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL);

        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_LEAVES, new ConstantTintSource(-8345771));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_LEAVES, new  ConstantTintSource(-10380959));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_LEAVES, new ConstantTintSource(-7158200));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, Blocks.PALE_OAK_LEAVES);

        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.OAK_HEDGE, Blocks.OAK_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.BIRCH_HEDGE, Blocks.BIRCH_LEAVES, new ConstantTintSource(-8345771));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES, new  ConstantTintSource(-10380959));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.ACACIA_HEDGE, Blocks.ACACIA_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.AZALEA_HEDGE, Blocks.AZALEA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE, Blocks.FLOWERING_AZALEA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.MANGROVE_HEDGE, Blocks.MANGROVE_LEAVES, new ConstantTintSource(-7158200));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PALE_OAK_HEDGE, Blocks.PALE_OAK_LEAVES);

        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_STAIRS, Blocks.HAY_BLOCK, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_SLAB, Blocks.HAY_BLOCK, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_RUG, Blocks.HAY_BLOCK, false);

        blockStateModelGenerator.registerAxisRotated(BlocksForBuildersBlocks.BAMBOO_THATCH, TexturedModel.CUBE_COLUMN, TexturedModel.CUBE_COLUMN_HORIZONTAL);
        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS, BlocksForBuildersBlocks.BAMBOO_THATCH, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, BlocksForBuildersBlocks.BAMBOO_THATCH, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_RUG, BlocksForBuildersBlocks.BAMBOO_THATCH, false);
        registerAltCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG, Blocks.BAMBOO_MOSAIC);

        blockStateModelGenerator.registerAxisRotated(BlocksForBuildersBlocks.COCONUT_THATCH, TexturedModel.CUBE_COLUMN, TexturedModel.CUBE_COLUMN_HORIZONTAL);
        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_STAIRS, BlocksForBuildersBlocks.COCONUT_THATCH, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_SLAB, BlocksForBuildersBlocks.COCONUT_THATCH, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_RUG, BlocksForBuildersBlocks.COCONUT_THATCH, false);

        registerGrassLike(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHED_GRASS);
        registerAltCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.ASHEN_CARPET);

        registerPie(blockStateModelGenerator, PumpkinPie.PUMPKIN_PIE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.SCORCHWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.PALM_RAFT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.PALM_CHEST_RAFT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.MAPLE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.BEECH_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.BEECH_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.PINE_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.PINE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.CEDAR_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.CEDAR_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.COCONUT_HUSK, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.COCONUT_FIBER, Models.GENERATED);
    }

    public static void registerSign(BlockStateModelGenerator blockStateModelGenerator, Block particleBlock, Block signBlock, Block wallSignBlock) {
        Identifier identifier = Models.PARTICLE.upload(signBlock, TextureMap.particle(particleBlock), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(signBlock, createWeightedVariant(identifier)));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(wallSignBlock, createWeightedVariant(identifier)));
        blockStateModelGenerator.registerItemModel(signBlock.asItem());
    }

    public static void registerFallenLeaves(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerFallenLeaves(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerFallenLeaves(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, ConstantTintSource tint) {
        Identifier parent = Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "fallen_leaves");
        Identifier identifier = new Model(Optional.of(parent), Optional.empty(), TextureKey.ALL).upload(block, TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
        if (tint != null) {
            blockStateModelGenerator.registerTintedItemModel(block, identifier, tint);
        }
    }

    public static void registerGrassLike(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier parent = Identifier.ofVanilla("block/" + "cube_bottom_top");
        Identifier identifier = new Model(Optional.of(parent), Optional.empty(), TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.TOP).upload(block,
        new TextureMap().put(TextureKey.BOTTOM, getId(Blocks.DIRT)).put(TextureKey.SIDE, Identifier.of(getId(block) + "_side")).put(TextureKey.TOP, Identifier.of(getId(block) + "_top")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    public static void registerBookshelf(BlockStateModelGenerator blockStateModelGenerator, Block block, Block planks) {
        Identifier parent = Identifier.ofVanilla("block/" + "cube_column");
        Identifier identifier = new Model(Optional.of(parent), Optional.empty(), TextureKey.SIDE, TextureKey.END).upload(block, new TextureMap().put(TextureKey.SIDE, getId(block)).put(TextureKey.END, getId(planks)).put(TextureKey.PARTICLE, getId(block)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    public static void registerHedge(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerHedge(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerHedge(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, ConstantTintSource tint) {
        Identifier postId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_post")), Optional.empty(), TextureKey.ALL).upload(block, "_post", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tallPostId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_post_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_post_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier singleId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_single")), Optional.empty(), TextureKey.ALL).upload(block, "_single", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tallSingleId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_single_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_single_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier straightId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_straight")), Optional.empty(), TextureKey.ALL).upload(block, "_straight", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tallStraightId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_straight_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_straight_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier cornerId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_corner")), Optional.empty(), TextureKey.ALL).upload(block, "_corner", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tallCornerId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_corner_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_corner_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tShapeId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_t_shape")), Optional.empty(), TextureKey.ALL).upload(block, "_t_shape", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier tallTShapeId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_t_shape_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_t_shape_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier crossId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_cross")), Optional.empty(), TextureKey.ALL).upload(block, "_cross", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier talLCrossId = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_cross_tall")), Optional.empty(), TextureKey.ALL).upload(block, "_cross_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        if (tint != null) {
            blockStateModelGenerator.registerTintedItemModel(block, straightId, tint);
        }
        else blockStateModelGenerator.registerItemModel(block.asItem(), straightId);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createHedgeBlockState(block, createWeightedVariant(postId), createWeightedVariant(singleId), createWeightedVariant(cornerId), createWeightedVariant(straightId), createWeightedVariant(tShapeId),
                createWeightedVariant(crossId), createWeightedVariant(tallPostId), createWeightedVariant(tallSingleId), createWeightedVariant(tallCornerId), createWeightedVariant(tallStraightId), createWeightedVariant(tallTShapeId), createWeightedVariant(talLCrossId)));
    }

    public static void registerManualCubeAll(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource) {
        Identifier model = new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_all")), Optional.empty(), TextureKey.ALL).upload(block, new TextureMap()
                .put(TextureKey.ALL, textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(model)));
    }

    public static void registerManualPillar(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier endTexture, Identifier sideTexture) {
        Identifier model = new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_column")), Optional.empty(), TextureKey.END, TextureKey.SIDE).upload(block, new TextureMap()
                .put(TextureKey.END, endTexture).put(TextureKey.SIDE, sideTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(model)));
    }

    public static void registerManualBottomTop(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        Identifier model = new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_bottom_top")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, new TextureMap()
                .put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(model)));
    }

    public static void registerParityStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerManualStairs(blockStateModelGenerator, block, getId(textureSource), getId(textureSource), getId(textureSource));
    }

    public static void registerParityStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource) {
        registerManualStairs(blockStateModelGenerator, block, textureSource, textureSource, textureSource);
    }

    public static void registerManualStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        Identifier identifier = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, new TextureMap().put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier identifier1 = new Model(Optional.of(Identifier.ofVanilla("block/" + "inner_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, "_inner", new TextureMap().put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(Identifier.ofVanilla("block/" + "outer_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, "_outer", new TextureMap().put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(block, createWeightedVariant(identifier1), createWeightedVariant(identifier), createWeightedVariant(identifier2)));
    }

    public static void registerParitySlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerManualSlab(blockStateModelGenerator, block, getId(textureSource), getId(textureSource), getId(textureSource), getId(textureSource));
    }

    public static void registerParitySlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource, Block horizontalModel) {
        registerManualSlab(blockStateModelGenerator, block, textureSource, textureSource, textureSource, getId(horizontalModel));
    }

    public static void registerManualSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture, Identifier blockModel) {
        Identifier identifier = new Model(Optional.of(Identifier.ofVanilla("block/" + "slab")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, new TextureMap().put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier identifier1 = new Model(Optional.of(Identifier.ofVanilla("block/" + "slab_top")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE, TextureKey.BOTTOM).upload(block, "_inner", new TextureMap().put(TextureKey.TOP, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, createWeightedVariant(identifier), createWeightedVariant(identifier1), createWeightedVariant(blockModel)));
    }

    public static void registerParityWall(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerParityWall(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityWall(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureId) {
        Identifier post = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_wall_post")), Optional.empty(), TextureKey.WALL).upload(block, "_post", new TextureMap()
                .put(TextureKey.WALL, textureId), blockStateModelGenerator.modelCollector);
        Identifier side = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_wall_side")), Optional.empty(), TextureKey.WALL).upload(block, "_side", new TextureMap()
                .put(TextureKey.WALL, textureId), blockStateModelGenerator.modelCollector);
        Identifier tallSide = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_wall_side_tall")), Optional.empty(), TextureKey.WALL).upload(block, "_side_tall", new TextureMap()
                .put(TextureKey.WALL, textureId), blockStateModelGenerator.modelCollector);
        Identifier inventory = new Model(Optional.of(Identifier.ofVanilla("block/" + "wall_inventory")), Optional.empty(), TextureKey.WALL).upload(block, "_inventory", new TextureMap()
                .put(TextureKey.WALL, textureId), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createWallBlockState(block, createWeightedVariant(post), createWeightedVariant(side), createWeightedVariant(tallSide)));
        blockStateModelGenerator.registerItemModel(block.asItem(), inventory);
    }

    public static void registerParityFence(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerParityFence(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityFence(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource) {
        Identifier identifier = new Model(Optional.of(Identifier.ofVanilla("block/" + "fence_post")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_post", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        Identifier identifier1 = new Model(Optional.of(Identifier.ofVanilla("block/" + "fence_side")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_side", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(block, createWeightedVariant(identifier), createWeightedVariant(identifier1)));
        Identifier identifier2 = new Model(Optional.of(Identifier.ofVanilla("block/" + "fence_inventory")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_inventory", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerItemModel(block.asItem(), identifier2);
    }

    public static void registerParityFenceGate(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerParityFenceGate(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityFenceGate(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier textureSource) {
        Identifier identifier = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_fence_gate")), Optional.empty(), TextureKey.TEXTURE).upload(block, new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        Identifier identifier1 = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_fence_gate_open")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_open", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        Identifier identifier2 = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_fence_gate_wall")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_wall", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        Identifier identifier3 = new Model(Optional.of(Identifier.ofVanilla("block/" + "template_fence_gate_wall_open")), Optional.empty(), TextureKey.TEXTURE).upload(block, "_wall_open", new TextureMap().put(TextureKey.TEXTURE, textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createFenceGateBlockState(block, createWeightedVariant(identifier1), createWeightedVariant(identifier), createWeightedVariant(identifier3), createWeightedVariant(identifier2), true));
    }

    public static void registerAltCarpet(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        registerAltCarpet(blockStateModelGenerator, block, block);
    }

    public static void registerAltCarpet(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerAltCarpet(blockStateModelGenerator, block, String.valueOf(getId(textureSource)));
    }

    public static void registerAltCarpet(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource) {
        Identifier parent = Identifier.ofVanilla("block/" + "carpet");
        Identifier identifier = new Model(Optional.of(parent), Optional.empty(), TextureKey.WOOL).upload(block, new TextureMap().put(TextureKey.WOOL, Identifier.of(textureSource)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, createWeightedVariant(identifier)));
    }

    public static void registerDirectionalBlock(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        registerDirectionalBlock(blockStateModelGenerator, block, block);
    }

    public static void registerDirectionalBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerDirectionalBlock(blockStateModelGenerator, block, String.valueOf(getId(textureSource)));
    }

    public static void registerDirectionalBlock(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource) {
        Identifier model = new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_column")), Optional.empty(), TextureKey.SIDE, TextureKey.END).upload(block, new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(textureSource)).put(TextureKey.END, Identifier.of(textureSource + "_top")), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.ofVanilla("block/" + "cube_column_horizontal")), Optional.empty(), TextureKey.SIDE, TextureKey.END).upload(block, "_horizontal", new TextureMap()
                .put(TextureKey.SIDE, Identifier.of(textureSource)).put(TextureKey.END, Identifier.of(textureSource + "_top")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createDirectionalBlockState(block, createWeightedVariant(model)));
    }

    public static void registerDirectionalStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerDirectionalStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerDirectionalStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseTexture;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseTexture = Identifier.ofVanilla("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseTexture = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, j) + "_stairs"));
        Identifier east = Identifier.of(rootTexture + "_east");
        Identifier straight = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, new TextureMap()
                .put(TextureKey.TOP, east).put(TextureKey.BOTTOM, east).put(TextureKey.SIDE, baseTexture), blockStateModelGenerator.modelCollector);
        Identifier innerLeft = new Model(Optional.of(Identifier.ofVanilla("block/" + "inner_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_inner_left", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(rootTexture + "_inner_left")).put(TextureKey.BOTTOM, east).put(TextureKey.SIDE, baseTexture), blockStateModelGenerator.modelCollector);
        Identifier innerRight = new Model(Optional.of(Identifier.ofVanilla("block/" + "inner_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_inner_right", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(rootTexture + "_inner_right")).put(TextureKey.BOTTOM, east).put(TextureKey.SIDE, baseTexture), blockStateModelGenerator.modelCollector);
        Identifier outerLeft = new Model(Optional.of(Identifier.ofVanilla("block/" + "outer_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_outer_left", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(rootTexture + "_outer_left")).put(TextureKey.BOTTOM, east).put(TextureKey.SIDE, baseTexture), blockStateModelGenerator.modelCollector);
        Identifier outerRight = new Model(Optional.of(Identifier.ofVanilla("block/" + "outer_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_outer_right", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(rootTexture + "_outer_right")).put(TextureKey.BOTTOM, east).put(TextureKey.SIDE, baseTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createDirectionalStairsBlockState(block,
                createWeightedVariant(straight), createWeightedVariant(innerLeft), createWeightedVariant(innerRight), createWeightedVariant(outerLeft), createWeightedVariant(outerRight)));
    }

    public static void registerDirectionalSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerDirectionalSlab(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerDirectionalSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseTexture;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseTexture = Identifier.ofVanilla("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseTexture = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, j) + "_slab"));
        Identifier topTexture = Identifier.of(rootTexture + "_top");
        Identifier slab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, new TextureMap()
                .put(TextureKey.TOP, baseTexture).put(TextureKey.BOTTOM, baseTexture).put(TextureKey.SIDE, baseTexture).put(TextureKey.FRONT, baseTexture).put(TextureKey.BACK, baseTexture), blockStateModelGenerator.modelCollector);
        Identifier topSlab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab_top")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_top", new TextureMap()
                .put(TextureKey.TOP, baseTexture).put(TextureKey.BOTTOM, baseTexture).put(TextureKey.SIDE, topTexture).put(TextureKey.FRONT, topTexture).put(TextureKey.BACK, topTexture), blockStateModelGenerator.modelCollector);
        Identifier inventory = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_inventory", new TextureMap()
                .put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, baseTexture).put(TextureKey.SIDE, baseTexture).put(TextureKey.FRONT, baseTexture).put(TextureKey.BACK, baseTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createDirectionalSlabBlockState(block, createWeightedVariant(slab), createWeightedVariant(topSlab), createWeightedVariant(baseTexture)));
        blockStateModelGenerator.registerItemModel(block.asItem(), inventory);
    }

    public static void registerPillarStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerPillarStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerPillarStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.ofVanilla("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseId = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, j)));
        Identifier sideTexture = Identifier.of(baseId + "_side");
        Identifier topTexture = Identifier.of(baseId + "_top");
        Identifier bottomTexture = Identifier.of(rootTexture + "_side_bottom");
        Identifier leftTexture = Identifier.of(rootTexture + "_side_left");
        Identifier rightTexture = Identifier.of(rootTexture + "_side_right");
        Identifier straight = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.END, TextureKey.FRONT, TextureKey.BACK).upload(block, new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.END, topTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture), blockStateModelGenerator.modelCollector);
        Identifier innerLeft = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_stairs_inner")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.FRONT, TextureKey.BACK, TextureKey.END, TextureKey.SIDE).upload(block, "inner_left", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture).put(TextureKey.END, topTexture).put(TextureKey.SIDE, topTexture), blockStateModelGenerator.modelCollector);
        Identifier innerRight = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_stairs_inner")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.FRONT, TextureKey.BACK, TextureKey.END, TextureKey.SIDE).upload(block, "inner_right", new TextureMap()
                .put(TextureKey.TOP, bottomTexture).put(TextureKey.BOTTOM, sideTexture).put(TextureKey.FRONT, topTexture).put(TextureKey.BACK, topTexture).put(TextureKey.END, rightTexture).put(TextureKey.SIDE, leftTexture), blockStateModelGenerator.modelCollector);
        Identifier outerLeft = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_stairs_outer")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.FRONT, TextureKey.BACK, TextureKey.END, TextureKey.SIDE).upload(block, "outer_left", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture).put(TextureKey.END, topTexture).put(TextureKey.SIDE, topTexture), blockStateModelGenerator.modelCollector);
        Identifier outerRight = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_stairs_outer")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.FRONT, TextureKey.BACK, TextureKey.END, TextureKey.SIDE).upload(block, "outer_right", new TextureMap()
                .put(TextureKey.TOP, bottomTexture).put(TextureKey.BOTTOM, sideTexture).put(TextureKey.FRONT, topTexture).put(TextureKey.BACK, topTexture).put(TextureKey.END, rightTexture).put(TextureKey.SIDE, leftTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createDirectionalStairsBlockState(block,
                createWeightedVariant(straight), createWeightedVariant(innerLeft), createWeightedVariant(innerRight), createWeightedVariant(outerLeft), createWeightedVariant(outerRight)));
    }

    public static void registerPillarSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, boolean side) {
        registerPillarSlab(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), side);
    }

    public static void registerPillarSlab(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource, boolean side) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.ofVanilla("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseId = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, i)));
        Identifier topTexture = Identifier.of(baseId + "_top");
        Identifier sideTexture;
        Identifier leftTexture;
        Identifier rightTexture;
        Identifier bottomTexture;
        Identifier topDownTexture;
        if (side) {
            sideTexture = Identifier.of(baseId + "_side");
            bottomTexture = Identifier.of(rootTexture + "_side_bottom");
            leftTexture = Identifier.of(rootTexture + "_side_left");
            rightTexture = Identifier.of(rootTexture + "_side_right");
            topDownTexture = Identifier.of(rootTexture + "_top_bottom");
        }
        else {
            sideTexture = baseId;
            leftTexture = Identifier.of(rootTexture + "_left");
            rightTexture = Identifier.of(rootTexture + "_right");
            bottomTexture = Identifier.of(rootTexture + "_down");
            topDownTexture = Identifier.of(rootTexture + "_top_down");
        }
        Identifier horizontalModel = Identifier.of(baseId + "_horizontal");
        Identifier slab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, topDownTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture), blockStateModelGenerator.modelCollector);
        Identifier topSlab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab_top")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_top", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, topDownTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture), blockStateModelGenerator.modelCollector);
        Identifier yAxisSlab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_y_axis", new TextureMap()
                .put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, topTexture).put(TextureKey.SIDE, sideTexture).put(TextureKey.FRONT, sideTexture).put(TextureKey.BACK, sideTexture), blockStateModelGenerator.modelCollector);
        Identifier yAxisTopSlab = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab_top")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_y_axis_top", new TextureMap()
                .put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, topTexture).put(TextureKey.SIDE, bottomTexture).put(TextureKey.FRONT, bottomTexture).put(TextureKey.BACK, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier inventory = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_slab")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_inventory", new TextureMap()
                .put(TextureKey.TOP, bottomTexture).put(TextureKey.BOTTOM, bottomTexture).put(TextureKey.SIDE, rightTexture).put(TextureKey.FRONT, topDownTexture).put(TextureKey.BACK, topDownTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createPillarSlabBlockState(block,
                createWeightedVariant(slab), createWeightedVariant(topSlab), createWeightedVariant(yAxisSlab), createWeightedVariant(yAxisTopSlab), createWeightedVariant(horizontalModel)));
        blockStateModelGenerator.registerItemModel(block.asItem(), inventory);
    }

    public static void registerPillarWall(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerPillarWall(blockStateModelGenerator, block, Identifier.of(getId(textureSource) + "_top"), getId(textureSource),  Identifier.of(getId(textureSource) + "_top"));
    }

    public static void registerPillarWall(BlockStateModelGenerator blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        Identifier post = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_wall_post")), Optional.empty(), TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM).upload(block, "_post", new TextureMap()
                .put(TextureKey.WALL, sideTexture).put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier side = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_wall_side")), Optional.empty(), TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM).upload(block, "_side", new TextureMap()
                .put(TextureKey.WALL, sideTexture).put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier tallSide = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_wall_side_tall")), Optional.empty(), TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM).upload(block, "_side_tall", new TextureMap()
                .put(TextureKey.WALL, sideTexture).put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        Identifier inventory = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_wall_inventory")), Optional.empty(), TextureKey.WALL, TextureKey.TOP, TextureKey.BOTTOM).upload(block, "_inventory", new TextureMap()
                .put(TextureKey.WALL, sideTexture).put(TextureKey.TOP, topTexture).put(TextureKey.BOTTOM, bottomTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createWallBlockState(block, createWeightedVariant(post), createWeightedVariant(side), createWeightedVariant(tallSide)));
        blockStateModelGenerator.registerItemModel(block.asItem(), inventory);
    }

    public static void registerPillarCarpet(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerPillarCarpet(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerPillarCarpet(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.ofVanilla("block/" + baseTextureName);
        } else {
            baseTextureName = textureSource.substring(24);
            baseId = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i - 1;
        } else j = i;
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, j)));
        Identifier topTexture = Identifier.of(baseId + "_top");
        Identifier bottomTexture = Identifier.of(rootTexture + "_side_bottom");
        Identifier leftTexture = Identifier.of(rootTexture + "_side_left");
        Identifier rightTexture = Identifier.of(rootTexture + "_side_right");
        Identifier carpet = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_carpet")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, topTexture).put(TextureKey.FRONT, rightTexture).put(TextureKey.BACK, leftTexture), blockStateModelGenerator.modelCollector);
        Identifier inventory = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pillar_carpet")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.FRONT, TextureKey.BACK).upload(block, "_inventory", new TextureMap()
                .put(TextureKey.TOP, bottomTexture).put(TextureKey.BOTTOM, bottomTexture).put(TextureKey.SIDE, leftTexture).put(TextureKey.FRONT, topTexture).put(TextureKey.BACK, topTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createPillarCarpetBlockState(block, createWeightedVariant(carpet)));
        blockStateModelGenerator.registerItemModel(block.asItem(), inventory);
    }

    public void registerGrimstoneStyleStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerGrimstoneStyleStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)));
    }

    public static void registerGrimstoneStyleStairs(BlockStateModelGenerator blockStateModelGenerator, Block block, String textureSource) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.ofVanilla("block/" + baseTextureName);
        } else {
            baseTextureName = textureSource.substring(24);
            baseId = Identifier.of(bfbTexture(baseTextureName));
        }
        int i = baseTextureName.length();
        Identifier rootTexture = Identifier.of(bfbTexture(baseTextureName.substring(0, i)));
        Identifier leftTexture = Identifier.of(rootTexture + "_left");
        Identifier downTexture = Identifier.of(rootTexture + "_down");
        Identifier straight = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, baseId), blockStateModelGenerator.modelCollector);
        Identifier straightTop = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_top", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, downTexture), blockStateModelGenerator.modelCollector);
        Identifier inner = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs_inner")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_inner", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, baseId), blockStateModelGenerator.modelCollector);
        Identifier innerTop = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs_inner")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_inner_top", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, downTexture), blockStateModelGenerator.modelCollector);
        Identifier outer = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs_outer")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_outer", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, baseId), blockStateModelGenerator.modelCollector);
        Identifier outerTop = new Model(Optional.of(Identifier.ofVanilla("block/" + "stairs_outer")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, "_outer_top", new TextureMap()
                .put(TextureKey.TOP, leftTexture).put(TextureKey.BOTTOM, leftTexture).put(TextureKey.SIDE, downTexture), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createGrimstoneStyleStairsBlockState(block,
                createWeightedVariant(straight), createWeightedVariant(straightTop), createWeightedVariant(inner), createWeightedVariant(innerTop), createWeightedVariant(outer), createWeightedVariant(outerTop)));
    }

    private static void registerPie(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        String root = String.valueOf(getId(block));
        Identifier full = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pie_template")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE).upload(block, new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_top")).put(TextureKey.BOTTOM, Identifier.of(root + "_bottom")).put(TextureKey.SIDE, Identifier.of(root + "_side")), blockStateModelGenerator.modelCollector);
        Identifier oneBite = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pie_template_slice_1")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.INSIDE).upload(block, "_slice_1", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_top")).put(TextureKey.BOTTOM, Identifier.of(root + "_bottom")).put(TextureKey.SIDE, Identifier.of(root + "_side")).put(TextureKey.INSIDE, Identifier.of(root + "_inside")), blockStateModelGenerator.modelCollector);
        Identifier twoBites = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pie_template_slice_2")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.INSIDE).upload(block, "_slice_2", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_top")).put(TextureKey.BOTTOM, Identifier.of(root + "_bottom")).put(TextureKey.SIDE, Identifier.of(root + "_side")).put(TextureKey.INSIDE, Identifier.of(root + "_inside")), blockStateModelGenerator.modelCollector);
        Identifier threeBites = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "pie_template_slice_3")), Optional.empty(), TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.INSIDE).upload(block, "_slice_3", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_top")).put(TextureKey.BOTTOM, Identifier.of(root + "_bottom")).put(TextureKey.SIDE, Identifier.of(root + "_side")).put(TextureKey.INSIDE, Identifier.of(root + "_inside")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createPieBlockState(block,
                createWeightedVariant(full), createWeightedVariant(oneBite), createWeightedVariant(twoBites), createWeightedVariant(threeBites)));
    }

    private static void registerCoconut(BlockStateModelGenerator blockStateModelGenerator, Block block, Item item, Item emptyItem, Item strippedItem, Item strippedEmptyItem) {
        String root = String.valueOf(getId(block));
        Identifier base = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "coconut_template")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE).upload(block, new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_top")).put(TextureKey.SIDE, Identifier.of(root)), blockStateModelGenerator.modelCollector);
        Identifier stripped = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "coconut_template")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE).upload(block, "_stripped", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_stripped_top")).put(TextureKey.SIDE, Identifier.of(root)), blockStateModelGenerator.modelCollector);
        Identifier empty = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "coconut_template")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE).upload(block, "_empty", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_empty_top")).put(TextureKey.SIDE, Identifier.of(root + "_empty")), blockStateModelGenerator.modelCollector);
        Identifier emptySheared = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "coconut_template")), Optional.empty(), TextureKey.TOP, TextureKey.SIDE).upload(block, "_stripped_empty", new TextureMap()
                .put(TextureKey.TOP, Identifier.of(root + "_empty_stripped_top")).put(TextureKey.SIDE, Identifier.of(root + "_empty")), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BFBBlockStateSuppliers.createCoconutBlockState(block,
                createWeightedVariant(base), createWeightedVariant(stripped), createWeightedVariant(empty), createWeightedVariant(emptySheared)));
        Identifier sprite = blockStateModelGenerator.uploadItemModel(item);
        blockStateModelGenerator.registerItemModel(item, sprite);
        Identifier emptySprite = blockStateModelGenerator.uploadItemModel(emptyItem);
        blockStateModelGenerator.registerItemModel(emptyItem, emptySprite);
        Identifier strippedSprite = blockStateModelGenerator.uploadItemModel(strippedItem);
        blockStateModelGenerator.registerItemModel(strippedItem, strippedSprite);
        Identifier strippedEmptySprite = blockStateModelGenerator.uploadItemModel(strippedEmptyItem);
        blockStateModelGenerator.registerItemModel(strippedEmptyItem, strippedEmptySprite);
    }

    public static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("block/");
    }

    private static String bfbTexture(String string) {
        return String.valueOf(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + string));
    }

    public static ModelVariant createModelVariant(Identifier id) {
        return new ModelVariant(id);
    }

    public static WeightedVariant createWeightedVariant(ModelVariant variant) {
        return new WeightedVariant(Pool.of(variant));
    }

    public static WeightedVariant createWeightedVariant(Identifier id) {
        return createWeightedVariant(createModelVariant(id));
    }
}