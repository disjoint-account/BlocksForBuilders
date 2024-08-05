package net.disjoint.blocksforbuilders.signstuff.util;

import net.minecraft.block.AbstractBlock;
public interface BlockSettingsLock {

    void bfb$lock();

    static AbstractBlock.Settings lock(AbstractBlock.Settings settings) {
        ((BlockSettingsLock) settings).bfb$lock();
        return settings;
    }
}