package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AttendanceDTO implements Serializable {

	private String day;
	private int noOfTrainees;
	private int noOfAbsentees;
	private int noOfPresentees;
	private String institute;

	public AttendanceDTO() {
		System.out.println("No-arg const in AttendanceDTO");
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getNoOfTrainees() {
		return noOfTrainees;
	}

	public void setNoOfTrainees(int noOfTrainees) {
		this.noOfTrainees = noOfTrainees;
	}

	public int getNoOfAbsentees() {
		return noOfAbsentees;
	}

	public void setNoOfAbsentees(int noOfAbsentees) {
		this.noOfAbsentees = noOfAbsentees;
	}

	public int getNoOfPresentees() {
		return noOfPresentees;
	}

	public void setNoOfPresentees(int noOfPresentees) {
		this.noOfPresentees = noOfPresentees;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	@Override
	public String toString() {
		return "AttendanceDTO [day=" + day + ", noOfTrainees=" + noOfTrainees + ", noOfAbsentees=" + noOfAbsentees
				+ ", noOfPresentees=" + noOfPresentees + ", institute=" + institute + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, institute, noOfAbsentees, noOfPresentees, noOfTrainees);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AttendanceDTO)) {
			return false;
		}
		AttendanceDTO other = (AttendanceDTO) obj;
		return Objects.equals(day, other.day) && Objects.equals(institute, other.institute)
				&& noOfAbsentees == other.noOfAbsentees && noOfPresentees == other.noOfPresentees
				&& noOfTrainees == other.noOfTrainees;
	}

}
