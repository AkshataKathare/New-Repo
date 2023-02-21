package com.xworkz.inheritance.equals.things;

public class TV {

	private String brand;
	private double price;
	private int size;

	public TV() {
		System.out.println("No-arg constructor in TV..");
	}

	public TV(String brand, double price, int size) {
		System.out.println("Running String,double and int in TV");
		this.brand = brand;
		this.price = price;
		this.size = size;

	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in TV...");
		return "Brand :" + this.brand + "Price :" + this.price + "Size :" + this.size;
	}

	@Override
	public boolean equals(Object arg) {
		System.out.println("Over-riding equals in TV" + arg);
		if (arg != null) {
			System.out.println("Arg is not null..");
			if (arg instanceof TV) {
				System.out.println("Arg is of TV type");
				TV casted = (TV) arg;
				TV left = this;
				TV right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.size == right.size) {
					System.out.println("left and right are same..");
					return true;
				}

				else {
					System.out.println("left and right are not same");
				}

			} else {
				System.out.println("Arg is not TV type");
			}
		} else {
			System.err.println("Arg is null");

		}
		return super.equals(arg);

	}

}
