
package com.xworkz.dl.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "drivingLicense")
@NamedQuery(name = "findByName", query = "select ent from DlEntity as ent where ent.fullName like :fnm")
public class DlEntity implements Serializable, Comparable<DlEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private int age;
	private String city;
	private String state;
	private String fileName;
	private String originalName;
	private String contentType;
	private long fileSize;
	private String country;

	@Override
	public int compareTo(DlEntity o) {
		return this.getCity().compareTo(o.getCity());
	}

}
