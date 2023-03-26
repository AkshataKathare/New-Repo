package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge fridge1 = new Fridge("Godrej", 4, 20000, true);
		System.out.println(fridge1);

		Fridge fridge2 = new Fridge("Godrej", 4, 20000, true);
		System.out.println(fridge2);

		boolean same = fridge1.equals(fridge2);
		System.out.println(same);

		System.out.println("");

		Fridge fridge3 = new Fridge("Samsung", 5, 40000, false);
		System.out.println(fridge3);

		boolean same2 = fridge1.equals(fridge3);
		System.out.println(same2);
	}

}
