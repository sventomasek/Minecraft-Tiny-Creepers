package sventomasek.tinycreepers.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import sventomasek.tinycreepers.TinyCreepers;

public class ModModelLayers {
    public static final EntityModelLayer TINYCREEPER =
            new EntityModelLayer(new Identifier(TinyCreepers.MOD_ID, "tinycreeper"), "main");
}
