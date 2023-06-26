package com.xworkz.parkingRentalSystem.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.xworkz.parkingRentalSystem.util.AdminLoginUtil;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Entity
@Table(name = "adminlogininfo")
@NamedQuery(name = "findByMail", query = "select inf from AdminEntity as inf where inf.email=:em")
public class AdminEntity extends AdminLoginUtil implements Serializable, Comparable<AdminEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	private String password;

	private LocalDateTime loginTime;

	public AdminEntity() {
		log.info("Creating ParkingEntity using no-arg const");
	}

	@Override
	public int compareTo(AdminEntity o) {
		return this.getEmail().compareTo(o.getEmail());
	}

}
