package net.disjoint.blocksforbuilders.util.particles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

@Environment(EnvType.CLIENT)
public class BFBLeavesParticle extends SingleQuadParticle {
    private static final float SPEED_SCALE = 0.0025F;
    private static final int field_43373 = 300;
    private static final int field_43366 = 300;
    private float angularVelocity = (float)Math.toRadians(this.random.nextBoolean() ? -30.0 : 30.0);
    private final float angularAcceleration = (float)Math.toRadians(this.random.nextBoolean() ? -5.0 : 5.0);
    private final float field_55127;
    private final boolean field_55128;
    private final boolean field_55129;
    private final double field_55130;
    private final double field_55131;
    private final double field_55132;

    protected BFBLeavesParticle(
            ClientLevel world, double x, double y, double z, TextureAtlasSprite sprite, float gravity, float f, boolean bl, boolean bl2, float size, float initialYVelocity
    ) {
        super(world, x, y, z, sprite);
        this.field_55127 = f;
        this.field_55128 = bl;
        this.field_55129 = bl2;
        this.lifetime = 300;
        this.gravity = gravity * 1.2F * 0.0025F;
        float g = size * (this.random.nextBoolean() ? 0.05F : 0.075F);
        this.quadSize = g;
        this.setSize(g, g);
        this.friction = 1.0F;
        this.yd = -initialYVelocity;
        float h = this.random.nextFloat();
        this.field_55130 = Math.cos(Math.toRadians(h * 60.0F)) * this.field_55127;
        this.field_55131 = Math.sin(Math.toRadians(h * 60.0F)) * this.field_55127;
        this.field_55132 = Math.toRadians(1000.0F + h * 3000.0F);
    }

    @Override
    public SingleQuadParticle.Layer getLayer() {
        return SingleQuadParticle.Layer.OPAQUE;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.lifetime-- <= 0) {
            this.remove();
        }

        if (!this.removed) {
            float f = 300 - this.lifetime;
            float g = Math.min(f / 300.0F, 1.0F);
            double d = 0.0;
            double e = 0.0;
            if (this.field_55129) {
                d += this.field_55130 * Math.pow(g, 1.25);
                e += this.field_55131 * Math.pow(g, 1.25);
            }

            if (this.field_55128) {
                d += g * Math.cos(g * this.field_55132) * this.field_55127;
                e += g * Math.sin(g * this.field_55132) * this.field_55127;
            }

            this.xd += d * 0.0025F;
            this.zd += e * 0.0025F;
            this.yd = this.yd - this.gravity;
            this.angularVelocity = this.angularVelocity + this.angularAcceleration / 20.0F;
            this.oRoll = this.roll;
            this.roll = this.roll + this.angularVelocity / 20.0F;
            this.move(this.xd, this.yd, this.zd);
            if (this.onGround || this.lifetime < 299 && (this.xd == 0.0 || this.zd == 0.0)) {
                this.remove();
            }

            if (!this.removed) {
                this.xd = this.xd * this.friction;
                this.yd = this.yd * this.friction;
                this.zd = this.zd * this.friction;
            }
        }
    }

    @Environment(EnvType.CLIENT)
    public static class GhostwoodLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public GhostwoodLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class GreenJungleLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public GreenJungleLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class WillowLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public WillowLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class PalmLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public PalmLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class MapleLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public MapleLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class BeechLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public BeechLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class PineLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public PineLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class CedarLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public CedarLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class GoldAcaciaLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public GoldAcaciaLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class YellowBirchLeavesFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public YellowBirchLeavesFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            return new net.disjoint.blocksforbuilders.util.particles.BFBLeavesParticle(clientWorld, d, e, f, this.spriteProvider.get(random), 0.07F, 10.0F, true, false, 2.0F, 0.021F);
        }
    }
}
