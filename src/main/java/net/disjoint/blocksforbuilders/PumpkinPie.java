package net.disjoint.blocksforbuilders;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.CAKE;

public class PumpkinPie {
    public static final Block PUMPKIN_PIE = registerBlock("pumpkin_pie",
            new PieBlock(AbstractBlock.Settings.copy(CAKE).mapColor(MapColor.ORANGE)));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name), block);
    }
}
