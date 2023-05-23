package com.xworkz.mvcArch.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.mvcArch.dto.IskonDTO;

public class IskonRepositoryImpl implements IskonRepository {

	private Collection<IskonDTO> collection = new ArrayList<>();

	@Override
	public boolean save(IskonDTO dto) {
		System.out.println("Running save method in IskonRepo");

		PreparedStatement statement = null;
		int count = 0;
		try (Connection connection = DriverManager.getConnection(null)) {
			String query = "insert into iskonDetails values(?,?,?,?,?)";

			statement = connection.prepareStatement(query);

			System.out.println(query);

			statement.setString(1, dto.getGodName());
			statement.setString(2, dto.getLocation());
			statement.setDouble(3, dto.getEntryFee());
			statement.setFloat(4, dto.getArea());
			statement.setBoolean(5, dto.isOpen());

		} catch (Exception e) {
			// TODO: handle exception
		}

		return this.collection.add(dto);
	}

	@Override
	public IskonDTO findByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
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
