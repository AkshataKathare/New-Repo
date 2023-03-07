package com.xworkz.link.boot;

import com.xworkz.link.things.Passengers;

public class RailwayStationRunnuer {

	public static void main(String[] args) {

		Passengers passengers = new Passengers();
		System.out.println(passengers.beAware());
		System.out.println(passengers.clean());
		System.out.println(passengers.officeCloseTime());
		System.out.println(passengers.officeOpenTime());
		System.out.println(passengers.standAwayFromDoor());
		System.out.println(passengers.stayInWaitingRoom());
		System.out.println(passengers.ticketCompulsion());
		System.out.println(passengers.timeOfTrain());
		System.out.println(passengers.equals(passengers));
		System.out.println(passengers.hashCode());
		System.out.println(passengers.toString());
		System.out.println(passengers.getClass());

	}

}
