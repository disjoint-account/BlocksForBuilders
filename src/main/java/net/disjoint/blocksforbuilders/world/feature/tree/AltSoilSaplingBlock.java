package net.disjoint.blocksforbuilders.world.feature.tree;

import net.minecraft.tags.TagKey;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class AltSoilSaplingBlock extends SaplingBlock {
    private final TagKey<Block> groundTag;

    public AltSoilSaplingBlock(TreeGrower generator, Properties settings, TagKey<Block> groundTag) {
        super(generator, settings);
        this.groundTag = groundTag;
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return floor.is(groundTag);
    }
}
