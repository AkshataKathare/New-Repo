package com.xworkz.inheritance.equals.things;

public class Fish {
	private String name;
	private double weight;
	private String color;
	private double length;
	private float price;

	public Fish() {
		System.out.println("No-arg constructor in Fish..");
	}

	public Fish(String name, double weight, String color, double length, float price) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.length = length;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Fish .." + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish type..");
				Fish casted = (Fish) obj;
				Fish left = this;
				Fish right = casted;
				if (left.name.equals(right.name) && left.weight == right.weight && left.color.equals(right.color)
						&& left.length == right.length && left.price == right.price) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Fish type..");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Fish..");
		return "Name :" + this.name + " Weight :" + this.weight + " Color :" + this.color + " Length :" + this.length
				+ " Price :" + this.price;
	}

}
