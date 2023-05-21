package com.xworkz.jdbc.crudOper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.jdbc.util.JdbcUtil;

public class MovieDetails {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
		Statement statement = null;

		System.out.println("Inserting the data into movieDetails");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {
			statement = connection.createStatement();

			int e = statement.executeUpdate(
					"insert into movieDetails2 values(3,'The Kerala Story',220.89,'Cinepolis','Amir Khan','Vidya','Vijay',589)");
			if (e != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.err.println("Not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Updating the data in movieDetails");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {
			statement = connection.createStatement();

			int i = statement.executeUpdate("update movieDetails2 set movieName='PS2'");
			if (i != 0) {
				System.out.println("Updated successfully");
			} else {
				System.err.println("Not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Deleting data from movieDetails");

		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {
			statement = connection.createStatement();

			int i = statement.executeUpdate("delete from movieDetails2 where srNo=1");
			if (i != 0) {
				System.out.println("Deleted successfully");
			} else {
				System.err.println("Not deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
