package com.proconsul.ejb;

import com.proconsul.dto.CategoriaDTO;

import jakarta.ejb.Local;
import jakarta.servlet.http.HttpSession;

@Local
public interface CategoriaEJBLocal {

	public String inserisciCategoria(HttpSession session, CategoriaDTO categoriaDTO);
	
}
