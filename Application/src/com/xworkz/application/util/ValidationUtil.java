package com.xworkz.application.util;

import java.time.LocalDate;

public class ValidationUtil {

	private ValidationUtil() {
		System.out.println("No-arg const in ValidationUtil");
	}

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validPrice(double cost) {
		if (cost > 0 && cost < 10000) {
			return true;
		}
		return false;
	}

	public static boolean validNumber(int no) {
		if (no > 0 && no < 80) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate arg, LocalDate pastDate) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		if (arg != null && arg.isBefore(tomorrow) && arg.isAfter(pastDate)) {
			return true;
		}
		return false;

	}

	public static boolean validFlag(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				System.out.println("Invalid element at index :" + index);
				return false;
			}
		}
		return true;
	}

}
