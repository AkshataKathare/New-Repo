package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {

		FootWare footWare1 = new FootWare("Paragoan", 'A', 6, 400.60);
		System.out.println(footWare1);

		FootWare footWare2 = new FootWare("Paragoan", 'A', 6, 400.60);
		System.out.println(footWare2);

		boolean same = footWare1.equals(footWare2);
		System.out.println(same);

		System.out.println("");

		FootWare footWare3 = new FootWare("Bata", 'B', 7, 799.99);
		System.out.println(footWare3);

		boolean same2 = footWare1.equals(footWare3);
		System.out.println(same2);

	}

}
