package com.xworkz.association.things;

import com.xworkz.association.constant.Ambience;

public class Mall {

	public String name = "PHOENIX";
	public Ambience ambience = Ambience.GOOD;
	public int totalFloors;
	public Security security;

	public void setFloors(int totalFloors) {
		this.totalFloors = totalFloors;

	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public void display() {
		System.out.println("Details of Mall..");
		System.out.println(this.name);
		System.out.println(this.ambience);
		System.out.println(this.totalFloors);
		if (this.security != null) {
			this.security.display();
		} else {
			System.out.println("this.security is null..");
		}

	}

}
