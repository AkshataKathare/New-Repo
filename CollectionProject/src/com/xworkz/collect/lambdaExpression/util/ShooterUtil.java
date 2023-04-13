package com.xworkz.collect.lambdaExpression.util;

import com.xworkz.collect.lambdaExpression.inter.Shooter;

public class ShooterUtil {

	public static void test(Shooter shooter) {
		boolean value = shooter.shoot("Rifle");
		System.out.println(value);
	}

}
