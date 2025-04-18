package net.exegov.guidemod;

import net.exegov.guidemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Test Comment
public class GuideMod implements ModInitializer {
	public static final String MOD_ID = "guidemod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}