package com.xworkz.override.equals;

import java.util.Objects;

public class Cake {

	private String flavour;
	private String shape;
	private double weight;
	private boolean birthday;

	public Cake() {
		System.out.println("No-arg const in Cake");
	}

	public Cake(String flavour, String shape, double weight, boolean birthday) {
		super();
		this.flavour = flavour;
		this.shape = shape;
		this.weight = weight;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Cake [flavour=" + flavour + ", shape=" + shape + ", weight=" + weight + ", birthday=" + birthday + "]";
	}

	@Override
	public int hashCode() {
		return 230;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Cake"+obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Cake) {
				System.out.println("obj is of Cake type");
				Cake casted = (Cake) obj;
				Cake left = this;
				Cake right = casted;
				if (left.flavour.equals(right.flavour) && left.shape.equals(right.shape) && left.weight == right.weight
						&& left.birthday == right.birthday) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not of Cake type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
