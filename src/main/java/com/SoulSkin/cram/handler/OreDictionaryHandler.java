package com.SoulSkin.cram.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.SoulSkin.cram.cram;

public class OreDictionaryHandler {
	public static cram MOD;

	public static String[] dyeColorNames = { "Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink", "Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White" };

	public static void registerBlocks() {
		// Vanilla //
		OreDictionary.registerOre("blockSponge", new ItemStack(Blocks.sponge));
		OreDictionary.registerOre("blockGlowstone", new ItemStack(Blocks.glowstone));
		OreDictionary.registerOre("blockObsidian", new ItemStack(Blocks.obsidian));
		OreDictionary.registerOre("dirt", new ItemStack(Blocks.dirt));
		OreDictionary.registerOre("blockClay", new ItemStack(Blocks.clay));
		OreDictionary.registerOre("blockSnow", new ItemStack(Blocks.snow));
	}

	public static void registerItems() {
		// Vanilla //
		OreDictionary.registerOre("itemNetherStar", new ItemStack(Items.nether_star));
	}

	public static void registerDyes() {
		for (int i = 0; i < dyeColorNames.length; i++) {
			OreDictionary.registerOre("dye" + dyeColorNames[i], new ItemStack(Items.dye, 1, i));
		}
	}

	public static void registerAll() {
		registerBlocks();
		registerItems();
		// ***Already done in forge*** //
		// registerDyes();
	}
}
