package squirrelcom.xworkz.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import squirrelcom.xworkz.entity.SquirrelEntity;
import squirrelcom.xworkz.util.Util;

public class SquirrelRepoImpl implements SquirrelRepository {

	private EntityManagerFactory factory = Util.getFactory();

	@Override
	public boolean save(SquirrelEntity entity) {
		System.out.println("Running save method in SquirrelRepo");
		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public SquirrelEntity find(int id) {
		System.out.println("Running find method in SquirrelRepo");

		EntityManager manager = null;
		SquirrelEntity entity = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			entity = manager.find(SquirrelEntity.class, id);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return entity;
	}

	@Override
	public List<SquirrelEntity> findAll() {
		System.out.println("Running findAll method in SquirrelRepo");
		EntityManager manager = this.factory.createEntityManager();
		Query query = manager.createNamedQuery("findAll");
		List<SquirrelEntity> list = query.getResultList();
		return list;
	}

	@Override
	public SquirrelEntity findById(int id) {
		System.out.println("Running findById in SquirrelRepo");
		EntityManager manager = factory.createEntityManager();
		SquirrelEntity entity = manager.find(SquirrelEntity.class, id);
		return entity;
	}

	@Override
	public boolean update(String name, int id) {
		System.out.println("Running update method in SqurrelRepo");
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			SquirrelEntity entity = manager.find(SquirrelEntity.class, id);
			entity.setColor(name);
			manager.merge(entity);
			transaction.commit();
		} catch (PersistenceException exception) {
			exception.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public boolean remove(int id) {
		System.out.println("Running remove method in SquirrelRepo");

		EntityManager manager = null;
		try {
			manager = this.factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			SquirrelEntity entity = manager.find(SquirrelEntity.class, id);
			manager.remove(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public List<SquirrelEntity> findByName(String name) {
		System.out.println("Running findByName method in Squirrel Repo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("byName", name);
		return query.getResultList();
	}

	@Override
	public boolean deleteName(String name) {
		System.out.println("Running deleteName method in SquirrelRepo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Query query = manager.createNamedQuery("findByName");
		query.setParameter("byName", name);
		List<SquirrelEntity> entities = new ArrayList<>();
		entities = query.getResultList();
		for (SquirrelEntity squirrelEntity : entities) {
			manager.remove(squirrelEntity);
		}
		transaction.commit();
		manager.close();

		return true;
	}

	@Override
	public List<SquirrelEntity> findByColor(String color) {
		System.out.println("Running findByColor method in SquirrelRepo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByColor");
		query.setParameter("byColor", color);
		List<SquirrelEntity> entities = query.getResultList();
		return entities;
	}

	@Override
	public boolean deleteByColor(String color) {
		System.out.println("Running deleteByColor method in SquirrelRepo");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("findByColor");
		query.setParameter("byColor", color);

		List<SquirrelEntity> entities = new ArrayList<>();
		entities = query.getResultList();
		for (SquirrelEntity entity : entities) {
			manager.remove(entity);
		}
		transaction.commit();

		manager.close();

		return true;
	}

}
