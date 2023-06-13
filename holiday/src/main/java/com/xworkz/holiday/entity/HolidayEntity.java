package com.xworkz.holiday.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Table(name = "holiday")
public class HolidayEntity implements Serializable, Comparable<HolidayEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 45)
	private String startMonth;

	@Size(min = 3, max = 50)
	private String endMonth;

	@Size(min = 3, max = 50)
	private String visitedPlace;

	@Override
	public int compareTo(HolidayEntity o) {
		return this.getEndMonth().compareTo(o.getEndMonth());
	}
}