package com.xworkz.override.equals;

public class PoliceStation {

	private String name;
	private String location;
	private int noOfPolice;

	public PoliceStation() {
		System.out.println("No-arg const in PoliceStation");
	}

	public PoliceStation(String name, String location, int noOfPolice) {
		super();
		this.name = name;
		this.location = location;
		this.noOfPolice = noOfPolice;
	}

	@Override
	public String toString() {
		return "PoliceStation [name=" + name + ", location=" + location + ", noOfPolice=" + noOfPolice + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode method in PoliceStation");
		return 21876;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in PoliceStation" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof PoliceStation) {
				System.out.println("obj is of PoliceStation type");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation left = this;
				PoliceStation right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location)
						&& left.noOfPolice == right.noOfPolice) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not PoliceStation type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
