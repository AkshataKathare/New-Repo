package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.electricity.constant.NumberOfCell;

public class PoliceStationDTO implements Serializable, Comparable<PoliceStationDTO> {

	@Min(value = 1)
	@Max(value = 200)
	private int id;

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20)
	private String name;

	@Min(value = 1)
	@Max(value = 200)
	private double area;

	@NotNull
	private NumberOfCell noOfCells;

	@NotEmpty
	@Size(min = 4, max = 40)
	private String inspectorName;

	public PoliceStationDTO() {
		// TODO Auto-generated constructor stub
	}

	public PoliceStationDTO(int id, String name, double area, NumberOfCell noOfCells, String inspectorName) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.noOfCells = noOfCells;
		this.inspectorName = inspectorName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, id, inspectorName, name, noOfCells);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PoliceStationDTO)) {
			return false;
		}
		PoliceStationDTO other = (PoliceStationDTO) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && id == other.id
				&& Objects.equals(inspectorName, other.inspectorName) && Objects.equals(name, other.name)
				&& noOfCells == other.noOfCells;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public NumberOfCell getNoOfCells() {
		return noOfCells;
	}

	public void setNoOfCells(NumberOfCell noOfCells) {
		this.noOfCells = noOfCells;
	}

	public String getInspectorName() {
		return inspectorName;
	}

	public void setInspectorName(String inspectorName) {
		this.inspectorName = inspectorName;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [id=" + id + ", name=" + name + ", area=" + area + ", noOfCells=" + noOfCells
				+ ", inspectorName=" + inspectorName + "]";
	}

	@Override
	public int compareTo(PoliceStationDTO o) {
		if (this.inspectorName != null) {
			return this.getInspectorName().compareTo(o.getInspectorName());
		}
		return 0;
	}

}