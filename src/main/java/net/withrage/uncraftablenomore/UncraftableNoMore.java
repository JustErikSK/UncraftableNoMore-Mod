package net.withrage.uncraftablenomore;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UncraftableNoMore implements ModInitializer {
	public static final String MOD_ID = "uncraftablenomore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mod Uncraftable No More is loaded!");
	}
}