package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AwarenessDTO implements Serializable {

	private String type;
	private LocalDate date;
	private String initiatedBy;
	private int noOfPeopleInvolved;
	private String location;

	public AwarenessDTO() {
		System.out.println("No-arg const in AwarenesDTO");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getInitiatedBy() {
		return initiatedBy;
	}

	public void setInitiatedBy(String initiatedBy) {
		this.initiatedBy = initiatedBy;
	}

	public int getNoOfPeopleInvolved() {
		return noOfPeopleInvolved;
	}

	public void setNoOfPeopleInvolved(int noOfPeopleInvolved) {
		this.noOfPeopleInvolved = noOfPeopleInvolved;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AwarenessDTO [type=" + type + ", date=" + date + ", initiatedBy=" + initiatedBy
				+ ", noOfPeopleInvolved=" + noOfPeopleInvolved + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, initiatedBy, location, noOfPeopleInvolved, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AwarenessDTO)) {
			return false;
		}
		AwarenessDTO other = (AwarenessDTO) obj;
		return Objects.equals(date, other.date) && Objects.equals(initiatedBy, other.initiatedBy)
				&& Objects.equals(location, other.location) && noOfPeopleInvolved == other.noOfPeopleInvolved
				&& Objects.equals(type, other.type);
	}

}
