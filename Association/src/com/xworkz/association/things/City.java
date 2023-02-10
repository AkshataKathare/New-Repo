package com.xworkz.association.things;

public class City {
	public String name = "Dharwad";
	public String district;
	public boolean capital;
	public Area area;

	public void setDistrict(String district) {
		this.district = district;

	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void display() {
		System.out.println("Details of City");
		System.out.println(this.name);
		System.out.println(this.district);
		System.out.println(this.capital);
		if (this.area != null) {
			this.area.show();
		} else {
			System.err.println("this.area is null.");
		}
	}

}
