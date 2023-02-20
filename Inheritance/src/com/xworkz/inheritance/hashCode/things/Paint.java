package com.xworkz.inheritance.hashCode.things;

public class Paint {

	private String brand;
	private String shop;
	private double price;
	private boolean pink;

	public Paint() {
		System.out.println("No-arg constructor in Paint..");
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Paint..");
		return 555;
	}

	@Override
	public String toString() {
		System.out.println("Overriding toString in Paint..");
		return "Brand :" + this.brand + "\nShop :" + this.shop + "\nPrice :" + this.price + "\nIt is pink :"
				+ this.pink;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPink(boolean pink) {
		this.pink = pink;
	}

	public String getBrand() {
		return brand;
	}

	public String getShop() {
		return shop;
	}

	public double getPrice() {
		return price;
	}

	private boolean isPink() {
		return pink;
	}

}
