package com.xworkz.jdbc.crudOper;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.jdbc.util.JdbcUtil;

public class CollegeDetails {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Statement statement = null;

		System.out.println("Inserting data in collegeDetails");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {

			statement = connection.createStatement();

			int inserted = statement.executeUpdate(
					"insert into collegeDetails values(3,'JSS','Shanbhag',100,1677,3,26,'Vicky','Vinaya','Sumangala','Vijayalaxmi')");
			System.out.println("No of row inserted :" + inserted);

			if (inserted != 0) {
				System.out.println("Inserted the data successfully");
			} else {
				System.err.println("Not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Updating data in collegeDetails");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {

			statement = connection.createStatement();

			int i = statement.executeUpdate("update collegeDetails set principalName='Arpita' where srNo=2");
			System.out.println(i);

			if (i != 0) {
				System.out.println("Updated successfully");
			} else {
				System.err.println("Not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Deleting data from collegeDetails");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {
			statement = connection.createStatement();

			int i = statement.executeUpdate("delete from collegeDetails where srNo=2");
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
