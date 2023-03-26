package com.xworkz.override.equals;

public class Park {
	private String name;
	private String location;
	private double area;
	private int noOfChairs;

	public Park() {
		System.out.println("No-arg const in Park");
	}

	public Park(String name, String location, double area, int noOfChairs) {
		super();
		this.name = name;
		this.location = location;
		this.area = area;
		this.noOfChairs = noOfChairs;
	}

	@Override
	public String toString() {
		return "Park [name=" + name + ", location=" + location + ", area=" + area + ", noOfChairs=" + noOfChairs + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode method in Park");
		return 329876;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in Park");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Park) {
				System.out.println("obj is Park type");
				Park casted = (Park) obj;
				Park left = this;
				Park right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location) && left.area == right.area
						&& left.noOfChairs == right.noOfChairs) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Park type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
