package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class BookDTO implements Serializable, Comparable<BookDTO> {

	private String name;
	private double price;
	private int id;

	public BookDTO() {
		// TODO Auto-generated constructor stub
	}

	public BookDTO(String name, double price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}

	@Override
	public String toString() {
		return "BookDTO [name=" + name + ", price=" + price + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BookDTO)) {
			return false;
		}
		BookDTO other = (BookDTO) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(BookDTO o) {
		if (this.name != null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
