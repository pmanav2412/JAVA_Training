package com.marlabs.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementApiExample {
	public void getEmployeeSetails() throws SQLException {
		Statement statement = null;
		ResultSet resultset = null;
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			statement = connection.createStatement();
			long a = 392011;
			String b = "Patel";
			final String SELECT_QUERY = "SELECT * FROM Emp WHERE EmpLastName=" + "'" + b + "'";
			resultset = statement.executeQuery(SELECT_QUERY);
			int resultSetCount = resultset.getMetaData().getColumnCount();
			// System.out.println(resultset);
			for (int i = 1; i <= resultSetCount; i++)
				System.out.print(resultset.getMetaData().getColumnName(i) + "\t");
			System.out.println();
			System.out.println();

			while (resultset.next()) {
				for (int i = 1; i <= resultSetCount; i++)
					System.out.print(resultset.getString(i) + "\t");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (resultset != null) {
					resultset.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		connection.close();

	}

	///// GET DATABASE METADATA METHOD

	public void getDatabaseMetaDataInformation() throws SQLException {

		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			DatabaseMetaData dbmd = connection.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseMinorVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getStringFunctions());
			System.out.println(dbmd.getNumericFunctions());
			System.out.println(dbmd.getSQLKeywords());
			System.out.println(dbmd.supportsBatchUpdates());
			System.out.println(dbmd.supportsStoredProcedures());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		connection.close();

	}

	///// INSERT DATA INTO TABLE
	public void InsertEmpDetails(String Name, String LAstName, String Address, long Pin, String ID)
			throws SQLException {
		Statement statement = null;
		ResultSet resultset = null;
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			statement = connection.createStatement();
			// long a = 392011;
			String b = "Darshan";
			// final String SELECT_QUERY = "INSERT INTO Emp Values ('" + Name + "','" +
			// LAstName + "','" + Address + "','"
			// + Pin + "','" + ID + "');";
			final String DELETE_QUERY = "DELETE FROM Emp WHERE Empname='" + b + "'";
			int resultSetCount = statement.executeUpdate(DELETE_QUERY);
			System.out.println(resultSetCount);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (resultset != null) {
					resultset.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		connection.close();

	}

	//////// BATCH EXAMPLE

	public void CommitMultiplequery() throws SQLException {
		Statement statement = null;
		ResultSet resultset = null;
		Connection connection = null;
		try {
			connection = DBUtil.getConnection();
			statement = connection.createStatement();
			long a = 392011;
			String b = "Patel";
			connection.setAutoCommit(false);
			String INSERT_QUERY = "INSERT INTO Emp VALUES('Manav','Patel', 'Amin Street',392011,'E109')";
			String UPDATE_QUERY = "UPDATE Emp SET EmpLastName = 'Patel' WHERE Empname='Pooja'";
			String DELETE_QUERY = "DELETE FROM Emp WHERE Empname='Jimit'";
			statement.addBatch(INSERT_QUERY);
			statement.addBatch(UPDATE_QUERY);
			statement.addBatch(DELETE_QUERY);
			int batchCount[] = statement.executeBatch();
			for (int i = 0; i < batchCount.length; i++) {
				System.out.println(batchCount[i]);
			}
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
				if (resultset != null) {
					resultset.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		connection.close();

	}

	//// Prepare Statement

	public void preparedStatement(String name, String Lname, String Add, long pin, String ID) throws SQLException {
		PreparedStatement prstatement = null;
		int resultset = 0;
		Connection connection = null;

		try {
			connection = DBUtil.getConnection();
			connection.setAutoCommit(false);
			// long a = 392011;
			// String b = "Patel";
			final String INSERT_QUERY = "INSERT INTO Emp VALUES(?,?,?,?,?)";
			prstatement = connection.prepareStatement(INSERT_QUERY);
			prstatement.setString(1, name);
			prstatement.setString(2, Lname);
			prstatement.setString(3, Add);
			prstatement.setLong(4, pin);
			prstatement.setString(5, ID);

			resultset = prstatement.executeUpdate();
			System.out.println(resultset + "Got this result");
			connection.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (prstatement != null) {
					prstatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		connection.close();

	}

}
