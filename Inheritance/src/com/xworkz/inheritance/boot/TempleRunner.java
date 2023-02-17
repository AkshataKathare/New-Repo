package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.GaneshTemple;
import com.xworkz.inheritance.things2.RamTemple;

public class TempleRunner {

	public static void main(String[] args) {

		GaneshTemple ganesh = new GaneshTemple();
		ganesh.displayDetails();

		System.out.println("        ");

		RamTemple ram = new RamTemple();
		ram.RamTempleDetails();

	}

}
