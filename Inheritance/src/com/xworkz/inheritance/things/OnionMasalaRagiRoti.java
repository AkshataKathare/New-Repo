package com.xworkz.inheritance.things;

public class OnionMasalaRagiRoti extends OnionRagiRoti {

	private float thickness;

	public OnionMasalaRagiRoti() {
		System.out.println("No-arg constructor in OnionMasalaRagiRoti");
	}

	public OnionMasalaRagiRoti(float thickness) {
		this.thickness = thickness;
		System.out.println("Float in OnionMasalaRagiRoti");
	}

	public float getThickness() {
		return this.thickness;
	}

}
