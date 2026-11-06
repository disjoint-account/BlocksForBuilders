package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.DiskFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class BlocksForBuildersFeatures {

    public static final ResourceKey<Feature> SCORCHWOOD_SAPLING_KEY = createKey("scorchwood_sapling");

    public static final ResourceKey<Feature> PUMPKIN_KEY = createKey("pumpkin");
    public static final ResourceKey<Feature> SWEET_BERRY_KEY = createKey("sweet_berry");

    public static final ResourceKey<Feature> FALLEN_MAPLE_KEY = createKey("fallen_maple");
    public static final ResourceKey<Feature> FALLEN_BEECH_KEY = createKey("fallen_beech");
    public static final ResourceKey<Feature> FALLEN_POPLAR_KEY = createKey("fallen_poplar");

    public static final ResourceKey<Feature> ASHEN_CARPET_KEY = createKey("ashen_carpet");

    public static final ResourceKey<Feature> MOSS_CARPET_KEY = createKey("moss_carpet");

    public static final ResourceKey<Feature> COARSE_DIRT_KEY = createKey("coarse_dirt");

    public static final ResourceKey<Feature> ORE_ANTIGORITE = createKey("antigorite");

    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest naturalStone = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);

        context.register(SCORCHWOOD_SAPLING_KEY, new SimpleBlockFeature(BlockStateProvider.of(BlocksForBuildersBlocks.SCORCHWOOD_SAPLING)));

        context.register(PUMPKIN_KEY, new SimpleBlockFeature(BlockStateProvider.of(Blocks.PUMPKIN)));
        context.register(SWEET_BERRY_KEY, new SimpleBlockFeature(BlockStateProvider.of(Blocks.SWEET_BERRY_BUSH.defaultBlockState().setValue(SweetBerryBushBlock.AGE, 3))));
        context.register(FALLEN_MAPLE_KEY, new SimpleBlockFeature(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_MAPLE_LEAVES)));
        context.register(FALLEN_BEECH_KEY, new SimpleBlockFeature(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_BEECH_LEAVES)));
        context.register(FALLEN_POPLAR_KEY, new SimpleBlockFeature(BlockStateProvider.of(BlocksForBuildersBlocks.FALLEN_POPLAR_LEAVES)));
        context.register(ASHEN_CARPET_KEY, new SimpleBlockFeature(BlockStateProvider.of(BlocksForBuildersBlocks.ASHEN_CARPET)));
        context.register(MOSS_CARPET_KEY, new SimpleBlockFeature(BlockStateProvider.of(Blocks.MOSS_CARPET)));

        context.register(COARSE_DIRT_KEY, new DiskFeature(BlockStateProvider.holderOf(Blocks.COARSE_DIRT),
                        BlockPredicate.matchesBlocks(Blocks.PODZOL, Blocks.DIRT), UniformInt.of(2, 3), 1));

        context.register(ORE_ANTIGORITE, new OreFeature(naturalStone, BlocksForBuildersBlocks.ANTIGORITE.defaultBlockState(), 64));
    }

    public static ResourceKey<Feature> createKey(final String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }
}

