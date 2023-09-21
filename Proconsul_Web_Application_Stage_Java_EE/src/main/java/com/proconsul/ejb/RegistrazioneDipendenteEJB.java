package com.proconsul.ejb;

import java.sql.Connection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.RegistrazioneDipendenteDAO;
import com.proconsul.dao.RegistrazioneDipendenteDAOImpl;
import com.proconsul.dto.DipendenteDTO;
import com.proconsul.sql.SqlScript;

@Stateless
@LocalBean
public class RegistrazioneDipendenteEJB implements RegistrazioneDipendenteEJBLocal {

	@Override
	public String registraDipendente(HttpSession session, DipendenteDTO dipendenteDTO) {
		
		String page = "errore.html";
		
		int nRigheInserite = 0;
		
		Connection connection = ConnectionManager.getConnection();
		
		RegistrazioneDipendenteDAO registrazioneDipendenteDAO = new RegistrazioneDipendenteDAOImpl();
		
		nRigheInserite = registrazioneDipendenteDAO.registraDipendente(connection, 
				SqlScript.sqlInserisciDipendente, dipendenteDTO);
		
		if (nRigheInserite > 0) {

			session.setAttribute("dipendenteDTO", dipendenteDTO);;
			page = "successo.jsp";
			
		}
		
		return page;
		
	}

}
