package com.SoulSkin.cram.util;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class removeVanillaRecipe {
	@SuppressWarnings ("unchecked")
	public static void remove (Item removeItem) {
		Collection<Item> removeSet = new HashSet<Item> ();
		Collections.addAll (removeSet, removeItem);
		Iterator<IRecipe> iterator = CraftingManager.getInstance ().getRecipeList ().iterator ();

		while (iterator.hasNext ()) {
			IRecipe recipe = iterator.next ();
			if (recipe == null)
				continue;
			ItemStack output = recipe.getRecipeOutput ();
			if (output != null && output.getItem () != null && removeSet.contains (output.getItem ()))
				iterator.remove ();
		}
	}

	public static void removeFromString (String sItem) {
		String[] splitItem = sItem.split (":");
		Item item = GameRegistry.findItem (splitItem[0], splitItem[1]);
		remove (item);
	}
}
