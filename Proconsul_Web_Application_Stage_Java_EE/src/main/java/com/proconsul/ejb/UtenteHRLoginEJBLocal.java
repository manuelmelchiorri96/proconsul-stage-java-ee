package com.proconsul.ejb;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

@Local
public interface UtenteHRLoginEJBLocal {

	public String loginUtenteHR(String email,String password, HttpSession session);
}
