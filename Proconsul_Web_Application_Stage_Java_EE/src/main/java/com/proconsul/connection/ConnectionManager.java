package com.proconsul.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager implements ConnectionParameters {

	
	public static Connection getConnection() {

		Connection con = null;

		try {

			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();

		}
		return con;
	}

	
	public static PreparedStatement getPreparedStatment(Connection con, String sql) {

		PreparedStatement ps = null;

		try {

			ps = con.prepareStatement(sql);

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return ps;
	}

	
	public static ResultSet getResultSet(Connection con, String sql) {

		Statement stmt = null;

		ResultSet rs = null;

		try {

			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return rs;
	}

	
	public static void closeConnection(Connection con) {

		try {

			con.close();

		} catch (SQLException ex) {

			ex.printStackTrace();
		}
	}
}
