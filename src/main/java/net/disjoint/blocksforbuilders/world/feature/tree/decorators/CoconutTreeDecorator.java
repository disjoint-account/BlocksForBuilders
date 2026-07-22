package net.disjoint.blocksforbuilders.world.feature.tree.decorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.CoconutBlock;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTreeDecoratorType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import java.util.List;

public class CoconutTreeDecorator extends TreeDecorator {
    public static final MapCodec<CoconutTreeDecorator> CODEC = Codec.floatRange(0.0F, 1.0F)
            .fieldOf("probability")
            .xmap(CoconutTreeDecorator::new, decorator -> decorator.probability);
    private final float probability;

    public CoconutTreeDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return BFBTreeDecoratorType.COCONUT;
    }

    @Override
    public void place(TreeDecorator.Context generator) {
        List<BlockPos> logsList = generator.logs();
        if (!logsList.isEmpty()) {
            RandomSource random = generator.random();
            if (!(random.nextFloat() >= this.probability)) {
                BlockPos topTrunk = logsList.getLast();
                BlockPos trunk = topTrunk.below();
                for (Direction direction : Direction.Plane.HORIZONTAL) {
                    if (random.nextFloat() <= 0.25F) {
                        BlockPos candidatePos = trunk.relative(direction);
                        if (generator.isAir(candidatePos) && generator.checkBlock(candidatePos.above(), state -> state.is(BlocksForBuildersBlocks.PALM_LEAVES))) {
                            generator.setBlock(candidatePos, BlocksForBuildersBlocks.COCONUT.defaultBlockState().setValue(CoconutBlock.HANGING, true));
                        }
                    }
                }
            }
        }
    }
}