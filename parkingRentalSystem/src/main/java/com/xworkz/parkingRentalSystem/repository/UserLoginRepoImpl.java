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
public class UserLoginRepoImpl implements UserLoginRepo {

	@Autowired
	private EntityManagerFactory factory;

	public UserLoginRepoImpl() {
		log.info("Creating UserLoginRepoImpl using no-arg const");
	}

	@Override
	public UserSignUpInfoEntity updateOTP(UserSignUpInfoEntity entity) {
		log.info("Running updateOTP method in UserLoginRepoImpl");

		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return entity;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public UserSignUpInfoEntity findByEmail(String userEmail) {
		log.info("Running findByEmail method");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findByEmail");
		log.info(userEmail);
		query.setParameter("em", userEmail);
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

	@Override
	public UserSignUpInfoEntity findByOTP(int otp) {
		log.info("Running findByOTP method");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findByOTP");
		query.setParameter("oTP", otp);
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
