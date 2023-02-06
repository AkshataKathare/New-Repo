package com.xworkz.association.things;

public class Camera {

	public int pixel;
	public boolean clear;
	public int zoomLimit;

	public void initVar(int pixel, boolean clear, int zoomLimit) {
		this.pixel = pixel;
		this.clear = clear;
		this.zoomLimit = zoomLimit;
	}

	public void display() {
		System.out.println("Camera pixel :" + pixel);
		System.out.println("Camera is clear :" + clear);
		System.out.println("Camera zoomLimit :" + zoomLimit);

	}

}
