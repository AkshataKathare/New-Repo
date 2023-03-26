package com.xworkz.override.equals;

public class FootWare {
	private String brand;
	private char quality;
	private double size;
	private double price;

	public FootWare() {
		System.out.println("No-arg const in FootWare");
	}

	public FootWare(String brand, char quality, double size, double price) {
		super();
		this.brand = brand;
		this.quality = quality;
		this.size = size;
		this.price = price;
	}

	@Override
	public String toString() {
		return "FootWare [brand=" + brand + ", quality=" + quality + ", size=" + size + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in FootWare");
		return 298786;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in FootWare"+obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof FootWare) {
				System.out.println("obj is FootWare type");
				FootWare casted = (FootWare) obj;
				FootWare left = this;
				FootWare right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.quality == right.quality
						&& left.size == right.size) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not FootWare type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
