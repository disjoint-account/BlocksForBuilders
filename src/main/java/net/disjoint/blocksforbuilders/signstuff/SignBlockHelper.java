package net.disjoint.blocksforbuilders.signstuff;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

@SuppressWarnings("unused")
public class SignBlockHelper {
    private static final Map<Identifier, WoodType> WOOD_TYPE_CACHE = new ConcurrentHashMap<>();

    private SignBlockHelper() {
    }

    public static <T extends AbstractSignBlock> T registerSignBlock(RegistryKey<Block> key, T block) {
        if (block instanceof SignBlock || block instanceof WallSignBlock) {
            BlockEntityType.SIGN.addSupportedBlock(block);
        } else if (block instanceof HangingSignBlock || block instanceof WallHangingSignBlock) {
            BlockEntityType.HANGING_SIGN.addSupportedBlock(block);
        } else {
            throw new IllegalArgumentException("This method only accepts vanilla sign blocks and descendants!");
        }

        return Registry.register(Registries.BLOCK, key, block);
    }

    public static <T extends AbstractSignBlock> T registerSignBlock(Identifier id, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);

        return registerSignBlock(key, factory.apply(settings.registryKey(key)));
    }

    public static WoodType registerDefaultWoodType(Identifier typeId) {
        return WOOD_TYPE_CACHE.computeIfAbsent(typeId, id -> WoodTypeBuilder.copyOf(WoodType.OAK).register(id, BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(id)));
    }
}
