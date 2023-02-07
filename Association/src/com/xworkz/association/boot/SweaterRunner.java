package com.xworkz.association.boot;

import com.xworkz.association.things.Sweater;
import com.xworkz.association.things.Zip;

public class SweaterRunner {

	public static void main(String[] args) {
		Sweater sweater = new Sweater("Blue", true);
		sweater.display();

		System.out.println("===========");

		Zip zip = new Zip(4, "Black");
		sweater.init(zip);
		sweater.display();

	}

}
