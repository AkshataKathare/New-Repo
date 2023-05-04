package com.xworkz.showroom.repository;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;

@Component
public class ShowRoomRepoImpl implements ShowRoomRepository {

	private Collection<ShoeShowRoomDTO> collection = new ArrayList<>();

	public ShowRoomRepoImpl() {
		System.out.println("No-arg const of ShowRoomRepoImpl..");
	}

	public ShowRoomRepoImpl(Collection<ShoeShowRoomDTO> collection) {
		System.out.println("Creating ShowRoomRepoImpl using collection");
		this.collection = collection;
	}

	@Override
	public boolean save(ShoeShowRoomDTO room) {
		System.out.println("save method in ShowRoomRepo");
		return this.collection.add(room);
	}

}
