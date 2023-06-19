package com.xworkz.dl.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dl.entity.DlEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class DLRepositoryImpl implements DLRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(DlEntity dlEntity) {
		log.info("running save in repo" + dlEntity);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(dlEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<DlEntity> findByName(String fullName) {
		log.info("Running findByName method in Repo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("fnm", "%" + fullName + "%");
		List<DlEntity> entities = query.getResultList();
		return entities;
	}

}
