package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SoftwareInsert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded the Driver");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Connected to mysql");

				String query = "insert into softwareDetails values(1,'system software','MS word')";
				System.out.println(query);

				String query2 = "insert into softwareDetails values(2,'Application software','MS Excel')";
				System.out.println(query2);

				String query3 = "insert into softwareDetails values(3,'Driver software','Microsoft Officer')";
				System.out.println(query3);

				Statement statement = connection.createStatement();
				System.out.println("created the statement");

				statement.execute(query);
				statement.execute(query2);
				statement.execute(query3);

				System.out.println("Executed all the statements");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
