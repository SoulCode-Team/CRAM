package com.SoulSkin.cram.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.SoulSkin.cram.lib.ModTextures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class baseModItem extends Item {

	public baseModItem() {
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1registerIcon) {
		this.itemIcon = par1registerIcon.registerIcon(ModTextures.GetTextureNameFull(this));
	}
}
