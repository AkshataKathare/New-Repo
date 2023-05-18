package com.xworkz.springJdbc.service;

import com.xworkz.springJdbc.things.Flower;

public interface FlowerService {

	boolean validateAndThenSave(Flower flower);

}
