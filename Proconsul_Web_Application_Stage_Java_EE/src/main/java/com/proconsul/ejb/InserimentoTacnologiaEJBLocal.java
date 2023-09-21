package com.proconsul.ejb;

import java.util.ArrayList;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

import com.proconsul.dto.CategoriaDTO;
import com.proconsul.dto.TecnologiaDTO;

@Local
public interface InserimentoTacnologiaEJBLocal {
	
	public String addTec(HttpSession session, TecnologiaDTO tecnologiaDTO);
	
//	public ArrayList<CategoriaDTO> findAllCategorie(HttpSession session);
}
