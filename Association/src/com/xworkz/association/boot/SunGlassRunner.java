package com.xworkz.association.boot;

import com.xworkz.association.things.Frame;
import com.xworkz.association.things.SunGlass;

public class SunGlassRunner {

	public static void main(String[] values) {

		SunGlass sunGlass = new SunGlass("Brown", 30);
		sunGlass.show();

		System.out.println("==========");

		Frame frame = new Frame("Square", true);
		sunGlass.init(frame);
		sunGlass.show();
	}

}
