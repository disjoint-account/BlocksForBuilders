package net.disjoint.blocksforbuilders.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTrunkPlacerTypes;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ScorchwoodTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<ScorchwoodTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(scorchwoodTrunkPlacerInstance ->
            trunkPlacerParts(scorchwoodTrunkPlacerInstance).apply(scorchwoodTrunkPlacerInstance, ScorchwoodTrunkPlacer::new));

    public ScorchwoodTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return BFBTrunkPlacerTypes.SCORCHWOOD_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(WorldGenLevel world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random,
                                                            int height, BlockPos startPos, TreeConfiguration config) {

        int heightCap = height + random.nextIntBetweenInclusive(heightRandA, heightRandA + 3) +
                random.nextIntBetweenInclusive(heightRandB - 2, heightRandB + 2);

        for(int i = 0; i < heightCap; i++) {
            placeLog(world, replacer, random, startPos.above(i), config);

            int branchHeight = heightCap - 1;
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                BlockPos pos = startPos.above(i).relative(direction);
                if(i >= 8 && i < branchHeight && random.nextBoolean()) {
                    if(random.nextFloat() > 0.6f && !world.isStateAtPosition(pos.above(), state -> state.is(BlocksForBuildersBlocks.SCORCHWOOD_LOG)) && !world.isStateAtPosition(pos.below(), state -> state.is(BlocksForBuildersBlocks.SCORCHWOOD_LOG))) {
                        Function<BlockState, BlockState> function = (state) -> (BlockState)state.trySetValue(RotatedPillarBlock.AXIS, direction.getAxis());
                        placeLog(world, replacer, random, pos, config, function);
                    }
                }
            }
        }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(heightCap), 0, false));
    }
}