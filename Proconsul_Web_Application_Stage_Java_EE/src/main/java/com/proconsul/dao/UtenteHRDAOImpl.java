package com.proconsul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.UtenteHRDTO;

public class UtenteHRDAOImpl implements UtenteHRDAO{

	@Override
	public UtenteHRDTO findUtenteHRByEmailAndPassword(Connection con, String sql, String email, String password) {
		
		ResultSet rs = null;
		PreparedStatement ps = ConnectionManager.getPreparedStatment(con, sql);
		
		UtenteHRDTO utenteHR = null;

		try {

			ps.setString(1, email);
			ps.setString(2, password);
			
			rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return utenteHR;
		
	}

}
