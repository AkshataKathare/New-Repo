package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {

		WaterFall waterFall = new WaterFall("Sathodi Falls", 380, "Yellapur");
		System.out.println(waterFall);

		WaterFall waterFall2 = new WaterFall("Magod Falls", 450, "Magod");
		System.out.println(waterFall2);

		boolean equal = waterFall.equals(waterFall2);
		System.out.println(equal);

		System.out.println("==============");

		WaterFall waterFall3 = new WaterFall("Magod Falls", 450, "Magod");
		System.out.println(waterFall3);

		boolean same = waterFall2.equals(waterFall3);
		System.out.println(same);
	}

}
