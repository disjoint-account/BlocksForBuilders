package net.disjoint.blocksforbuilders.signstuff;

import net.minecraft.block.AbstractBlock;
public interface BlockSettingsLock {
    public void lock();

    public static AbstractBlock.Settings lock(AbstractBlock.Settings settings) {
        ((BlockSettingsLock) settings).lock();
        return settings;
    }
}