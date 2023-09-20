package com.proconsul.ejb;

import javax.servlet.http.HttpSession;

@Local
public interface UtenteHRLoginEJBLocal {

	public String findUtenteHRByEmailAndPassword(String email,String password, HttpSession session);
}
