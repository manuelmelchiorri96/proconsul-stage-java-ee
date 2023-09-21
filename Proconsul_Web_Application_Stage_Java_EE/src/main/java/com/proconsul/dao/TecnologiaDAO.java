package com.proconsul.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.proconsul.dto.CategoriaDTO;
import com.proconsul.dto.TecnologiaDTO;

public interface TecnologiaDAO  {
	
	public int addTec(Connection con, String sql, TecnologiaDTO tecnologiaDTO);
	
//	public ArrayList<CategoriaDTO> findAllCategorie(Connection con, String sql); 
}
