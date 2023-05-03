package com.xworkz.museum.things;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class EntryFee {

	private SensoredDoor sensoredDoor;

	public EntryFee(SensoredDoor sensoredDoor) {
		System.out.println("Creating EntryFee using no-arg");
		this.sensoredDoor = sensoredDoor;
	}
}
