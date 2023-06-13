package com.xworkz.dl.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class DrivingLicenseDTO implements Serializable, Comparable<DrivingLicenseDTO> {

	@Size(min = 4, max = 50, message = "Name should have atleast 4 characters or atmost 50 characters")
	private String fullName;

	@Min(value = 18, message = "One whose age is greater then 18 can apply for driving license")
	private int age;

	@Size(min = 4, max = 50, message = "City name should have atleast 4 characters or atmost 50 characters")
	private String city;

	@Size(min = 4, max = 50, message = "State name should have atleast 4 characters or atmost 50 characters")
	private String state;

	private String fileName;

	private String contentType;

	private long fileSize;
	
	private String originalName;

	@Size(min = 4, max = 50, message = "Country name should have atleast 4 characters or atmost 50 characters")
	private String country;

	@Override
	public int compareTo(DrivingLicenseDTO o) {
		return this.getCity().compareTo(o.getCity());
	}

}
