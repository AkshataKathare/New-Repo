package com.xworkz.reevaluation.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class ReEvaluationEntity implements Serializable, Comparable<ReEvaluationEntity> {

	private String studentName;
	private String subject;
	private String collegeName;
	private double marks;
	private String fileName;
	private String contentType;

	@Override
	public int compareTo(ReEvaluationEntity o) {
		return this.getCollegeName().compareTo(o.getCollegeName());
	}

}
