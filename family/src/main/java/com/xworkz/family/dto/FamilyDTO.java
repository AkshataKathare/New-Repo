package com.xworkz.family.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class FamilyDTO implements Serializable, Comparable<FamilyDTO> {

	private String myName;
	private String fatherName;
	private String fatherOccup;
	private String motherName;
	private String motherOccup;
	private String sisterName;
	private String sisterPursuing;
	private String brotherName;
	private String brotherPursuing;
	private String surname;

	@Override
	public int compareTo(FamilyDTO o) {
		return this.getBrotherName().compareTo(o.getBrotherName());
	}

}
