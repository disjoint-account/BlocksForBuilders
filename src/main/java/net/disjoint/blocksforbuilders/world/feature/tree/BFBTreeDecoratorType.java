package net.disjoint.blocksforbuilders.world.feature.tree;

import com.mojang.serialization.MapCodec;
import net.disjoint.blocksforbuilders.BlocksForBuilders;
import net.disjoint.blocksforbuilders.world.feature.tree.decorators.CoconutTreeDecorator;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

public class BFBTreeDecoratorType <P extends TreeDecorator> {
    public static final TreeDecoratorType<CoconutTreeDecorator> COCONUT = register("coconut", CoconutTreeDecorator.CODEC);
    private final MapCodec<P> codec;

    private static <P extends TreeDecorator> TreeDecoratorType<P> register(String id, MapCodec<P> codec) {
        return Registry.register(BuiltInRegistries.TREE_DECORATOR_TYPE, id, new TreeDecoratorType<>(codec));
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
