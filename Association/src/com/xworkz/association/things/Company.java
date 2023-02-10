package com.xworkz.association.things;

public class Company {

	public String name = "Happiest Minds";
	public final String cEOName = "Sagar";
	public int since;
	public Address address;

	public void setSince(int since) {
		this.since = since;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Details of Company");
		System.out.println(this.name);
		System.out.println(this.cEOName);
		System.out.println(this.since);
		if (this.address != null) {
			this.address.display();
		} else {
			System.out.println("this.address is null..");
		}

	}

}
