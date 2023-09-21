package com.proconsul.ejb;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

import com.proconsul.dto.CategoriaDTO;

@Local
public interface CategoriaEJBLocal {
	
	public ArrayList<CategoriaDTO> findAllCategorie(HttpSession session);
	
}
