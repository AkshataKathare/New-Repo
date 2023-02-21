package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.TV;

public class TVRunner {

	public static void main(String[] args) {

		TV tv = new TV("Sony", 40000, 42);
		System.out.println(tv);

		TV tv2 = new TV("Haier", 45000, 35);
		System.out.println(tv2);

		boolean equal = tv.equals(tv2);
		System.out.println(equal);

		System.out.println("==============");

		TV tv3 = new TV("Haier", 45000, 35);
		System.out.println(tv3);

		boolean same = tv2.equals(tv3);
		System.out.println(same);

	}

}
