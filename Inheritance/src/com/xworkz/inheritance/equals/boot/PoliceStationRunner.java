package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStation policeStation = new PoliceStation("Karnatak police station", "Vivekanand circle", "Dharwad",
				"Karnatak", 30, 59, "Abhi", "Arpita", 60, "Sagar");
		System.out.println(policeStation);

		PoliceStation policeStation2 = new PoliceStation("Village police station", "Gandhi chowk", "Hubli", "Karnataka",
				60, 57, "Anita", "Shubhangi", 80, "Akshata");
		System.out.println(policeStation2);

		boolean equal = policeStation.equals(policeStation2);
		System.out.println(equal);
		
		System.out.println("============");

		PoliceStation policeStation3 = new PoliceStation("Village police station", "Gandhi chowk", "Hubli", "Karnataka",
				60, 57, "Anita", "Shubhangi", 80, "Akshata");
		System.out.println(policeStation3);

		boolean same = policeStation2.equals(policeStation3);
		System.out.println(same);

	}

}
