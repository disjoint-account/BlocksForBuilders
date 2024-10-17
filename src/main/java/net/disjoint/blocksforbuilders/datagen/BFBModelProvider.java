package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;

public class BFBModelProvider extends FabricModelProvider {
    public BFBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ghostwoodTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.WILLOW_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenJungleTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenBambooTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool blackNetherBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grimstoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GRIMSTONE_BRICKS);

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.GHOSTWOOD_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GHOSTWOOD_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.GHOSTWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_GHOSTWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        ghostwoodTexturePool.stairs(BlocksForBuildersBlocks.GHOSTWOOD_STAIRS);
        ghostwoodTexturePool.slab(BlocksForBuildersBlocks.GHOSTWOOD_SLAB);
        ghostwoodTexturePool.fence(BlocksForBuildersBlocks.GHOSTWOOD_FENCE);
        ghostwoodTexturePool.fenceGate(BlocksForBuildersBlocks.GHOSTWOOD_FENCE_GATE);
        ghostwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.GHOSTWOOD_PRESSURE_PLATE);
        ghostwoodTexturePool.button(BlocksForBuildersBlocks.GHOSTWOOD_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GHOSTWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.GHOSTWOOD_TRAPDOOR);

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.WILLOW_LOG).log(BlocksForBuildersBlocks.WILLOW_LOG).wood(BlocksForBuildersBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).log(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG).wood(BlocksForBuildersBlocks.STRIPPED_WILLOW_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.WILLOW_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.WILLOW_SAPLING, BlocksForBuildersBlocks.POTTED_WILLOW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        willowTexturePool.stairs(BlocksForBuildersBlocks.WILLOW_STAIRS);
        willowTexturePool.slab(BlocksForBuildersBlocks.WILLOW_SLAB);
        willowTexturePool.fence(BlocksForBuildersBlocks.WILLOW_FENCE);
        willowTexturePool.fenceGate(BlocksForBuildersBlocks.WILLOW_FENCE_GATE);
        willowTexturePool.pressurePlate(BlocksForBuildersBlocks.WILLOW_PRESSURE_PLATE);
        willowTexturePool.button(BlocksForBuildersBlocks.WILLOW_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.WILLOW_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).log(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG).wood(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_WOOD);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GREEN_JUNGLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.GREEN_JUNGLE_SAPLING, BlocksForBuildersBlocks.POTTED_GREEN_JUNGLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        greenJungleTexturePool.stairs(BlocksForBuildersBlocks.GREEN_JUNGLE_STAIRS);
        greenJungleTexturePool.slab(BlocksForBuildersBlocks.GREEN_JUNGLE_SLAB);
        greenJungleTexturePool.fence(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE);
        greenJungleTexturePool.fenceGate(BlocksForBuildersBlocks.GREEN_JUNGLE_FENCE_GATE);
        greenJungleTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_JUNGLE_PRESSURE_PLATE);
        greenJungleTexturePool.button(BlocksForBuildersBlocks.GREEN_JUNGLE_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GREEN_JUNGLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);

        greenBambooTexturePool.stairs(BlocksForBuildersBlocks.GREEN_BAMBOO_STAIRS);
        greenBambooTexturePool.slab(BlocksForBuildersBlocks.GREEN_BAMBOO_SLAB);
        greenBambooTexturePool.customFence(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE);
        greenBambooTexturePool.customFenceGate(BlocksForBuildersBlocks.GREEN_BAMBOO_FENCE_GATE);
        greenBambooTexturePool.pressurePlate(BlocksForBuildersBlocks.GREEN_BAMBOO_PRESSURE_PLATE);
        greenBambooTexturePool.button(BlocksForBuildersBlocks.GREEN_BAMBOO_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.GREEN_BAMBOO_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.GREEN_BAMBOO_TRAPDOOR);

        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.RED_OAK_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.RED_OAK_SAPLING, BlocksForBuildersBlocks.POTTED_RED_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.ORANGE_OAK_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.ORANGE_OAK_SAPLING, BlocksForBuildersBlocks.POTTED_ORANGE_OAK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.GOLD_ACACIA_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING, BlocksForBuildersBlocks.POTTED_GOLD_ACACIA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(BlocksForBuildersBlocks.YELLOW_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.YELLOW_BIRCH_SAPLING, BlocksForBuildersBlocks.POTTED_YELLOW_BIRCH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_BLACK_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_BLACK_NETHER_BRICKS);
        blackNetherBricksTexturePool.stairs(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_STAIRS);
        blackNetherBricksTexturePool.slab(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_SLAB);
        blackNetherBricksTexturePool.fence(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE);
        blackNetherBricksTexturePool.fenceGate(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_FENCE_GATE);
        blackNetherBricksTexturePool.wall(BlocksForBuildersBlocks.BLACK_NETHER_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_RED_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CRACKED_RED_NETHER_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.GRIMSTONE);
        grimstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        grimstoneBricksTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB);
        grimstoneBricksTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_HANGING_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_HANGING_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_HANGING_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_HANGING_SIGN_ITEM, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, Models.GENERATED);
    }
}