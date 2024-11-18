package net.disjoint.blocksforbuilders.world.feature.tree;

import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.mixin.MixinTrunkPlacerTypeInvoker;
import net.disjoint.blocksforbuilders.world.feature.tree.custom.ScorchwoodTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class BFBTrunkPlacerTypes {
    public static final TrunkPlacerType<?> SCORCHWOOD_TRUNK_PLACER = MixinTrunkPlacerTypeInvoker.callRegister("scorchwood_trunk_placer",
            ScorchwoodTrunkPlacer.CODEC);

    public static void register() {
        BlocksForBuilders.LOGGER.info("Registering Trunk Placers for " + BlocksForBuilders.MOD_ID);
    }
}
