package net.disjoint.blocksforbuilders.util;

import com.mojang.datafixers.types.templates.Tag;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlocksForBuildersTags {
    public static class Blocks {
        public static final TagKey<Block> BOOKSHELVES =
                createTag("bookshelves");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(BlocksForBuilders.MOD_ID, name));
        }

    }

    public static class Items {

        }

}
