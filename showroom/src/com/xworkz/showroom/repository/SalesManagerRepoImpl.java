package com.xworkz.showroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SalesManagerDTO;

@Component
public class SalesManagerRepoImpl implements SalesManagerRepository {

	private Collection<SalesManagerDTO> collection = new ArrayList<>();

	@Override
	public boolean save(SalesManagerDTO dto) {
		System.out.println("Running save method in Repository");
		return this.collection.add(dto);
	}

}
