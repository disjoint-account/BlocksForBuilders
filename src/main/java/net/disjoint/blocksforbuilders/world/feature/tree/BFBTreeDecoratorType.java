package net.disjoint.blocksforbuilders.world.feature.tree;

import com.mojang.serialization.MapCodec;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.tree.decorators.CoconutTreeDecorator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class BFBTreeDecoratorType <P extends TreeDecorator> {
    public static final TreeDecoratorType<CoconutTreeDecorator> COCONUT = register("coconut", CoconutTreeDecorator.CODEC);
    private final MapCodec<P> codec;

    private static <P extends TreeDecorator> TreeDecoratorType<P> register(String id, MapCodec<P> codec) {
        return Registry.register(Registries.TREE_DECORATOR_TYPE, id, new TreeDecoratorType<>(codec));
    }

    public BFBTreeDecoratorType(MapCodec<P> codec) {
        this.codec = codec;
    }

    public MapCodec<P> getCodec() {
        return this.codec;
    }

    public static void register() {
        BlocksForBuilders.LOGGER.info("Registering Trunk Placers for " + BlocksForBuilders.MOD_ID);
    }
}
