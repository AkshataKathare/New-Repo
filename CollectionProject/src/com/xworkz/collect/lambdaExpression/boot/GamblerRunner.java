package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.GamblerUtil;

public class GamblerRunner {

	public static void main(String[] args) {

		GamblerUtil.test((principal) -> {
			if (principal < 1000) {
				return 0;
			}
			if (principal > 1000) {
				return 100;
			}
			return 200;
		});

	}

}
