package net.disjoint.blocksforbuilders;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.block.BlockTintSources;

import java.util.List;

public class BFBBlockColors {
    public static BlockColors createDefault() {
        BlockColors colors = new BlockColors();

        colors.register(List.of(BlockTintSources.foliage()),
                BlocksForBuildersBlocks.FALLEN_OAK_LEAVES,
                BlocksForBuildersBlocks.OAK_HEDGE,
                BlocksForBuildersBlocks.FALLEN_JUNGLE_LEAVES,
                BlocksForBuildersBlocks.JUNGLE_HEDGE,
                BlocksForBuildersBlocks.FALLEN_DARK_OAK_LEAVES,
                BlocksForBuildersBlocks.DARK_OAK_HEDGE,
                BlocksForBuildersBlocks.FALLEN_ACACIA_LEAVES,
                BlocksForBuildersBlocks.ACACIA_HEDGE,
                BlocksForBuildersBlocks.FALLEN_MANGROVE_LEAVES,
                BlocksForBuildersBlocks.MANGROVE_HEDGE
        );
        colors.register(List.of(BlockTintSources.constant(-8345771)), BlocksForBuildersBlocks.FALLEN_BIRCH_LEAVES, BlocksForBuildersBlocks.BIRCH_HEDGE);
        colors.register(List.of(BlockTintSources.constant(-10380959)), BlocksForBuildersBlocks.FALLEN_SPRUCE_LEAVES, BlocksForBuildersBlocks.SPRUCE_HEDGE);
        return colors;
    }
}
