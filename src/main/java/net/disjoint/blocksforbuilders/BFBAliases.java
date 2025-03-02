package net.disjoint.blocksforbuilders;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class BFBAliases {
    public static void registerAliases() {
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "red_oak_sapling"), Identifier.of(BlocksForBuilders.MOD_ID, "maple_sapling"));
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "red_oak_leaves"), Identifier.of(BlocksForBuilders.MOD_ID, "maple_leaves"));
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "fallen_red_oak_leaves"), Identifier.of(BlocksForBuilders.MOD_ID, "fallen_maple_leaves"));
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "orange_oak_sapling"), Identifier.of(BlocksForBuilders.MOD_ID, "beech_sapling"));
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "orange_oak_leaves"), Identifier.of(BlocksForBuilders.MOD_ID, "beech_leaves"));
        Registries.BLOCK.addAlias(Identifier.of(BlocksForBuilders.MOD_ID, "fallen_orange_oak_leaves"), Identifier.of(BlocksForBuilders.MOD_ID, "fallen_beech_leaves"));
    }
}
