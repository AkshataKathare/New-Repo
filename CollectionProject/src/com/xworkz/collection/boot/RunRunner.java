package com.xworkz.collection.boot;

import com.xworkz.collection.util.RunnerUtil;

public class RunRunner {

	public static void main(String[] args) {

		RunnerUtil.test((dist) -> {
			return dist;
		});
	}

}
