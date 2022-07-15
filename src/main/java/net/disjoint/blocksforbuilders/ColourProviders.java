package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;

import static net.disjoint.blocksforbuilders.BlocksForBuilders.FALLEN_OAK_LEAVES;

public class ColourProviders {
    public static void registerClient() {
        BlockColorProvider FallenOakLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.OAK_LEAVES);
        ItemColorProvider FallenOakLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.OAK_LEAVES);
        BlockColorProvider FallenBirchLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.BIRCH_LEAVES);
        ItemColorProvider FallenBirchLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.BIRCH_LEAVES);
        BlockColorProvider FallenSpruceLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.SPRUCE_LEAVES);
        ItemColorProvider FallenSpruceLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.SPRUCE_LEAVES);
        BlockColorProvider FallenJungleLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.JUNGLE_LEAVES);
        ItemColorProvider FallenJungleLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.JUNGLE_LEAVES);
        BlockColorProvider FallenDarkOakLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.DARK_OAK_LEAVES);
        ItemColorProvider FallenDarkOakLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.DARK_OAK_LEAVES);
        BlockColorProvider FallenAcaciaLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.ACACIA_LEAVES);
        ItemColorProvider FallenAcaciaLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.ACACIA_LEAVES);
        BlockColorProvider FallenMangroveLeavesBlockColorProvider = ColorProviderRegistry.BLOCK.get(Blocks.MANGROVE_LEAVES);
        ItemColorProvider FallenMangroveLeavesItemColorProvider = ColorProviderRegistry.ITEM.get(Blocks.MANGROVE_LEAVES);

        FallenOakLeavesBlockColorProvider = new BFBBlockColourProvider(FallenOakLeavesBlockColorProvider);
        ColorProviderRegistry.BLOCK.register(FallenOakLeavesBlockColorProvider, FALLEN_OAK_LEAVES);
        ColorProviderRegistry.ITEM.register(FallenOakLeavesItemColorProvider, FALLEN_OAK_LEAVES);
    }
}
