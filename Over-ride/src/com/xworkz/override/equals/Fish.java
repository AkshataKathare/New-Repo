package com.xworkz.override.equals;

public class Fish {

	private String name;
	private String color;
	private double length;
	private double weight;
	private boolean lakeFish;

	public Fish() {
		System.out.println("No-arg const of Fish");
	}

	public Fish(String name, String color, double length, double weight, boolean lakeFish) {
		super();
		this.name = name;
		this.color = color;
		this.length = length;
		this.weight = weight;
		this.lakeFish = lakeFish;
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", color=" + color + ", length=" + length + ", weight=" + weight + ", lakeFish="
				+ lakeFish + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Fish");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in Fish" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish type");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.name.equals(right.name) && left.color.equals(right.color) && left.length == right.length
						&& left.weight == right.weight && left.lakeFish == right.lakeFish) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Fish type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}
}
