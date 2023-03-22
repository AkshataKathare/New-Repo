package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {

		ChiefMinister chiefMinister1 = new ChiefMinister("Bommai", 2, 5.5, 78, "BJP", "Hubli", "Karnatak", "India",
				"Gangamma", "Parvatamma");
		System.out.println(chiefMinister1);

		ChiefMinister chiefMinister2 = new ChiefMinister("Bommai", 2, 5.5, 78, "BJP", "Hubli", "Karnatak", "India",
				"Gangamma", "Parvatamma");
		System.out.println(chiefMinister2);

		boolean same = chiefMinister1.equals(chiefMinister2);
		System.out.println(same);

		System.out.println("");

		ChiefMinister chiefMinister3 = new ChiefMinister("Basavaraj", 3, 5.7, 76, "BJP", "Hubli", "Karnatak", "India",
				"Gangamma", "Parvatamma");
		System.out.println(chiefMinister3);

		boolean equal = chiefMinister1.equals(chiefMinister3);
		System.out.println(equal);
	}

}
