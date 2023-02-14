package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Alcohol;
import com.xworkz.inheritance.things.Whiskey;

public class AlcoholRunner {

	public static void main(String[] args) {

		Whiskey whiskey = new Whiskey();
		whiskey.taste();
		String name = whiskey.getBrand();
		System.out.println(name);

		Alcohol alcohol = new Whiskey();
		String name1 = alcohol.getBrand();
		System.out.println(name1);

		Whiskey whiskey1 = (Whiskey) alcohol;
		whiskey1.taste();

	}

}
