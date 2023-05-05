package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IceCreamSelect {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded the Driver");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Connected to Mysql");

				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery("select * from icecreamDetails");
				while (resultset.next()) {
					System.out
							.println(resultset.getInt(1) + " " + resultset.getString(2) + " " + resultset.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
