package com.xworkz.collection.dto;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDTO implements Serializable {

	private String name;

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EmployeeDTO)) {
			return false;
		}
		EmployeeDTO other = (EmployeeDTO) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
