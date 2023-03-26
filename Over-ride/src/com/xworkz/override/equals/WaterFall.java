package com.xworkz.override.equals;

import java.util.Objects;

public class WaterFall {

	private String name;
	private String location;
	private double height;
	private double distance;

	public WaterFall() {
		System.out.println("No-arg const in WaterFall");
	}

	public WaterFall(String name, String location, double height, double distance) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "WaterFall [name=" + name + ", location=" + location + ", height=" + height + ", distance=" + distance
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(distance, height, location, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals method in WaterFall" + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof WaterFall) {
				System.out.println("obj is of WaterFall type");
				WaterFall casted = (WaterFall) obj;
				WaterFall left = this;
				WaterFall right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location) && left.height == right.height
						&& left.distance == right.distance) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not WaterFall type");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
