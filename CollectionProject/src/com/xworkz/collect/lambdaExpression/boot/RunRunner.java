package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.RunnerUtil;

public class RunRunner {

	public static void main(String[] args) {

		RunnerUtil.test((dist) -> {
			System.out.println(dist);
			return 0;
		});
	}

}
