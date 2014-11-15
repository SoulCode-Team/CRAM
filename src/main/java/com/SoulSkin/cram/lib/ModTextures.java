package com.SoulSkin.cram.lib;

import com.SoulSkin.cram.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModTextures {
	public static String FormatUnlocalized(Item item) {
		return item.getUnlocalizedName().substring(5);
	}

	public static String FormatUnlocalized(Block block) {
		return block.getUnlocalizedName().substring(5);
	}

	public static String GetTextureNameFull(Item item) {
		return ModTextures.GetTextureNameFull(item, "");
	}

	public static String GetTextureNameFull(Block block) {
		return ModTextures.GetTextureNameFull(block, "");
	}

	public static String GetTextureNameFull(Item item, String subFolders) {
		return ModTextures.RESOURCE_CONTEXT + ":" + subFolders + ModTextures.FormatUnlocalized(item);
	}

	public static String GetTextureNameFull(Block block, String subFolders) {
		return ModTextures.RESOURCE_CONTEXT + ":" + subFolders + ModTextures.FormatUnlocalized(block);
	}

	public static String GetTextureFolder(String subFolders) {
		return ModTextures.RESOURCE_CONTEXT + ":" + subFolders;
	}

	public static String GetTextureFolder() {
		return ModTextures.GetTextureFolder("");
	}

	public static final String RESOURCE_CONTEXT = Reference.MOD_ID;

	// Guis //
	public static final ResourceLocation GUI_COBBLESTONE_GENERATOR = new ResourceLocation(RESOURCE_CONTEXT, "textures/gui/cobblestone_generator" + Reference.IMG_EXTENSION);

	// Models //

}
