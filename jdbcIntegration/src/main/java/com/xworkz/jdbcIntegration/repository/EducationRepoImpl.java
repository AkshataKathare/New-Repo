package com.xworkz.jdbcIntegration.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbcIntegration.dto.EducationDTO;
import com.xworkz.jdbcIntegration.util.JDBCUtil;

public class EducationRepoImpl implements EducationRepo {

	@Override
	public boolean save(EducationDTO dto) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		PreparedStatement statement = null;

		try (Connection connection = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD)) {

			statement = connection.prepareStatement("insert into education values(?,?,?,?,?,?,?)");

			statement.setString(1, dto.getFName());
			statement.setString(2, dto.getSchoolName());
			statement.setString(3, dto.getSchoolPerc());
			statement.setString(4, dto.getPuCollegeName());
			statement.setString(5, dto.getPuPerc());
			statement.setString(6, dto.getDegreeCollege());
			statement.setString(7, dto.getDegreePerc());

			int i = statement.executeUpdate();
			if (i > 0) {
				System.out.println("Inserted " + i + "row");
				return true;
			} else {
				System.err.println("Did not insert any rows");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			statement.close();
		}

		return false;
	}

//	@Override
//	public boolean update(EducationDTO dto) throws ClassNotFoundException, SQLException {
//		System.out.println("Running update method...");
//
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		PreparedStatement statement = null;
//
//		try (Connection connection = DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD)) {
//
//			statement = connection.prepareStatement("update education set fName=? where schoolName=?");
//
//			statement.setString(1, dto.getFName());
//			statement.setString(2, dto.getSchoolName());
//
//			int i = statement.executeUpdate();
//
//			if (i > 0) {
//				System.out.println("Updated " + i + "rows");
//			} else {
//				System.err.println("Did not update any row");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			statement.close();
//		}
//		return false;
//	}

}
