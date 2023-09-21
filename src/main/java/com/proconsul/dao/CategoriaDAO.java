package com.proconsul.dao;

import java.sql.Connection;

import com.proconsul.dto.CategoriaDTO;


public interface CategoriaDAO {

	public int inserisciCategoria(Connection con, String sql, CategoriaDTO categoriaDTO);
	
}
