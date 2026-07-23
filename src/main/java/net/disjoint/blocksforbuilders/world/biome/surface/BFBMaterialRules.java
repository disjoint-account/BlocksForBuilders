package net.disjoint.blocksforbuilders.world.biome.surface;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.biome.BFBBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class BFBMaterialRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource PODZOL = makeStateRule(Blocks.PODZOL);
    private static final SurfaceRules.RuleSource ASH = makeStateRule(BlocksForBuildersBlocks.SCORCHED_GRASS);

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource makeRules(HolderGetter<Biome> biomes) {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.ConditionSource isAboveSeaLevel = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(59), 0);
        SurfaceRules.ConditionSource isInAutumnalForest = SurfaceRules.isBiome(biomes, BFBBiomes.AUTUMNAL_FOREST);
        SurfaceRules.ConditionSource isInScorchedForest = SurfaceRules.isBiome(biomes, BFBBiomes.SCORCHED_FOREST);
        SurfaceRules.ConditionSource isInAlpineForest = SurfaceRules.isBiome(biomes, BFBBiomes.ALPINE_FOREST);

        SurfaceRules.RuleSource podzolSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, PODZOL), DIRT);
        SurfaceRules.RuleSource podzolSurface1 = SurfaceRules.sequence(SurfaceRules.ifTrue(isAboveSeaLevel, podzolSurface));
        SurfaceRules.RuleSource podzolSurface2 = SurfaceRules.sequence(SurfaceRules.ifTrue(isInAutumnalForest, podzolSurface1));
        SurfaceRules.RuleSource podzolSurface3 = SurfaceRules.sequence(SurfaceRules.ifTrue(isInAlpineForest, podzolSurface1));

        SurfaceRules.RuleSource ashSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, ASH), DIRT);
        SurfaceRules.RuleSource ashSurface1 = SurfaceRules.sequence(SurfaceRules.ifTrue(isAboveSeaLevel, ashSurface));
        SurfaceRules.RuleSource ashSurface2 = SurfaceRules.sequence(SurfaceRules.ifTrue(isInScorchedForest, ashSurface1));

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, podzolSurface2),
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, ashSurface2),
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, podzolSurface3)
        );
    }
}