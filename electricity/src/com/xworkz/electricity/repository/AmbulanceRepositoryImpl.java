package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.AmbulanceDTO;

public class AmbulanceRepositoryImpl implements AmbulanceRepository {

	Collection<AmbulanceDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(AmbulanceDTO dto) {
		System.out.println("Running save method in Repository");
		return this.dtos.add(dto);
	}

}
