package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.WeaponType;

public class WeaponDTO implements Serializable {

	private int id;
	private String name;
	private WeaponType type;
	private double cost;
	private String material;
	private String madeby;
	private String manufacturedBy;
	private LocalDate manufacturedYear;
	private String usedBy;
	private String usedFor;
	private double weight;

	public WeaponDTO() {
		System.out.println("No-arg const of WeaponDTO");
	}

	public WeaponDTO(int id, String name, WeaponType type, double cost, String material, String madeby,
			String manufacturedBy, LocalDate manufacturedYear, String usedBy, String usedFor, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.material = material;
		this.madeby = madeby;
		this.manufacturedBy = manufacturedBy;
		this.manufacturedYear = manufacturedYear;
		this.usedBy = usedBy;
		this.usedFor = usedFor;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeby, manufacturedBy, manufacturedYear, material, name, type, usedBy, usedFor,
				weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WeaponDTO)) {
			return false;
		}
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeby, other.madeby) && Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(manufacturedYear, other.manufacturedYear) && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& Objects.equals(usedBy, other.usedBy) && Objects.equals(usedFor, other.usedFor)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + ", material=" + material
				+ ", madeby=" + madeby + ", manufacturedBy=" + manufacturedBy + ", manufacturedYear=" + manufacturedYear
				+ ", usedBy=" + usedBy + ", usedFor=" + usedFor + ", weight=" + weight + "]";
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

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
