package com.xworkz.collection.util;

import com.xworkz.collection.function.Eater;

public class EaterUtil {

	public static void test(Eater eater) {
		String value = eater.eat("Chicken kabab", 1.5);
		System.out.println(value);
	}

}
