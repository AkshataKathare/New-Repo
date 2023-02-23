package com.xworkz.inheritance.equals.things;

public class WaterFall {

	private String name;
	private double height;
	private String location;

	public WaterFall() {
		System.out.println("No-arg constructor in WaterFall..");
	}

	public WaterFall(String name, double height, String location) {
		this.name = name;
		this.height = height;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in WaterFall.." + obj);
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof WaterFall) {
				System.out.println("obj is WaterFall type..");
				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.equals(right.name) && left.height == right.height
						&& left.location.equals(right.location)) {
					System.out.println("left and right are the same..");
					return true;
				} else {
					System.err.println("left and right are not the same..");
				}
			} else {
				System.err.println("obj is not WaterFall type..");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in WaterFall..");
		return "Name :" + this.name + " Height :" + this.height + " Location :" + this.location;
	}

}
