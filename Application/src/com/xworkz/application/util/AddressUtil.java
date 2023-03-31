package com.xworkz.application.util;

public class AddressUtil {

	public AddressUtil() {
		System.out.println("No-arg const of AddressUtil");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validInt(int num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validFlags(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				return false;
			}
		}
		return true;

	}

}
