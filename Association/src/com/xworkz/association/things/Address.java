package com.xworkz.association.things;

public class Address {
	public Country country;

	public void setCountry(Country country) {
		this.country = country;
	}

	public void display() {
		System.out.println("Details of Address");
		if (this.country != null) {
			this.country.display();
		} else {
			System.err.println("this.country is null..");
		}
	}

}
