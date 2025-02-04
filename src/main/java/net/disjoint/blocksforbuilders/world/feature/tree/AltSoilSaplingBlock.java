package net.disjoint.blocksforbuilders.world.feature.tree;

import net.minecraft.block.*;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class AltSoilSaplingBlock extends SaplingBlock {
    private final TagKey<Block> groundTag;

    public AltSoilSaplingBlock(SaplingGenerator generator, Settings settings, TagKey<Block> groundTag) {
        super(generator, settings);
        this.groundTag = groundTag;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(groundTag);
    }
}
