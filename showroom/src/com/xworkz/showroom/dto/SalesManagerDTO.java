package com.xworkz.showroom.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO> {

	private String name;
	private String email;

	@Override
	public int compareTo(SalesManagerDTO o) {
		return this.getEmail().compareTo(o.getEmail());
	}

}
