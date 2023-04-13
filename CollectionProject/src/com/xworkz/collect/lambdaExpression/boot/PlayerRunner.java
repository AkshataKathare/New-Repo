package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.PlayerUtil;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerUtil.test((name, state) -> {
			System.out.println(name.toUpperCase());
			System.out.println(name.toLowerCase());
			System.out.println("Name:"+name+","+"State:"+state);
			return null;
		});

	}

}
