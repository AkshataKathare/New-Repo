package com.xworkz.showroom.thing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fruit {

	private String name;
	private String color;
	private double cost;

	public Fruit(@Value("Apple") String name) {
		System.out.println("Creating Fruit with String :" + name);
		this.name = name;
	}

	@PostConstruct
	public void postConst() {
		System.out.println("Running postConst in Fruit");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Running pre destroy method in Fruit");
	}

	@PreDestroy
	public void preDestroy2() {
		System.out.println("Running pre destroy 2 method in Fruit");
	}

	@Value("Red")
	public void setColor(String color) {
		System.out.println("Running setColor in Fruit :" + color);
		this.color = color;
	}

	@Value("45.89")
	public void setCost(double cost) {
		System.out.println("Running setCost method in Fruit :" + cost);
		this.cost = cost;
	}
}
