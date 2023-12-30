package com.ramaselvathangamm.evaluation4.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class DbHandler {

	private static final String URL = "jdbc:mysql://localhost:3306/role_hierarchy";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "1#Thangam";
	private static Connection connection;

	private DbHandler() {

	}

	public static Connection getConnection() {
		synchronized (DbHandler.class) {
			try {
				connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				createHeirarchyTable();
				createEmployeeTable();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}

	private static void createHeirarchyTable() {
		try {
			String query = "CREATE TABLE IF NOT EXISTS Heirarchy (" + "roleID INT PRIMARY KEY AUTO_INCREMENT,"
					+ "role_name VARCHAR(255)," + "reportingOfficer INT,"
					+ "FOREIGN KEY (reportingOfficer) REFERENCES Heirarchy(roleID)" + ")";

			Statement statement = connection.createStatement();
			boolean created = statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertRole(String roleName, Integer reportingOfficer) throws SQLException {
		String insertQuery = "INSERT INTO Heirarchy (role_name, reportingOfficer) VALUES (?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
			preparedStatement.setString(1, roleName);
			preparedStatement.setObject(2, reportingOfficer);
			preparedStatement.executeUpdate();
		}
	}

	private static void createEmployeeTable() {
		try {
			String query = "CREATE TABLE IF NOT EXISTS employees (" + "employeeID INT AUTO_INCREMENT PRIMARY KEY,"
					+ "employeeName VARCHAR(200)," + "roleID INT," + "FOREIGN KEY (roleID) REFERENCES Heirarchy(roleID)" // 'Heirarchy'
					+ ")";

			Statement statement = connection.createStatement();
			boolean created = statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
