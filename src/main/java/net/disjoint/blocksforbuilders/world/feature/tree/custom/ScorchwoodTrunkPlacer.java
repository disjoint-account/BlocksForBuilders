package net.disjoint.blocksforbuilders.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTrunkPlacerTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ScorchwoodTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<ScorchwoodTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(scorchwoodTrunkPlacerInstance ->
            fillTrunkPlacerFields(scorchwoodTrunkPlacerInstance).apply(scorchwoodTrunkPlacerInstance, ScorchwoodTrunkPlacer::new));

    public ScorchwoodTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return BFBTrunkPlacerTypes.SCORCHWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random,
                                                 int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);

        int heightCap = height + random.nextBetween(firstRandomHeight, firstRandomHeight + 3) +
                random.nextBetween(secondRandomHeight - 2, secondRandomHeight + 2);

        for(int i = 0; i < heightCap; i++) {
            getAndSetState(world, replacer, random, startPos.up(i), config);

            int branchHeight = heightCap - 1;
            for (Direction direction : Direction.Type.HORIZONTAL) {
                BlockPos pos = startPos.up(i).offset(direction);
                if(i >= 8 && i < branchHeight && random.nextBoolean()) {
                    if(random.nextFloat() > 0.6f && !world.testBlockState(pos.up(), state -> state.isOf(BlocksForBuildersBlocks.SCORCHWOOD_LOG)) && !world.testBlockState(pos.down(), state -> state.isOf(BlocksForBuildersBlocks.SCORCHWOOD_LOG))) {
                        Function<BlockState, BlockState> function = (state) -> (BlockState)state.withIfExists(PillarBlock.AXIS, direction.getAxis());
                        getAndSetState(world, replacer, random, pos, config, function);
                    }
                }
            }
        }
        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(heightCap), 0, false));
    }
}