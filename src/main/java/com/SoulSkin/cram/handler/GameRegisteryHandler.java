package com.SoulSkin.cram.handler;

import com.SoulSkin.cram.cram;

import cpw.mods.fml.common.registry.GameRegistry;

public class GameRegisteryHandler {
	public static cram MOD;

	public static void registerItems() {
		// Register Items//
		if (ConfigHandler.enableUnlocalizeFinder) {
			GameRegistry.registerItem(MOD.unlocalizedFinder, MOD.unlocalizedFinder.getUnlocalizedName());
		}
	}

	public static void registerAll() {
		registerItems();
	}
}
