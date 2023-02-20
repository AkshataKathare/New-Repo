package com.xworkz.inheritance.hashCode.things;

public class Gold {

	private String shop;
	private double cost;
	private boolean costly;
	private String jewellery;

	public Gold() {
		System.out.println("No-arg constructor in Gold..");
	}

	@Override
	public String toString() {
		System.out.println("over-riding toString in Gold..");
		return "SHop name :" + this.shop + "\nCost :" + this.cost + "\nCostly :" + this.costly + "\nJewellery type :"
				+ this.jewellery;
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Gold..");
		return 200;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setCostly(boolean costly) {
		this.costly = costly;
	}

	public void setJewellery(String jewellery) {
		this.jewellery = jewellery;
	}

	public String getShop() {
		return shop;
	}

	public double getCost() {
		return cost;
	}

	public String getJewellery() {
		return jewellery;
	}

	public boolean isCostly() {
		return costly;
	}

}
