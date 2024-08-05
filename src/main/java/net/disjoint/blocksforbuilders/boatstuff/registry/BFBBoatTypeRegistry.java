package net.disjoint.blocksforbuilders.boatstuff.registry;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BFBBoatTypeRegistry {
    private static final RegistryKey<Registry<BFBBoatType>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.of(BlocksForBuilders.MOD_ID, "boat"));

    public static final Registry<BFBBoatType> INSTANCE = FabricRegistryBuilder.createSimple(REGISTRY_KEY).buildAndRegister();

    public static RegistryKey<BFBBoatType> createKey(Identifier id) {
        return RegistryKey.of(REGISTRY_KEY, id);
    }


}