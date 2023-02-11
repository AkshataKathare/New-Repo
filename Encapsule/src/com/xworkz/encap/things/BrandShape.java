package com.xworkz.encap.things;

public class BrandShape {

	public static void main(String[] args) {
		Soap soap = new Soap();
		soap.setBrand("Santoor");
		String ref1 = soap.getBrand();

		soap.setShape("Oval");
		String ref2 = soap.getShape();

		soap.display();

	}

}
