package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerUtil.test((name, state) -> {
			return name.toUpperCase();
		});

		PlayerUtil.test((name2, state2) -> {
			return name2.toLowerCase();
		});

		PlayerUtil.test((name3, state3) -> {
			return "Name :" + name3 + ",State :" + state3;
		});

	}

}
