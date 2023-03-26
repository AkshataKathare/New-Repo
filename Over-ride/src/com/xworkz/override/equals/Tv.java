package com.xworkz.override.equals;

public class Tv {

	private String brand;
	private boolean good;
	private double price;
	private double size;

	public Tv() {
		System.out.println("No-arg const in Tv");
	}

	public Tv(String brand, boolean good, double price, double size) {
		super();
		this.brand = brand;
		this.good = good;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", good=" + good + ", price=" + price + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode method in Tv");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in Tv" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Tv) {
				System.out.println("obj is of Tv type");
				Tv casted = (Tv) obj;
				Tv left = this;
				Tv right = casted;
				if (left.brand.equals(right.brand) && left.good == right.good && left.price == right.price
						&& left.size == right.size) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Tv type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
}
