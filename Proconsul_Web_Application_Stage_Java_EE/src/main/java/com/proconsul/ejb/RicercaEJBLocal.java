package com.proconsul.ejb;

import java.util.List;

import jakarta.ejb.Local;
import jakarta.servlet.http.HttpSession;

@Local
public interface RicercaEJBLocal {

	public String ricerca(HttpSession session, List<String> nomiTecnologia);
	
}
