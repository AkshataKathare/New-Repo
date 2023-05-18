package com.xworkz.springJdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xworkz.springJdbc.things.Flower;

@Component
public class FlowerRepositoryImpl implements FlowerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertFlower(Flower dto) {
		System.out.println("Running insertFlower method");
		String query = "insert into flower values('"+dto.getFlowerName()+"','"+dto.getColor()+"')";
		return this.jdbcTemplate.update(query);
	}

}
