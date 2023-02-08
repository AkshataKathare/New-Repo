package com.xworkz.association.boot;

import com.xworkz.association.things.Isro;
import com.xworkz.association.things.Scientist;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro = new Isro();

		String[] locs = { "Delhi", "Bengaluru", "Hyderabad" };
		isro.setLocations(locs);

		int[] satNos = { 1, 2, 3 };
		isro.setSatelliteNos(satNos);

		Scientist scientist = new Scientist();
		scientist.setName("Abdul Kalam");
		scientist.setDesignation("Senior Scientist");

		Scientist scientist1 = new Scientist();
		scientist1.setName("Homi Bhabha");
		scientist1.setDesignation("Director");

		Scientist[] ref = { scientist, scientist1 };
		isro.setScientists(ref);

		isro.display();

	}

}
