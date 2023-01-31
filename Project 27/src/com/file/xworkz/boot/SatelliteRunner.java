package com.file.xworkz.boot;

import  com.file.xworkz.thing.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Satellite ref1=new Satellite();
		
		ref1.name="Chandrayana";
		ref1.institute="ISRO";
		ref1.fuel="Hydrazine";
		ref1.budget=2000000;
		ref1.launchDate=4;
		ref1.launchMonth="October";
		ref1.year=2001;
		ref1.length=7;
		ref1.width=10;
		ref1.diameter=6;
		ref1.weight=2500;
		ref1.indian=true;
		ref1.noOfSatellites=385;
		ref1.camera=true;
		ref1.orbit="Elliptical";
		ref1.solarPanel=true;
		
		ref1.display();
		
		System.out.println("===============");
		
        Satellite ref2=new Satellite();
		
		ref2.name="Aryabhatta";
		ref2.institute="ISRO";
		ref2.fuel="Hydrazine";
		ref2.budget=300000;
		ref2.launchDate=11;
		ref2.launchMonth="October";
		ref2.year=1996;
		ref2.length=8;
		ref2.width=8;
		ref2.diameter=9;
		ref2.weight=5000;
		ref2.indian=true;
		ref2.noOfSatellites=385;
		ref2.camera=true;
		ref2.orbit="Circular";
		ref2.solarPanel=false;
		
		ref2.display();
		
		

	}

}
