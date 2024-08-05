package net.disjoint.blocksforbuilders.boatstuff.util;

import net.minecraft.item.Item;

public interface BFBBoatType {

    boolean isRaft();

    Item getItem();

    Item getChestItem();

    Item getPlanks();

    class Builder {
        private boolean raft;
        private Item item;
        private Item chestItem;
        private Item planks;

        public BFBBoatType build() {
            return new BFBBoatTypeImpl(raft, item, chestItem, planks);
        }

        public Builder raft() {
            this.raft = true;
            return this;
        }

        public Builder item(Item item) {
            this.item = item;
            return this;
        }

        public Builder chestItem(Item chestItem) {
            this.chestItem = chestItem;
            return this;
        }

        public Builder block(Item planks) {
            this.planks = planks;
            return this;
        }
    }

}