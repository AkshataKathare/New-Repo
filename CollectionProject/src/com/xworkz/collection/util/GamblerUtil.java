package com.xworkz.collection.util;

import com.xworkz.collection.function.Gambler;

public class GamblerUtil {

	public static void test(Gambler gambler) {
		double money = gambler.lost(2000);
		System.out.println(money);
	}

}
