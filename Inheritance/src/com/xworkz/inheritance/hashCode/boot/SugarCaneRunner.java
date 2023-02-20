package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.SugarCane;

public class SugarCaneRunner {

	public static void main(String[] args) {

		SugarCane cane1 = new SugarCane();
		cane1.setColor("Green");
		cane1.setDiameter(2);
		cane1.setLength(3);
		cane1.setSweet(true);
		System.out.println(cane1);
		System.out.println(cane1.hashCode() + "Original hashCode of cane1 :" + System.identityHashCode(cane1));

		System.out.println("        ");
		
		SugarCane cane2 = new SugarCane();
		cane2.setColor("Black");
		cane2.setDiameter(5);
		cane2.setLength(40);
		cane2.setSweet(false);
		System.out.println(cane2);
		System.out.println(cane2.hashCode() + "Original hashCode of cane2 :" + System.identityHashCode(cane2));

		System.out.println("        ");
		
		boolean equal = cane1.equals(cane2);
		System.out.println(equal);
	}

}
