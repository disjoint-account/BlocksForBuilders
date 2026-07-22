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
            valueLookupBuilder(EntityTypeTags.BOAT)
                    .add(BFBEntityTypes.GHOSTWOOD_BOAT,
                            BFBEntityTypes.SCORCHWOOD_BOAT,
                            BFBEntityTypes.WILLOW_BOAT,
                            BFBEntityTypes.PALM_RAFT,
                            BFBEntityTypes.MAPLE_BOAT,
                            BFBEntityTypes.BEECH_BOAT,
                            BFBEntityTypes.PINE_BOAT,
                            BFBEntityTypes.CEDAR_BOAT,
                            BFBEntityTypes.GREEN_JUNGLE_BOAT,
                            BFBEntityTypes.GREEN_BAMBOO_RAFT);
    }
}
