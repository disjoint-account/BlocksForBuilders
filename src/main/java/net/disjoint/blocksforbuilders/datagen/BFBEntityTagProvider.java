package net.disjoint.blocksforbuilders.datagen;

import net.disjoint.blocksforbuilders.boatstuff.BFBEntityTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class BFBEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public BFBEntityTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
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
