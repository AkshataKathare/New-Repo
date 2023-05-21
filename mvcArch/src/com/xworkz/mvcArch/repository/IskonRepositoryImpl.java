package com.xworkz.mvcArch.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.mvcArch.dto.IskonDTO;

public class IskonRepositoryImpl implements IskonRepository {

	private Collection<IskonDTO> collection = new ArrayList<>();

	@Override
	public boolean save(IskonDTO dto) {
		System.out.println("Running save method in IskonRepo");
		return this.collection.add(dto);
	}

	@Override
	public Optional<IskonDTO> findByLocation(String location) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean insertIskon(IskonDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByLocation(String location) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIskon(IskonDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readIskon(IskonDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
