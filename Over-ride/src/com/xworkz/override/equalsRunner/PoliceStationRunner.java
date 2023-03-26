package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {

		PoliceStation policeStation1 = new PoliceStation("Central Police Station", "Vivekanand Circle", 28);
		System.out.println(policeStation1);

		PoliceStation policeStation2 = new PoliceStation("Central Police Station", "Vivekanand Circle", 28);
		System.out.println(policeStation2);

		boolean same = policeStation1.equals(policeStation2);
		System.out.println(same);

		System.out.println("");

		PoliceStation policeStation3 = new PoliceStation("District Police Station", "New Bus Stand", 35);
		System.out.println(policeStation3);

		boolean equal = policeStation1.equals(policeStation3);
		System.out.println(equal);
	}

}
