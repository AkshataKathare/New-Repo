package com.xworkz.application.util;

import java.time.LocalDate;

public class EducationValidationUtil {

	public static boolean validString(String value) {
		if (value != null && !value.isEmpty() && value.length() > 3 && value.length() < 30) {
			return true;
		}
		return false;
	}

	public static boolean validDate(LocalDate date) {
		LocalDate past = LocalDate.of(2001, 6, 1);
		if (date != null && date.isAfter(past)) {
			return true;
		}
		return false;

	}

	public static boolean validFlags(boolean... flags) {
		for (int index = 0; index < flags.length; index++) {
			boolean element = flags[index];
			if (!element) {
				System.err.println("Invalid element at index :" + index);
				return false;
			}
		}
		return true;
	}

}
