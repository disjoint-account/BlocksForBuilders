package net.disjoint.blocksforbuilders.util;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;

public class BFBSimpleParticleType extends ParticleType<BFBSimpleParticleType> implements ParticleEffect {
    private final MapCodec<BFBSimpleParticleType> codec = MapCodec.unit(this::getType);
    private final PacketCodec<RegistryByteBuf, BFBSimpleParticleType> packetCodec = PacketCodec.unit(this);

    public BFBSimpleParticleType(boolean alwaysShow) {
        super(alwaysShow);
    }

    public BFBSimpleParticleType getType() {
        return this;
    }

    public MapCodec<BFBSimpleParticleType> getCodec() {
        return this.codec;
    }

    public PacketCodec<RegistryByteBuf, BFBSimpleParticleType> getPacketCodec() {
        return this.packetCodec;
    }
}