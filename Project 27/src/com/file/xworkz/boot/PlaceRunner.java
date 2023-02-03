package com.file.xworkz.boot;

import com.file.xworkz.thing.Place;

public class PlaceRunner {

	public static void main(String[] args) {

		Place place = new Place("Dharwad");
		place.show();

		System.out.println("==================");

		Place place1 = new Place("Dharwad", 23000);
		place1.show();

		System.out.println("==================");

		Place place2 = new Place("Dharwad", 23000, "Dharwad");
		place2.show();

		System.out.println("==================");

		Place place3 = new Place("Dharwad", 23000, "Dharwad", "Karnataka");
		place3.show();

		System.out.println("==================");

		Place place4 = new Place("Dharwad", 23000, "Karnataka", "India");
		place4.show();

		System.out.println("==================");

		Place place5 = new Place();
		place5.initVariables("Sagar", 25000, "Shimoga", "Karnataka", "India");
		place5.show();

	}

}
