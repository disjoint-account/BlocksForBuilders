package net.disjoint.blocksforbuilders;

import net.disjoint.blocksforbuilders.boatstuff.entity.BFBBoatEntity;
import net.disjoint.blocksforbuilders.boatstuff.entity.BFBChestBoatEntity;
import net.disjoint.blocksforbuilders.boatstuff.registry.BoatTypes;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatTrackedData;
import net.disjoint.blocksforbuilders.world.gen.BlocksForBuildersWorldGen;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlocksForBuilders implements ModInitializer {

	public static final String MOD_ID = "blocksforbuilders";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	private static final Identifier BOAT_ID = Identifier.of(BlocksForBuilders.MOD_ID, "boat");
	public static final EntityType<BFBBoatEntity> BOAT = EntityType.Builder.<BFBBoatEntity>create(BFBBoatEntity::new, SpawnGroup.MISC)
			.dimensions(1.375f, 0.5625f)
			.build("boat");

	private static final Identifier CHEST_BOAT_ID = Identifier.of(BlocksForBuilders.MOD_ID, "chest_boat");
	public static final EntityType<BFBChestBoatEntity> CHEST_BOAT = EntityType.Builder.<BFBChestBoatEntity>create(BFBChestBoatEntity::new, SpawnGroup.MISC)
			.dimensions(1.375f, 0.5625f)
			.build("chest_boat");

	@Override
	public void onInitialize() {
		BlocksForBuildersWorldGen.generateBlocksForBuildersWorldGen();
		BFBItemGroup.registerItemGroups();
		BlocksForBuildersBlocks.registerModBlocks();
		BlocksForBuildersItems.registerModItems();
		BoatTypes.registerBoatTypes();
		BFBBoatTrackedData.register();
		Registry.register(Registries.ENTITY_TYPE, BOAT_ID, BOAT);
		Registry.register(Registries.ENTITY_TYPE, CHEST_BOAT_ID, CHEST_BOAT);
		Instance.init();
	}

}


