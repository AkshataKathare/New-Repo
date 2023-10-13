package com.xworkz.parkingRentalSystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingRentalSystem.entity.AdminParkingInfoEntity;
import com.xworkz.parkingRentalSystem.entity.UserParkingInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserParkingInfoRepoImpl implements UserParkingInfoRepo {

	@Autowired
	private EntityManagerFactory factory;

	public UserParkingInfoRepoImpl() {
		log.info("Created UserParkingInfoRepoImpl using no-arg const");
	}

	@Override
	public boolean saveInfo(UserParkingInfoEntity entity) {
		log.info("Running saveInfo method in UserParkingInfoRepoImpl");
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public AdminParkingInfoEntity findByParameters(String location, String vehicleType, String vehicleClassification,
			String term) {
		log.info("Running findByParameters in UserSignUpInfoRepoImpl");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findEntity");
		query.setParameter("loc", location);
		query.setParameter("vt", vehicleType);
		query.setParameter("vc", vehicleClassification);
		query.setParameter("ter", term);
		try {
			Object object = query.getSingleResult();
			AdminParkingInfoEntity entity = (AdminParkingInfoEntity) object;
			return entity;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}

}
