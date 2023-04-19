package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class GroceryDTO implements Serializable, Comparable<GroceryDTO> {

	private int id;
	private String name;
	private double price;
	private float quantity;

	public GroceryDTO() {
		// TODO Auto-generated constructor stub
	}

	public GroceryDTO(int id, String name, double price, float quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "GroceryDTO [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GroceryDTO)) {
			return false;
		}
		GroceryDTO other = (GroceryDTO) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Float.floatToIntBits(quantity) == Float.floatToIntBits(other.quantity);
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(GroceryDTO o) {
		if (this.name != null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
