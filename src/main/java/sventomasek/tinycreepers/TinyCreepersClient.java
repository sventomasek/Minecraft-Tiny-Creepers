package sventomasek.tinycreepers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import sventomasek.tinycreepers.entity.ModEntities;
import sventomasek.tinycreepers.entity.client.ModModelLayers;
import sventomasek.tinycreepers.entity.client.TinyCreeperModel;
import sventomasek.tinycreepers.entity.client.TinyCreeperRenderer;

public class TinyCreepersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TINYCREEPER, TinyCreeperRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TINYCREEPER, TinyCreeperModel::getTexturedModelData);
    }
}
