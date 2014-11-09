package com.SoulSkin.cram.item;

import java.util.List;

import com.SoulSkin.cram.util.StringUtils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class unlocalizedFinder extends baseModItem {

	public unlocalizedFinder() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("unlocalizedFinder");
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip1"));
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip2"));
	}
}