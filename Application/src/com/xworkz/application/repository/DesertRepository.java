package com.xworkz.application.repository;

import com.xworkz.application.dto.DesertDTO;

public interface DesertRepository {

	boolean save(DesertDTO dto);

	boolean isExist(DesertDTO dto);

	DesertDTO find(DesertDTO dto);

	DesertDTO findByName(String name);

	double findAreaByName(String name);

	DesertDTO findByNameAndCountryAndArea(String name, String country, double area);

	int total();

}
