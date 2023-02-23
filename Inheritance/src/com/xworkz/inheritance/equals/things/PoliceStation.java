package com.xworkz.inheritance.equals.things;

public class PoliceStation {

	private String name;
	private String location;
	private String place;
	private String state;
	private int noOfStaff;
	private int noOfRobbers;
	private String inspectorName;
	private String subInspectorName;
	private int noOfCells;
	private String constableName;

	public PoliceStation() {
		System.out.println("No-arg constructor in PoliceStation..");
	}

	public PoliceStation(String name, String location, String place, String state, int noOfStaff, int noOfRobbers,
			String inspectorName, String subInspectorName, int noOfCells, String constableName) {
		this.name = name;
		this.location = location;
		this.place = place;
		this.state = state;
		this.noOfStaff = noOfStaff;
		this.noOfRobbers = noOfRobbers;
		this.inspectorName = inspectorName;
		this.subInspectorName = subInspectorName;
		this.noOfCells = noOfCells;
		this.constableName = constableName;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in PoliceStation.." + obj);
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof PoliceStation) {
				System.out.println("obj is PoliceStation type..");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation left = this;
				PoliceStation right = casted;
				if (left.name.equals(right.name) && left.location.equals(right.location)
						&& left.place.equals(right.place) && left.state.equals(right.state)
						&& left.noOfStaff == right.noOfStaff && left.noOfRobbers == right.noOfRobbers
						&& left.inspectorName.equals(right.inspectorName)
						&& left.subInspectorName.equals(right.subInspectorName) && left.noOfCells == right.noOfCells
						&& left.constableName.equals(right.constableName)) {
					System.out.println("left and right are same..");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not PoliceStation type..");
			}
		} else {
			System.err.println("obj is null..");
		}
		return super.equals(obj);

	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in PoliceStation..");
		return "Name :" + this.name + " Location :" + this.location + " Place :" + this.place + " State :" + this.state
				+ " No of staff :" + this.noOfStaff + " No of Roobbers :" + this.noOfRobbers + " Inspector name :"
				+ this.inspectorName + " Sub Inspector name :" + this.subInspectorName + " No of cells :"
				+ this.noOfCells + " Constable name :" + this.constableName;
	}

}
