package com.xworkz.inheritance.equals.things;

public class Fridge {

	private String brand;
	private double price;
	private int noOfDoors;
	private int guarantee;
	private double maxTemp;
	private String color;
	private int noOfDrawers;
	private boolean wifiConnectivity;
	private boolean fresh;
	private String type;
	private String thing1;
	private String thing2;

	public Fridge() {
		System.out.println("No-arg constructor in Fridge..");
	}

	public Fridge(String brand, double price, int noOfDOors, int guarantee, double maxTemp, String color,
			int noOfDrawers, boolean wifiConnectivity, boolean fresh, String type, String thing1, String thing2) {
		this.brand = brand;
		this.price = price;
		this.noOfDoors = noOfDOors;
		this.guarantee = guarantee;
		this.maxTemp = maxTemp;
		this.color = color;
		this.noOfDrawers = noOfDrawers;
		this.wifiConnectivity = wifiConnectivity;
		this.fresh = fresh;
		this.type = type;
		this.thing1 = thing1;
		this.thing2 = thing2;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Fridge.." + obj);
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof Fridge) {
				System.out.println("obj is Fridge type..");
				Fridge casted = (Fridge) obj;
				Fridge left = this;
				Fridge right = casted;
				if (left.brand.equals(right.brand) && left.price == right.price && left.noOfDoors == right.noOfDoors
						&& left.guarantee == right.guarantee && left.maxTemp == right.maxTemp
						&& left.color.equals(right.color) && left.noOfDrawers == right.noOfDrawers
						&& left.wifiConnectivity == right.wifiConnectivity && left.fresh == right.fresh
						&& left.thing1.equals(right.thing1) && left.thing2.equals(right.thing2)) {
					System.out.println("left and right are same..");
					return true;
				} else {
					System.err.println("left and right are not same..");
				}
			} else {
				System.err.println("obj is not Fridge type..");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Fridge..");
		return "Brand :" + this.brand + " Price :" + this.price + " No of doors :" + this.noOfDoors + " Guarantee :"
				+ this.guarantee + " Maximum temp :" + this.maxTemp + " Color :" + this.color + " No of Drawers :"
				+ this.noOfDrawers + " Wifi connectivity :" + this.wifiConnectivity + " Fresh :" + this.fresh
				+ " Type :" + this.type + " Thing1 :" + this.thing1 + " Thing2 :" + this.thing2;
	}

}
