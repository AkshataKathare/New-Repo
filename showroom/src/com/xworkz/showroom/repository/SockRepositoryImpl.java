package com.xworkz.showroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.SockDTO;

@Component
public class SockRepositoryImpl implements SockRepository {

	private Collection<SockDTO> collection = new ArrayList<>();

	@Override
	public boolean save(SockDTO dto) {
		System.out.println("Running save method in Repository...");
		return this.collection.add(dto);
	}

}
