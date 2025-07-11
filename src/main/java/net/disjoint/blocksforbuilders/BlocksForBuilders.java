package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBBoatDispenserBehavior;
import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.disjoint.blocksforbuilders.util.particles.BFBParticleTypes;
import net.disjoint.blocksforbuilders.villagers.BFBVillagerTrades;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTreeDecoratorType;
import net.disjoint.blocksforbuilders.world.feature.tree.BFBTrunkPlacerTypes;
import net.disjoint.blocksforbuilders.world.gen.BlocksForBuildersWorldGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksForBuilders implements ModInitializer {

	public static final String MOD_ID = "blocksforbuilders";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		BlocksForBuildersWorldGen.generateBlocksForBuildersWorldGen();
		BFBItemGroup.registerItemGroups();
		BlocksForBuildersBlocks.registerModBlocks();
		BlocksForBuildersItems.registerModItems();
		BFBAliases.registerAliases();
		BFBEntityTypes.registerEntityTypes();
		BFBTrunkPlacerTypes.register();
		BFBTreeDecoratorType.register();
		BFBBoatDispenserBehavior.registerDefaults();
		BFBParticleTypes.registerParticles();
		BFBVillagerTrades.registerTrades();
		Instance.init();
	}
}


