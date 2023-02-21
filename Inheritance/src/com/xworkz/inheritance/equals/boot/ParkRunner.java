package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park park = new Park("KC Park", "PB Road", 25, 100, 3, 30);
		System.out.println(park);

		Park park2 = new Park("Sadhankeri", "Saptapur", 30, 80, 5, 60);
		System.out.println(park2);

		boolean equal = park.equals(park2);
		System.out.println(equal);
		
		System.out.println("=============");

		Park park3 = new Park("Sadhankeri", "Saptapur", 30, 80, 5, 60);
		System.out.println(park3);

		boolean same = park2.equals(park3);
		System.out.println(same);
	}

}
