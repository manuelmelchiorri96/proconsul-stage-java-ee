package com.proconsul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.DipendenteDTO;

public class RegistrazioneDipendenteDAOImpl implements RegistrazioneDipendenteDAO {

	@Override
	public int registraDipendente(Connection connection, String sql, DipendenteDTO dipendente) {
		
		int nRigheInserite = 0;
		
		PreparedStatement ps = ConnectionManager.getPreparedStatment(connection, sql);
		
		try {
			
			ps.setString(1, dipendente.getCodiceFiscale());
			ps.setString(2, dipendente.getCap());
			ps.setString(3, dipendente.getCittaNatale());
			ps.setString(4, dipendente.getCittaResidenza());
			ps.setString(5, dipendente.getCognome());
			ps.setDate(6, dipendente.getDataNascita());
			ps.setString(7, dipendente.getEmail());
			ps.setString(8, dipendente.getIndirizzo());
			ps.setString(9, dipendente.getNome());
			ps.setString(10, dipendente.getNumeroTelefonico());
			
			nRigheInserite = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nRigheInserite;
	}

}
