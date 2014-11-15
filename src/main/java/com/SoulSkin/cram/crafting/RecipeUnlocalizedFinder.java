package com.SoulSkin.cram.crafting;

import com.SoulSkin.cram.cram;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeUnlocalizedFinder implements IRecipe {

	@Override
	public boolean matches(InventoryCrafting craftingMatrix, World world) {
		boolean hasUnloc = false;
		boolean hasOther = false;

		for (int i = 0; i < craftingMatrix.getSizeInventory(); i++) {
			if (craftingMatrix.getStackInSlot(i) == null)
				continue;

			ItemStack checkItem = craftingMatrix.getStackInSlot(i);
			if (checkItem.getItem() == null)
				continue;
			if (checkItem.getItem() == cram.unlocalizedFinder && !hasUnloc)
				return false;

			if (checkItem.getItem() == cram.unlocalizedFinder)
				hasUnloc = true;

			if (checkItem.getItem() != cram.unlocalizedFinder && !hasOther)
				return false;
			if (checkItem.getItem() != cram.unlocalizedFinder)
				hasOther = true;
			if (hasOther && hasUnloc)
				return true;
		}
		return false;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting craftingMatrix) {
		Item otherStack = null;

		for (int i = 0; i < craftingMatrix.getSizeInventory(); i++) {
			if (craftingMatrix.getStackInSlot(i) == null)
				continue;

			ItemStack checkItem = craftingMatrix.getStackInSlot(i);
			if (checkItem.getItem() == null)
				continue;
			if (checkItem.getItem() != cram.unlocalizedFinder)
				otherStack = checkItem.getItem();
		}
		return new ItemStack(cram.unlocalizedFinder).setStackDisplayName(otherStack.getUnlocalizedName());
	}

	@Override
	public int getRecipeSize() {
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return new ItemStack(cram.instance.unlocalizedFinder);
	}

}
