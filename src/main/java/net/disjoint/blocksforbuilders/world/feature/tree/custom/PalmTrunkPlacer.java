package net.disjoint.blocksforbuilders.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTrunkPlacerTypes;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class PalmTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<PalmTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(palmTrunkPlacerInstance ->
            trunkPlacerParts(palmTrunkPlacerInstance).apply(palmTrunkPlacerInstance, PalmTrunkPlacer::new));

    public PalmTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return BFBTrunkPlacerTypes.PALM_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(WorldGenLevel world, BiConsumer<BlockPos, BlockState> replacer, RandomSource random,
                                                            int height, BlockPos startPos, TreeConfiguration config) {

        int stage1Height = random.nextIntBetweenInclusive(baseHeight - 1, baseHeight + 2);
        int stage2Height = random.nextIntBetweenInclusive(heightRandA - 1, heightRandA + 2);
        int stage3Height = random.nextIntBetweenInclusive(heightRandB - 1, heightRandB + 2);

        Direction dir1 = Direction.getRandom(random);
        Direction direction;
        if (dir1.getAxis() == Direction.Axis.Y) {
            direction = dir1.getClockWise(Direction.Axis.X);
        }
        else direction = dir1;

        for(int i = 0; i < stage1Height; i++) {
            placeLog(world, replacer, random, startPos.above(i), config);
        }

        BlockPos stage2pos = startPos.above(stage1Height - 1).relative(direction);
        for (int j = 0; j < stage2Height; j++) {
            placeLog(world, replacer, random, stage2pos.above(j), config);
        }

        BlockPos stage3pos = startPos.above(stage1Height + stage2Height - 2).relative(direction, 2);
        for (int k = 0; k < stage3Height; k++) {
            placeLog(world, replacer, random, stage3pos.above(k), config);
        }

        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(startPos.above(stage1Height + stage2Height + stage3Height - 2).relative(direction, 2), 0, false));
    }
}
