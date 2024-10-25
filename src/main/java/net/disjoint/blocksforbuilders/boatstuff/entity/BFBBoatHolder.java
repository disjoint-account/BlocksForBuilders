package net.disjoint.blocksforbuilders.boatstuff.entity;

import net.disjoint.blocksforbuilders.boatstuff.registry.BFBBoatTypeRegistry;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

public interface BFBBoatHolder {
    String BOAT_KEY = "BFBBoat";

    BFBBoatType getBFBBoat();

    void setBFBBoat(BFBBoatType boat);

    default boolean hasValidTerraformBoat() {
        return this.getBFBBoat() != null;
    }

    default void readBFBBoatFromNbt(NbtCompound nbt) {
        Identifier id = Identifier.tryParse(nbt.getString(BOAT_KEY));
        if (id != null) {
            BFBBoatType boat = BFBBoatTypeRegistry.INSTANCE.get(id);
            if (boat != null) {
                this.setBFBBoat(boat);
            }
        }
    }

    default void writeBFBBoatToNbt(NbtCompound nbt) {
        Identifier boatId = BFBBoatTypeRegistry.INSTANCE.getId(this.getBFBBoat());
        if (boatId != null) {
            nbt.putString(BOAT_KEY, boatId.toString());
        }
    }

    default EntityType<? extends AbstractBoatEntity> getImpersonatedBoatType() {
        return this.getBFBBoat().isRaft() ? EntityType.BAMBOO_RAFT : EntityType.OAK_BOAT;
    }
}
