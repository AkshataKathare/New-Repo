package com.xworkz.association.things;

import com.xworkz.association.constant.Language;

public class State {
	public final String name = "Karnataka";
	public String cMName;
	public Language language = Language.KANNADA;
	public City city;

	public void setCMName(String cMName) {
		this.cMName = cMName;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void display() {
		System.out.println("Details of State");
		System.out.println(this.name);
		System.out.println(this.cMName);
		System.out.println(this.language);
		if (this.city != null) {
			this.city.display();
		} else {
			System.err.println("this.city is null..");
		}
	}

}
