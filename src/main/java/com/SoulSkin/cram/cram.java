package com.SoulSkin.cram;

import com.SoulSkin.cram.handler.*;
import com.SoulSkin.cram.item.tool.AdminSword;
import com.SoulSkin.cram.item.tool.unlocalizedFinder;
import com.SoulSkin.cram.proxy.CommonProxy;
import com.SoulSkin.cram.reference.Reference;
import com.SoulSkin.cram.util.ModLogger;
import com.SoulSkin.cram.util.StringUtils;
import com.SoulSkin.cram.util.removeVanillaRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

@Mod (name = Reference.MOD_NAME, version = Reference.VERSION, useMetadata = false, modid = Reference.MOD_ID)
// , guiFactory =Reference.GUI_FACTORY_CLASS
public class cram {

	@Instance (Reference.MOD_ID)
	public static cram instance;

	@SidedProxy (clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;

	// Define Tools//
	public static Item unlocalizedFinder;
	public static Item adminSword;

	@EventHandler
	public void preInit (FMLPreInitializationEvent event) {
		ModLogger.info ("Loading " + Reference.MOD_NAME);
		proxy.registerRenderers ();

		ConfigHandler.init (event.getSuggestedConfigurationFile ());

		if (ConfigHandler.enableUnlocalizeFinder) {
			unlocalizedFinder = new unlocalizedFinder ();
		}
		if (ConfigHandler.enableAdminSword) {
			adminSword = new AdminSword ();
		}

		GameRegisteryHandler.registerAll ();
		OreDictionaryHandler.registerAll ();

		RecipeHandler.craftingAll ();
		IntegrationHandler.buildCraftInIt ();

		FMLInterModComms.sendMessage ("OpenBlocks", "donateUrl", "http://www.railcraft.info/donate/");

	}

	@EventHandler
	public void init (FMLInitializationEvent event) {
	}

	@EventHandler
	public void postInit (FMLPostInitializationEvent event) {

		if (!StringUtils.isNullOrEmpty (ConfigHandler.disableCrafting)) {

			for (String remove : StringUtils.GetStringList (ConfigHandler.disableCrafting)) {
				removeVanillaRecipe.removeFromString (remove);
			}
		}
	}
}
