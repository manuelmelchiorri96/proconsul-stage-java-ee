package com.proconsul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.dto.TecnologiaDTO;

public class TecnologiaDAOImpl implements TecnologiaDAO {

	@Override
	public int addTec(Connection con, String sql, TecnologiaDTO tecnologiaDTO) {
		
		int nRowsInserted = 0;
		
		PreparedStatement ps = ConnectionManager.getPreparedStatment(con, sql);
		
		try {
			
			ps.setString(1, tecnologiaDTO.getNome());
			ps.setString(2, tecnologiaDTO.getNomeCategoria());
			
			nRowsInserted = ps.executeUpdate();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return nRowsInserted;
	}

//	@Override
//	public ArrayList<CategoriaDTO> findAllCategorie(Connection con, String sql) {
//		
//		ArrayList<CategoriaDTO> categorie = new ArrayList<>();
//		
//		CategoriaDTO categoriaDTO = null;
//		
//		ResultSet rs = ConnectionManager.getResultSet(con, sql);
//		
//		try {
//			while(rs.next()) {
//				categoriaDTO = new CategoriaDTO(
//						rs.getString("categorie"));
//				categorie.add(categoriaDTO);
//			}
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return categorie;
//	}
	
	

}
