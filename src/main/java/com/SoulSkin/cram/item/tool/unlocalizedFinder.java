package com.SoulSkin.cram.item.tool;

import com.SoulSkin.cram.item.baseModItem;
import com.SoulSkin.cram.util.StringUtils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.List;

public class unlocalizedFinder extends baseModItem {

//	private static String[] tooltip;

	public unlocalizedFinder() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("unlocalizedFinder");
	}

	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		// ModLogger.info(world.getBlock(x, y, z).getUnlocalizedName());
		player.addChatMessage(new ChatComponentText(world.getBlock(x, y, z).getUnlocalizedName()));

		return false;
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip1"));
		list.add(StringUtils.localize("item.unlocalizedFinder.tooltip2"));
//		if (StringUtils.isNullOrEmpty(tooltip)) {
//			list.add(tooltip);
//		}
	}

//	public static void setTooltip(String tootipString) {
//		tooltip[0] = tootipString;
//	}
//
//	public static void setTooltip(String[] tootipString) {
//		tooltip = tootipString;
//	}
//
//	public static String[] getTooltip() {
//		return tooltip;
//	}
}