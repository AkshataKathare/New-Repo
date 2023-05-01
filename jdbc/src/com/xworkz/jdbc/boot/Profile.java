package com.xworkz.jdbc.boot;

import java.sql.Connection;
import java.sql.DriverManager;

public class Profile {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class is loaded");
			Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "19S10020");
			System.out.println("Connected with the mysql database");
			connect.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
