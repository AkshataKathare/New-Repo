package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {

		WaterFall waterFall1 = new WaterFall("Jog falls", "Shimoga", 895, 400);
		System.out.println(waterFall1);

		WaterFall waterFall2 = new WaterFall("Jog falls", "Shimoga", 895, 400);
		System.out.println(waterFall2);

		boolean same = waterFall1.equals(waterFall2);
		System.out.println(same);

		System.out.println("");

		WaterFall waterFall3 = new WaterFall("Sathod falls", "Yallapur", 300, 100);
		System.out.println(waterFall3);

		boolean equal = waterFall1.equals(waterFall3);
		System.out.println(equal);
	}

}
