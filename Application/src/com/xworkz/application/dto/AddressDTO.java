package com.xworkz.application.dto;

import java.io.Serializable;
import java.util.Objects;

public class AddressDTO implements Serializable {
	private String street;
	private String area;
	private int pinCode;
	private int floor;
	private int number;
	private String city;
	private String state;

	public AddressDTO() {
		System.out.println("No-arg const of AddressDTO");
	}

	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", area=" + area + ", pinCode=" + pinCode + ", floor=" + floor
				+ ", number=" + number + ", city=" + city + ", state=" + state + "]";
	}

	public AddressDTO(String street, String area, int pinCode, int floor, int number, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.pinCode = pinCode;
		this.floor = floor;
		this.number = number;
		this.city = city;
		this.state = state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, city, floor, number, pinCode, state, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AddressDTO)) {
			return false;
		}
		AddressDTO other = (AddressDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(city, other.city) && floor == other.floor
				&& number == other.number && pinCode == other.pinCode && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
