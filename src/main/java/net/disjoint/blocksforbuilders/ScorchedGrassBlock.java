package net.disjoint.blocksforbuilders;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealSource;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class ScorchedGrassBlock extends Block implements BonemealableBlock {
    private final ResourceKey<PlacedFeature> feature;

    public ScorchedGrassBlock(ResourceKey<PlacedFeature> feature, Properties settings) {
        super(settings);
        this.feature = feature;
    }

    @Override
    public boolean isValidBonemealTarget(final LevelReader level, final BlockPos pos, final BlockState state, final BonemealSource source) {
        return (level.getBlockState(pos.above()).is(BlockTags.REPLACEABLE) || level.getBlockState(pos.above()).isAir()) && level.isInsideBuildHeight(pos.above());
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state, BonemealSource bonemealSource) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state,BonemealSource bonemealSource) {
        BlockPos abovePos = pos.above();
        ChunkGenerator generator = world.getChunkSource().getGenerator();
        Registry<PlacedFeature> configuredFeatures = world.registryAccess().lookupOrThrow(Registries.PLACED_FEATURE);
        if (world.isInsideBuildHeight(pos)) {
            configuredFeatures.get(feature).ifPresent(h -> h.value().place(world, generator, random, abovePos));
        }
    }

    @Override
    public BonemealableBlock.Type getType() {
        return Type.NEIGHBOR_SPREADER;
    }
}
