package net.disjoint.blocksforbuilders;

import net.minecraft.block.entity.BlockEntityType;

public class BFBBlockEntities {

    public static void registerBlockEntities() {
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.GHOSTWOOD_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.SCORCHWOOD_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.WILLOW_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.PALM_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.MAPLE_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.BEECH_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.PINE_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.CEDAR_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.GREEN_JUNGLE_SHELF);
        BlockEntityType.SHELF.addSupportedBlock(BlocksForBuildersBlocks.GREEN_BAMBOO_SHELF);

        BlocksForBuilders.LOGGER.info("Registering Block Entities for " + BlocksForBuilders.MOD_ID);
    }
}
