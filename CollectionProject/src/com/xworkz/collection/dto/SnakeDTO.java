package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

import com.xworkz.collection.constant.SnakeType;

public class SnakeDTO implements Serializable, Comparable<SnakeDTO> {

	private int id;
	private String name;
	private SnakeType type;
	private String place;

	public SnakeDTO() {
		// TODO Auto-generated constructor stub
	}

	public SnakeDTO(int id, String name, SnakeType type, String place) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
	}

	@Override
	public String toString() {
		return "SnakeDTO [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, place, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SnakeDTO)) {
			return false;
		}
		SnakeDTO other = (SnakeDTO) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place)
				&& type == other.type;
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

	public SnakeType getType() {
		return type;
	}

	public void setType(SnakeType type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int compareTo(SnakeDTO o) {
		if (this.name != null) {
			return this.getName().compareTo(o.getName());
		}
		return 0;
	}

}
