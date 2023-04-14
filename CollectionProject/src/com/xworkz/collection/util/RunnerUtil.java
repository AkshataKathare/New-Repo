package com.xworkz.collection.util;

import com.xworkz.collection.function.Runner;

public class RunnerUtil {

	public static void test(Runner runner) {
		double speed = runner.running(30);
		System.out.println(speed);
	}

}
