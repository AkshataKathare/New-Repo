package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopSelect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading Driver");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Connected to mysql");

				Statement statement = connection.createStatement();
				System.out.println("Created statement");

				ResultSet resultSet = statement.executeQuery("select * from laptopDetails");
				while (resultSet.next()) {
					System.out.println(
							resultSet.getString(1) + " " + resultSet.getDouble(2) + " " + resultSet.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
