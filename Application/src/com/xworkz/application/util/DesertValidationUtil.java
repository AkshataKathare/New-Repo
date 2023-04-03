package com.xworkz.application.util;

public class DesertValidationUtil {

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		}
		return false;

	}

	public static boolean validDouble(double num) {
		if (num > 0) {
			return true;
		}
		return false;
	}

	public static boolean validFlags(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				System.err.println("dto will not be saved");
				return false;
			}
		}
		return true;
	}

}
