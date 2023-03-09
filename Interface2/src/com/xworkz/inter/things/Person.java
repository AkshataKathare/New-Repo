package com.xworkz.inter.things;

public class Person extends Info implements PassportRule,DubaiVisaRule {
	
	@Override
	public void name() {
		System.out.println("Running name in Person");
	}
	@Override
	public void setCreatedBy(String createdBy) {
		System.out.println("Running setCreatedBy in Info");
	}
    @Override
	public void setUpdatedBy(String updatedBy) {
		System.out.println("Running setCreatedBy in Info");

	}

	@Override
	public double minAmount() {
		System.out.println("Running minAmount in Person");
		return 50000;
	}

	@Override
	public boolean stayingHotel() {
		System.out.println("Running stayingHotel in Person");
		return false;
	}

	@Override
	public double maxGoldLimit() {
		System.out.println("Running maxGoldLimit in Person");
		return 200000;
	}

	@Override
	public boolean citizen() {
		System.out.println("Running citizen in Person");
		return false;
	}

	@Override
	public int criminalRecord() {
		System.out.println("Running criminalRecord in Person");
		return 300;
	}

	@Override
	public boolean jail() {
		System.out.println("Running jail in Person");
		return true;
	}

}