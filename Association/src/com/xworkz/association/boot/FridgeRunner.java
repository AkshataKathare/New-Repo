package com.xworkz.association.boot;

import com.xworkz.association.things.Fridge;
import com.xworkz.association.things.Milk;

public class FridgeRunner {

	public static void main(String[] args) {
		Fridge fridge = new Fridge("Godrej", 25000);
		fridge.display();

		System.out.println("============");

		Milk milk = new Milk("Nandini", 20);
		fridge.init(milk);
		fridge.display();

	}

}
