package com.xworkz.collection.util;

public class ValidationUtil {

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			if (flags[index]) {
				return true;
			}
		}
		return false;
	}

}
