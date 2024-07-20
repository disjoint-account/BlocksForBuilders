package net.disjoint.blocksforbuilders;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BFBItemGroup {
    public static ItemGroup BLOCKSFORBUILDERS = Registry.register(Registries.ITEM_GROUP, new Identifier(BlocksForBuilders.MOD_ID, "blocksforbuilders"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocksforbuilders"))
                    .icon(() -> new ItemStack(BlocksForBuilders.GHOSTWOOD_PLANKS)).entries((displayContext, entries) -> {
                        entries.add(BlocksForBuilders.GHOSTWOOD_LOG);
                        entries.add(BlocksForBuilders.STRIPPED_GHOSTWOOD_LOG);
                        entries.add(BlocksForBuilders.GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuilders.STRIPPED_GHOSTWOOD_WOOD);
                        entries.add(BlocksForBuilders.GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_GHOSTWOOD_LEAVES);
                        entries.add(BlocksForBuilders.GHOSTWOOD_SAPLING);
                        entries.add(BlocksForBuilders.GHOSTWOOD_PLANKS);
                        entries.add(BlocksForBuilders.GHOSTWOOD_STAIRS);
                        entries.add(BlocksForBuilders.GHOSTWOOD_SLAB);
                        entries.add(BlocksForBuilders.GHOSTWOOD_FENCE);
                        entries.add(BlocksForBuilders.GHOSTWOOD_FENCE_GATE);
                        entries.add(BlocksForBuilders.GHOSTWOOD_BUTTON);
                        entries.add(BlocksForBuilders.GHOSTWOOD_PRESSURE_PLATE);
                        entries.add(BlocksForBuilders.GHOSTWOOD_DOOR);
                        entries.add(BlocksForBuilders.GHOSTWOOD_TRAPDOOR);
                        entries.add(BlocksForBuilders.GHOSTWOOD_SIGN_ITEM);
                        entries.add(BlocksForBuilders.GHOSTWOOD_HANGING_SIGN_ITEM);
                        entries.add(BFBEntities.GHOSTWOOD_BOAT.getItem());
                        entries.add(BFBEntities.GHOSTWOOD_BOAT.getChestItem());
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuilders.STRIPPED_GREEN_JUNGLE_LOG);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuilders.STRIPPED_GREEN_JUNGLE_WOOD);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_GREEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_SAPLING);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_PLANKS);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_STAIRS);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_SLAB);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_FENCE);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_FENCE_GATE);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_BUTTON);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_PRESSURE_PLATE);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_DOOR);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_TRAPDOOR);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_SIGN_ITEM);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_HANGING_SIGN_ITEM);
                        entries.add(BFBEntities.GREEN_JUNGLE_BOAT.getItem());
                        entries.add(BFBEntities.GREEN_JUNGLE_BOAT.getChestItem());
                        entries.add(BlocksForBuilders.RED_OAK_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_RED_OAK_LEAVES);
                        entries.add(BlocksForBuilders.RED_OAK_SAPLING);
                        entries.add(BlocksForBuilders.GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_GOLD_ACACIA_LEAVES);
                        entries.add(BlocksForBuilders.GOLD_ACACIA_SAPLING);
                        entries.add(BlocksForBuilders.FALLEN_OAK_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_BIRCH_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_SPRUCE_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_JUNGLE_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_DARK_OAK_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_ACACIA_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_AZALEA_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_FLOWERING_AZALEA_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_MANGROVE_LEAVES);
                        entries.add(BlocksForBuilders.FALLEN_CHERRY_LEAVES);
                        entries.add(BlocksForBuilders.BIRCH_BOOKSHELF);
                        entries.add(BlocksForBuilders.SPRUCE_BOOKSHELF);
                        entries.add(BlocksForBuilders.JUNGLE_BOOKSHELF);
                        entries.add(BlocksForBuilders.DARK_OAK_BOOKSHELF);
                        entries.add(BlocksForBuilders.ACACIA_BOOKSHELF);
                        entries.add(BlocksForBuilders.CRIMSON_BOOKSHELF);
                        entries.add(BlocksForBuilders.WARPED_BOOKSHELF);
                        entries.add(BlocksForBuilders.MANGROVE_BOOKSHELF);
                        entries.add(BlocksForBuilders.CHERRY_BOOKSHELF);
                        entries.add(BlocksForBuilders.BAMBOO_BOOKSHELF);
                        entries.add(BlocksForBuilders.GHOSTWOOD_BOOKSHELF);
                        entries.add(BlocksForBuilders.GREEN_JUNGLE_BOOKSHELF);
                        entries.add(BlocksForBuilders.SMOOTH_STONE_STAIRS);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuilders.CHISELED_BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuilders.CRACKED_BLACK_NETHER_BRICKS);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICK_STAIRS);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICK_SLAB);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICK_WALL);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICK_FENCE);
                        entries.add(BlocksForBuilders.BLACK_NETHER_BRICK_FENCE_GATE);
                        entries.add(BlocksForBuilders.CHISELED_RED_NETHER_BRICKS);
                        entries.add(BlocksForBuilders.CRACKED_RED_NETHER_BRICKS);
                        entries.add(BlocksForBuilders.RED_NETHER_BRICK_FENCE);
                        entries.add(BlocksForBuilders.RED_NETHER_BRICK_FENCE_GATE);
                        entries.add(BlocksForBuilders.NETHER_BRICK_FENCE_GATE);
                        entries.add(BlocksForBuilders.PAPER_LANTERN);

                    }).build());
    public static void registerItemGroups() {
    }
}

