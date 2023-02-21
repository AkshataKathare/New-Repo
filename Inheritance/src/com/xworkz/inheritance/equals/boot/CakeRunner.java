package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.Cake;

public class CakeRunner {

	public static void main(String[] args) {

		Cake cake = new Cake("Black Forest", 2, "Square", 350);
		System.out.println(cake);

		Cake cake2 = new Cake("White Forest", 1, "Round", 400);
		System.out.println(cake2);

		boolean equal = cake.equals(cake2);
		System.out.println(equal);
		
		System.out.println("==========");

		Cake cake3 = new Cake("White Forest", 1, "Round", 400);
		System.out.println(cake3);

		boolean same = cake2.equals(cake3);
		System.out.println(same);

	}

}
