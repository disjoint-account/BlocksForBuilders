package net.disjoint.blocksforbuilders.world.biome.surface;

import net.disjoint.blocksforbuilders.BlocksForBuildersBlocks;
import net.disjoint.blocksforbuilders.world.biome.BFBBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class BFBMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule PODZOL = makeStateRule(Blocks.PODZOL);
    private static final MaterialRules.MaterialRule ASH = makeStateRule(BlocksForBuildersBlocks.SCORCHED_GRASS);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialCondition isAboveSeaLevel = MaterialRules.aboveY(YOffset.fixed(59), 0);
        MaterialRules.MaterialCondition isInAutumnalForest = MaterialRules.biome(BFBBiomes.AUTUMNAL_FOREST);
        MaterialRules.MaterialCondition isInScorchedForest = MaterialRules.biome(BFBBiomes.SCORCHED_FOREST);

        MaterialRules.MaterialRule podzolSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, PODZOL), DIRT);
        MaterialRules.MaterialRule podzolSurface1 = MaterialRules.sequence(MaterialRules.condition(isAboveSeaLevel, podzolSurface));
        MaterialRules.MaterialRule podzolSurface2 = MaterialRules.sequence(MaterialRules.condition(isInAutumnalForest, podzolSurface1));

        MaterialRules.MaterialRule ashSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, ASH), DIRT);
        MaterialRules.MaterialRule ashSurface1 = MaterialRules.sequence(MaterialRules.condition(isAboveSeaLevel, ashSurface));
        MaterialRules.MaterialRule ashSurface2 = MaterialRules.sequence(MaterialRules.condition(isInScorchedForest, ashSurface1));

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, podzolSurface2),
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, ashSurface2)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}