package com.ramaselvathangamm.evaluation4.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Repository {
	private static Repository repository;
	private static Connection connection;

	private Repository() {
		connection = DbHandler.getConnection();
	}

	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;
	}

	public void addRoot(String rootName) {
		if (!roleExists(rootName)) {
			String query = "INSERT INTO Heirarchy (role_name, reportingOfficer) VALUES (?, null)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, rootName);
				int affectedRows = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean roleExists(String roleName) {
		String query = "SELECT * FROM Heirarchy WHERE role_name = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, roleName);
			ResultSet resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public int addSubRole(String parentRoleName, String subRoleName) {
		if (roleExists(parentRoleName)) {
			if (!roleExists(subRoleName)) {
				String query = "INSERT INTO Heirarchy (role_name, reportingOfficer) VALUES (?, ?)";
				try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
					preparedStatement.setString(1, subRoleName);
					preparedStatement.setInt(2, getRoleId(parentRoleName));
					int affectedRows = preparedStatement.executeUpdate();

					if (affectedRows > 0) {
						return 0;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else {
				return 2;
			}
		} else {
			return 1;
		}

		return -1;
	}

	private int getRoleId(String roleName) {
		String query = "SELECT roleID FROM Heirarchy WHERE role_name = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, roleName);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return resultSet.getInt("roleID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}

	public List<String> displayRoles() {
		String query = "SELECT role_name FROM Heirarchy";
		List<String> res = new ArrayList<String>();
		try (Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {

			while (resultSet.next()) {
				res.add(resultSet.getString("role_name") + ", ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

}
