package com.proconsul.main;

import java.sql.Connection;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.CategoriaDAO;
import com.proconsul.dao.CategoriaDAOImpl;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.sql.SqlScript;

public class Main {

	public static void main(String[] args) {
		
		
		CategoriaDTO categoriaDTO = new CategoriaDTO("CSS");

		Connection con = ConnectionManager.getConnection();

		
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		
		categoriaDAO.inserisciCategoria(con, SqlScript.sqlInsert, categoriaDTO);

		
	}

}
