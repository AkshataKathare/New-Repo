package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SockDTO implements Serializable, Comparable<SockDTO> {

	@Size(min = 7, max = 40)
	private String color;
	@Min(value = 1)
	@Max(value = 20)
	private int size;

	@Override
	public int compareTo(SockDTO o) {
		return this.getColor().compareTo(o.getColor());
	}

}
