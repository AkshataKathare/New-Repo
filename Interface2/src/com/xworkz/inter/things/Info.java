package com.xworkz.inter.things;

public class Info extends AbstractInfo {

	@Override
	void name() {
		System.out.println("Running name in Info");
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
	boolean followStandards() {
		System.out.println("Running followStandards in Info");
		return false;
	}

	@Override
	boolean understandingConcepts() {
		System.out.println("Running understandingConcepts in Info");
		return false;
	}

}
