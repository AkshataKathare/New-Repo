package com.xworkz.mvcArch.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IskonDTO implements Serializable, Comparable<IskonDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String godName;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String location;

	@Min(value = 30)
	@Max(value = 60)
	private double entryFee;

	@Min(value = 100)
	@Max(value = 200)
	private float area;

	private boolean open;

	@Override
	public int compareTo(IskonDTO o) {
		System.out.println("Running compareTo me");
		return this.getGodName().compareTo(o.getGodName());
	}

}
