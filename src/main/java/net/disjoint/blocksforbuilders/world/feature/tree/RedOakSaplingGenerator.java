package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class RedOakSaplingGenerator {
    public static final SaplingGenerator RED_OAK = new SaplingGenerator(BlocksForBuilders.MOD_ID + ":red_oak",
            Optional.empty(), Optional.of(BlocksForBuildersConfiguredFeatures.RED_OAK_KEY), Optional.empty());
}
