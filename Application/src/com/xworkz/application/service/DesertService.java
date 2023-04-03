package com.xworkz.application.service;

import com.xworkz.application.dto.DesertDTO;
import com.xworkz.application.exception.InvalidDesertException;

public interface DesertService {

	boolean validateAndThenSave(DesertDTO dto) throws InvalidDesertException;

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	double findAreaByName(String name);

	DesertDTO findByNameAndCountryAndArea(String name, String country, double area);

	int total();

}
