package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import static net.disjoint.blocksforbuilders.datagen.BFBBlockstateModelGenerator.registerSign;

public class BFBModelProvider extends FabricModelProvider {
    public BFBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool ghostwoodTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GHOSTWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool scorchwoodTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.SCORCHWOOD_PLANKS);
        BlockStateModelGenerator.BlockTexturePool willowTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.WILLOW_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenJungleTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS);
        BlockStateModelGenerator.BlockTexturePool greenBambooTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GREEN_BAMBOO_PLANKS);
        BlockStateModelGenerator.BlockTexturePool blackNetherBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.BLACK_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool grimstoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.GRIMSTONE);
        BlockStateModelGenerator.BlockTexturePool polishedGrimstoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(BlocksForBuildersBlocks.POLISHED_GRIMSTONE);
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
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GHOSTWOOD_PLANKS, BlocksForBuildersBlocks.GHOSTWOOD_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_GHOSTWOOD_LOG, BlocksForBuildersBlocks.GHOSTWOOD_HANGING_SIGN, BlocksForBuildersBlocks.GHOSTWOOD_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.SCORCHWOOD_WOOD);
        blockStateModelGenerator.registerLog(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).log(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG).wood(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_WOOD);
        blockStateModelGenerator.registerFlowerPotPlant(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING, BlocksForBuildersBlocks.POTTED_SCORCHWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        scorchwoodTexturePool.stairs(BlocksForBuildersBlocks.SCORCHWOOD_STAIRS);
        scorchwoodTexturePool.slab(BlocksForBuildersBlocks.SCORCHWOOD_SLAB);
        scorchwoodTexturePool.fence(BlocksForBuildersBlocks.SCORCHWOOD_FENCE);
        scorchwoodTexturePool.fenceGate(BlocksForBuildersBlocks.SCORCHWOOD_FENCE_GATE);
        scorchwoodTexturePool.pressurePlate(BlocksForBuildersBlocks.SCORCHWOOD_PRESSURE_PLATE);
        scorchwoodTexturePool.button(BlocksForBuildersBlocks.SCORCHWOOD_BUTTON);
        blockStateModelGenerator.registerDoor(BlocksForBuildersBlocks.SCORCHWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(BlocksForBuildersBlocks.SCORCHWOOD_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.SCORCHWOOD_PLANKS, BlocksForBuildersBlocks.SCORCHWOOD_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_SCORCHWOOD_LOG, BlocksForBuildersBlocks.SCORCHWOOD_HANGING_SIGN, BlocksForBuildersBlocks.SCORCHWOOD_WALL_HANGING_SIGN);

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
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.WILLOW_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.WILLOW_PLANKS, BlocksForBuildersBlocks.WILLOW_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_WILLOW_LOG, BlocksForBuildersBlocks.WILLOW_HANGING_SIGN, BlocksForBuildersBlocks.WILLOW_WALL_HANGING_SIGN);

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
        blockStateModelGenerator.registerOrientableTrapdoor(BlocksForBuildersBlocks.GREEN_JUNGLE_TRAPDOOR);
        registerSign(blockStateModelGenerator, BlocksForBuildersBlocks.GREEN_JUNGLE_PLANKS, BlocksForBuildersBlocks.GREEN_JUNGLE_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_SIGN);
        blockStateModelGenerator.registerHangingSign(BlocksForBuildersBlocks.STRIPPED_GREEN_JUNGLE_LOG, BlocksForBuildersBlocks.GREEN_JUNGLE_HANGING_SIGN, BlocksForBuildersBlocks.GREEN_JUNGLE_WALL_HANGING_SIGN);

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

        grimstoneTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_STAIRS);
        grimstoneTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_SLAB);
        grimstoneTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlocksForBuildersBlocks.CHISELED_GRIMSTONE);
        polishedGrimstoneTexturePool.stairs(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_STAIRS);
        polishedGrimstoneTexturePool.slab(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_SLAB);
        polishedGrimstoneTexturePool.wall(BlocksForBuildersBlocks.POLISHED_GRIMSTONE_WALL);
        grimstoneBricksTexturePool.stairs(BlocksForBuildersBlocks.GRIMSTONE_BRICK_STAIRS);
        grimstoneBricksTexturePool.slab(BlocksForBuildersBlocks.GRIMSTONE_BRICK_SLAB);
        grimstoneBricksTexturePool.wall(BlocksForBuildersBlocks.GRIMSTONE_BRICK_WALL);

        blockStateModelGenerator.registerAxisRotated(BlocksForBuildersBlocks.BAMBOO_THATCH, TexturedModel.CUBE_COLUMN, TexturedModel.CUBE_COLUMN_HORIZONTAL);

        Identifier identifier = TextureMap.getId(Blocks.DIRT);
        Identifier identifier2 = TexturedModel.CUBE_BOTTOM_TOP.get(BlocksForBuildersBlocks.ASHEN_DIRT).textures((textures) -> textures.put(TextureKey.BOTTOM, identifier)).upload(BlocksForBuildersBlocks.ASHEN_DIRT, blockStateModelGenerator.modelCollector);
        TextureMap textureMap = (new TextureMap()).put(TextureKey.BOTTOM, identifier).inherit(TextureKey.BOTTOM, TextureKey.PARTICLE).put(TextureKey.TOP, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_snow"));
        BlockStateVariant blockStateVariant = BlockStateVariant.create().put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(Blocks.GRASS_BLOCK, "_snow", textureMap, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.registerTopSoil(BlocksForBuildersBlocks.ASHEN_DIRT, identifier2, blockStateVariant);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.SCORCHWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.WILLOW_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, Models.GENERATED);
        itemModelGenerator.register(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, Models.GENERATED);
    }
}