package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Cake;

public class CakeRunner {

	public static void main(String[] args) {

		Cake cake1 = new Cake("Black Forest", "Square", 2.5, false);
		System.out.println(cake1);

		Cake cake2 = new Cake("Black Forest", "Square", 2.5, false);
		System.out.println(cake2);

		boolean same = cake1.equals(cake2);
		System.out.println(same);

		Cake cake3 = new Cake("White Forest", "Round", 2.5, false);
		System.out.println(cake3);

		boolean same2 = cake1.equals(cake3);
		System.out.println(same2);

	}

}
