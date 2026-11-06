package net.disjoint.blocksforbuilders.world.feature;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.disjoint.blocksforbuilders.world.feature.BlocksForBuildersFeatures.SCORCHWOOD_SAPLING_KEY;

public class BlocksForBuildersPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SCORCHWOOD_SAPLING_PLACED_KEY = registerKey("scorchwood_sapling_placed");

    public static final ResourceKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");
    public static final ResourceKey<PlacedFeature> BEECH_PLACED_KEY = registerKey("beech_placed");
    public static final ResourceKey<PlacedFeature> POPLAR_PLACED_KEY = registerKey("poplar_placed");
    public static final ResourceKey<PlacedFeature> GOLD_ACACIA_PLACED_KEY = registerKey("gold_acacia_placed");
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");
    public static final ResourceKey<PlacedFeature> PALM_PLACED_KEY = registerKey("palm_placed");
    public static final ResourceKey<PlacedFeature> SCORCHWOOD_PLACED_KEY = registerKey("scorchwood_placed");
    public static final ResourceKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");
    public static final ResourceKey<PlacedFeature> MEGA_PINE_PLACED_KEY = registerKey("mega_pine_placed");
    public static final ResourceKey<PlacedFeature> CEDAR_PLACED_KEY = registerKey("cedar_placed");
    public static final ResourceKey<PlacedFeature> MEGA_CEDAR_PLACED_KEY = registerKey("mega_cedar_placed");

    public static final ResourceKey<PlacedFeature> PUMPKIN_PLACED_KEY = registerKey("pumpkin_placed");
    public static final ResourceKey<PlacedFeature> SWEET_BERRY_PATCH_PLACED_KEY = registerKey("sweet_berry_patch_placed");
    public static final ResourceKey<PlacedFeature> SWEET_BERRY_SINGLE_PLACED_KEY = registerKey("sweet_berry_single_placed");

    public static final ResourceKey<PlacedFeature> SMALL_FALLEN_MAPLE_PLACED_KEY = registerKey("small_fallen_maple_placed");
    public static final ResourceKey<PlacedFeature> SMALL_FALLEN_BEECH_PLACED_KEY = registerKey("small_fallen_beech_placed");
    public static final ResourceKey<PlacedFeature> SMALL_FALLEN_POPLAR_PLACED_KEY = registerKey("small_fallen_poplar_placed");

    public static final ResourceKey<PlacedFeature> LARGE_FALLEN_MAPLE_PLACED_KEY = registerKey("large_fallen_maple_placed");
    public static final ResourceKey<PlacedFeature> LARGE_FALLEN_BEECH_PLACED_KEY = registerKey("large_fallen_beech_placed");
    public static final ResourceKey<PlacedFeature> LARGE_FALLEN_POPLAR_PLACED_KEY = registerKey("large_fallen_poplar_placed");

    public static final ResourceKey<PlacedFeature> SMALL_ASHEN_CARPET_PLACED_KEY = registerKey("small_ashen_carpet_placed");
    public static final ResourceKey<PlacedFeature> LARGE_ASHEN_CARPET_PLACED_KEY = registerKey("large_ashen_carpet_placed");

    public static final ResourceKey<PlacedFeature> SMALL_MOSS_CARPET_PLACED_KEY = registerKey("small_moss_carpet_placed");
    public static final ResourceKey<PlacedFeature> LARGE_MOSS_CARPET_PLACED_KEY = registerKey("large_moss_carpet_placed");

    public static final ResourceKey<PlacedFeature> COARSE_DIRT_PLACED_KEY = registerKey("coarse_dirt_placed");

    public static final ResourceKey<PlacedFeature> ORE_ANTIGORITE_UPPER = registerKey("ore_antigorite_upper");
    public static final ResourceKey<PlacedFeature> ORE_ANTIGORITE_LOWER = registerKey("ore_antigorite_lower");

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacement.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilter.onAverageOnceEvery(chance), heightModifier);
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.FEATURE);

        register(context, SCORCHWOOD_SAPLING_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(SCORCHWOOD_SAPLING_KEY),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                CountPlacement.of(96),
                OffsetPlacement.ofTriangle(4, 3),
                BlockPredicateFilter.forPredicate(BlockPredicate.allOf(BlockPredicate.anyOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.matchesBlocks(Blocks.AIR)),
                        BlockPredicate.matchesBlocks(Direction.DOWN, BlocksForBuildersBlocks.SCORCHED_GRASS))));

        register(context, MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.MAPLE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.5f, 6), BlocksForBuildersBlocks.MAPLE_SAPLING));

        register(context, BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.BEECH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.5f, 6), BlocksForBuildersBlocks.BEECH_SAPLING));

        register(context, POPLAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.POPLAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1), Blocks.POPLAR_SAPLING));

        register(context, GOLD_ACACIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.GOLD_ACACIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1), BlocksForBuildersBlocks.GOLD_ACACIA_SAPLING));

        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1), BlocksForBuildersBlocks.WILLOW_SAPLING));

        register(context, PALM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.PALM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1), BlocksForBuildersBlocks.COCONUT));

        register(context, SCORCHWOOD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.SCORCHWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.5f, 8), BlocksForBuildersBlocks.SCORCHWOOD_SAPLING));

        register(context, PINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.PINE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.5f, 6), BlocksForBuildersBlocks.PINE_SAPLING));

        register(context, MEGA_PINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.MEGA_PINE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1), BlocksForBuildersBlocks.PINE_SAPLING));

        register(context, CEDAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.CEDAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.5f, 6), BlocksForBuildersBlocks.CEDAR_SAPLING));

        register(context, MEGA_CEDAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersTreeFeatures.MEGA_CEDAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1), BlocksForBuildersBlocks.CEDAR_SAPLING));



        register(context, PUMPKIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.PUMPKIN_KEY),
                RarityFilter.onAverageOnceEvery(4),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                CountPlacement.of(96),
                OffsetPlacement.ofTriangle(4, 3),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, SWEET_BERRY_PATCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.SWEET_BERRY_KEY),
                RarityFilter.onAverageOnceEvery(4),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                CountPlacement.of(96),
                OffsetPlacement.ofTriangle(4, 3),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, SWEET_BERRY_SINGLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.SWEET_BERRY_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(16),
                OffsetPlacement.ofTriangle(3, 3),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL)))
                ));



        register(context, SMALL_FALLEN_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_MAPLE_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(256),
                OffsetPlacement.ofTriangle(4, 3),
                PlacementUtils.countExtra(1, 0.5f, 4),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, SMALL_FALLEN_BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_BEECH_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(256),
                OffsetPlacement.ofTriangle(4, 3),
                PlacementUtils.countExtra(1, 0.5f, 4),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, SMALL_FALLEN_POPLAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_POPLAR_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(256),
                OffsetPlacement.ofTriangle(4, 3),
                PlacementUtils.countExtra(1, 0.5f, 4),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, LARGE_FALLEN_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_MAPLE_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(512),
                OffsetPlacement.ofTriangle(8, 3),
                PlacementUtils.countExtra(1, 0.5f, 8),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, LARGE_FALLEN_BEECH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_BEECH_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(512),
                OffsetPlacement.ofTriangle(8, 3),
                PlacementUtils.countExtra(1, 0.5f, 8),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));

        register(context, LARGE_FALLEN_POPLAR_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.FALLEN_POPLAR_KEY),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(512),
                OffsetPlacement.ofTriangle(8, 3),
                PlacementUtils.countExtra(1, 0.5f, 8),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.matchesTag(BlockTags.REPLACEABLE_BY_MUSHROOMS), BlockPredicate.noFluid(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.PODZOL, BlocksForBuildersBlocks.HUMUS_GRASS, Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.COARSE_DIRT)))
                ));



        register(context, SMALL_ASHEN_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.ASHEN_CARPET_KEY),
                RarityFilter.onAverageOnceEvery(1),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(128),
                OffsetPlacement.ofTriangle(4, 3),
                PlacementUtils.countExtra(1, 0.5f, 4),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(BlocksForBuildersBlocks.SCORCHED_GRASS)))
                ));
        register(context, LARGE_ASHEN_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.ASHEN_CARPET_KEY),
                RarityFilter.onAverageOnceEvery(1),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(256),
                OffsetPlacement.ofTriangle(8, 3),
                PlacementUtils.countExtra(1, 0.5f, 8),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE, BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(BlocksForBuildersBlocks.SCORCHED_GRASS)))
                ));



        register(context, SMALL_MOSS_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.MOSS_CARPET_KEY),
                RarityFilter.onAverageOnceEvery(1),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(256),
                OffsetPlacement.ofTriangle(5, 3),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesTag(Direction.DOWN.getUnitVec3i(), BlockTags.DIRT))
                ));
        register(context, LARGE_MOSS_CARPET_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.MOSS_CARPET_KEY),
                RarityFilter.onAverageOnceEvery(1),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                CountPlacement.of(512),
                OffsetPlacement.ofTriangle(10, 3),
                BiomeFilter.biome(),
                BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesBlocks(Direction.DOWN.getUnitVec3i(), List.of(Blocks.COARSE_DIRT, Blocks.PODZOL)))
                ));



        register(context, COARSE_DIRT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.COARSE_DIRT_KEY),
                RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome(), PlacementUtils.countExtra(1, 0.2f, 2));

        PlacementUtils.register(context, ORE_ANTIGORITE_UPPER, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.ORE_ANTIGORITE),
                modifiersWithRarity(6, HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
        PlacementUtils.register(context, ORE_ANTIGORITE_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(BlocksForBuildersFeatures.ORE_ANTIGORITE),
                modifiersWithCount(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<Feature> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
