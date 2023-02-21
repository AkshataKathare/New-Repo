package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {

		FootWare foot = new FootWare("Bata", 6, "Sandals");
		System.out.println(foot);

		FootWare foot2 = new FootWare("Paragoan", 7, "Slippers");
		System.out.println(foot2);

		boolean equal = foot.equals(foot2);
		System.out.println(equal);
		
		System.out.println("=============");

		FootWare foot3 = new FootWare("Paragoan", 7, "Slippers");
		System.out.println(foot3);

		boolean same = foot2.equals(foot3);
		System.out.println(same);

	}

}
