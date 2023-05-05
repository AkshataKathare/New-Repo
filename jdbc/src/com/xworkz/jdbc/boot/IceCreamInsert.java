package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IceCreamInsert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded the Driver");

			try {
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
						"19S10020");
				System.out.println("Connected to mysql");

				String query = "insert into icecreamDetails Values(3,'Vanilla','Hangyo')";
				System.out.println(query);

				Statement statement = connect.createStatement();
				System.out.println("Created the statement");

				boolean executed = statement.execute(query);
				System.out.println("Executed the statement" + executed);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
