package com.xworkz.association.things;

public class Security {
	public String deptName = "Zeal Team";
	public int totalStaff;
	public String headStaff;
	public Company company;

	public void setNum(int totalStaff) {
		this.totalStaff = totalStaff;
	}

	public void setheadStaff(String headStaff) {
		this.headStaff = headStaff;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void display() {
		System.out.println("Details of Security");
		System.out.println(this.deptName);
		System.out.println(this.totalStaff);
		System.out.println(this.headStaff);
		if (this.company != null) {
			this.company.display();
		} else {
			System.out.println("this.company is null..");
		}
	}

}
