package org.liabri.perit;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.liabri.perit.blocks.Blocks;
import org.liabri.perit.items.Items;
import org.liabri.perit.materials.Materials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Perit implements ModInitializer {
	public static final String MOD_ID = "perit";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {
		Materials.init();
		Blocks.init();
		Items.init();
	}
}
