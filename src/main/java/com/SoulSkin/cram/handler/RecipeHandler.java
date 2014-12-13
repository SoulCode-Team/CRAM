package com.SoulSkin.cram.handler;

import com.SoulSkin.cram.cram;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHandler {
	private static cram MOD;

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void craftingAll () {

		craftingBlocks ();
		craftingItems ();
		craftingTools ();
		if (LoadedModsHandler.isBuildcraftLoaded ()) {
			craftingBC ();
			craftingOreDictBC ();
		}
		if (LoadedModsHandler.isAE2Loaded () && LoadedModsHandler.isEnderIOLoaded ()) {
			craftingAE_EnderIO ();
		}
	}

	public static void smeltingAll () {
	}

	public static void addRecipe (ItemStack result, Object... recipe) {
		GameRegistry.addRecipe (new ShapedOreRecipe (result, recipe));
	}

	// public static void addShapelessRecipe(ItemStack result, Object... recipe)
	// {
	// CraftingManager.getInstance().getRecipeList().add(new
	// ShapelessOreRecipe(result, recipe));
	// }

	public static void addShapelessRecipe (ItemStack result, Object... recipe) {
		GameRegistry.addRecipe (new ShapelessOreRecipe (result, recipe));
	}

	public static void craftingBlocks () {

		// Recipes for Blocks //

		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.quartz_block, 6), "stairQuartz", "stairQuartz", "stairQuartz", "stairQuartz");
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.dirt), new ItemStack (Blocks.dirt, 1, 1));
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.dirt), new ItemStack (Blocks.dirt, 1, 2));
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.sand), new ItemStack (Blocks.sand, 1, 1));
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.stone, 1, 5), new ItemStack (Blocks.stone, 1, 6));
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.dirt, 1, 3), new ItemStack (Blocks.dirt, 1, 4));
		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.dirt, 1, 1), new ItemStack (Blocks.dirt, 1, 2));
		//		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.quartz_block), new ItemStack (Blocks.quartz_block, 1, 1));
		//		RecipeHandler.addShapelessRecipe (new ItemStack (Blocks.quartz_block), new ItemStack (Blocks.quartz_block, 1, 2));
	}

	public static void craftingItems () {
		// Recipes for Items //
		RecipeHandler.addShapelessRecipe (new ItemStack (Items.snowball, 4), "blockSnow");
		RecipeHandler.addShapelessRecipe (new ItemStack (Items.clay_ball, 4), "blockClay");
		RecipeHandler.addShapelessRecipe (new ItemStack (Items.glowstone_dust, 4), "blockGlowstone");
		RecipeHandler.addShapelessRecipe (new ItemStack (Items.quartz, 4), "blockQuartz");
		RecipeHandler.addShapelessRecipe (new ItemStack (Items.brick, 4), "blockBrick");
	}

	public static void craftingTools () {
		// Recipes for Tools //
		if (ConfigHandler.enableUnlocalizeFinder) {
			RecipeHandler.addRecipe (new ItemStack (MOD.unlocalizedFinder), true, " gg", " gg", "s  ", 'g', "blockGlass", 's', "stickWood");
		}
	}

	public static void craftingBC () {
		// variables //
		ItemStack woodGear = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftCore, "woodenGearItem"));
		ItemStack stoneGear = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftCore, "stoneGearItem"));
		ItemStack ironGear = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftCore, "ironGearItem"));
		ItemStack goldGear = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftCore, "goldGearItem"));
		ItemStack diamondGear = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftCore, "diamondGearItem"));
		ItemStack markerBlock = new ItemStack (GameRegistry.findItem (LoadedModsHandler.BuildCraftBuilders, "markerBlock"));
		// Gears //
		RecipeHandler.addRecipe (stoneGear, true, "tst", "s s", "tst", 't', new ItemStack (Blocks.cobblestone), 's', "stickWood");
		RecipeHandler.addRecipe (ironGear, true, "isi", "sgs", "isi", 'i', "ingotIron", 's', new ItemStack (Blocks.cobblestone), 'g', woodGear);
		RecipeHandler.addRecipe (goldGear, true, "isi", "sgs", "isi", 's', "ingotIron", 'i', "ingotGold", 'g', stoneGear);
		RecipeHandler.addRecipe (diamondGear, true, "did", "igi", "did", 'd', "gemDiamond", 'i', "ingotGold", 'g', ironGear);
		// Blocks //
		RecipeHandler.addRecipe (markerBlock, true, " l ", " r ", " s ", 'l', "gemLapis", 'r', "dustRedstone", 's', "stickWood");
	}

	public static void craftingOreDictBC () {
		// Variables //
		ItemStack tankBlock = new ItemStack (GameRegistry.findBlock (LoadedModsHandler.BuildCraftFactory, "tankBlock"));

		// Blocks //
		RecipeHandler.addRecipe (tankBlock, true, "ggg", "g g", "ggg", 'g', "blockGlass");
	}

	public static void craftingAE_EnderIO () {
		RecipeHandler.addShapelessRecipe (new ItemStack (GameRegistry.findBlock (LoadedModsHandler.AE2, "CableGlass.Fluix")), new ItemStack (GameRegistry.findBlock (LoadedModsHandler.EnderIO, "ItemMEConduit")));
	}

}
