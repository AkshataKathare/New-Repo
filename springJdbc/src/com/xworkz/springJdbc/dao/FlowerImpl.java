package com.xworkz.springJdbc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.springJdbc.things.Flower;

public class FlowerImpl implements FlowerDAO {

	@Autowired
	@Qualifier("dataSour")
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertFlower(Flower flower) {
		System.out.println("Running insertFlower method");
		String query = "insert into flower values(flower.getFlowerName+','+flower.color)";
		return this.jdbcTemplate.update(query);
	}

}
