package com.xworkz.collect.lambdaExpression.util;

import com.xworkz.collect.lambdaExpression.inter.Runner;

public class RunnerUtil {

	public static void test(Runner runner) {
		double speed = runner.running(30);
		System.out.println(speed);
	}

}
