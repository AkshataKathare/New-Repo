package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.Door;

public class DoorRunner {

	public static void main(String[] args) {

		Door door1 = new Door();
		door1.setCompany("Akshata");
		door1.setHandleType("Steel");
		door1.setLength(20);
		door1.setWooden(false);
		System.out.println(door1);
		System.out.println(door1.hashCode() + "Original hashcode of door1 :" + System.identityHashCode(door1));

		System.out.println("      ");

		Door door2 = new Door();
		door2.setCompany("Anita");
		door2.setHandleType("Wooden");
		door2.setLength(30);
		door2.setWooden(true);
		System.out.println(door2);
		System.out.println(door2.hashCode() + "Original hashcode of door2 :" + System.identityHashCode(door2));

		System.out.println("      ");

		boolean same = door1.equals(door2);
		System.out.println(same);

	}

}
