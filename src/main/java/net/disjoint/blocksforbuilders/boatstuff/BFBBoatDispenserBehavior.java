package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.BoatDispenserBehavior;

public interface BFBBoatDispenserBehavior {
    static void registerDefaults() {
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_BOAT, new BoatDispenserBehavior(BFBEntityTypes.WILLOW_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.WILLOW_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GHOSTWOOD_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_JUNGLE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_BAMBOO_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT));
    }
}