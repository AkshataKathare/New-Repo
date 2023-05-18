package com.xworkz.springJdbc.service;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springJdbc.things.Flower;

@Component
public class FlowerServiceImpl implements FlowerService {

	@Autowired
	private Validator validator;

	@Override
	public boolean validateAndThenSave(Flower flower) {
		if (flower != null) {
			System.out.println("flower is not null");
		} else {
			System.err.println("flower is null");
		}
		return false;
	}

}
