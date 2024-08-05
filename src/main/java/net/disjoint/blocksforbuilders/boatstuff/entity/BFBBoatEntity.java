package net.disjoint.blocksforbuilders.boatstuff.entity;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatTrackedData;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Optional;

public class BFBBoatEntity extends BoatEntity implements BFBBoatHolder {
    private static final TrackedData<Optional<BFBBoatType>> BFB_BOAT = DataTracker.registerData(BFBBoatEntity.class, BFBBoatTrackedData.HANDLER);

    public BFBBoatEntity(EntityType<? extends BFBBoatEntity> type, World world) {
        super(type, world);
    }

    public BFBBoatEntity(World world) {
        this(BlocksForBuilders.BOAT, world);
    }

    public BFBBoatEntity(World world, double x, double y, double z) {
        this(BlocksForBuilders.BOAT, world);

        this.setPosition(x, y, z);
        this.prevX = x;
        this.prevY = y;
        this.prevZ = z;
    }

    @Override
    public BFBBoatType getBFBBoat() {
        return this.dataTracker.get(BFB_BOAT).orElse(null);
    }

    @Override
    public void setBFBBoat(BFBBoatType boat) {
        this.dataTracker.set(BFB_BOAT, Optional.of(boat));
    }

    @Override
    protected Text getDefaultName() {
        if (this.getBFBBoat() == null) {
            return EntityType.BOAT.getName();
        }

        return super.getDefaultName();
    }

    @Override
    public Item asItem() {
        return this.getBFBBoat().getItem();
    }

    @Override
    public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
        return this.hasValidTerraformBoat() && super.shouldRender(cameraX, cameraY, cameraZ);
    }

    @Override
    public void tick() {
        if (this.hasValidTerraformBoat()) {
            super.tick();
        } else {
            this.discard();
        }
    }

    @Override
    public void setVariant(BoatEntity.Type type) {
        return;
    }

    @Override
    public BoatEntity.Type getVariant() {
        return this.getImpersonatedBoatType();
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(BFB_BOAT, Optional.empty());
    }

    // Serialization
    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.readBFBBoatFromNbt(nbt);

        if (!this.hasValidTerraformBoat()) {
            this.discard();
        }
    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        this.writeBFBBoatToNbt(nbt);
    }
}