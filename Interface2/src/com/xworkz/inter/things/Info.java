package com.xworkz.inter.things;

public class Info extends AbstractInfo{

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
	

}
