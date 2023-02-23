package com.xworkz.inheritance.equals.things;

public class Park {

	private String name;
	private String location;
	private double entranceTicket;
	private float boatingTicket;
	private int noOfGates;
	private int noOfTrees;

	public Park() {
		System.out.println("No-arg constructor in Park..");
	}

	public Park(String name, String location, double entranceTicket, float boatingTicket, int noOfGates,
			int noOfTrees) {
		this.name = name;
		this.location = location;
		this.entranceTicket = entranceTicket;
		this.boatingTicket = boatingTicket;
		this.noOfGates = noOfGates;
		this.noOfTrees = noOfTrees;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Park.." + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Park) {
				System.out.println("obj is Park type..");
				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location)
						&& left.entranceTicket == right.entranceTicket && left.boatingTicket == right.boatingTicket
						&& left.noOfGates == right.noOfGates && left.noOfTrees == right.noOfTrees) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not Park type..");
			}

		} else {
			System.err.println("obj is null..");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Park..");
		return "Name :" + this.name + " Location :" + this.location + " Entrance ticket :" + this.entranceTicket
				+ " Boating ticket :" + this.boatingTicket + " No of gates :" + this.noOfGates + " No of trees :"
				+ this.noOfTrees;
	}

}
