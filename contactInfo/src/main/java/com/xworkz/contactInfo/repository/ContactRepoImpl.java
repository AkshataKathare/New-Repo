package com.xworkz.contactInfo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.contactInfo.entity.ContactInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ContactRepoImpl implements ContactRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ContactInfoEntity entity) {
		log.info("Running save method in RepoImpl");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<ContactInfoEntity> findByName(String name) {
		log.info("running findByNAme in repo..." + name);

		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createNamedQuery("findByName");
		query.setParameter("nm", "%" + name + "%");
		List<ContactInfoEntity> result = query.getResultList();
		log.info("result from repo" + result);
		entityManager.close();
		return result;
	}

}
