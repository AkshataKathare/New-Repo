package com.xworkz.override.equals;

public class Alcohol {

	private String brand;
	private double percentage;
	private boolean good;
	private char quality;

	public Alcohol(String brand, double percentage, boolean good, char quality) {
		this.brand = brand;
		this.percentage = percentage;
		this.good = good;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Alcohol [brand=" + brand + ", percentage=" + percentage + ", good=" + good + ", quality=" + quality
				+ "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Alcohol");
		return 1244;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("Running equals method in Alcohol" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof Alcohol) {
				System.out.println("arg is of Alcohol type");
				Alcohol casted = (Alcohol) arg;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.percentage == right.percentage && left.good == right.good
						&& left.quality == right.quality) {
					System.out.println("right and left are same");
					return true;
				} else {
					System.err.println("right and left are not same");
				}
			} else {
				System.err.println("arg is not Alcohol type");
			}
		} else {
			System.err.println("arg is null");
		}
		return super.equals(arg);
	}

}
