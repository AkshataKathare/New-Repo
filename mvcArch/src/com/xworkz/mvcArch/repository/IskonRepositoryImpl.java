package com.xworkz.mvcArch.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.mvcArch.dto.IskonDTO;
import com.xworkz.mvcArch.util.JDBCUtil;

public class IskonRepositoryImpl implements IskonRepository {

	private Collection<IskonDTO> collection = new ArrayList<>();

	@Override
	public boolean save(IskonDTO dto) {
		System.out.println("Running save method in IskonRepo");

		PreparedStatement statement = null;
		int count = 0;
		try (Connection connection = DriverManager.getConnection(JDBCUtil.JDBC_URL, JDBCUtil.USER_NAME,
				JDBCUtil.PASSWORD)) {
			String query = "insert into iskonDetails values(?,?,?,?,?)";

			statement = connection.prepareStatement(query);

			System.out.println(query);

			statement.setString(1, dto.getGodName());
			statement.setString(2, dto.getLocation());
			statement.setDouble(3, dto.getEntryFee());
			statement.setFloat(4, dto.getArea());
			statement.setBoolean(5, dto.isOpen());

			if (count != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.err.println("Not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this.collection.add(dto);
	}

	@Override
	public boolean findByLocation(String location) {
		if (location != null) {
			PreparedStatement preparedStatement = null;
			int count = 0;
			try (Connection connection = DriverManager.getConnection(location)) {

				String query = "select * from iskonDetails where location=?";

				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, location);
				System.out.println(query);

				ResultSet resultSet = preparedStatement.executeQuery(query);

				while (resultSet.next()) {
					System.out.println(resultSet.getString(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getDouble(3));
					System.out.println(resultSet.getFloat(4));
					System.out.println(resultSet.getBoolean(5));
				}

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (count != 0) {
				System.out.println("There is a location of this name");
			} else {
				System.err.println("No such location in data");
			}
		}
		return false;
	}

	@Override
	public boolean updateByLocation(String location) {

		PreparedStatement statement = null;
		int count = 0;
		try (Connection connection = DriverManager.getConnection(JDBCUtil.JDBC_URL, JDBCUtil.USER_NAME,
				JDBCUtil.PASSWORD)) {
			String query = "update iskonDetails set godName=? where location=?";
			statement = connection.prepareStatement(query);

			statement.setString(1, location);
//			statement.setString(2 );
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (count != 0) {
			System.out.println("Updated successfully");
		}
		return false;
	}

	@Override
	public boolean deleteIskon(String location) {
		PreparedStatement statement = null;
		int count = 0;
		try (Connection connection = DriverManager.getConnection(JDBCUtil.JDBC_URL, JDBCUtil.USER_NAME,
				JDBCUtil.PASSWORD)) {

			String query = "delete * from iskonDetails where location=?";

			statement = connection.prepareStatement(query);

			count = statement.executeUpdate();

			if (count != 0) {
				System.out.println("Deleted successfully");
			} else {
				System.err.println("Not deleted");
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
