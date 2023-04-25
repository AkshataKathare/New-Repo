package com.xworkz.electricity.repository;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.electricity.dto.ShowRoomDTO;

public class ShowRoomRepositoryImpl implements ShowRoomRepository {

	Collection<ShowRoomDTO> dtos = new ArrayList<ShowRoomDTO>();

	@Override
	public boolean save(ShowRoomDTO dto) {
		System.out.println("Running save method in Repository");
		return this.dtos.add(dto);
	}

}
