package net.disjoint.blocksforbuilders.util;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BFBTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BOOKSHELVES = createTag("bookshelves");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }
    }
}