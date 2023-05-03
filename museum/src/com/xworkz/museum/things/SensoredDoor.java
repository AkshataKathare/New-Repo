package com.xworkz.museum.things;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class SensoredDoor {

	private Camera camera;

	public SensoredDoor(Camera camera) {
		System.out.println("Creating SensoredDoor using no-arg const");
		this.camera = camera;
	}
}
