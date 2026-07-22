package net.disjoint.blocksforbuilders;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

import java.util.function.Function;

import static net.minecraft.world.level.block.Blocks.CAKE;

public class PumpkinPie {
    public static final Block PUMPKIN_PIE = registerBlock(
            PieBlock::new, BlockBehaviour.Properties.ofFullCopy(CAKE).mapColor(MapColor.COLOR_ORANGE));

    private static Block registerBlock(Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        return Blocks.register(keyOf(), factory, settings);
    }
    private static ResourceKey<Block> keyOf() {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "pumpkin_pie"));
    }
    public static void registerPie() {
        BlocksForBuilders.LOGGER.info("Registering Pumpkin Pie for " + BlocksForBuilders.MOD_ID);
    }
}
