package com.xworkz.inheritance.things;

public class Camera extends Device {

	public Camera() {
		System.out.println("No-arg constructor in Camera");
	}

	public Camera(String brand) {
		super(brand);// explicit ref
	}

	public void clickPhoto() {
		System.out.println("Running clickPhoto in Camera");
	}

}
