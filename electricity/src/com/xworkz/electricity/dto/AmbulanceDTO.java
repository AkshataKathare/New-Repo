package com.xworkz.electricity.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class AmbulanceDTO implements Serializable, Comparable<AmbulanceDTO> {

	@Min(value = 3)
	@Max(value = 500)
	private int id;

	@Min(value = 1)
	@Max(value = 1839287)
	private int regNo;

	@Min(value = 1)
	@Max(value = 1839287)
	private int chasisNo;

	@NotNull
	@Size(min = 3, max = 40)
	private String ownerName;

	private boolean insuranceExpired;

	@NotNull
	@Size(min = 3, max = 40)
	private String driverName;

	@NotNull
	@PastOrPresent
	private LocalDate startDate;

	@Override
	public int compareTo(AmbulanceDTO o) {
		return this.getDriverName().compareTo(o.getDriverName());
	}

}
