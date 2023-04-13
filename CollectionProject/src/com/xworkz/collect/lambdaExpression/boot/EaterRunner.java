package com.xworkz.collect.lambdaExpression.boot;

import com.xworkz.collect.lambdaExpression.util.EaterUtil;

public class EaterRunner {

	public static void main(String[] args) {

		EaterUtil.test((item, quan) -> {
			System.out.println("item in Upper case :" + item.toUpperCase());
			return item;
		});
		EaterUtil.test((item1, quan1) -> {
			System.out.println(item1.toLowerCase());
			return item1;
		});
	}

}
