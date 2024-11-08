package net.disjoint.blocksforbuilders;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.CAKE;

public class PumpkinPie {
    public static final Block PUMPKIN_PIE = registerBlock(
            PieBlock::new, AbstractBlock.Settings.copy(CAKE).mapColor(MapColor.ORANGE));

    private static Block registerBlock(Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return Blocks.register(keyOf(), factory, settings);
    }
    private static RegistryKey<Block> keyOf() {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, "pumpkin_pie"));
    }
}
