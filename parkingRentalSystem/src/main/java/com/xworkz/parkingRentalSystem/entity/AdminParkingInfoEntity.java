package com.xworkz.parkingRentalSystem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Entity
@Table(name = "adminparkinginfo")
@NamedQuery(name = "findEntity", query = "select inf from AdminParkingInfoEntity as inf where inf.location=:loc and inf.vehicleType=:vt and inf.vehicleClassification=:vc and inf.term=:ter")
@NamedQuery(name = "searchQuery", query = "select serie from AdminParkingInfoEntity as serie where serie.location like :locate")
public class AdminParkingInfoEntity implements Serializable, Comparable<AdminParkingInfoEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String location;
	private String vehicleType;
	private String vehicleClassification;
	private String term;
	private double price;
	private String discount;

	public AdminParkingInfoEntity() {
		log.info("Created AdminParkingInfoEntity using no-arg const");
	}

	@Override
	public int compareTo(AdminParkingInfoEntity o) {
		return this.getLocation().compareTo(o.getLocation());
	}
}