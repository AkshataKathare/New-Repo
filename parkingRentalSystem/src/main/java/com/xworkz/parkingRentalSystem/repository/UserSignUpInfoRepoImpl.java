package com.xworkz.parkingRentalSystem.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingRentalSystem.entity.UserSignUpInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserSignUpInfoRepoImpl implements UserSignUpInfoRepo {

	@Autowired
	private EntityManagerFactory factory;

	public UserSignUpInfoRepoImpl() {
		log.info("Created UserSignUpInfoRepoImpl using no-arg const");
	}

	@Override
	public boolean save(UserSignUpInfoEntity entity) {
		log.info("Running save method in UserSignUpInfoRepoImpl");
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
	public UserSignUpInfoEntity findByEmail(String email) {
		log.info("Running findByEmail method");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("em", email);
		try {
			Object object = query.getSingleResult();
			return (UserSignUpInfoEntity) object;
		} catch (PersistenceException e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
	}

}
