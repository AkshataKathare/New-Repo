package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OSInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading Driver");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Created connection with mysql");

				String query = "insert into osDetails values(1,'macOS')";
				System.out.println(query);

				String query2 = "insert into osDetails values(2,'Linux')";
				System.out.println(query2);

				String query3 = "insert into osDetails values(3,'windows')";
				System.out.println(query3);

				Statement statement = connection.createStatement();
				System.out.println("Created the statement");

				statement.execute(query);
				statement.execute(query2);
				statement.execute(query3);

				System.out.println("Executed all the statement");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
