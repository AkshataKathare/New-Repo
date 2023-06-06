package com.xworkz.pgDetails.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PGDTO implements Serializable, Comparable<PGDTO> {

	@NonNull
	@Size(min = 3, max = 45, message = "PG name should be in btw 3 and 45")
	private String pgName;

	@NonNull
	@Size(min = 3, max = 45, message = "PG owner should be in btw 3 and 45")
	private String pgOwner;

	@NonNull
	@Size(min = 3, max = 45, message = "PG location should be in btw 3 and 45")
	private String location;

	@Min(value = 4000, message = "pg rent must be greater than 4000")
	@Max(value = 6000, message = "pg rent must be less than 6000")
	private Double pgRent;

	@Min(value = 2, message = "It must have min 2 floors")
	@Max(value = 4, message = "It must have max 4 floors")
	private Integer noOfFloors;

	@Override
	public int compareTo(PGDTO o) {
		return this.getPgName().compareTo(o.getPgName());
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public String getPgOwner() {
		return pgOwner;
	}

	public void setPgOwner(String pgOwner) {
		this.pgOwner = pgOwner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getPgRent() {
		return pgRent;
	}

	public void setPgRent(Double pgRent) {
		this.pgRent = pgRent;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
}
