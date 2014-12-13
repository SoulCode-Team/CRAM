package com.SoulSkin.cram.handler;

import com.SoulSkin.cram.util.LoaderHelper;
import cpw.mods.fml.common.Loader;

public class LoadedModsHandler {
	// Mod ID List //
	public static final String BuildCraftNameBase = "BuildCraft|";
	public static final String BuildCraftCore = "BuildCraft|Core";
	public static final String BuildCraftBuilders = "BuildCraft|Builders";
	public static final String BuildCraftFactory = "BuildCraft|Factory";
	public static final String BuildCraftSilicon = "BuildCraft|Silicon";
	public static final String BuildCraftEnergy = "BuildCraft|Energy";
	public static final String BuildCraftTransport = "BuildCraft|Transport";

	public static final String AE2 = "appliedenergistics2";
	public static final String BigReactors = "BigReactors";
	public static final String BloodMagic = "AWWayofTime";
	public static final String Botania = "Botania";
	public static final String CarpentersBlocks = "CarpentersBlocks";
	public static final String ComputerCraft = "ComputerCraft";
	public static final String EnderIO = "EnderIO";
	public static final String EnderStorage = "EnderStorage";
	public static final String ExtraCells = "extracells";
	public static final String ExtraUtilities = "ExtraUtilities";
	public static final String Factorization = "factorization";
	public static final String Forestry = "Forestry";
	public static final String Gendustry = "gendustry";
	public static final String IguanaTweaks = "IguanaTweaksTConstruct";
	public static final String IndustrialCraft2 = "IC2";
	public static final String IC2 = IndustrialCraft2;
	public static final String InventoryTweaks = "inventorytweaks";
	public static final String IronChests = "IronChest";
	public static final String Jabba = "jabba";
	public static final String LogisticsPipes = "LogisticsPipes|Main";

	public static final String Thaumcraft = "Thaumcraft";
	public static final String Mekanism = "Mekanism";

	// Mod Loaded Checks //
	public static boolean isBuildcraftLoaded () {
		return Loader.isModLoaded (BuildCraftCore);
	}

	public static boolean isBuildcraftLoaded (String subMod) {
		return Loader.isModLoaded (BuildCraftNameBase + subMod);
	}

	public static boolean isThaumcraftLoaded () {
		return Loader.isModLoaded (Thaumcraft);
	}

	public static boolean isMekanismLoaded () {
		return Loader.isModLoaded (Mekanism);
	}

	public static boolean isAE2Loaded () {
		return Loader.isModLoaded (AE2);
	}

	public static boolean isBigReactorsLoaded () {
		return Loader.isModLoaded (BigReactors);
	}

	public static boolean isBloodMagicLoaded () {
		return Loader.isModLoaded (BloodMagic);
	}

	public static boolean isBotaniaLoaded () {
		return Loader.isModLoaded (Botania);
	}

	public static boolean isCarpentersBlocksLoaded () {
		return Loader.isModLoaded (CarpentersBlocks);
	}

	public static boolean isComputercraftLoaded () {
		return Loader.isModLoaded (ComputerCraft);
	}

	public static boolean isEnderIOLoaded () {
		return Loader.isModLoaded (EnderIO);
	}

	public static boolean isEnderStorageLoaded () {
		return Loader.isModLoaded (EnderStorage);
	}

	public static boolean isExtraUtilitiesLoaded () {
		return Loader.isModLoaded (ExtraUtilities);
	}

	public static boolean isExtraUtilsLoaded () {
		return isExtraUtilitiesLoaded ();
	}

	public static boolean isFactorizationLoaded () {
		return Loader.isModLoaded (Factorization);
	}

	public static boolean isForestryLoaded () {
		return Loader.isModLoaded (Forestry);
	}

	public static boolean isIguanaTweaksLoaded () {
		return Loader.isModLoaded (IguanaTweaks);
	}

	public static boolean isIndustrialCraft2Loaded () {
		return Loader.isModLoaded (IndustrialCraft2);
	}

	public static boolean isIC2Loaded () {
		return isIndustrialCraft2Loaded ();
	}

	public static boolean isInventoryTweaksLoaded () {
		return Loader.isModLoaded (InventoryTweaks);
	}

	public static boolean isIronChestsLoaded () {
		return Loader.isModLoaded (IronChests);
	}

	public static boolean isJabbaLoaded () {
		return Loader.isModLoaded (Jabba);
	}

	public static boolean isLogisticsPipesLoaded () {
		return Loader.isModLoaded (Jabba);
	}

	// Multi-mod checks //
	public static boolean areChunkLoadersPresent () {
		return Loader.isModLoaded ("ChickenChunks") || Loader.isModLoaded ("RailCraft");
	}

	public static boolean areMapsPresent () {
		return Loader.isModLoaded ("opis") || LoaderHelper.isWildcardModLoaded ("map");
	}
}
