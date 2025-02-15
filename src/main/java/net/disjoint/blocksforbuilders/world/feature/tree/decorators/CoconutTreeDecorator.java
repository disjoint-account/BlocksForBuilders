package net.disjoint.blocksforbuilders.world.feature.tree.decorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.CoconutBlock;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTreeDecoratorType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
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
    protected TreeDecoratorType<?> getType() {
        return BFBTreeDecoratorType.COCONUT;
    }

    @Override
    public void generate(TreeDecorator.Generator generator) {
        List<BlockPos> logsList = generator.getLogPositions();
        if (!logsList.isEmpty()) {
            Random random = generator.getRandom();
            if (!(random.nextFloat() >= this.probability)) {
                BlockPos topTrunk = logsList.getLast();
                BlockPos trunk = topTrunk.down();
                for (Direction direction : Direction.Type.HORIZONTAL) {
                    if (random.nextFloat() <= 0.25F) {
                        BlockPos candidatePos = trunk.offset(direction);
                        if (generator.isAir(candidatePos) && generator.matches(candidatePos.up(), state -> state.isOf(BlocksForBuildersBlocks.PALM_LEAVES))) {
                            generator.replace(candidatePos, BlocksForBuildersBlocks.COCONUT.getDefaultState().with(CoconutBlock.HANGING, true));
                        }
                    }
                }
            }
        }
    }
}