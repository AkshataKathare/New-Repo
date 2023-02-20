package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.Coconut;

public class CoconutRunner {

	public static void main(String[] args) {

		Coconut coconut1 = new Coconut();
		coconut1.setColor("Orange");
		coconut1.setCost(50);
		coconut1.setLength(20);
		coconut1.setSweet(true);
		System.out.println(coconut1);
		System.out.println(coconut1.hashCode() + ", Original hash code of coconut1 :" + System.identityHashCode(coconut1));

		System.out.println("      ");
		
		Coconut coconut2 = new Coconut();
		coconut2.setColor("Green");
		coconut2.setCost(20);
		coconut2.setLength(25);
		coconut2.setSweet(false);
		System.out.println(coconut2);
		System.out.println(coconut2.hashCode() + ", Original hashcode of coconut2 :" + System.identityHashCode(coconut2));

		System.out.println("      ");

		
		boolean same = coconut1.equals(coconut2);
		System.out.println("coconut1 and coconut2 are same :"+same);
	}

}
