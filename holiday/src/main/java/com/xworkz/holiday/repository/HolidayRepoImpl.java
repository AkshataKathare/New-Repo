package com.xworkz.holiday.repository;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.holiday.entity.HolidayEntity;
import static com.xworkz.holiday.util.JPAUtil.*;

public class HolidayRepoImpl implements HolidayRepository {

	EntityManagerFactory factory = getFactory();

	@Override
	public boolean save(HolidayEntity entity) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();

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
		return false;
	}

}
