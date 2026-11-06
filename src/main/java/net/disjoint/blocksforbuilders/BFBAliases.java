package net.disjoint.blocksforbuilders;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class BFBAliases {
    public static void registerAliases() {
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_sapling"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "potted_red_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "potted_maple_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_leaves"), Identifier.withDefaultNamespace("red_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_leaves"), Identifier.withDefaultNamespace("red_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_red_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_maple_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_red_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_maple_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_sapling"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "potted_orange_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "potted_beech_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_leaves"), Identifier.withDefaultNamespace("orange_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_leaves"), Identifier.withDefaultNamespace("orange_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_orange_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_beech_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_orange_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_beech_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_leaves"), Identifier.withDefaultNamespace("red_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_leaves"), Identifier.withDefaultNamespace("red_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_leaves"), Identifier.withDefaultNamespace("orange_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_leaves"), Identifier.withDefaultNamespace("orange_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_leaves"), Identifier.withDefaultNamespace("yellow_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_leaves"), Identifier.withDefaultNamespace("yellow_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_yellow_birch_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_poplar_leaves"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_yellow_birch_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_poplar_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_hedge"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "poplar_hedge"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_hedge"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "poplar_hedge"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_sapling"), Identifier.withDefaultNamespace("poplar_sapling"));
        BuiltInRegistries.ITEM.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "yellow_birch_sapling"), Identifier.withDefaultNamespace("poplar_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "potted_yellow_birch_sapling"), Identifier.withDefaultNamespace("potted_poplar_sapling"));
    }
}
