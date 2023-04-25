package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.PoliceStationDTO;

public class PoliceStationRepoImpl implements PoliceStationRepository {

	Collection<PoliceStationDTO> dtos = new ArrayList<>();

	@Override
	public boolean save(PoliceStationDTO dto) {
		System.out.println("Running save method in repository");
		return this.dtos.add(dto);
	}

}
