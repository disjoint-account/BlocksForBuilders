package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class OrangeOakSaplingGenerator {
    public static final SaplingGenerator ORANGE_OAK = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":orange_oak",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.ORANGE_OAK_KEY), Optional.empty());
}
