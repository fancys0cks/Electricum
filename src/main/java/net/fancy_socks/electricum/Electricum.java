package net.fancy_socks.electricum;

import net.fabricmc.api.ModInitializer;

import net.fancy_socks.electricum.block.ModBlocks;
import net.fancy_socks.electricum.item.ModItemGroups;
import net.fancy_socks.electricum.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Electricum implements ModInitializer {
	public static final String MOD_ID = "electricum";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModBlocks.registerBlocks();
		ModItems.registerModItems();

	}
}