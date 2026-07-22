package net.disjoint.blocksforbuilders;

import net.minecraft.world.level.block.entity.BlockEntityType;

public class BFBBlockEntities {

    public static void registerBlockEntities() {
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.GHOSTWOOD_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.SCORCHWOOD_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.WILLOW_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.PALM_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.MAPLE_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.BEECH_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.PINE_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.CEDAR_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF);
        BlockEntityType.SHELF.addValidBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF);

        BlocksForBuilders.LOGGER.info("Registering Block Entities for " + BlocksForBuilders.MOD_ID);
    }
}
