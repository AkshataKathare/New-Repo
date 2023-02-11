package com.xworkz.encap.boot;

import com.xworkz.encap.things.Soap;

public class SoapRunner {

	public static void main(String[] args) {

		Soap soap = new Soap();
		String brand = soap.getBrand();
		String shape = soap.getShape();
		soap.display();

	}

}
