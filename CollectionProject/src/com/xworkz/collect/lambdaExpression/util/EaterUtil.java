package com.xworkz.collect.lambdaExpression.util;

import com.xworkz.collect.lambdaExpression.inter.Eater;

public class EaterUtil {

	public static void test(Eater eater) {
		String value = eater.eat("Chicken kabab", 1.5);
		System.out.println(value);
	}

}
