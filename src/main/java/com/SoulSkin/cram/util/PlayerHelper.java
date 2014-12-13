package com.SoulSkin.cram.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class PlayerHelper {
	public static void sentMessageToPlayer (EntityPlayer player, String message) {
		player.addChatMessage (new ChatComponentText (message));
	}

	public static void playSoundForPlayer (EntityPlayer player, String sound, float volume, float pitch) {
		player.playSound (sound, volume, pitch);
	}

	public static void playSoundForPlayer (EntityPlayer player, String sound) {
		player.playSound (sound, 0.5F, 1.0F);
	}

	public static void playSoundForPlayer (EntityPlayer player) {
		player.setSneaking (true);
	}

	public static void closePlayerGUI (EntityPlayer player) {
		player.closeScreen ();
	}

	public static void mountEntity (EntityPlayer player, Entity entity) {
		player.mountEntity (entity);
	}
}
