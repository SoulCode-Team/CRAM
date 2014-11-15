package com.SoulSkin.cram.item.tool;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class AdminSword extends baseModTool {

	public AdminSword() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("adminSword");
	}

	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		player.attackEntityFrom(new DamageSource("byAdmin").setDamageBypassesArmor().setDamageIsAbsolute(), Float.MAX_VALUE);
		return false;
	}
}
