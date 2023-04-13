package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {

		ShooterUtil.test((gun) -> {
			System.out.println(gun);
			return false;
		});
	}

}
