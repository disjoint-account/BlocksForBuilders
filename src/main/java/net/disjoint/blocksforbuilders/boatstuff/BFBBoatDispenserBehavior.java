package net.disjoint.blocksforbuilders.boatstuff;

import net.disjoint.blocksforbuilders.BlocksForBuildersItems;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

public interface BFBBoatDispenserBehavior {
    static void registerDefaults() {
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.WILLOW_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.WILLOW_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.WILLOW_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PALM_RAFT, new BoatDispenseItemBehavior(BFBEntityTypes.PALM_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PALM_CHEST_RAFT, new BoatDispenseItemBehavior(BFBEntityTypes.PALM_CHEST_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.MAPLE_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.MAPLE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.MAPLE_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.MAPLE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.BEECH_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.BEECH_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.BEECH_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.BEECH_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PINE_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.PINE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.PINE_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.PINE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.CEDAR_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.CEDAR_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.CEDAR_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.CEDAR_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.GHOSTWOOD_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GHOSTWOOD_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.GHOSTWOOD_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.SCORCHWOOD_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.SCORCHWOOD_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.SCORCHWOOD_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.SCORCHWOOD_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.GREEN_JUNGLE_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_JUNGLE_CHEST_BOAT, new BoatDispenseItemBehavior(BFBEntityTypes.GREEN_JUNGLE_CHEST_BOAT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_RAFT, new BoatDispenseItemBehavior(BFBEntityTypes.GREEN_BAMBOO_RAFT));
        DispenserBlock.registerBehavior(BlocksForBuildersItems.GREEN_BAMBOO_CHEST_RAFT, new BoatDispenseItemBehavior(BFBEntityTypes.GREEN_BAMBOO_CHEST_RAFT));
    }
}