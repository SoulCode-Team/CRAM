package com.SoulSkin.cram.item;

import java.util.List;

import com.SoulSkin.cram.util.ModLogger;
import com.SoulSkin.cram.util.StringUtils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class unlocalizedFinder extends baseModItem {

	public unlocalizedFinder() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("unlocalizedFinder");
	}

	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		ModLogger.info(world.getBlock(x, y, z).getUnlocalizedName());
		
		return false;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip1"));
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip2"));
	}
}