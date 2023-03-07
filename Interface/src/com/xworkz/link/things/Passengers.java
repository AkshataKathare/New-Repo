package com.xworkz.link.things;

public class Passengers implements RailwayStationRule {

	@Override
	public double officeOpenTime() {
		System.out.println("Running officeOpenTime in Passengers");
		return 7;
	}

	@Override
	public double officeCloseTime() {
		System.out.println("Running officeCloseTime in Passengers");
		return 9;
	}

	@Override
	public boolean beAware() {
		System.out.println("Running beAware in Passengers");
		return true;
	}

	@Override
	public boolean standAwayFromDoor() {
		System.out.println("Running standAwayFromDoor in Passengers");
		return true;
	}

	@Override
	public boolean ticketCompulsion() {
		System.out.println("Running ticketCompulsion in Passengers");
		return true;
	}

	@Override
	public double timeOfTrain() {
		System.out.println("Running timeOfTrain in Passengers");
		return 12.15;

	}

	@Override
	public boolean stayInWaitingRoom() {
		System.out.println("Running stayInWaitingRoom in Passengers");
		return true;
	}

	@Override
	public boolean clean() {
		System.out.println("Running clean in Passengers");
		return false;
	}

}
