package com.xworkz.override.boot;

import com.xworkz.override.things.PaniPuri;
import com.xworkz.override.things.Snack;

public class PaniPuriRunner {

	public static void main(String[] args) {

		PaniPuri puri = new Snack();
		String loc = puri.location();
		System.out.println(loc);
		puri.tasty();

	}

}
