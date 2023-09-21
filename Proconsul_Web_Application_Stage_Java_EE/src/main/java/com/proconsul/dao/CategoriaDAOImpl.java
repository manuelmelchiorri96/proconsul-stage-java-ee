package com.proconsul.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.CategoriaDTO;

public class CategoriaDAOImpl implements CategoriaDAO {

	@Override
	public ArrayList<CategoriaDTO> findAllCategorie(Connection con, String sql) {

			
			ArrayList<CategoriaDTO> categorie = new ArrayList<>();
			
			CategoriaDTO categoriaDTO = null;
			
			ResultSet rs = ConnectionManager.getResultSet(con, sql);
			
			try {
				while(rs.next()) {
					
					categoriaDTO = new CategoriaDTO(
							rs.getString("categorie"));
					
					categorie.add(categoriaDTO);
					
				}
				
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return categorie;
		}
	}


