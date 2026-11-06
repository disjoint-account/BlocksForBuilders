package net.disjoint.blocksforbuilders.world.biome.surface;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.biome.BFBBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.material.MaterialRules;
import net.minecraft.world.level.levelgen.material.condition.MaterialCondition;
import net.minecraft.world.level.levelgen.material.rule.MaterialRule;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class BFBMaterialRules {

    private static final MaterialRule PODZOL = makeStateRule(Blocks.PODZOL);
    private static final MaterialRule ASH = makeStateRule(BlocksForBuildersBlocks.SCORCHED_GRASS);

    private static final MaterialCondition ON_FLOOR = MaterialRules.stoneDepthCheck(0, false, CaveSurface.FLOOR);

    public static MaterialRule makeRules(HolderGetter<Biome> biomes) {
        MaterialCondition isInAutumnalForest = MaterialRules.isBiome(biomes, BFBBiomes.AUTUMNAL_FOREST);
        MaterialCondition isInScorchedForest = MaterialRules.isBiome(biomes, BFBBiomes.SCORCHED_FOREST);
        MaterialCondition isInAlpineForest = MaterialRules.isBiome(biomes, BFBBiomes.ALPINE_FOREST);

        MaterialCondition isAtOrAboveWaterLevel = MaterialRules.waterBlockCheck(-1, 0);

        MaterialRule scorchedSurface = MaterialRules.sequence(
                MaterialRules.ifTrue(isInScorchedForest,
                        MaterialRules.ifTrue(ON_FLOOR,
                                MaterialRules.ifTrue(isAtOrAboveWaterLevel,
                                        ASH))));

        MaterialRule autumnalSurface = MaterialRules.sequence(
                MaterialRules.ifTrue(isInAutumnalForest,
                        MaterialRules.ifTrue(ON_FLOOR,
                                MaterialRules.ifTrue(isAtOrAboveWaterLevel,
                                        PODZOL))));

        MaterialRule alpineSurface = MaterialRules.sequence(
                MaterialRules.ifTrue(isInAlpineForest,
                        MaterialRules.ifTrue(ON_FLOOR,
                                MaterialRules.ifTrue(isAtOrAboveWaterLevel,
                                        PODZOL))));

        return MaterialRules.sequence(
                autumnalSurface,
                alpineSurface,
                scorchedSurface
        );
    }

    private static MaterialRule makeStateRule(Block block) {
        return MaterialRules.state(block.defaultBlockState());
    }
}