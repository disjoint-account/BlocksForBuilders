package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class BFBEntityTagProvider extends FabricTagsProvider.EntityTypeTagsProvider {
    public BFBEntityTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
            tag(EntityTypeTags.BOAT)
                    .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.GHOSTWOOD_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.SCORCHWOOD_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.WILLOW_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.PALM_RAFT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.MAPLE_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.BEECH_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.PINE_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.CEDAR_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.GREEN_JUNGLE_BOAT))
                            .add(BFBEntityTypes.getResourceKey(BFBEntityTypes.GREEN_BAMBOO_RAFT));
    }
}
