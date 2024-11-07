package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
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
		BFBEntityTypes.registerEntityTypes();
		Instance.init();
	}

}


