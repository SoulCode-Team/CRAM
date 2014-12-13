package com.SoulSkin.cram.util;

import cpw.mods.fml.common.Loader;

public class LoaderHelper {
	public static boolean isWildcardModLoaded (String modidSubstring) {
		return (getWildcardModId (modidSubstring).length > 0);
	}

	public static String[] getWildcardModId (String modidSubstring) {
		String[] returnStringArray = null;
		String[] setStrings = (String[]) Loader.instance ().getIndexedModList ().keySet ().toArray ();
		for (String s : setStrings) {
			if (s.contains (modidSubstring) && Loader.isModLoaded (s)) {
				returnStringArray[returnStringArray.length] = s;
			}
		}
		return returnStringArray;
	}
}
