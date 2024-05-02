package sventomasek.tinycreepers.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import sventomasek.tinycreepers.TinyCreepers;
import sventomasek.tinycreepers.entity.custom.TinyCreeperEntity;

public class TinyCreeperRenderer extends MobEntityRenderer<TinyCreeperEntity, TinyCreeperModel<TinyCreeperEntity>> {
    private static final Identifier TEXTURE = new Identifier(TinyCreepers.MOD_ID, "textures/entity/tinycreeper.png");

    public TinyCreeperRenderer(EntityRendererFactory.Context context) {
        super(context, new TinyCreeperModel<>(context.getPart(ModModelLayers.TINYCREEPER)), 0.6f);
    }

    @Override
    public Identifier getTexture(TinyCreeperEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(TinyCreeperEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
