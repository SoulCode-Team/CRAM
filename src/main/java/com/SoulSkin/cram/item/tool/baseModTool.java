package com.SoulSkin.cram.item.tool;

import com.SoulSkin.cram.lib.ModTextures;
import com.SoulSkin.cram.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class baseModTool extends Item {

	public baseModTool () {
		super ();
		this.setMaxStackSize (1);
		this.setCreativeTab (CreativeTabs.tabMisc);
	}

	@SideOnly (Side.CLIENT)
	public void registerIcons (IIconRegister par1registerIcon) {
		this.itemIcon = par1registerIcon.registerIcon (ModTextures.GetTextureNameFull (this, Reference.TOOL_FOLDER));
	}
}
