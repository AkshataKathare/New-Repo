package com.xworkz.association.things;

public class Country {
	public final String name = "India";
	public String president;
	public boolean developed;
	public State state;

	public void setPresident(String president) {
		this.president = president;
	}

	public void setDev(boolean developed) {
		this.developed = developed;
	}

	public void setState(State state) {

		this.state = state;
	}

	public void display() {
		System.out.println("Details of Country..");
		System.out.println(this.name);
		System.out.println(this.president);
		System.out.println(this.developed);
		if (this.state != null) {
			this.state.display();
		} else {
			System.err.println("this.state is null..");
		}

	}

}
