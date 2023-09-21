package com.proconsul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.CategoriaDTO;

public class CategoriaDAOImpl implements CategoriaDAO {

	
	
	@Override
	public int inserisciCategoria(Connection con, String sql, CategoriaDTO categoriaDTO) {
		
		int righeInserite = 0;
		
		PreparedStatement ps = ConnectionManager.getPreparedStatement(con, sql);
		
		
		try {
			
			ps.setString(1, categoriaDTO.getNome());
			righeInserite = ps.executeUpdate();
		}
		catch(SQLException | NullPointerException e) {
			
			e.printStackTrace();
			righeInserite = 0;
		}
		
		return righeInserite;
	}


	
	
}
