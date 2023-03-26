package com.xworkz.override.equals;

public class Fridge {
	private String company;
	private double rating;
	private double price;
	private boolean doubleDoor;

	public Fridge() {
		System.out.println("No-arg const in Fridge");
	}

	public Fridge(String company, double rating, double price, boolean doubleDoor) {
		super();
		this.company = company;
		this.rating = rating;
		this.price = price;
		this.doubleDoor = doubleDoor;
	}

	@Override
	public String toString() {
		return "Fridge [company=" + company + ", rating=" + rating + ", price=" + price + ", doubleDoor=" + doubleDoor
				+ "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode method in Fridge");
		return 4387;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in Fridge" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fridge) {
				System.out.println("obj is Fridge type");
				Fridge casted = (Fridge) obj;
				Fridge left = this;
				Fridge right = casted;
				if (left.company.equals(right.company) && left.rating == right.rating && left.price == right.price
						&& left.doubleDoor == right.doubleDoor) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Fridge type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
