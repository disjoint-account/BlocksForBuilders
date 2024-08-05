package net.disjoint.blocksforbuilders.boatstuff.entity;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.disjoint.blocksforbuilders.boatstuff.client.BFBBoatClient;
import net.disjoint.blocksforbuilders.boatstuff.registry.BFBBoatTypeRegistry;
import net.disjoint.blocksforbuilders.boatstuff.util.BFBBoatType;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;

import java.util.Map;

@Environment(EnvType.CLIENT)
public class BFBBoatEntityRenderer extends BoatEntityRenderer {
    private final Map<BFBBoatType, Pair<Identifier, CompositeEntityModel<BoatEntity>>> texturesAndModels;

    public BFBBoatEntityRenderer(EntityRendererFactory.Context context, boolean chest) {
        super(context, chest);

        this.texturesAndModels = BFBBoatTypeRegistry.INSTANCE.getEntrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getValue, entry -> {
            boolean raft = entry.getValue().isRaft();
            String prefix = raft ? (chest ? "chest_raft/" : "raft/") : (chest ? "chest_boat/" : "boat/");

            Identifier id = entry.getKey().getValue();
            Identifier textureId = id.withPath(path -> "textures/entity/" + prefix + path + ".png");

            EntityModelLayer layer = BFBBoatClient.getLayer(id, raft, chest);
            CompositeEntityModel<BoatEntity> model = createModel(context.getPart(layer), raft, chest);

            return new Pair<>(textureId, model);
        }));
    }

    @Override
    public Identifier getTexture(BoatEntity entity) {
        if (entity instanceof BFBBoatHolder) {
            BFBBoatType boat = ((BFBBoatHolder) entity).getBFBBoat();
            return this.texturesAndModels.get(boat).getFirst();
        }
        return super.getTexture(entity);
    }

    public Pair<Identifier, CompositeEntityModel<BoatEntity>> getTextureAndModel(BFBBoatHolder holder) {
        return this.texturesAndModels.get(holder.getBFBBoat());
    }

    private CompositeEntityModel<BoatEntity> createModel(ModelPart part, boolean raft, boolean chest) {
        if (raft) {
            return chest ? new ChestRaftEntityModel(part) : new RaftEntityModel(part);
        } else {
            return chest ? new ChestBoatEntityModel(part) : new BoatEntityModel(part);
        }
    }
}