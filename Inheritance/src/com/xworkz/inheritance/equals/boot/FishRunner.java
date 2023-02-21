package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("Katla", 3.5D, "Grey", 4, 150);
		System.out.println(fish);

		Fish fish2 = new Fish("Pamplet", 10, "Black", 10, 500);
		System.out.println(fish2);

		boolean equal = fish.equals(fish2);
		System.out.println(equal);

		System.out.println("=============");

		Fish fish3 = new Fish("Pamplet", 10, "Black", 10, 500);
		System.out.println(fish3);

		boolean same = fish2.equals(fish3);
		System.out.println(same);
	}

}
