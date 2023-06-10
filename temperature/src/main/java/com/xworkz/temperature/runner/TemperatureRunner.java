package com.xworkz.temperature.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.temperature.entity.TemperatureEntity;

public class TemperatureRunner {

	public static void main(String[] args) {

		TemperatureEntity entity = new TemperatureEntity();
		entity.setId(1);
		entity.setPlace("Hubli");

		System.out.println(entity);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		// manager.persist(entity);
		// manager.merge(entity);
		TemperatureEntity find = manager.find(TemperatureEntity.class, 5);
		System.out.println(find);

		manager.remove(manager.find(TemperatureEntity.class, 2));
		// System.out.println("updated object");
		transaction.commit();

		manager.close();
	}

}
