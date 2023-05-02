package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Profile {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is loaded");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "19S10020");
			System.out.println("Connected with the mysql database");

			String query = "insert into profileDetail values(1,'Akshata',7204223793,21)";
			System.out.println("query ");
			Statement statement = connect.createStatement();
			System.out.println("Created the statement");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
