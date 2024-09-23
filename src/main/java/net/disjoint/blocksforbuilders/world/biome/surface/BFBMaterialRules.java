package net.disjoint.blocksforbuilders.world.biome.surface;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class BFBMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule SURFACE_BLOCK = makeStateRule(Blocks.PODZOL);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialCondition isAboveSeaLevel = MaterialRules.aboveY(YOffset.fixed(59), 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, SURFACE_BLOCK), DIRT);
        MaterialRules.MaterialRule grassSurface2 = MaterialRules.sequence(MaterialRules.condition(isAboveSeaLevel, grassSurface));

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface2)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}