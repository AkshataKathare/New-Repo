package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Park;

public class ParkRunner {

	public static void main(String[] args) {

		Park park1 = new Park("KC Park", "PB Road", 30, 25);
		System.out.println(park1);

		Park park2 = new Park("KC Park", "PB Road", 30, 25);
		System.out.println(park2);

		boolean same = park1.equals(park2);
		System.out.println(same);

		System.out.println("");

		Park park3 = new Park("Sadhankere", "Nehru Nagar", 50, 100);
		System.out.println(park3);

		boolean equal = park1.equals(park3);
		System.out.println(equal);
	}

}
