package sventomasek.tinycreepers.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import sventomasek.tinycreepers.TinyCreepers;
import sventomasek.tinycreepers.entity.custom.TinyCreeperEntity;

public class ModEntities {
    public static final EntityType<TinyCreeperEntity> TINYCREEPER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TinyCreepers.MOD_ID, "tinycreeper"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TinyCreeperEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static void registerModEntities() {
        TinyCreepers.LOGGER.info("Registering Entities for " + TinyCreepers.MOD_ID);
    }
}
