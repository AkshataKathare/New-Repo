package com.xworkz.inheritance.equals.boot;

import com.xworkz.inheritance.equals.things.ChiefMinister;

public class ChiefMinisterRunner {

	public static void main(String[] args) {

		ChiefMinister chiefMinister = new ChiefMinister("Basavaraj Bommai", "Karnataka", 55, "S.Bommai", "R.Bommai",
				"Gangamma", 2, "Engineering", "Eritica", 5, "BJP", 2021, "Indian");
		System.out.println(chiefMinister);

		ChiefMinister chiefMinister2 = new ChiefMinister("Basavaraj Bommai", "Karnataka", 55, "S.Bommai", "R.Bommai",
				"Gangamma", 2, "Engineering", "Eritica", 5, "BJP", 2021, "Indian");
		System.out.println(chiefMinister2);

		boolean equal = chiefMinister.equals(chiefMinister2);
		System.out.println(equal);

	}

}
