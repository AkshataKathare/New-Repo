package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProfileSelect {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver has been loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "19S10020");
			System.out.println("Connected to My sql");

			Statement st = connection.createStatement();
			System.out.println("Created the statement");

			ResultSet ex = st.executeQuery("select * from profileDetail");
			while (ex.next()) {
				System.out.println(ex.getInt(1) + " " + ex.getString(2) + " " + ex.getLong(3) + " " + ex.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
