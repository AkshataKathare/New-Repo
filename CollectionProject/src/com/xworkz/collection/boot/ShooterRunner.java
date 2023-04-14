package com.xworkz.collection.boot;

import com.xworkz.collection.util.ShooterUtil;

public class ShooterRunner {

	public static void main(String[] args) {

		ShooterUtil.test((gun) -> {
			return true;
		});
	}

}
