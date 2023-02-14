package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Cricket;
import com.xworkz.inheritance.things.Sport;

public class SportRunner {

	public static void main(String[] args) {

		Cricket cricket = new Cricket();
		cricket.bat();
		String loc1 = cricket.getLocation();
		System.out.println(loc1);

		Sport sport = new Cricket();
		String loc2 = sport.getLocation();
		System.out.println(loc2);

		Cricket cricket1 = (Cricket) sport;
		cricket1.bat();

	}

}
