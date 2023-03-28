package com.xworkz.application.util;

import java.time.LocalDate;

public class FestivalValidationUtil {

	private FestivalValidationUtil() {
		System.out.println("No-arg const of FestivalValidationUtil");
	}

	public static boolean validString(String name) {
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validNumber(double id) {
		if (id > 0) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate start) {
		LocalDate thisYear = LocalDate.of(2023, 1, 1);
		if (start != null && start.isAfter(thisYear)) {
			return true;
		}
		return false;
	}

	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				return false;
			}
		}
		return true;

	}
}
