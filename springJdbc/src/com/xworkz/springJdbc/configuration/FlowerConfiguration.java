package com.xworkz.springJdbc.configuration;

import javax.sql.DataSource;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.xworkz.springJdbc")
public class FlowerConfiguration {

	@Bean
	public DataSource dataSource() {
		System.out.println("Running datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("19S10020");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		System.out.println("Running jdbcTemplate");
		JdbcTemplate jdbcTemp = new JdbcTemplate(dataSource());
		return jdbcTemp;
	}

	public Validator validator() {
		System.out.println("Running validator in Configuration");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}
}
