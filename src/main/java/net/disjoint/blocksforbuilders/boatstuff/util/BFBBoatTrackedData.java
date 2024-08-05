package net.disjoint.blocksforbuilders.boatstuff.util;

import net.disjoint.blocksforbuilders.boatstuff.registry.BFBBoatTypeRegistry;
import net.minecraft.entity.data.TrackedDataHandler;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

import java.util.Optional;

public class BFBBoatTrackedData {

    private BFBBoatTrackedData() {

    }

    public static final PacketCodec<RegistryByteBuf, Optional<BFBBoatType>> PACKET_CODEC = PacketCodecs
            .registryValue(BFBBoatTypeRegistry.INSTANCE.getKey())
            .collect(PacketCodecs::optional);

    public static final TrackedDataHandler<Optional<BFBBoatType>> HANDLER = TrackedDataHandler.create(PACKET_CODEC);

    public static void register() {
        TrackedDataHandlerRegistry.register(HANDLER);
    }
}
