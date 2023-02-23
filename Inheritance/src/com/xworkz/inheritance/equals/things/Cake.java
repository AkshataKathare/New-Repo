package com.xworkz.inheritance.equals.things;

public class Cake {

	private String flavour;
	private double weight;
	private String shape;
	private float price;

	public Cake() {
		System.out.println("No-arg constructor in Cake..");
	}

	public Cake(String flavour, double weight, String shape, float price) {
		this.flavour = flavour;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Cake.." + obj);
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof Cake) {
				System.out.println("obj is of Cake type..");
				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.weight == right.weight && left.price == right.price
						&& left.shape.equals(right.shape)) {
					System.out.println("left and right are same..");
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not of Cake type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Cake..");
		return "Flavour :" + this.flavour + " Weight :" + this.weight + " Shape :" + this.shape + " Price :"
				+ this.price;
	}

}
