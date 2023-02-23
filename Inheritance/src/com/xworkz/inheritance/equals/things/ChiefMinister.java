package com.xworkz.inheritance.equals.things;

public class ChiefMinister {

	private String name;
	private String state;
	private int age;
	private String motherName;
	private String fatherName;
	private String wifeName;
	private int noOfChildren;
	private String qualification;
	private String car;
	private double duration;
	private String party;
	private int since;
	private String nationality;

	public ChiefMinister() {
		System.out.println("No-arg constructor in ChiefMinister..");
	}

	public ChiefMinister(String name, String state, int age, String motherName, String fatherName, String wifeName,
			int noOfChildren, String qualification, String car, double duration, String party, int since,
			String nationality) {
		this.name = name;
		this.state = state;
		this.age = age;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.wifeName = wifeName;
		this.noOfChildren = noOfChildren;
		this.qualification = qualification;
		this.car = car;
		this.duration = duration;
		this.party = party;
		this.since = since;
		this.nationality = nationality;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in ChiefMinister.." + obj);
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof ChiefMinister) {
				System.out.println("obj is ChiefMinister type..");
				ChiefMinister casted = (ChiefMinister) obj;
				ChiefMinister left = this;
				ChiefMinister right = casted;
				if (left.name.equals(right.name) && left.state.equals(right.state) && left.age == right.age
						&& left.motherName.equals(right.motherName) && left.fatherName.equals(right.fatherName)
						&& left.wifeName.equals(right.wifeName) && left.noOfChildren == right.noOfChildren
						&& left.qualification.equals(right.qualification) && left.car.equals(right.car)
						&& left.duration == right.duration && left.party.equals(right.party)
						&& left.since == right.since && left.nationality.equals(right.nationality)) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left andright are not same..");
				}
			} else {
				System.err.println("obj is not ChiefMinister type..");
			}
		} else {
			System.err.println("obj is null..");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in ChiefMinister..");
		return "Name :" + this.name + " State :" + this.state + " Age :" + this.age + " Mother name :" + this.motherName
				+ " Father name :" + this.fatherName + " Wife name :" + this.wifeName + " No of children :"
				+ this.noOfChildren + " Qualification :" + this.qualification + " Car :" + this.car + " Duration :"
				+ this.party + " Since :" + this.since + " Nationality :" + this.nationality;
	}

}
