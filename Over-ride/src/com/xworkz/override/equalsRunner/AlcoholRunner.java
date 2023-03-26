package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Alcohol;

public class AlcoholRunner {
	public static void main(String[] args) {
		Alcohol alcohol1 = new Alcohol("Black & White", 30, false, 'C');
		System.out.println(alcohol1);
		System.out.println(alcohol1.hashCode() + "Original hash of alcohol1 :" + System.identityHashCode(alcohol1));

		Alcohol alcohol2 = new Alcohol("Black & White", 30, false, 'C');
		System.out.println(alcohol2);

		boolean same = alcohol1.equals(alcohol2);
		System.out.println(same);

		System.out.println("  ");

		Alcohol alcohol3 = new Alcohol("Kingfisher", 40, true, 'D');
		System.out.println(alcohol3);

		boolean equal = alcohol2.equals(alcohol3);
		System.out.println(equal);
	}

}
