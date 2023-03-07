package com.xworkz.inter.things;

public abstract class AbstractInfo {

	private String createdBy;
	private String updatedBy;
	
	abstract void name();

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
