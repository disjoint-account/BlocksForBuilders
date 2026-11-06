package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedStateProvider;

public interface BFBBlockStateProviders {

    ResourceKey<BlockStateProvider> SCORCHED_GRASS_BENEATH_TREE = key("scorched_grass_beneath_tree");

    static void bootstrap(final BootstrapContext<BlockStateProvider> context) {
        context.register(SCORCHED_GRASS_BENEATH_TREE, RuleBasedStateProvider.ifTrueThenProvide(BlockPredicate.matchesTag(BlockTags.BENEATH_TREE_PODZOL_REPLACEABLE), BlocksForBuildersBlocks.SCORCHED_GRASS));
    }

    private static ResourceKey<BlockStateProvider> key(final String id) {
        return ResourceKey.create(Registries.BLOCK_STATE_PROVIDER, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, id));
    }
}
