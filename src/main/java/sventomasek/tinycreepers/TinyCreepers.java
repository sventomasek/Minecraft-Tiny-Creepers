package sventomasek.tinycreepers;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sventomasek.tinycreepers.entity.ModEntities;
import sventomasek.tinycreepers.entity.custom.TinyCreeperEntity;
import sventomasek.tinycreepers.world.gen.ModWorldGeneration;

public class TinyCreepers implements ModInitializer {
	public static final String MOD_ID = "tiny-creepers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntities.registerModEntities();
		ModWorldGeneration.generateModWorldGen();

		FabricDefaultAttributeRegistry.register(ModEntities.TINYCREEPER, TinyCreeperEntity.createTinyCreeperAttributes());
	}
}
