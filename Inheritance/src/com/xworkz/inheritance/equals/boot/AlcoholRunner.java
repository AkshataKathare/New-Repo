package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {

		Alcohol alcohol = new Alcohol("Black & White", 50, 700, "Beer");
		System.out.println(alcohol);

		Alcohol alcohol2 = new Alcohol("KingFischer", 40, 500, "Whiskey");
		System.out.println(alcohol2);

		boolean equal = alcohol.equals(alcohol2);
		System.out.println(equal);

		System.out.println("============");

		Alcohol alcohol3 = new Alcohol("KingFischer", 40, 500, "Whiskey");
		System.out.println(alcohol3);

		boolean same = alcohol2.equals(alcohol3);
		System.out.println(same);

	}

}
