package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO> {

	@Size(min = 5, max = 20)
	private String brand;

	@Size(min = 5, max = 20)
	private String color;

	@Override
	public int compareTo(PolishDTO o) {
		return this.getBrand().compareTo(o.getBrand());
	}

}
