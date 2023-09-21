package com.proconsul.ejb;

import javax.ejb.Local;
import javax.servlet.http.HttpSession;

import com.proconsul.dto.DipendenteDTO;

@Local
public interface RegistrazioneDipendenteEJBLocal {

	String registraDipendente(HttpSession session, DipendenteDTO dipendenteDTO);

}
