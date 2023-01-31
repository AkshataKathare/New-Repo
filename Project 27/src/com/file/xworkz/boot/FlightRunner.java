package com.file.xworkz.boot;

import  com.file.xworkz.thing.Flight;

public class FlightRunner {

	public static void main(String[] args) {
		
		Flight ref=new Flight();
		
		ref.name="Airbus";
		ref.compartments=20;
		ref.seats=100000;
		ref.domestic=true;
		ref.seatType="Window Seat";
		ref.classType="Buisness Class";
		ref.length=56;
		ref.height=6;
        ref.width=6;
        ref.speed=1110;
        
        ref.display();
        
        System.out.println("=============");
        
        Flight ref1=new Flight();
        
        ref1.name="IndiGo";
		ref1.compartments=30;
		ref1.seats=200000;
		ref1.domestic=false;
		ref1.seatType="Middle Seat";
		ref1.classType="First Class";
		ref1.length=70;
		ref1.height=5;
        ref1.width=7;
        ref1.speed=500;
        
        ref1.display();
	}

}
