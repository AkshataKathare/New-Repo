package com.xworkz.showroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.PolishDTO;

@Component
public class PolishRepositoryImpl implements PolishRepository {

	private Collection<PolishDTO> collection = new ArrayList<>();

	@Override
	public boolean save(PolishDTO dto) {
		System.out.println("Running save method in PolishRepository");
		return this.collection.add(dto);
	}

}
