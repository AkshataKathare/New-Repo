package com.xworkz.inheritance.hashCode.things;

public class Door {

	private boolean wooden;
	private String company;
	private String handleType;
	private double length;

	public Door() {
		System.out.println("No-arg constructor in Door..");
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Door");
		return "It is wooden :" + this.wooden + "\nCompany :" + this.company + "\nHandletype :" + this.handleType
				+ "\nLength :" + this.length;
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Door..");
		return 900;
	}

	public void setWooden(boolean wooden) {
		this.wooden = wooden;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isWooden() {
		return wooden;
	}

	public String getCompany() {
		return company;
	}

	public String getHandleType() {
		return handleType;
	}

	public double getLength() {
		return length;
	}

}
