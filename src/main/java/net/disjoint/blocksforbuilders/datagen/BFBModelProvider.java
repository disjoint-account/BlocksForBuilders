package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.disjoint.blocksforbuilders.PumpkinPie;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.color.item.Constant;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.Optional;

import static net.minecraft.client.data.models.BlockModelGenerators.createSimpleBlock;

public class BFBModelProvider extends FabricModelProvider {
    public BFBModelProvider(FabricPackOutput output) {
        super(output);
    }
    Constant standardTint = new Constant(-12012264);

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider ghostwoodTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        BlockModelGenerators.BlockFamilyProvider scorchwoodTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
        BlockModelGenerators.BlockFamilyProvider willowTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.WILLOW_PLANKS);
        BlockModelGenerators.BlockFamilyProvider palmTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.PALM_PLANKS);
        BlockModelGenerators.BlockFamilyProvider mapleTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.MAPLE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider beechTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.BEECH_PLANKS);
        BlockModelGenerators.BlockFamilyProvider pineTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.PINE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider cedarTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.CEDAR_PLANKS);
        BlockModelGenerators.BlockFamilyProvider greenJungleTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        BlockModelGenerators.BlockFamilyProvider greenBambooTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        BlockModelGenerators.BlockFamilyProvider blackNetherBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        BlockModelGenerators.BlockFamilyProvider grimstoneTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GRIMSTONE);
        BlockModelGenerators.BlockFamilyProvider polishedGrimstoneTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
        BlockModelGenerators.BlockFamilyProvider grimstoneBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider antigoriteTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.ANTIGORITE);
        BlockModelGenerators.BlockFamilyProvider polishedAntigoriteTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.POLISHED_ANTIGORITE);
        BlockModelGenerators.BlockFamilyProvider antigoriteBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.ANTIGORITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider graniteBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.GRANITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider dioriteBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.DIORITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider andesiteBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.ANDESITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider smoothStoneBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.SMOOTH_STONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider sandstoneBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.SANDSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider redSandstoneBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.RED_SANDSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider darkSandstoneBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider polishedCalciteTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.POLISHED_CALCITE);
        BlockModelGenerators.BlockFamilyProvider calciteBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.CALCITE_BRICKS);
        BlockModelGenerators.BlockFamilyProvider lightTuffTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.LIGHT_TUFF);
        BlockModelGenerators.BlockFamilyProvider polishedLightTuffTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF);
        BlockModelGenerators.BlockFamilyProvider lightTuffBricksTexturePool = blockStateModelGenerator.family(BlocksForBuildersBlocks.LIGHT_TUFF_BRICKS);



        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.GHOSTWOOD_LOG).logWithHorizontal(BlocksForBuildersBlocks.GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GHOSTWOOD_LEAVES, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_HEDGE, BlocksForBuildersBlocks.GHOSTWOOD_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        ghostwoodTexturePool.stairs(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        ghostwoodTexturePool.slab(BlocksForBuildersBlocks.GHOSTWOOD_SLAB);
        ghostwoodTexturePool.fence(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
        ghostwoodTexturePool.fenceGate(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
        ghostwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
        ghostwoodTexturePool.button(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.GHOSTWOOD_DOOR);
        blockStateModelGenerator.createTrapdoor(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.GHOSTWOOD_SHELF, BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, BlocksForBuildersBlocks.GHOSTWOOD_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG, BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_BOOKSHELF, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.SCORCHWOOD_LOG).logWithHorizontal(BlocksForBuildersBlocks.SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        scorchwoodTexturePool.stairs(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
        scorchwoodTexturePool.slab(BlocksForBuildersBlocks.SCORCHWOOD_SLAB);
        scorchwoodTexturePool.fence(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
        scorchwoodTexturePool.fenceGate(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
        scorchwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
        scorchwoodTexturePool.button(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.SCORCHWOOD_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.SCORCHWOOD_SHELF, BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, BlocksForBuildersBlocks.SCORCHWOOD_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG, BlocksForBuildersBlocks.SCORCHWOOD_HANGING_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHWOOD_BOOKSHELF, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.WILLOW_LOG).logWithHorizontal(BlocksForBuildersBlocks.WILLOW_LOG).wood(BlocksForBuildersBlocks.WILLOW_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).wood(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.WILLOW_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_WILLOW_LEAVES, BlocksForBuildersBlocks.WILLOW_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_HEDGE, BlocksForBuildersBlocks.WILLOW_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.WILLOW_SAPLING, BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        willowTexturePool.stairs(BlocksForBuildersBlocks.WILLOW_STAIRS);
        willowTexturePool.slab(BlocksForBuildersBlocks.WILLOW_SLAB);
        willowTexturePool.fence(BlocksForBuildersBlocks.WILLOW_FENCE);
        willowTexturePool.fenceGate(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
        willowTexturePool.pressurePlate(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
        willowTexturePool.button(BlocksForBuildersBlocks.WILLOW_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.WILLOW_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.WILLOW_SHELF, BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_PLANKS, BlocksForBuildersBlocks.WILLOW_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG, BlocksForBuildersBlocks.WILLOW_HANGING_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_BOOKSHELF, BlocksForBuildersBlocks.WILLOW_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.PALM_LOG).logWithHorizontal(BlocksForBuildersBlocks.PALM_LOG).wood(BlocksForBuildersBlocks.PALM_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_PALM_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PALM_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.PALM_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PALM_LEAVES, BlocksForBuildersBlocks.PALM_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_HEDGE, BlocksForBuildersBlocks.PALM_LEAVES);
        registerCoconut(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT, BlocksForBuildersItems.COCONUT, BlocksForBuildersItems.EMPTY_COCONUT, BlocksForBuildersItems.STRIPPED_COCONUT, BlocksForBuildersItems.STRIPPED_EMPTY_COCONUT);
        palmTexturePool.stairs(BlocksForBuildersBlocks.PALM_STAIRS);
        palmTexturePool.slab(BlocksForBuildersBlocks.PALM_SLAB);
        palmTexturePool.fence(BlocksForBuildersBlocks.PALM_FENCE);
        palmTexturePool.fenceGate(BlocksForBuildersBlocks.PALM_FENCE_GATE);
        palmTexturePool.pressurePlate(BlocksForBuildersBlocks.PALM_PRESSURE_PLATE);
        palmTexturePool.button(BlocksForBuildersBlocks.PALM_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.PALM_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.PALM_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.PALM_SHELF, BlocksForBuildersBlocks.STRIPPED_PALM_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_PLANKS, BlocksForBuildersBlocks.PALM_SIGN, BlocksForBuildersBlocks.PALM_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_PALM_LOG, BlocksForBuildersBlocks.PALM_HANGING_SIGN, BlocksForBuildersBlocks.PALM_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.PALM_BOOKSHELF, BlocksForBuildersBlocks.PALM_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.MAPLE_LOG).logWithHorizontal(BlocksForBuildersBlocks.MAPLE_LOG).wood(BlocksForBuildersBlocks.MAPLE_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.MAPLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES, BlocksForBuildersBlocks.MAPLE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_HEDGE, BlocksForBuildersBlocks.MAPLE_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.MAPLE_SAPLING, BlocksForBuildersBlocks.POTTED_MAPLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        mapleTexturePool.stairs(BlocksForBuildersBlocks.MAPLE_STAIRS);
        mapleTexturePool.slab(BlocksForBuildersBlocks.MAPLE_SLAB);
        mapleTexturePool.fence(BlocksForBuildersBlocks.MAPLE_FENCE);
        mapleTexturePool.fenceGate(BlocksForBuildersBlocks.MAPLE_FENCE_GATE);
        mapleTexturePool.pressurePlate(BlocksForBuildersBlocks.MAPLE_PRESSURE_PLATE);
        mapleTexturePool.button(BlocksForBuildersBlocks.MAPLE_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.MAPLE_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.MAPLE_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.MAPLE_SHELF, BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_PLANKS, BlocksForBuildersBlocks.MAPLE_SIGN, BlocksForBuildersBlocks.MAPLE_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_MAPLE_LOG, BlocksForBuildersBlocks.MAPLE_HANGING_SIGN, BlocksForBuildersBlocks.MAPLE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.MAPLE_BOOKSHELF, BlocksForBuildersBlocks.MAPLE_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.BEECH_LOG).logWithHorizontal(BlocksForBuildersBlocks.BEECH_LOG).wood(BlocksForBuildersBlocks.BEECH_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG).wood(BlocksForBuildersBlocks.STRIPPED_BEECH_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.BEECH_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES, BlocksForBuildersBlocks.BEECH_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_HEDGE, BlocksForBuildersBlocks.BEECH_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.BEECH_SAPLING, BlocksForBuildersBlocks.POTTED_BEECH_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        beechTexturePool.stairs(BlocksForBuildersBlocks.BEECH_STAIRS);
        beechTexturePool.slab(BlocksForBuildersBlocks.BEECH_SLAB);
        beechTexturePool.fence(BlocksForBuildersBlocks.BEECH_FENCE);
        beechTexturePool.fenceGate(BlocksForBuildersBlocks.BEECH_FENCE_GATE);
        beechTexturePool.pressurePlate(BlocksForBuildersBlocks.BEECH_PRESSURE_PLATE);
        beechTexturePool.button(BlocksForBuildersBlocks.BEECH_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.BEECH_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.BEECH_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.BEECH_SHELF, BlocksForBuildersBlocks.STRIPPED_BEECH_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_PLANKS, BlocksForBuildersBlocks.BEECH_SIGN, BlocksForBuildersBlocks.BEECH_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_BEECH_LOG, BlocksForBuildersBlocks.BEECH_HANGING_SIGN, BlocksForBuildersBlocks.BEECH_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.BEECH_BOOKSHELF, BlocksForBuildersBlocks.BEECH_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.PINE_LOG).logWithHorizontal(BlocksForBuildersBlocks.PINE_LOG).wood(BlocksForBuildersBlocks.PINE_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_PINE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_PINE_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.PINE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PINE_LEAVES, BlocksForBuildersBlocks.PINE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_HEDGE, BlocksForBuildersBlocks.PINE_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.PINE_SAPLING, BlocksForBuildersBlocks.POTTED_PINE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        pineTexturePool.stairs(BlocksForBuildersBlocks.PINE_STAIRS);
        pineTexturePool.slab(BlocksForBuildersBlocks.PINE_SLAB);
        pineTexturePool.fence(BlocksForBuildersBlocks.PINE_FENCE);
        pineTexturePool.fenceGate(BlocksForBuildersBlocks.PINE_FENCE_GATE);
        pineTexturePool.pressurePlate(BlocksForBuildersBlocks.PINE_PRESSURE_PLATE);
        pineTexturePool.button(BlocksForBuildersBlocks.PINE_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.PINE_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.PINE_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.PINE_SHELF, BlocksForBuildersBlocks.STRIPPED_PINE_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_PLANKS, BlocksForBuildersBlocks.PINE_SIGN, BlocksForBuildersBlocks.PINE_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_PINE_LOG, BlocksForBuildersBlocks.PINE_HANGING_SIGN, BlocksForBuildersBlocks.PINE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.PINE_BOOKSHELF, BlocksForBuildersBlocks.PINE_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.CEDAR_LOG).logWithHorizontal(BlocksForBuildersBlocks.CEDAR_LOG).wood(BlocksForBuildersBlocks.CEDAR_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG).wood(BlocksForBuildersBlocks.STRIPPED_CEDAR_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.CEDAR_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_CEDAR_LEAVES, BlocksForBuildersBlocks.CEDAR_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_HEDGE, BlocksForBuildersBlocks.CEDAR_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.CEDAR_SAPLING, BlocksForBuildersBlocks.POTTED_CEDAR_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        cedarTexturePool.stairs(BlocksForBuildersBlocks.CEDAR_STAIRS);
        cedarTexturePool.slab(BlocksForBuildersBlocks.CEDAR_SLAB);
        cedarTexturePool.fence(BlocksForBuildersBlocks.CEDAR_FENCE);
        cedarTexturePool.fenceGate(BlocksForBuildersBlocks.CEDAR_FENCE_GATE);
        cedarTexturePool.pressurePlate(BlocksForBuildersBlocks.CEDAR_PRESSURE_PLATE);
        cedarTexturePool.button(BlocksForBuildersBlocks.CEDAR_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.CEDAR_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.CEDAR_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.CEDAR_SHELF, BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_PLANKS, BlocksForBuildersBlocks.CEDAR_SIGN, BlocksForBuildersBlocks.CEDAR_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_CEDAR_LOG, BlocksForBuildersBlocks.CEDAR_HANGING_SIGN, BlocksForBuildersBlocks.CEDAR_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.CEDAR_BOOKSHELF, BlocksForBuildersBlocks.CEDAR_PLANKS);

        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).logWithHorizontal(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.woodProvider(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).logWithHorizontal(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, TexturedModel.LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GREEN_JUNGLE_LEAVES, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_HEDGE, BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        greenJungleTexturePool.stairs(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        greenJungleTexturePool.slab(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB);
        greenJungleTexturePool.fence(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
        greenJungleTexturePool.fenceGate(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
        greenJungleTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
        greenJungleTexturePool.button(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF, BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_BOOKSHELF, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);

        greenBambooTexturePool.stairs(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
        greenBambooTexturePool.slab(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB);
        greenBambooTexturePool.fence(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
        greenBambooTexturePool.fenceGate(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
        greenBambooTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
        greenBambooTexturePool.button(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
        blockStateModelGenerator.createDoor(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR);
        blockStateModelGenerator.createOrientableTrapdoor(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createShelf(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF, Blocks.BAMBOO_BLOCK);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS, BlocksForBuildersBlocks.GREEN_BAMBOO_SIGN, BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_SIGN);
        blockStateModelGenerator.createHangingSign(Blocks.BAMBOO_BLOCK, BlocksForBuildersBlocks.GREEN_BAMBOO_HANGING_SIGN, BlocksForBuildersBlocks.GREEN_BAMBOO_WALL_HANGING_SIGN);
        registerBookshelf(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_BAMBOO_BOOKSHELF, BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);

        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_GOLD_ACACIA_LEAVES, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.GOLD_ACACIA_HEDGE, BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES);
        blockStateModelGenerator.createTrivialBlock(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createPlantWithDefaultItem(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
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

        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
        blackNetherBricksTexturePool.stairs(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
        blackNetherBricksTexturePool.slab(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
        blackNetherBricksTexturePool.fence(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
        blackNetherBricksTexturePool.fenceGate(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
        blackNetherBricksTexturePool.wall(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);
        registerParityFence(blockStateModelGenerator, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
        registerParityFenceGate(blockStateModelGenerator, BlocksForBuildersBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
        registerParityFenceGate(blockStateModelGenerator, BlocksForBuildersBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_WALL, Identifier.withDefaultNamespace("block/" + "quartz_block_side"));
        registerDirectionalStairs(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS, true);
        registerDirectionalSlab(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS, true);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_QUARTZ_WALL, Identifier.withDefaultNamespace("block/" + "quartz_block_bottom"));

        grimstoneTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
        grimstoneTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_SLAB);
        grimstoneTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_WALL);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
        polishedGrimstoneTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
        polishedGrimstoneTexturePool.slab(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB);
        polishedGrimstoneTexturePool.wall(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_GRIMSTONE_BRICKS);
        grimstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        grimstoneBricksTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB);
        grimstoneBricksTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
        registerDirectionalBlock(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILES);
        registerDirectionalBlock(blockStateModelGenerator, BlocksForBuildersBlocks.CRACKED_GRIMSTONE_TILES);
        registerGrimstoneStyleStairs(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_STAIRS, BlocksForBuildersBlocks.GRIMSTONE_TILES);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_SLAB, BlocksForBuildersBlocks.GRIMSTONE_TILES, false);
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.GRIMSTONE_TILE_WALL, BlocksForBuildersBlocks.GRIMSTONE_TILES);

        registerParityStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CALCITE_STAIRS, Blocks.CALCITE);
        registerParitySlab(blockStateModelGenerator, BlocksForBuildersBlocks.CALCITE_SLAB, Blocks.CALCITE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.CALCITE_WALL, Blocks.CALCITE);
        polishedCalciteTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_CALCITE_STAIRS);
        polishedCalciteTexturePool.slab(BlocksForBuildersBlocks.POLISHED_CALCITE_SLAB);
        polishedCalciteTexturePool.wall(BlocksForBuildersBlocks.POLISHED_CALCITE_WALL);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_CALCITE_BRICKS);
        calciteBricksTexturePool.stairs(BlocksForBuildersBlocks.CALCITE_BRICK_STAIRS);
        calciteBricksTexturePool.slab(BlocksForBuildersBlocks.CALCITE_BRICK_SLAB);
        calciteBricksTexturePool.wall(BlocksForBuildersBlocks.CALCITE_BRICK_WALL);

        antigoriteTexturePool.stairs(BlocksForBuildersBlocks.ANTIGORITE_STAIRS);
        antigoriteTexturePool.slab(BlocksForBuildersBlocks.ANTIGORITE_SLAB);
        antigoriteTexturePool.wall(BlocksForBuildersBlocks.ANTIGORITE_WALL);
        polishedAntigoriteTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_STAIRS);
        polishedAntigoriteTexturePool.slab(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_SLAB);
        polishedAntigoriteTexturePool.wall(BlocksForBuildersBlocks.POLISHED_ANTIGORITE_WALL);
        antigoriteBricksTexturePool.stairs(BlocksForBuildersBlocks.ANTIGORITE_BRICK_STAIRS);
        antigoriteBricksTexturePool.slab(BlocksForBuildersBlocks.ANTIGORITE_BRICK_SLAB);
        antigoriteBricksTexturePool.wall(BlocksForBuildersBlocks.ANTIGORITE_BRICK_WALL);

        lightTuffTexturePool.stairs(BlocksForBuildersBlocks.LIGHT_TUFF_STAIRS);
        lightTuffTexturePool.slab(BlocksForBuildersBlocks.LIGHT_TUFF_SLAB);
        lightTuffTexturePool.wall(BlocksForBuildersBlocks.LIGHT_TUFF_WALL);
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF);
        polishedLightTuffTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_STAIRS);
        polishedLightTuffTexturePool.slab(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_SLAB);
        polishedLightTuffTexturePool.wall(BlocksForBuildersBlocks.POLISHED_LIGHT_TUFF_WALL);
        lightTuffBricksTexturePool.stairs(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_STAIRS);
        lightTuffBricksTexturePool.slab(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_SLAB);
        lightTuffBricksTexturePool.wall(BlocksForBuildersBlocks.LIGHT_TUFF_BRICK_WALL);
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CHISELED_LIGHT_TUFF_BRICKS);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        graniteBricksTexturePool.stairs(BlocksForBuildersBlocks.GRANITE_BRICK_STAIRS);
        graniteBricksTexturePool.slab(BlocksForBuildersBlocks.GRANITE_BRICK_SLAB);
        graniteBricksTexturePool.wall(BlocksForBuildersBlocks.GRANITE_BRICK_WALL);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        dioriteBricksTexturePool.stairs(BlocksForBuildersBlocks.DIORITE_BRICK_STAIRS);
        dioriteBricksTexturePool.slab(BlocksForBuildersBlocks.DIORITE_BRICK_SLAB);
        dioriteBricksTexturePool.wall(BlocksForBuildersBlocks.DIORITE_BRICK_WALL);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        andesiteBricksTexturePool.stairs(BlocksForBuildersBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricksTexturePool.slab(BlocksForBuildersBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricksTexturePool.wall(BlocksForBuildersBlocks.ANDESITE_BRICK_WALL);

        registerParityStairs(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_SMOOTH_STONE_BRICKS);
        smoothStoneBricksTexturePool.stairs(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_STAIRS);
        smoothStoneBricksTexturePool.slab(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_SLAB);
        smoothStoneBricksTexturePool.wall(BlocksForBuildersBlocks.SMOOTH_STONE_BRICK_WALL);

        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_SANDSTONE_WALL, Identifier.withDefaultNamespace("block/sandstone_top"));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_SANDSTONE_STAIRS, Identifier.withDefaultNamespace("block/sandstone_top"), getId(Blocks.CUT_SANDSTONE), Identifier.withDefaultNamespace("block/sandstone_top"));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_SANDSTONE_WALL, Identifier.withDefaultNamespace("block/sandstone_top"), getId(Blocks.CUT_SANDSTONE), Identifier.withDefaultNamespace("block/sandstone_top"));
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_RED_SANDSTONE_WALL, Identifier.withDefaultNamespace("block/red_sandstone_top"));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_STAIRS, Identifier.withDefaultNamespace("block/red_sandstone_top"), getId(Blocks.CUT_RED_SANDSTONE), Identifier.withDefaultNamespace("block/red_sandstone_top"));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_RED_SANDSTONE_WALL, Identifier.withDefaultNamespace("block/red_sandstone_top"), getId(Blocks.CUT_RED_SANDSTONE), Identifier.withDefaultNamespace("block/red_sandstone_top"));

        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_SANDSTONE_BRICKS);
        sandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.SANDSTONE_BRICK_WALL);
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        redSandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_STAIRS);
        redSandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_SLAB);
        redSandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.RED_SANDSTONE_BRICK_WALL);

        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.DARK_SAND);
        registerManualBottomTop(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE);
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_STAIRS, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"));
        registerManualSlab(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_SLAB, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_SANDSTONE_WALL, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_bottom"));
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CHISELED_DARK_SANDSTONE));
        registerManualCubeAll(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerParityStairs(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_STAIRS, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerParitySlab(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_SLAB, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE);
        registerParityWall(blockStateModelGenerator, BlocksForBuildersBlocks.SMOOTH_DARK_SANDSTONE_WALL, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerManualPillar(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE));
        registerManualStairs(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_STAIRS, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        registerManualSlab(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_SLAB, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE));
        registerPillarWall(blockStateModelGenerator, BlocksForBuildersBlocks.CUT_DARK_SANDSTONE_WALL, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"), getId(BlocksForBuildersBlocks.CUT_DARK_SANDSTONE), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/dark_sandstone_top"));
        blockStateModelGenerator.createTrivialCube(BlocksForBuildersBlocks.CRACKED_DARK_SANDSTONE_BRICKS);
        darkSandstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_STAIRS);
        darkSandstoneBricksTexturePool.slab(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_SLAB);
        darkSandstoneBricksTexturePool.wall(BlocksForBuildersBlocks.DARK_SANDSTONE_BRICK_WALL);

        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_OAK_LEAVES, Blocks.OAK_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, Blocks.BIRCH_LEAVES, new Constant(-8345771));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, Blocks.SPRUCE_LEAVES, new  Constant(-10380959));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES, Blocks.JUNGLE_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES, Blocks.DARK_OAK_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES, Blocks.ACACIA_LEAVES, standardTint);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_AZALEA_LEAVES, Blocks.AZALEA_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_FLOWERING_AZALEA_LEAVES, Blocks.FLOWERING_AZALEA_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES, Blocks.MANGROVE_LEAVES, new Constant(-7158200));
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_CHERRY_LEAVES, Blocks.CHERRY_LEAVES);
        registerFallenLeaves(blockStateModelGenerator, BlocksForBuildersBlocks.FALLEN_PALE_OAK_LEAVES, Blocks.PALE_OAK_LEAVES);

        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.OAK_HEDGE, Blocks.OAK_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.BIRCH_HEDGE, Blocks.BIRCH_LEAVES, new Constant(-8345771));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.SPRUCE_HEDGE, Blocks.SPRUCE_LEAVES, new  Constant(-10380959));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.JUNGLE_HEDGE, Blocks.JUNGLE_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.ACACIA_HEDGE, Blocks.ACACIA_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.DARK_OAK_HEDGE, Blocks.DARK_OAK_LEAVES, standardTint);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.AZALEA_HEDGE, Blocks.AZALEA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.FLOWERING_AZALEA_HEDGE, Blocks.FLOWERING_AZALEA_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.MANGROVE_HEDGE, Blocks.MANGROVE_LEAVES, new Constant(-7158200));
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.CHERRY_HEDGE, Blocks.CHERRY_LEAVES);
        registerHedge(blockStateModelGenerator, BlocksForBuildersBlocks.PALE_OAK_HEDGE, Blocks.PALE_OAK_LEAVES);

        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_STAIRS, Blocks.HAY_BLOCK, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_SLAB, Blocks.HAY_BLOCK, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.HAY_RUG, Blocks.HAY_BLOCK, false);

        blockStateModelGenerator.createRotatedPillarWithHorizontalVariant(BlocksForBuildersBlocks.BAMBOO_THATCH, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_STAIRS, BlocksForBuildersBlocks.BAMBOO_THATCH, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_SLAB, BlocksForBuildersBlocks.BAMBOO_THATCH, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_THATCH_RUG, BlocksForBuildersBlocks.BAMBOO_THATCH, false);
        registerAltCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.BAMBOO_MOSAIC_RUG, Blocks.BAMBOO_MOSAIC);

        blockStateModelGenerator.createRotatedPillarWithHorizontalVariant(BlocksForBuildersBlocks.COCONUT_THATCH, TexturedModel.COLUMN, TexturedModel.COLUMN_HORIZONTAL);
        registerPillarStairs(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_STAIRS, BlocksForBuildersBlocks.COCONUT_THATCH, false);
        registerPillarSlab(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_SLAB, BlocksForBuildersBlocks.COCONUT_THATCH, true);
        registerPillarCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.COCONUT_THATCH_RUG, BlocksForBuildersBlocks.COCONUT_THATCH, false);

        registerGrassLike(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHED_GRASS);
        registerAltCarpet(blockStateModelGenerator, BlocksForBuildersBlocks.ASHEN_CARPET);

        registerPie(blockStateModelGenerator, PumpkinPie.PUMPKIN_PIE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GHOSTWOOD_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.SCORCHWOOD_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.WILLOW_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.WILLOW_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.PALM_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.PALM_CHEST_RAFT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.MAPLE_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.MAPLE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.BEECH_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.BEECH_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.PINE_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.PINE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.CEDAR_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.CEDAR_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.COCONUT_HUSK, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(BlocksForBuildersItems.COCONUT_FIBER, ModelTemplates.FLAT_ITEM);
    }

    public static void registerSign(BlockModelGenerators blockStateModelGenerator, Block particleBlock, Block signBlock, Block wallSignBlock) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.PARTICLE, materialify(getId(particleBlock)));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.PARTICLE_ONLY.create(signBlock, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(signBlock, identifier));
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(wallSignBlock, identifier));
        blockStateModelGenerator.registerSimpleFlatItemModel(signBlock.asItem());
    }

    public static void registerFallenLeaves(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerFallenLeaves(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerFallenLeaves(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, Constant tint) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.ALL, materialify(getId(textureSource)));
        Identifier identifier = create("block/" + "fallen_leaves", TextureSlot.ALL).create(block, mapping, blockStateModelGenerator.modelOutput);
        MultiVariant model = BlockModelGenerators.plainVariant(identifier);
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
        if (tint != null) {
            blockStateModelGenerator.registerSimpleTintedItemModel(block, identifier, tint);
        }
    }

    public static void registerGrassLike(BlockModelGenerators blockStateModelGenerator, Block block) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.BOTTOM,  TextureMapping.getBlockTexture(Blocks.DIRT))
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(block, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(block, "_side"));
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_BOTTOM_TOP.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
    }

    public static void registerBookshelf(BlockModelGenerators blockStateModelGenerator, Block block, Block planks) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE,  TextureMapping.getBlockTexture(block))
                .put(TextureSlot.END, TextureMapping.getBlockTexture(planks))
                .copyForced(TextureSlot.END, TextureSlot.PARTICLE);
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_COLUMN.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
    }

    public static void registerHedge(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerHedge(blockStateModelGenerator, block, textureSource, null);
    }

    public static void registerHedge(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, Constant tint) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.ALL, TextureMapping.getBlockTexture(textureSource));
        MultiVariant postId = BlockModelGenerators.plainVariant(create("block/" + "hedge_post", TextureSlot.ALL).createWithSuffix(block, "_post", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallPostId = BlockModelGenerators.plainVariant(create("block/" + "hedge_post_tall", TextureSlot.ALL).createWithSuffix(block, "_post_tall", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant singleId = BlockModelGenerators.plainVariant(create("block/" + "hedge_single", TextureSlot.ALL).createWithSuffix(block, "_single", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallSingleId = BlockModelGenerators.plainVariant(create("block/" + "hedge_single_tall", TextureSlot.ALL).createWithSuffix(block, "_single_tall", mapping, blockStateModelGenerator.modelOutput));
        Identifier straight = create("block/" + "hedge_straight", TextureSlot.ALL).createWithSuffix(block, "_straight", mapping, blockStateModelGenerator.modelOutput);
        MultiVariant straightId = BlockModelGenerators.plainVariant(straight);
        MultiVariant tallStraightId = BlockModelGenerators.plainVariant(create("block/" + "hedge_straight_tall", TextureSlot.ALL).createWithSuffix(block, "_straight_tall", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant cornerId = BlockModelGenerators.plainVariant(create("block/" + "hedge_corner", TextureSlot.ALL).createWithSuffix(block, "_corner", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallCornerId = BlockModelGenerators.plainVariant(create("block/" + "hedge_corner_tall", TextureSlot.ALL).createWithSuffix(block, "_corner_tall", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tShapeId = BlockModelGenerators.plainVariant(create("block/" + "hedge_t_shape", TextureSlot.ALL).createWithSuffix(block, "_t_shape", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallTShapeId = BlockModelGenerators.plainVariant(create("block/" + "hedge_t_shape_tall", TextureSlot.ALL).createWithSuffix(block, "_t_shape_tall", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant crossId = BlockModelGenerators.plainVariant(create("block/" + "hedge_cross", TextureSlot.ALL).createWithSuffix(block, "_cross", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallCrossId = BlockModelGenerators.plainVariant(create("block/" + "hedge_cross_tall", TextureSlot.ALL).createWithSuffix(block, "_cross_tall", mapping, blockStateModelGenerator.modelOutput));
        if (tint != null) {
            blockStateModelGenerator.registerSimpleTintedItemModel(block, straight, tint);
        }
        else blockStateModelGenerator.registerSimpleItemModel(block, straight);
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createHedgeBlockState(block, postId, singleId, cornerId, straightId, tShapeId,
                crossId, tallPostId, tallSingleId, tallCornerId, tallStraightId, tallTShapeId, tallCrossId));
    }

    public static void registerManualCubeAll(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.ALL, materialify(textureSource));
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
    }

    public static void registerManualPillar(BlockModelGenerators blockStateModelGenerator, Block block) {
        registerManualPillar(blockStateModelGenerator, block, getId(block).withSuffix("_top"), getId(block));
    }

    public static void registerManualPillar(BlockModelGenerators blockStateModelGenerator, Block block, Identifier endTexture, Identifier sideTexture) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.END, materialify(endTexture))
                .put(TextureSlot.SIDE, materialify(sideTexture));
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_COLUMN.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
    }

    public static void registerManualBottomTop(BlockModelGenerators blockStateModelGenerator, Block block) {
        registerManualBottomTop(blockStateModelGenerator, block, getId(block).withSuffix("_top"), getId(block), getId(block).withSuffix("_bottom"));
    }

    public static void registerManualBottomTop(BlockModelGenerators blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(sideTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture));
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_BOTTOM_TOP.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, model));
    }

    public static void registerParityStairs(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerManualStairs(blockStateModelGenerator, block, getId(textureSource), getId(textureSource), getId(textureSource));
    }

    public static void registerParityStairs(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        registerManualStairs(blockStateModelGenerator, block, textureSource, textureSource, textureSource);
    }

    public static void registerManualStairs(BlockModelGenerators blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(sideTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_STRAIGHT.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier1 = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier2 = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createStairs(block, identifier1, identifier, identifier2));
    }

    public static void registerParitySlab(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerManualSlab(blockStateModelGenerator, block, getId(textureSource), getId(textureSource), getId(textureSource), getId(textureSource));
    }

    public static void registerParitySlab(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource, Block horizontalModel) {
        registerManualSlab(blockStateModelGenerator, block, textureSource, textureSource, textureSource, getId(horizontalModel));
    }

    public static void registerManualSlab(BlockModelGenerators blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture, Identifier blockModel) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(sideTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.SLAB_BOTTOM.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier1 = BlockModelGenerators.plainVariant(ModelTemplates.SLAB_TOP.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSlab(block, identifier, identifier1, BlockModelGenerators.plainVariant(blockModel)));
    }

    public static void registerParityWall(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerParityWall(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityWall(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureId) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.WALL, materialify(textureId));
        MultiVariant post = BlockModelGenerators.plainVariant(ModelTemplates.WALL_POST.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant side = BlockModelGenerators.plainVariant(ModelTemplates.WALL_LOW_SIDE.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallSide = BlockModelGenerators.plainVariant(ModelTemplates.WALL_TALL_SIDE.create(block, mapping, blockStateModelGenerator.modelOutput));
        Identifier inventory = ModelTemplates.WALL_INVENTORY.create(block, mapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createWall(block, post, side, tallSide));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), inventory);
    }

    public static void registerParityFence(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerParityFence(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityFence(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, materialify(textureSource));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_POST.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier1 = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_SIDE.create(block, mapping, blockStateModelGenerator.modelOutput));
        Identifier identifier2 = ModelTemplates.FENCE_INVENTORY.create(block, mapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFence(block, identifier, identifier1));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), identifier2);
    }

    public static void registerParityFenceGate(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerParityFenceGate(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerParityFenceGate(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, materialify(textureSource));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_CLOSED.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier1 = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_OPEN.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier2 = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_CLOSED.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier3 = BlockModelGenerators.plainVariant(ModelTemplates.FENCE_GATE_WALL_OPEN.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createFenceGate(block, identifier1, identifier, identifier3, identifier2, true));
    }

    public static void registerAltCarpet(BlockModelGenerators blockStateModelGenerator, Block block) {
        registerAltCarpet(blockStateModelGenerator, block, block);
    }

    public static void registerAltCarpet(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerAltCarpet(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerAltCarpet(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.WOOL, materialify(textureSource));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.CARPET.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(block, identifier));
    }

    public static void registerDirectionalBlock(BlockModelGenerators blockStateModelGenerator, Block block) {
        registerDirectionalBlock(blockStateModelGenerator, block, block);
    }

    public static void registerDirectionalBlock(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerDirectionalBlock(blockStateModelGenerator, block, getId(textureSource));
    }

    public static void registerDirectionalBlock(BlockModelGenerators blockStateModelGenerator, Block block, Identifier textureSource) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, materialify(textureSource))
                .put(TextureSlot.END, materialify(textureSource.withSuffix("_top")));
        MultiVariant model = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_COLUMN.create(block, mapping, blockStateModelGenerator.modelOutput));
        MultiVariant identifier = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_COLUMN_HORIZONTAL.create(block, mapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createDirectionalBlockState(block, model));
    }

    public static void registerDirectionalStairs(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerDirectionalStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerDirectionalStairs(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseTexture;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseTexture = Identifier.withDefaultNamespace("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseTexture = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, j) + "_stairs");
        Identifier east = rootTexture.withSuffix("_east");
        TextureMapping straightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(east))
                .put(TextureSlot.BOTTOM, materialify(east))
                .put(TextureSlot.SIDE, materialify(baseTexture));
        TextureMapping innerLeftMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(rootTexture.withSuffix("_inner_left")))
                .put(TextureSlot.BOTTOM, materialify(east))
                .put(TextureSlot.SIDE, materialify(baseTexture));
        TextureMapping innerRightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(rootTexture.withSuffix("_inner_right")))
                .put(TextureSlot.BOTTOM, materialify(east))
                .put(TextureSlot.SIDE, materialify(baseTexture));
        TextureMapping outerLeftMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(rootTexture.withSuffix("_outer_left")))
                .put(TextureSlot.BOTTOM, materialify(east))
                .put(TextureSlot.SIDE, materialify(baseTexture));
        TextureMapping outerRightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(rootTexture.withSuffix("_outer_right")))
                .put(TextureSlot.BOTTOM, materialify(east))
                .put(TextureSlot.SIDE, materialify(baseTexture));

        MultiVariant straight = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_STRAIGHT.create(block, straightMapping, blockStateModelGenerator.modelOutput));
        MultiVariant innerLeft = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.createWithSuffix(block, "_left", innerLeftMapping, blockStateModelGenerator.modelOutput));
        MultiVariant innerRight = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.createWithSuffix(block, "_right", innerRightMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outerLeft = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.createWithSuffix(block, "_left", outerLeftMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outerRight = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.createWithSuffix(block, "_right", outerRightMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createDirectionalStairsBlockState(block, straight, innerLeft, innerRight, outerLeft, outerRight));
    }

    public static void registerDirectionalSlab(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerDirectionalSlab(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerDirectionalSlab(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseTexture;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseTexture = Identifier.withDefaultNamespace("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseTexture = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, j) + "_slab");
        Identifier topTexture = rootTexture.withSuffix("_top");
        TextureMapping slabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(baseTexture))
                .put(TextureSlot.BOTTOM, materialify(baseTexture))
                .put(TextureSlot.SIDE, materialify(baseTexture))
                .put(TextureSlot.FRONT, materialify(baseTexture))
                .put(TextureSlot.BACK, materialify(baseTexture));
        TextureMapping topSlabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(baseTexture))
                .put(TextureSlot.BOTTOM, materialify(baseTexture))
                .put(TextureSlot.SIDE, materialify(topTexture))
                .put(TextureSlot.FRONT, materialify(topTexture))
                .put(TextureSlot.BACK, materialify(topTexture));
        TextureMapping inventoryMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.BOTTOM, materialify(baseTexture))
                .put(TextureSlot.SIDE, materialify(baseTexture))
                .put(TextureSlot.FRONT, materialify(baseTexture))
                .put(TextureSlot.BACK, materialify(baseTexture));

        MultiVariant slab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).create(block, slabMapping, blockStateModelGenerator.modelOutput));
        MultiVariant topSlab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab_top", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_top", topSlabMapping, blockStateModelGenerator.modelOutput));
        Identifier inventory = create("block/" + "pillar_slab", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_inventory", inventoryMapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createDirectionalSlabBlockState(block, slab, topSlab, BlockModelGenerators.plainVariant(baseTexture)));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), inventory);
    }

    public static void registerPillarStairs(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerPillarStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerPillarStairs(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.withDefaultNamespace("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseId = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i- 1;
        }
        else j = i;
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, j));
        Identifier sideTexture = baseId.withSuffix("_side");
        Identifier topTexture = baseId.withSuffix("_top");
        Identifier bottomTexture = rootTexture.withSuffix("_side_bottom");
        Identifier leftTexture = rootTexture.withSuffix("_side_left");
        Identifier rightTexture = rootTexture.withSuffix("_side_right");
        TextureMapping straightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.END, materialify(topTexture))
                .put(TextureSlot.FRONT, materialify(rightTexture))
                .put(TextureSlot.BACK, materialify(leftTexture));
        TextureMapping innerLeftMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.END, materialify(rightTexture))
                .put(TextureSlot.FRONT, materialify(leftTexture))
                .put(TextureSlot.BACK, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(topTexture));
        TextureMapping innerRightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(bottomTexture))
                .put(TextureSlot.BOTTOM, materialify(sideTexture))
                .put(TextureSlot.END, materialify(topTexture))
                .put(TextureSlot.FRONT, materialify(topTexture))
                .put(TextureSlot.BACK, materialify(rightTexture))
                .put(TextureSlot.SIDE, materialify(leftTexture));
        TextureMapping outerLeftMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.END, materialify(rightTexture))
                .put(TextureSlot.FRONT, materialify(leftTexture))
                .put(TextureSlot.BACK, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(topTexture));
        TextureMapping outerRightMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(bottomTexture))
                .put(TextureSlot.BOTTOM, materialify(sideTexture))
                .put(TextureSlot.END, materialify(topTexture))
                .put(TextureSlot.FRONT, materialify(topTexture))
                .put(TextureSlot.BACK, materialify(rightTexture))
                .put(TextureSlot.SIDE, materialify(leftTexture));
        MultiVariant straight = BlockModelGenerators.plainVariant(create("block/" + "pillar_stairs", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.END, TextureSlot.FRONT, TextureSlot.BACK).create(block, straightMapping, blockStateModelGenerator.modelOutput));
        MultiVariant innerLeft = BlockModelGenerators.plainVariant(create("block/" + "pillar_stairs_inner", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.END, TextureSlot.FRONT, TextureSlot.BACK, TextureSlot.SIDE).createWithSuffix(block, "_inner_left", innerLeftMapping, blockStateModelGenerator.modelOutput));
        MultiVariant innerRight = BlockModelGenerators.plainVariant(create("block/" + "pillar_stairs_inner", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.END, TextureSlot.FRONT, TextureSlot.BACK, TextureSlot.SIDE).createWithSuffix(block, "_inner_right", innerRightMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outerLeft = BlockModelGenerators.plainVariant(create("block/" + "pillar_stairs_outer", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.END, TextureSlot.FRONT, TextureSlot.BACK, TextureSlot.SIDE).createWithSuffix(block, "_outer_left", outerLeftMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outerRight = BlockModelGenerators.plainVariant(create("block/" + "pillar_stairs_outer", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.END, TextureSlot.FRONT, TextureSlot.BACK, TextureSlot.SIDE).createWithSuffix(block, "_outer_right", outerRightMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createDirectionalStairsBlockState(block, straight, innerLeft, innerRight, outerLeft, outerRight));
    }

    public static void registerPillarSlab(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, boolean side) {
        registerPillarSlab(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), side);
    }

    public static void registerPillarSlab(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource, boolean side) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.withDefaultNamespace("block/" + baseTextureName);
        }
        else {
            baseTextureName = textureSource.substring(24);
            baseId = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, i));
        Identifier topTexture = baseId.withSuffix("_top");
        Identifier sideTexture;
        Identifier leftTexture;
        Identifier rightTexture;
        Identifier bottomTexture;
        Identifier topDownTexture;
        if (side) {
            sideTexture = baseId.withSuffix("_side");
            bottomTexture = rootTexture.withSuffix("_side_bottom");
            leftTexture = rootTexture.withSuffix("_side_left");
            rightTexture = rootTexture.withSuffix("_side_right");
            topDownTexture = rootTexture.withSuffix("_top_bottom");
        }
        else {
            sideTexture = baseId;
            leftTexture = rootTexture.withSuffix("_left");
            rightTexture = rootTexture.withSuffix("_right");
            bottomTexture = rootTexture.withSuffix("_down");
            topDownTexture = rootTexture.withSuffix("_top_down");
        }
        Identifier horizontalModel = baseId.withSuffix("_horizontal");

        TextureMapping slabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.SIDE, materialify(topDownTexture))
                .put(TextureSlot.FRONT, materialify(rightTexture))
                .put(TextureSlot.BACK, materialify(leftTexture));
        TextureMapping topSlabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.SIDE, materialify(topDownTexture))
                .put(TextureSlot.FRONT, materialify(rightTexture))
                .put(TextureSlot.BACK, materialify(leftTexture));
        TextureMapping yAxisSlabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.BOTTOM, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(sideTexture))
                .put(TextureSlot.FRONT, materialify(sideTexture))
                .put(TextureSlot.BACK, materialify(sideTexture));
        TextureMapping yAxisTopSlabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.BOTTOM, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(bottomTexture))
                .put(TextureSlot.FRONT, materialify(bottomTexture))
                .put(TextureSlot.BACK, materialify(bottomTexture));
        TextureMapping inventorySlabMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(bottomTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture))
                .put(TextureSlot.SIDE, materialify(rightTexture))
                .put(TextureSlot.FRONT, materialify(topDownTexture))
                .put(TextureSlot.BACK, materialify(topDownTexture));
        MultiVariant slab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).create(block, slabMapping, blockStateModelGenerator.modelOutput));
        MultiVariant topSlab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab_top", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_top", topSlabMapping, blockStateModelGenerator.modelOutput));
        MultiVariant yAxisSlab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_y_axis", yAxisSlabMapping, blockStateModelGenerator.modelOutput));
        MultiVariant yAxisTopSlab = BlockModelGenerators.plainVariant(create("block/" + "pillar_slab_top", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_y_axis_top", yAxisTopSlabMapping, blockStateModelGenerator.modelOutput));
        Identifier inventory = create("block/" + "pillar_slab", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_inventory", inventorySlabMapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createPillarSlabBlockState(block, slab, topSlab, yAxisSlab, yAxisTopSlab, BlockModelGenerators.plainVariant(horizontalModel)));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), inventory);
    }

    public static void registerPillarWall(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerPillarWall(blockStateModelGenerator, block, getId(textureSource).withSuffix("_top"), getId(textureSource),  getId(textureSource).withSuffix("_top"));
    }

    public static void registerPillarWall(BlockModelGenerators blockStateModelGenerator, Block block, Identifier topTexture, Identifier sideTexture, Identifier bottomTexture) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.WALL, materialify(sideTexture))
                .put(TextureSlot.TOP, materialify(topTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture));

        MultiVariant post = BlockModelGenerators.plainVariant(create("block/" + "pillar_wall_post", TextureSlot.WALL, TextureSlot.TOP, TextureSlot.BOTTOM).createWithSuffix(block, "_post", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant side = BlockModelGenerators.plainVariant(create("block/" + "pillar_wall_side", TextureSlot.WALL, TextureSlot.TOP, TextureSlot.BOTTOM).createWithSuffix(block, "_side", mapping, blockStateModelGenerator.modelOutput));
        MultiVariant tallSide = BlockModelGenerators.plainVariant(create("block/" + "pillar_wall_side_tall", TextureSlot.WALL, TextureSlot.TOP, TextureSlot.BOTTOM).createWithSuffix(block, "_side_tall", mapping, blockStateModelGenerator.modelOutput));
        Identifier inventory = create("block/" + "pillar_wall_inventory", TextureSlot.WALL, TextureSlot.TOP, TextureSlot.BOTTOM).createWithSuffix(block, "_inventory", mapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createWall(block, post, side, tallSide));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), inventory);
    }

    public static void registerPillarCarpet(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource, boolean plural) {
        registerPillarCarpet(blockStateModelGenerator, block, String.valueOf(getId(textureSource)), plural);
    }

    public static void registerPillarCarpet(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource, boolean plural) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.withDefaultNamespace("block/" + baseTextureName);
        } else {
            baseTextureName = textureSource.substring(24);
            baseId = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        int j;
        if (plural) {
            j = i - 1;
        } else j = i;
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, j));
        Identifier topTexture = baseId.withSuffix("_top");
        Identifier bottomTexture = rootTexture.withSuffix("_side_bottom");
        Identifier leftTexture = rootTexture.withSuffix("_side_left");
        Identifier rightTexture = rootTexture.withSuffix("_side_right");

        TextureMapping carpetMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(leftTexture))
                .put(TextureSlot.SIDE, materialify(topTexture))
                .put(TextureSlot.FRONT, materialify(rightTexture))
                .put(TextureSlot.BACK, materialify(leftTexture));
        TextureMapping inventoryMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(bottomTexture))
                .put(TextureSlot.BOTTOM, materialify(bottomTexture))
                .put(TextureSlot.SIDE, materialify(leftTexture))
                .put(TextureSlot.FRONT, materialify(topTexture))
                .put(TextureSlot.BACK, materialify(topTexture));
        MultiVariant carpet = BlockModelGenerators.plainVariant(create("block/" + "pillar_carpet", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).create(block, carpetMapping, blockStateModelGenerator.modelOutput));
        Identifier inventory = create("block/" + "pillar_carpet", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.FRONT, TextureSlot.BACK).createWithSuffix(block, "_inventory", inventoryMapping, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createPillarCarpetBlockState(block, carpet));
        blockStateModelGenerator.registerSimpleItemModel(block.asItem(), inventory);
    }

    public void registerGrimstoneStyleStairs(BlockModelGenerators blockStateModelGenerator, Block block, Block textureSource) {
        registerGrimstoneStyleStairs(blockStateModelGenerator, block, String.valueOf(getId(textureSource)));
    }

    public static void registerGrimstoneStyleStairs(BlockModelGenerators blockStateModelGenerator, Block block, String textureSource) {
        String baseTextureName;
        Identifier baseId;
        if (textureSource.contains("minecraft")) {
            baseTextureName = textureSource.substring(16);
            baseId = Identifier.withDefaultNamespace("block/" + baseTextureName);
        } else {
            baseTextureName = textureSource.substring(24);
            baseId = bfbTexture(baseTextureName);
        }
        int i = baseTextureName.length();
        Identifier rootTexture = bfbTexture(baseTextureName.substring(0, i));
        Identifier topTexture = rootTexture.withSuffix("_top");
        Identifier leftTexture = rootTexture.withSuffix("_left");
        Identifier rightTexture = rootTexture.withSuffix("_right");
        Identifier downTexture = rootTexture.withSuffix("_down");

        TextureMapping regularMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(leftTexture))
                .put(TextureSlot.BOTTOM, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(baseId));
        TextureMapping downMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(rightTexture))
                .put(TextureSlot.BOTTOM, materialify(topTexture))
                .put(TextureSlot.SIDE, materialify(downTexture));

        MultiVariant straight = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_STRAIGHT.create(block, regularMapping, blockStateModelGenerator.modelOutput));
        MultiVariant straightTop = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_STRAIGHT.createWithSuffix(block, "_top", downMapping, blockStateModelGenerator.modelOutput));
        MultiVariant inner = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.create(block, regularMapping, blockStateModelGenerator.modelOutput));
        MultiVariant innerTop = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_INNER.createWithSuffix(block, "_top", downMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outer = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.create(block, regularMapping, blockStateModelGenerator.modelOutput));
        MultiVariant outerTop = BlockModelGenerators.plainVariant(ModelTemplates.STAIRS_OUTER.createWithSuffix(block, "_top", downMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createGrimstoneStyleStairsBlockState(block, straight, straightTop, inner, innerTop, outer, outerTop));
    }

    private static void registerPie(BlockModelGenerators blockStateModelGenerator, Block block) {
        Identifier root = getId(block);
        TextureMapping fullMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_top")))
                .put(TextureSlot.BOTTOM, materialify(root.withSuffix("_bottom")))
                .put(TextureSlot.SIDE, materialify(root.withSuffix("_side")));
        TextureMapping insideMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_top")))
                .put(TextureSlot.BOTTOM, materialify(root.withSuffix("_bottom")))
                .put(TextureSlot.SIDE, materialify(root.withSuffix("_side")))
                .put(TextureSlot.INSIDE, materialify(root.withSuffix("_inside")));
        MultiVariant full = BlockModelGenerators.plainVariant(create("block/" + "pie_template", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE).create(block, fullMapping, blockStateModelGenerator.modelOutput));
        MultiVariant oneBite = BlockModelGenerators.plainVariant(create("block/" + "pie_template_slice_1", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.INSIDE).createWithSuffix(block, "_slice_1", insideMapping, blockStateModelGenerator.modelOutput));
        MultiVariant twoBites = BlockModelGenerators.plainVariant(create("block/" + "pie_template_slice_2", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.INSIDE).createWithSuffix(block, "_slice_2", insideMapping, blockStateModelGenerator.modelOutput));
        MultiVariant threeBites = BlockModelGenerators.plainVariant(create("block/" + "pie_template_slice_3", TextureSlot.TOP, TextureSlot.BOTTOM, TextureSlot.SIDE, TextureSlot.INSIDE).createWithSuffix(block, "_slice_3", insideMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createPieBlockState(block, full, oneBite, twoBites, threeBites));
    }

    private static void registerCoconut(BlockModelGenerators blockStateModelGenerator, Block block, Item item, Item emptyItem, Item strippedItem, Item strippedEmptyItem) {
        Identifier root = getId(block);
        TextureMapping baseMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_top")))
                .put(TextureSlot.SIDE, materialify(root));
        TextureMapping strippedMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_stripped_top")))
                .put(TextureSlot.SIDE, materialify(root));
        TextureMapping emptyMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_empty_top")))
                .put(TextureSlot.SIDE, materialify(root));
        TextureMapping emptyShearedMapping = new TextureMapping()
                .put(TextureSlot.TOP, materialify(root.withSuffix("_empty_stripped_top")))
                .put(TextureSlot.SIDE, materialify(root));
        MultiVariant base = BlockModelGenerators.plainVariant(create("block/" + "coconut_template", TextureSlot.TOP, TextureSlot.SIDE).create(block, baseMapping, blockStateModelGenerator.modelOutput));
        MultiVariant stripped = BlockModelGenerators.plainVariant(create("block/" + "coconut_template", TextureSlot.TOP, TextureSlot.SIDE).createWithSuffix(block, "_stripped", strippedMapping, blockStateModelGenerator.modelOutput));
        MultiVariant empty = BlockModelGenerators.plainVariant(create("block/" + "coconut_template", TextureSlot.TOP, TextureSlot.SIDE).createWithSuffix(block, "_empty", emptyMapping, blockStateModelGenerator.modelOutput));
        MultiVariant emptySheared = BlockModelGenerators.plainVariant(create("block/" + "coconut_template", TextureSlot.TOP, TextureSlot.SIDE).createWithSuffix(block, "_stripped_empty", emptyShearedMapping, blockStateModelGenerator.modelOutput));
        blockStateModelGenerator.blockStateOutput.accept(BFBBlockStateSuppliers.createCoconutBlockState(block, base, stripped, empty, emptySheared));
        Identifier sprite = blockStateModelGenerator.createFlatItemModel(item);
        blockStateModelGenerator.registerSimpleItemModel(item, sprite);
        Identifier emptySprite = blockStateModelGenerator.createFlatItemModel(emptyItem);
        blockStateModelGenerator.registerSimpleItemModel(emptyItem, emptySprite);
        Identifier strippedSprite = blockStateModelGenerator.createFlatItemModel(strippedItem);
        blockStateModelGenerator.registerSimpleItemModel(strippedItem, strippedSprite);
        Identifier strippedEmptySprite = blockStateModelGenerator.createFlatItemModel(strippedEmptyItem);
        blockStateModelGenerator.registerSimpleItemModel(strippedEmptyItem, strippedEmptySprite);
    }

    public static Identifier getId(Block block) {
        Identifier identifier = BuiltInRegistries.BLOCK.getKey(block);
        return identifier.withPrefix("block/");
    }

    private static Identifier bfbTexture(String string) {
        return Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "block/" + string);
    }

    private static Material materialify(Identifier identifier) {
        return new Material(identifier);
    }

    private static ModelTemplate create(final TextureSlot... slots) {
        return new ModelTemplate(Optional.empty(), Optional.empty(), slots);
    }

    private static ModelTemplate create(final String id, final TextureSlot... slots) {
        return new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, id)), Optional.empty(), slots);
    }

    private static ModelTemplate create(final String id, final String suffix, final TextureSlot... slots) {
        return new ModelTemplate(Optional.of(Identifier.withDefaultNamespace("block/" + id)), Optional.of(suffix), slots);
    }
}