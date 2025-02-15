package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.tint.ConstantTintSource;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Optional;

import static net.minecraft.client.data.BlockStateModelGenerator.createSingletonBlockState;

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
        BlockStateModelGenerator.BlockTexturePool sandstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool redSandstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_HEDGE, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.WILLOW_LOG).log(BlocksForBuildersBlocks.WILLOW_LOG).wood(BlocksForBuildersBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).log(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).wood(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.WILLOW_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_HEDGE, BlocksForBuildersBlocks.WILLOW_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.PALM_LOG).log(BlocksForBuildersBlocks.PALM_LOG).wood(BlocksForBuildersBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).log(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.PALM_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.PALM_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_HEDGE, BlocksForBuildersBlocks.PALM_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.MAPLE_LOG).log(BlocksForBuildersBlocks.MAPLE_LOG).wood(BlocksForBuildersBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).log(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.MAPLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_HEDGE, BlocksForBuildersBlocks.MAPLE_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.BEECH_LOG).log(BlocksForBuildersBlocks.BEECH_LOG).wood(BlocksForBuildersBlocks.BEECH_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).log(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).wood(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.BEECH_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_HEDGE, BlocksForBuildersBlocks.BEECH_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.PINE_LOG).log(BlocksForBuildersBlocks.PINE_LOG).wood(BlocksForBuildersBlocks.PINE_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).log(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.PINE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlocksForBuildersBlocks.PINE_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_HEDGE, BlocksForBuildersBlocks.PINE_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.CEDAR_LOG).log(BlocksForBuildersBlocks.CEDAR_LOG).wood(BlocksForBuildersBlocks.CEDAR_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).log(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).wood(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.CEDAR_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_HEDGE, BlocksForBuildersBlocks.CEDAR_LEAVES);
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

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
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
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlantAndItem(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_YELLOW_BIRCH_LEAVES, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.YELLOW_BIRCH_HEDGE, BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES);

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

        sandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL);
        redSandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL);

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

        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.OAK_HEDGE, Blocks.OAK_LEAVES, standardTint);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.BIRCH_HEDGE, Blocks.BIRCH_LEAVES, new ConstantTintSource(-8345771));
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES, new  ConstantTintSource(-10380959));
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES, standardTint);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.ACACIA_HEDGE, Blocks.ACACIA_LEAVES, standardTint);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES, standardTint);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.AZALEA_HEDGE, Blocks.AZALEA_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE, Blocks.FLOWERING_AZALEA_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.MANGROVE_HEDGE, Blocks.MANGROVE_LEAVES, new ConstantTintSource(-7158200));
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
        registerHedgeModels(blockStateModelGenerator, BlocksForBuildersBlocks.PALE_OAK_HEDGE, Blocks.PALE_OAK_LEAVES);

        blockStateModelGenerator.registerAxisRotated(BlocksForBuildersBlocks.BAMBOO_THATCH, TexturedModel.CUBE_COLUMN, TexturedModel.CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(BlocksForBuildersBlocks.COCONUT_THATCH, TexturedModel.CUBE_COLUMN, TexturedModel.CUBE_COLUMN_HORIZONTAL);

        Identifier identifier = TextureMap.getId(Blocks.DIRT);
        Identifier identifier2 = TexturedModel.CUBE_BOTTOM_TOP.get(BlocksForBuildersBlocks.SCORCHED_GRASS).textures((textures) -> textures.put(TextureKey.BOTTOM, identifier)).upload(BlocksForBuildersBlocks.SCORCHED_GRASS, blockStateModelGenerator.modelCollector);
        TextureMap textureMap = (new TextureMap()).put(TextureKey.BOTTOM, identifier).inherit(TextureKey.BOTTOM, TextureKey.PARTICLE).put(TextureKey.TOP, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_snow"));
        BlockStateVariant blockStateVariant = BlockStateVariant.create().put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(Blocks.GRASS_BLOCK, "_snow", textureMap, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.registerTopSoil(BlocksForBuildersBlocks.SCORCHED_GRASS, identifier2, blockStateVariant);
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

        itemModelGenerator.register(BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL.asItem());
        itemModelGenerator.register(BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE.asItem());
        itemModelGenerator.register(BlocksForBuildersBlocks.QUARTZ_WALL.asItem());
        itemModelGenerator.register(BlocksForBuildersBlocks.QUARTZ_BRICK_WALL.asItem());
        itemModelGenerator.register(BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL.asItem());

        itemModelGenerator.register(BlocksForBuildersBlocks.COCONUT.asItem(), Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.STRIPPED_COCONUT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.COCONUT_HUSK, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.COCONUT_FIBER, Models.GENERATED);
    }

    public static void registerSign(BlockStateModelGenerator blockStateModelGenerator, Block particleBlock, Block signBlock, Block wallSignBlock) {
        Identifier identifier = Models.PARTICLE.upload(signBlock, TextureMap.particle(particleBlock), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(signBlock, identifier));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(wallSignBlock, identifier));
        blockStateModelGenerator.registerItemModel(signBlock.asItem());
    }

    public static void registerFallenLeaves(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerFallenLeaves(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerFallenLeaves(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, ConstantTintSource tint) {
        Identifier parent = Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "fallen_leaves");
        Optional<String> variant = Optional.empty();
        Identifier identifier = new Model(Optional.of(parent), variant, TextureKey.ALL).upload(block, TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, identifier));
        if (tint != null) {
            blockStateModelGenerator.registerTintedItemModel(block, identifier, tint);
        }
    }

    public static void registerBookshelf(BlockStateModelGenerator blockStateModelGenerator, Block block, Block planks) {
        Identifier parent = Identifier.ofVanilla("block/" + "cube_column");
        Optional<String> variant = Optional.empty();
        Identifier identifier = new Model(Optional.of(parent), variant, TextureKey.SIDE, TextureKey.END).upload(block, new TextureMap().put(TextureKey.SIDE, getId(block)).put(TextureKey.END, getId(planks)).put(TextureKey.PARTICLE, getId(block)), blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(block, identifier));
    }

    public static void registerHedgeModels(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource) {
        registerHedgeModels(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerHedgeModels(BlockStateModelGenerator blockStateModelGenerator, Block block, Block textureSource, ConstantTintSource tint) {
        Optional<String> variant = Optional.empty();
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_central")), variant, TextureKey.ALL).upload(block, "_central", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_central_tall")), variant, TextureKey.ALL).upload(block, "_central_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_north")), variant, TextureKey.ALL).upload(block, "_north", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_north_tall")), variant, TextureKey.ALL).upload(block, "_north_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_east")), variant, TextureKey.ALL).upload(block, "_east", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_east_tall")), variant, TextureKey.ALL).upload(block, "_east_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_south")), variant, TextureKey.ALL).upload(block, "_south", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_south_tall")), variant, TextureKey.ALL).upload(block, "_south_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_west")), variant, TextureKey.ALL).upload(block, "_west", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_west_tall")), variant, TextureKey.ALL).upload(block, "_west_tall", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        Identifier identifier = new Model(Optional.of(Identifier.of(BlocksForBuilders.MOD_ID, "block/" + "hedge_inventory")), variant, TextureKey.ALL).upload(block, "_inventory", TextureMap.all(textureSource), blockStateModelGenerator.modelCollector);
        if (tint != null) {
            blockStateModelGenerator.registerTintedItemModel(block, identifier, tint);
        }
        else blockStateModelGenerator.registerItemModel(block.asItem(), identifier);

    }

    public static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("block/");
    }
}