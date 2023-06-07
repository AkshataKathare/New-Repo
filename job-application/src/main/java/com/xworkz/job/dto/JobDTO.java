package com.xworkz.job.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class JobDTO implements Serializable, Comparable<JobDTO> {

	@NonNull
	@Size(min = 4, max = 45, message = "applicant name should have chars btw 4 and 45")
	private String applName;

	@Min(value = 0, message = "applicant must have min 0 yr experience")
	@Max(value = 5, message = "applicant must have max 5 years experience")
	private double experience;

	@NonNull
	@NotEmpty(message = "Applicant must have any one of the qualifications")
	private String qualification;

	@Min(value = 60, message = "Min percentage of applicant must be 60%")
	private double percentage;

	@Override
	public int compareTo(JobDTO o) {
		return this.getApplName().compareTo(o.getApplName());
	}

}
