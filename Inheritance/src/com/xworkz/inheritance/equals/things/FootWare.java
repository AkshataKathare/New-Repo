package com.xworkz.inheritance.equals.things;

public class FootWare {

	private String brand;
	private int size;
	private String type;

	public FootWare() {
		System.out.println("No-arg constructor in FootWare..");
	}

	public FootWare(String brand, int size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("over-riding equals in FootWare..");
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof FootWare) {
				System.out.println("obj is FootWare type");
				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;
				if (left.brand.equals(right.brand) && left.size == right.size && left.type.equals(right.type)) {
					System.out.println("left and right are same..");
					return true;
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not of FootWare type..");
			}
		} else {
			System.err.println("obj is null");
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in FootWare");
		return "Brand :" + this.brand + " Size :" + this.size + " Type :" + this.type;
	}

}
