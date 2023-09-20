package com.proconsul.ejb;

import java.sql.Connection;

import jakarta.ejb.Stateless;
import jakarta.servlet.http.HttpSession;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.UtenteHRDAO;
import com.proconsul.dao.UtenteHRDAOImpl;
import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.sql.SqlScript;

@Stateless
public class UtenteHRLoginEJB implements UtenteHRLoginEJBLocal {

	@Override
	public String loginUtenteHR(String email, String password, HttpSession session) {

		String page = "error.html";

		Connection con = ConnectionManager.getConnection();

		UtenteHRDAO utenteHRDAO = new UtenteHRDAOImpl();

		UtenteHRDTO utenteHr = utenteHRDAO.findUtenteHRByEmailAndPassword(con, SqlScript.sqlFindByEmailAndPassword,
				email, password);

		if (utenteHr != null) {

			if (!utenteHr.isUtente()) {
				session.setAttribute("UtenteHR", utenteHr);
				page = "admin.html";

			} else {
				page = "ricerca.html";
//DA MODIFICARE URL
			}
			
		}

		return page;
	}

}
