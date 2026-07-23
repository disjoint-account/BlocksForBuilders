package net.disjoint.blocksforbuilders;

import net.minecraft.world.level.block.entity.BlockEntityTypes;

public class BFBBlockEntities {

    public static void registerBlockEntities() {
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.GHOSTWOOD_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.SCORCHWOOD_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.WILLOW_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.PALM_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.MAPLE_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.BEECH_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.PINE_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.CEDAR_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF);

        BlocksForBuilders.LOGGER.info("Registering Block Entities for " + BlocksForBuilders.MOD_ID);
    }
}
