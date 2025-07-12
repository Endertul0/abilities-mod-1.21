package net.endertul.abilmod;

import net.endertul.abilmod.block.ModBlocks;
import net.endertul.abilmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbilitiesMod implements ModInitializer {
	public static final String MOD_ID = "abilities-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}