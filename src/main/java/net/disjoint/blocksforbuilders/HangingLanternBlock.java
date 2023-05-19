package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class HangingLanternBlock extends HangingRootsBlock {

    private static VoxelShape SHAPE = Block.createCuboidShape(3, 1, 3, 13, 16, 13);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public HangingLanternBlock() {
        super(FabricBlockSettings.copyOf(Blocks.LANTERN));
    }
}