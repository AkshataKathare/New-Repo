package com.file.xworkz.boot;

import com.file.xworkz.thing.Place;

public class PlaceRunner {

	public static void main(String[] args) {

		Place place = new Place("Dharwad");
		place.show();

		System.out.println("==================");

		Place place1 = new Place(23000);
		place1.show();

		System.out.println("==================");

		Place place2 = new Place("Dharwad", "Karnataka");
		place2.show();

		System.out.println("==================");

		Place place3 = new Place("Dharwad", "Karnataka", "India");
		place3.show();

		System.out.println("==================");

		Place place4 = new Place();
		place4.initVariables("Sagar", 25000, "Shimoga", "Karnataka", "India");
		place4.show();

	}

}
