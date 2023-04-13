package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.inter.Hunter;
import com.xworkz.collect.lambdaExpression.util.Util;

public class HunterRunner {

	public static void main(String[] args) {

		Hunter hunter = (forest) -> {
			System.out.println("Running test in hunter :" + forest);
		};
		// method-->functional interface as argument-->we can pass lambda expression
		Util.test(hunter);// expl ref

		// implicit ref
		Util.test((arg) -> {
			System.out.println("running method implicitly :" + arg);
		});
	}

}