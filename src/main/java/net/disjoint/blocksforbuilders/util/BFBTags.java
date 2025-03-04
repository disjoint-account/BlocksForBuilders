package net.disjoint.blocksforbuilders.util;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class BFBTags {
    public static class Blocks {
        public static final TagKey<Block> AUTUMNAL_FOREST_BLOCKS = createTag("autumnal_forest_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BOOKSHELVES = createTag("bookshelves");
        public static final TagKey<Item> GHOSTWOOD_LOGS = createTag("ghostwood_wood");
        public static final TagKey<Item> SCORCHWOOD_LOGS = createTag("scorchwood_wood");
        public static final TagKey<Item> GREEN_JUNGLE_LOGS = createTag("green_jungle_wood");
        public static final TagKey<Item> WILLOW_LOGS = createTag("willow_wood");
        public static final TagKey<Item> PALM_LOGS = createTag("palm_wood");
        public static final TagKey<Item> MAPLE_LOGS = createTag("maple_wood");
        public static final TagKey<Item> BEECH_LOGS = createTag("beech_wood");
        public static final TagKey<Item> PINE_LOGS = createTag("pine_wood");
        public static final TagKey<Item> CEDAR_LOGS = createTag("cedar_wood");
        public static final TagKey<Item> COCONUTS = createTag("coconuts");
        public static final TagKey<Item> BFB_TAG = createTag("bfb_tag");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> SPAWNS_RUSTY_WOLF = createTag("spawns_rusty_wolf");
        public static final TagKey<Biome> SPAWNS_WOODS_WOLF = createTag("spawns_woods_wolf");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.of(RegistryKeys.BIOME, Identifier.of(BlocksForBuilders.MOD_ID, name));
        }
    }
}