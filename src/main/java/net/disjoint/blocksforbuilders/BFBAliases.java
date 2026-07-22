package net.disjoint.blocksforbuilders;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class BFBAliases {
    public static void registerAliases() {
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "red_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "maple_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_red_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_maple_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_sapling"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_sapling"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "orange_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "beech_leaves"));
        BuiltInRegistries.BLOCK.addAlias(Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_orange_oak_leaves"), Identifier.fromNamespaceAndPath(BlocksForBuilders.MOD_ID, "fallen_beech_leaves"));
    }
}
