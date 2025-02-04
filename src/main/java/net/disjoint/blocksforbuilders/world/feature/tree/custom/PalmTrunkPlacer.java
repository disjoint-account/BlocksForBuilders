package net.disjoint.blocksforbuilders.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTrunkPlacerTypes;
import net.minecraft.block.BlockState;
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

public class PalmTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<PalmTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(palmTrunkPlacerInstance ->
            fillTrunkPlacerFields(palmTrunkPlacerInstance).apply(palmTrunkPlacerInstance, PalmTrunkPlacer::new));

    public PalmTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return BFBTrunkPlacerTypes.PALM_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random,
                                                 int height, BlockPos startPos, TreeFeatureConfig config) {

        int stage1Height = random.nextBetween(baseHeight - 1, baseHeight + 2);
        int stage2Height = random.nextBetween(firstRandomHeight - 1, firstRandomHeight + 2);
        int stage3Height = random.nextBetween(secondRandomHeight - 1, secondRandomHeight + 2);

        Direction dir1 = Direction.random(random);
        Direction direction;
        if (dir1.getAxis() == Direction.Axis.Y) {
            direction = dir1.rotateClockwise(Direction.Axis.X);
        }
        else direction = dir1;

        for(int i = 0; i < stage1Height; i++) {
            getAndSetState(world, replacer, random, startPos.up(i), config);
        }

        BlockPos stage2pos = startPos.up(stage1Height - 1).offset(direction);
        for (int j = 0; j < stage2Height; j++) {
            getAndSetState(world, replacer, random, stage2pos.up(j), config);
        }

        BlockPos stage3pos = startPos.up(stage1Height + stage2Height - 2).offset(direction, 2);
        for (int k = 0; k < stage3Height; k++) {
            getAndSetState(world, replacer, random, stage3pos.up(k), config);
        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(stage1Height + stage2Height + stage3Height - 2).offset(direction, 2), 0, false));
    }
}
