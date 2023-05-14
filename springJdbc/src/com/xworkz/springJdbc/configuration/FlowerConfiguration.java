package com.xworkz.springJdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.xworkz.springJdbc")
public class FlowerConfiguration {

	@Bean
	public DataSource dataSour() {
		System.out.println("Running jdbcTemplate");
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
		JdbcTemplate jdbcTemp = new JdbcTemplate(dataSour());
		return jdbcTemp;
	}
}
