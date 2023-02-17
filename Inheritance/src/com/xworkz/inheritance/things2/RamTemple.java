package com.xworkz.inheritance.things2;

import com.xworkz.inheritance.things.Temple;

public class RamTemple extends Temple {

	@Override
	public void bell() {
		System.out.println("Running bell in RamTemple..");
	}

	@Override
	public double ticketPrice() {
		System.out.println("Running ticketPrice in RamTemple");
		return 40;
	}

	public void RamTempleDetails() {
		System.out.println(super.location);
		super.bell();
		super.ticketPrice();
		//super.distance();
		super.ticketPrice();
		//super.name();//name is private;
		
		

	}

}
