package net.disjoint.blocksforbuilders.world.feature.tree;

        import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
        import net.minecraft.block.sapling.SaplingGenerator;
        import net.minecraft.registry.RegistryKey;
        import net.minecraft.util.math.random.Random;
        import net.minecraft.world.gen.feature.ConfiguredFeature;

public class GreenJungleSaplingGenerator extends SaplingGenerator {
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return BlocksForBuildersConfiguredFeatures.GREEN_JUNGLE_KEY;
    }
}
