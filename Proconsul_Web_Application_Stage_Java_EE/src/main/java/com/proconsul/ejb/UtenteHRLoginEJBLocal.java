package com.proconsul.ejb;

import jakarta.ejb.Local;
import jakarta.servlet.http.HttpSession;

@Local
public interface UtenteHRLoginEJBLocal {

	public String loginUtenteHR(String email,String password, HttpSession session);
}
