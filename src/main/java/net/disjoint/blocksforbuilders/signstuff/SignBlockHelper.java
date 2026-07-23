package net.disjoint.blocksforbuilders.signstuff;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.SignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

@SuppressWarnings("unused")
public class SignBlockHelper {
    private static final Map<Identifier, WoodType> WOOD_TYPE_CACHE = new ConcurrentHashMap<>();

    private SignBlockHelper() {
    }

    public static <T extends SignBlock> T registerSignBlock(ResourceKey<Block> key, T block) {
        if (block instanceof StandingSignBlock || block instanceof WallSignBlock) {
            BlockEntityTypes.SIGN.addValidBlock(block);
        } else if (block instanceof CeilingHangingSignBlock || block instanceof WallHangingSignBlock) {
            BlockEntityTypes.HANGING_SIGN.addValidBlock(block);
        } else {
            throw new IllegalArgumentException("This method only accepts vanilla sign blocks and descendants!");
        }

        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    public static <T extends SignBlock> T registerSignBlock(Identifier id, Function<BlockBehaviour.Properties, T> factory, BlockBehaviour.Properties settings) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);

        return registerSignBlock(key, factory.apply(settings.setId(key)));
    }

    public static WoodType registerDefaultWoodType(Identifier typeId) {
        return WOOD_TYPE_CACHE.computeIfAbsent(typeId, id -> WoodTypeBuilder.copyOf(WoodType.OAK).register(id, BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(id)));
    }
}
