package net.disjoint.blocksforbuilders;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ScorchedGrassBlock extends Block implements BonemealableBlock {
    public static final MapCodec<ScorchedGrassBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            ResourceKey.codec(Registries.CONFIGURED_FEATURE).fieldOf("feature").forGetter(block -> block.feature), propertiesCodec()
                    )
                    .apply(instance, ScorchedGrassBlock::new));
    private final ResourceKey<ConfiguredFeature<?, ?>> feature;


    @Override
    public MapCodec<ScorchedGrassBlock> codec() {
        return CODEC;
    }

    public ScorchedGrassBlock(ResourceKey<ConfiguredFeature<?, ?>> feature, Properties settings) {
        super(settings);
        this.feature = feature;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return isValidBonemealTarget(world, pos, state);
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        world.registryAccess()
                .lookup(Registries.CONFIGURED_FEATURE)
                .flatMap(registry -> registry.get(this.feature))
                .ifPresent(entry -> entry.value().place(world, world.getChunkSource().getGenerator(), random, pos.above()));
    }

    @Override
    public BonemealableBlock.Type getType() {
        return Type.NEIGHBOR_SPREADER;
    }
}
