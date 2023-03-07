package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.things.FoodMenu;
import com.xworkz.abstraction.things.StarterMenu;

public class FoodMenuRunner {

	public static void main(String[] args) {
		
		FoodMenu food=new StarterMenu();
		StarterMenu starterMenu = new StarterMenu();
		starterMenu.color();
		starterMenu.design();
		starterMenu.hotel();

	}

}
