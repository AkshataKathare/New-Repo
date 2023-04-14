package com.xworkz.collection.util;

import com.xworkz.collection.function.Shooter;

public class ShooterUtil {

	public static void test(Shooter shooter) {
		boolean value = shooter.shoot("Rifle");
		System.out.println(value);
	}

}
