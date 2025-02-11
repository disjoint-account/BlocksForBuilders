package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.BoatDispenserBehavior;

public interface BFBBoatDispenserBehavior {
    static void registerDefaults() {
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_BOAT, new BoatDispenserBehavior(BFBEntityTypes.WILLOW_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.WILLOW_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PALM_RAFT, new BoatDispenserBehavior(BFBEntityTypes.PALM_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PALM_CHEST_RAFT, new BoatDispenserBehavior(BFBEntityTypes.PALM_CHEST_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.MAPLE_BOAT, new BoatDispenserBehavior(BFBEntityTypes.MAPLE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.MAPLE_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.MAPLE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.BEECH_BOAT, new BoatDispenserBehavior(BFBEntityTypes.BEECH_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.BEECH_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.BEECH_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PINE_BOAT, new BoatDispenserBehavior(BFBEntityTypes.PINE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PINE_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.PINE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GHOSTWOOD_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.SCORCHWOOD_BOAT, new BoatDispenserBehavior(BFBEntityTypes.SCORCHWOOD_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_JUNGLE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_BAMBOO_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, new BoatDispenserBehavior(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT));
    }
}