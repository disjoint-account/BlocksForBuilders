package net.disjoint.blocksforbuilders;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallBlock;
import net.minecraft.block.enums.WallShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HedgeBlock extends WallBlock {
    public HedgeBlock(Settings settings) {
        super(settings);
    }
}
