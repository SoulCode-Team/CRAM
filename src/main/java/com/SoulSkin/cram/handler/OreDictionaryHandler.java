package com.SoulSkin.cram.handler;

import com.SoulSkin.cram.cram;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
	public static cram MOD;

	public static String[] dyeColorNames = { "Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White" };

	public static void registerBlocks () {
		// Vanilla //
		OreDictionary.registerOre ("blockSponge", new ItemStack (Blocks.sponge));
		OreDictionary.registerOre ("blockGlowstone", new ItemStack (Blocks.glowstone));
		OreDictionary.registerOre ("blockObsidian", new ItemStack (Blocks.obsidian));
		OreDictionary.registerOre ("dirt", new ItemStack (Blocks.dirt));
		OreDictionary.registerOre ("blockClay", new ItemStack (Blocks.clay));
		OreDictionary.registerOre ("blockSnow", new ItemStack (Blocks.snow));
		OreDictionary.registerOre ("blockBrick", new ItemStack (Blocks.brick_block));
	}

	public static void registerQuartz () {
		OreDictionary.registerOre ("blockQuartz", new ItemStack (Blocks.quartz_block, 1, 1));
		OreDictionary.registerOre ("blockQuartz", new ItemStack (Blocks.quartz_block, 1, 2));
	}

	public static void registerStairs () {
		OreDictionary.registerOre ("stairQuartz", new ItemStack (Blocks.quartz_stairs));
		OreDictionary.registerOre ("stairNetherBrick", new ItemStack (Blocks.nether_brick_stairs));
		OreDictionary.registerOre ("stairBrick", new ItemStack (Blocks.brick_stairs));
		OreDictionary.registerOre ("stairStoneBrick", new ItemStack (Blocks.stone_brick_stairs));
		OreDictionary.registerOre ("stairSandstone", new ItemStack (Blocks.sandstone_stairs));
		OreDictionary.registerOre ("stairStone", new ItemStack (Blocks.stone_stairs));
	}

	public static void registerItems () {
		// Vanilla //
		OreDictionary.registerOre ("itemNetherStar", new ItemStack (Items.nether_star));
	}

	public static void registerAE2 () {
		OreDictionary.registerOre ("AE2QuartzCable", new ItemStack (GameRegistry.findBlock (LoadedModsHandler.AE2, "CableGlass.Fluix")));
	}

	public static void registerEnderIO () {
		OreDictionary.registerOre ("AE2QuartzCable", new ItemStack (GameRegistry.findBlock (LoadedModsHandler.EnderIO, "ItemMEConduit")));
	}

	public static void registerDyes () {
		for (int i = 0; i < dyeColorNames.length; i++) {
			OreDictionary.registerOre ("dye" + dyeColorNames[i], new ItemStack (Items.dye, 1, i));
		}
	}

	public static void registerAll () {
		registerBlocks ();
		registerItems ();
		registerStairs ();
		registerQuartz ();
		if (LoadedModsHandler.isAE2Loaded ()) {
			registerAE2 ();
		}
		if (LoadedModsHandler.isAE2Loaded ()) {
			registerEnderIO ();
		}
		// ***Already done in forge*** //
		// registerDyes();
	}
}
