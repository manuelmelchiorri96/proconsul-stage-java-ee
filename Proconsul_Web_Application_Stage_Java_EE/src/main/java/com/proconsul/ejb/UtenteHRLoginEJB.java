package com.proconsul.ejb;

import javax.servlet.http.HttpSession;

import com.proconsul.dao.UtenteHRDAO;
import com.proconsul.dao.UtenteHRDAOImpl;
import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.sql.SqlScript;

@Stateless
public class UtenteHRLoginEJB implements UtenteHRLoginEJBLocal{

	@Override
	public String findUtenteHRByEmailAndPassword(String email, String password, HttpSession session) {

		email = request.getParameter("email");
		password = request.getParameter("password");

		UtenteHRDAO utenteHRDAO = new UtenteHRDAOImpl();
		UtenteHRDTO utenteHr = utenteHRDAO.findUtenteHRByEmailAndPassword(con, SqlScript.sqlFindByEmailAndPassword, email, password);

		if (utenteHr != null) {
			if (!utenteHr.isUtente()) {
				response.sendRedirect("adminPage.jsp"); // Vai alla pagina admin
			} else {
				response.sendRedirect("searchPage.jsp"); // Vai alla pagina di ricerca

			}
		}
		
	}

}
