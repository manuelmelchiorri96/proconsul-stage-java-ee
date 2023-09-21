package com.proconsul.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.proconsul.dto.CategoriaDTO;

public interface CategoriaDAO {
	
	public ArrayList<CategoriaDTO> findAllCategorie(Connection con, String sql);
}
