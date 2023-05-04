package com.xworkz.showroom.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoeShowRoomDTO implements Serializable, Comparable<ShoeShowRoomDTO> {
	@Min(value = 3)
	@Max(value = 100)
	private int id;

	@NotNull
	@Size(min = 3, max = 60)
	private String name;

	@NotNull
	@Size(min = 3, max = 60)
	private String address;

	@NotNull
	@Size(min = 3, max = 60)
	private String gstNo;

	public ShoeShowRoomDTO() {
		System.out.println("Creating ShoeShowRoom using no-arg const");
	}

	public void show() {
		System.out.println("Running show method in ShoeShowRoom");
		System.out.println("ID :" + this.id);
		System.out.println("Shoe show room name :" + this.name);
		System.out.println("Address :" + this.address);
		System.out.println("GST No :" + this.gstNo);
	}

	@Override
	public int compareTo(ShoeShowRoomDTO o) {
		return this.getAddress().compareTo(o.getAddress());
	}
}
