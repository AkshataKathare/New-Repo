package com.xworkz.override.boot;

import com.xworkz.override.things.CarnivorousAnimal;
import com.xworkz.override.things.Tiger;

public class TigerRunner {

	public static void main(String[] args) {

		Tiger tiger = new CarnivorousAnimal();
		boolean wild = tiger.wildAnimal();
		System.out.println(wild);
		tiger.strong();

	}

}
