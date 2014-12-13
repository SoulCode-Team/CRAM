package com.SoulSkin.cram.handler;

import com.SoulSkin.cram.reference.Reference;
import com.SoulSkin.cram.util.ModLogger;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {
	public static Configuration config;

	public static void init (File configFile) {
		if (config == null) {
			config = new Configuration (configFile);
		}

		loadConfigs ();

	}

	@SubscribeEvent
	public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase (Reference.MOD_ID)) {
			loadConfigs ();
		}
	}

	public static final boolean True = true;
	public static final boolean False = false;

	public static String disableCrafting;
	public static boolean enableUnlocalizeFinder;
	public static boolean enableAdminSword;

	public static void loadConfigs () {
		ModLogger.info ("Loading Configs");
		// Configs for Crafting//
		disableCrafting = config.get (Reference.DISABLE_CRAFTING_CATEGORY, "Crafting Recipes to Disable", "", "These Items will have all recipes removed (comma separated (eg. minecraft:string,buildcraft:woodenGearItem))").getString ();

		// Configs for Tools//
		enableUnlocalizeFinder = config.get (Reference.DISABLE_ITEM_CATEGORY, "Enable Unlocalized Name Finder", true, "Shows the unlocalized name of the block clicked on").getBoolean ();
		enableAdminSword = config.get (Reference.DISABLE_ITEM_CATEGORY, "Enable Admin Sword", true, "one-shot kills ANYTHING").getBoolean ();

		if (config.hasChanged ()) {
			config.save ();
		}
	}
}
