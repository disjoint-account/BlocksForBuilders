package net.disjoint.blocksforbuilders;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry.createKey;

public class BFBEntities {
    public static final TerraformBoatType GREEN_JUNGLE_BOAT = registerBoat("green_jungle");
    public static final TerraformBoatType GHOSTWOOD_BOAT = registerBoat("ghostwood");

    public static TerraformBoatType registerBoat(String boatPath) {
        Identifier id = BlocksForBuilders.id(boatPath + "_boat");
        Identifier chestId = BlocksForBuilders.id(boatPath + "_chest_boat");
        RegistryKey<TerraformBoatType> boatId = createKey(BlocksForBuilders.id(boatPath));

        Item item = TerraformBoatItemHelper.registerBoatItem(id, boatId, false);
        Item chestItem = TerraformBoatItemHelper.registerBoatItem(chestId, boatId, true);

        TerraformBoatType boatType = new TerraformBoatType.Builder().item(item).chestItem(chestItem).build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, boatId, boatType);

        return boatType;

    }

    public static TerraformBoatType registerRaft(String raftPath) {
        Identifier raftId = BlocksForBuilders.id(raftPath + "_raft");
        Identifier chestRaftId = BlocksForBuilders.id(raftPath + "_chest_raft");
        RegistryKey<TerraformBoatType> raftKey = createKey(BlocksForBuilders.id(raftPath));

        Item raftItem = TerraformBoatItemHelper.registerBoatItem(raftId, raftKey, false);
        Item chestRaftItem = TerraformBoatItemHelper.registerBoatItem(chestRaftId, raftKey, true);

        TerraformBoatType raftType = new TerraformBoatType.Builder().raft().item(raftItem).chestItem(chestRaftItem).build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, raftKey, raftType);

        return raftType;

    }
}