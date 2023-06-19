package com.xworkz.contactInfo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "contactinfo")
@NamedQuery(name = "findByName", query = "select info from ContactInfoEntity as info where info.name like :nm")
public class ContactInfoEntity implements Serializable, Comparable<ContactInfoEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String comments;
	private String fileName;
	private String originalFileName;
	private String contentType;

	@Override
	public int compareTo(ContactInfoEntity o) {
		return this.getEmail().compareTo(o.getEmail());
	}

}
