package com.xworkz.inheritance.equals.things;

public class Alcohol {

	private String brand;
	private double percentage;
	private float price;
	private String type;

	public Alcohol() {
		System.out.println("No-arg constructor in Alcohol..");
	}

	public Alcohol(String brand, double percentage, float price, String type) {
		this.brand = brand;
		this.percentage = percentage;
		this.price = price;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Alcohol.." + obj);// alcohol2 is obj
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Alcohol) {
				System.out.println("obj is Alcohol type..");
				Alcohol casted = (Alcohol) obj;
				Alcohol left = this;
				Alcohol right = casted;
				if (left.brand.equals(right.brand) && left.percentage == right.percentage && left.price == right.price
						&& left.type.equals(right.type)) {
					System.out.println("left and right are same..");
					return true;
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not Alcohol type..");
			}
		} else {
			System.err.println("obj is null.");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding Alcohol in Alcohol..");
		return "Brand :" + this.brand + " Percentage :" + this.percentage + " Price :" + this.price + " Type :"
				+ this.type;
	}

}
