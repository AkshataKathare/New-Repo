package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 3)
	@Max(value = 500)
	private int id;

	@Min(value = 1)
	@Max(value = 1839287)
	private int regNo;

	@Min(value = 1)
	@Max(value = 1839287)
	private int chasisNo;

	@NotNull
	@Size(min = 3, max = 40)
	private String ownerName;

	private boolean insuranceExpired;

	@NotNull
	@Size(min = 3, max = 40)
	private String driverName;

	@NotNull
	@PastOrPresent
	private LocalDate startDate;

	public AmbulanceDTO() {
		// TODO Auto-generated constructor stub
	}

	public AmbulanceDTO(int id, int regNo, int chasisNo, String ownerName, boolean insuranceExpired, String driverName,
			LocalDate startDate) {
		super();
		this.id = id;
		this.regNo = regNo;
		this.chasisNo = chasisNo;
		this.ownerName = ownerName;
		this.insuranceExpired = insuranceExpired;
		this.driverName = driverName;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "AmbulanceDTO [id=" + id + ", regNo=" + regNo + ", chasisNo=" + chasisNo + ", ownerName=" + ownerName
				+ ", insuranceExpired=" + insuranceExpired + ", driverName=" + driverName + ", startDate=" + startDate
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(chasisNo, driverName, id, insuranceExpired, ownerName, regNo, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AmbulanceDTO)) {
			return false;
		}
		AmbulanceDTO other = (AmbulanceDTO) obj;
		return chasisNo == other.chasisNo && Objects.equals(driverName, other.driverName) && id == other.id
				&& insuranceExpired == other.insuranceExpired && Objects.equals(ownerName, other.ownerName)
				&& regNo == other.regNo && Objects.equals(startDate, other.startDate);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isInsuranceExpired() {
		return insuranceExpired;
	}

	public void setInsuranceExpired(boolean insuranceExpired) {
		this.insuranceExpired = insuranceExpired;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Override
	public int compareTo(AmbulanceDTO o) {
		return this.getDriverName().compareTo(o.getDriverName());
	}

}
