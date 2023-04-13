package com.xworkz.collect.lambdaExpression.util;

import com.xworkz.collect.lambdaExpression.inter.Gambler;

public class GamblerUtil {

	public static void test(Gambler gambler) {
		double money = gambler.lost(2000);
		System.out.println(money);
	}

}
