package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Tv;

public class TvRunner {

	public static void main(String[] args) {

		Tv tv1 = new Tv("Sony", true, 8000, 32);
		System.out.println(tv1);

		Tv tv2 = new Tv("Sony", true, 8000, 32);
		System.out.println(tv2);

		boolean same = tv1.equals(tv2);
		System.out.println(same);

		System.out.println("");

		Tv tv3 = new Tv("xiaomi", true, 10000, 42);
		System.out.println(tv3);

		boolean equal = tv1.equals(tv3);
		System.out.println(equal);

	}

}
