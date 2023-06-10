package com.xworkz.holiday.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;

import com.xworkz.holiday.entity.HolidayEntity;
import com.xworkz.holiday.util.JPAUtil;

@Component
public class HolidayRepoImpl implements HolidayRepository {

	EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public boolean save(HolidayEntity entity) {
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		}

		catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

}
