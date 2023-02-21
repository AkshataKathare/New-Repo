package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.Fridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge fridge = new Fridge("Godrej", 30000, 2, 3, 4, "Grey", 5, true, true, "Top & Bottom freezer",
				"Vegetables", "Juice");
		System.out.println(fridge);

		Fridge fridge2 = new Fridge("Samsung", 40000, 4, 5, 6, "White", 6, false, true, "French Door", "Juice", "Egg");
		System.out.println(fridge2);

		boolean equal = fridge.equals(fridge2);
		System.out.println(equal);
		
		System.out.println("==========");

		Fridge fridge3 = new Fridge("Samsung", 40000, 4, 5, 6, "White", 6, false, true, "French Door", "Juice", "Egg");
		System.out.println(fridge3);

		boolean same = fridge2.equals(fridge3);
		System.out.println(same);

	}

}
