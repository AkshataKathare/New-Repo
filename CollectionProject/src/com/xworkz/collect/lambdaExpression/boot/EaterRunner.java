package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {

		EaterUtil.test((item, quan) -> {
			return item.toUpperCase();
		});
		EaterUtil.test((item1, quan1) -> {
			return item1.toLowerCase();
		});
	}

}