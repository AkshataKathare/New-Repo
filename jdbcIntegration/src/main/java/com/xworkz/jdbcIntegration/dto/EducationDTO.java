package com.xworkz.jdbcIntegration.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class EducationDTO implements Serializable, Comparable<EducationDTO> {

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String fName;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String schoolName;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String schoolPerc;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String puCollegeName;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String puPerc;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String degreeCollege;

	@NotNull
	@NotEmpty
	@Size(min = 2, max = 30)
	private String degreePerc;

	@Override
	public int compareTo(EducationDTO o) {
		return this.getSchoolName().compareTo(o.getSchoolName());
	}

}
