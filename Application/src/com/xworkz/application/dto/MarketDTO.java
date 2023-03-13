package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class MarketDTO implements Serializable {

	private String name;
	private String location;
	private boolean nearBy;
	private boolean goodRate;
	private double area;

	public MarketDTO() {
		System.out.println("No-arg const in MarketDTO");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isNearBy() {
		return nearBy;
	}

	public void setNearBy(boolean nearBy) {
		this.nearBy = nearBy;
	}

	public boolean isGoodRate() {
		return goodRate;
	}

	public void setGoodRate(boolean goodRate) {
		this.goodRate = goodRate;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", nearBy=" + nearBy + ", goodRate=" + goodRate
				+ ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, goodRate, location, name, nearBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MarketDTO)) {
			return false;
		}
		MarketDTO other = (MarketDTO) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && goodRate == other.goodRate
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& nearBy == other.nearBy;
	}

}
