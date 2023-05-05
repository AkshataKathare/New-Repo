package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading Driver");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Created connection with mysql");

				String query = "insert into laptopDetails values('DELL',55.8,'Silver')";
				System.out.println(query);

				Statement statement = connection.createStatement();
				System.out.println("Created the statement");

				statement.execute(query);
				System.out.println("Executed the statement");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
