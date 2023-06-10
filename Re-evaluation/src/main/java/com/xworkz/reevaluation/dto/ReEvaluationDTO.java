package com.xworkz.reevaluation.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
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
public class ReEvaluationDTO implements Serializable, Comparable<ReEvaluationDTO> {

	@Size(min = 3, max = 45, message = "student name must be btw 3 and 45")
	private String studentName;

	@NotEmpty(message = "You must choose any one of the subjects")
	private String subject;

	@Size(min = 3, max = 45, message = "college name must be btw 3 and 45")
	private String collegeName;

	@Max(value = 34, message = "only for those subject which you have got below or equal to 34")
	private double marks;

	private String fileName;

	private String contentType;

	private long fileSize;

	@Override
	public int compareTo(ReEvaluationDTO o) {
		return this.getStudentName().compareTo(o.getStudentName());
	}

}