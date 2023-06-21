package com.xworkz.parkingRentalSystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingRentalSystem.entity.AdminEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ParkingRepoImpl implements ParkingRepo {

	@Autowired
	private EntityManagerFactory factory;

	public ParkingRepoImpl() {
		log.info("Created ParkingRepoImpl using no-arg const");
	}

	@Override
	public AdminEntity findByMail(String mail) {
		log.info("Running findAll method in RepoImpl");

		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByMail");
		query.setParameter("em", mail);
		Object obj = query.getSingleResult();
		AdminEntity entity = (AdminEntity) obj;
		return entity;
	}

//	@Override
//	public boolean updateByMail(String email, LocalDateTime loginTime) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		Query query2 = manager.createNamedQuery("updateLoginTime");
//		query2.setParameter("lt",loginTime);
//		query2.setParameter("ems", email);
//		query2.executeUpdate();
//		transaction.commit();
//		manager.close();
//		return true;
//	}
	@Override
	public boolean update(AdminEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
		return true;
	}

}
