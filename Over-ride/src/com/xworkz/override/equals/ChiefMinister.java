package com.xworkz.override.equals;

public class ChiefMinister {

	private String name;
	private double yearsOfService;
	private double height;
	private double weight;
	private String party;
	private String city;
	private String state;
	private String country;
	private String wifeName;
	private String motherName;

	public ChiefMinister() {
		System.out.println("No-arg const of ChiefMinister");
	}

	public ChiefMinister(String name, double yearsOfService, double height, double weight, String party, String city,
			String state, String country, String wifeName, String motherName) {
		super();
		this.name = name;
		this.yearsOfService = yearsOfService;
		this.height = height;
		this.weight = weight;
		this.party = party;
		this.city = city;
		this.state = state;
		this.country = country;
		this.wifeName = wifeName;
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "ChiefMinister [name=" + name + ", yearsOfService=" + yearsOfService + ", height=" + height + ", weight="
				+ weight + ", party=" + party + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", wifeName=" + wifeName + ", motherName=" + motherName + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in ChiefMinister");
		return 128;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in ChiefMinister");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof ChiefMinister) {
				System.out.println("obj is of ChiefMinister type");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister left = this;
				ChiefMinister right = casted;
				if (left.name.equals(right.name) && left.yearsOfService == right.yearsOfService
						&& left.height == right.height && left.weight == right.weight && left.party.equals(right.party)
						&& left.city.equals(right.city) && left.state.equals(right.state)
						&& left.country.equals(right.country) && left.wifeName.equals(right.wifeName)
						&& left.motherName.equals(right.motherName)) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not ChiefMinister type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
