package com.xworkz.jdbc.crudOper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.jdbc.util.JdbcUtil;

public class IPLDetails {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Statement statement = null;

		System.out.println("Inserting the values");
		try (Connection connect = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {

			String query = "insert into iplDetails values(8,'RCB','Virat Kohli',true,19,35,'Harshal Patel',11,20886667.67,'Hoysala Lodge','Delhi')";

			statement = connect.createStatement();

			int exc = statement.executeUpdate(query);
			System.out.println(exc);
			if (exc != 0) {
				System.out.println("Inserted successfully");
			} else {
				System.err.println("Not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Updating the data");
		try (Connection connection = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {

			statement = connection.createStatement();

			int e = statement.executeUpdate("update iplDetails set captain='Abhishek' where srNo=5");
			System.out.println(e);
			if (e != 0) {
				System.out.println("updated successfully");
			} else {
				System.err.println("not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Deleting the data");

		try (Connection conn = DriverManager.getConnection(JdbcUtil.url, JdbcUtil.userName, JdbcUtil.password)) {

			statement = conn.createStatement();

			int upd = statement.executeUpdate("delete from iplDetails where srNo=5");
			if (upd != 0) {
				System.out.println("deleted the data");
			} else {
				System.err.println("not deleted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
