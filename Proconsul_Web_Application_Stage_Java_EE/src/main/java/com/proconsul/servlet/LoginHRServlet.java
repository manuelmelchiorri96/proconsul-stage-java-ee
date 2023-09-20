package com.proconsul.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.UtenteHRDAO;
import com.proconsul.dao.UtenteHRDAOImpl;
import com.proconsul.dto.UtenteHRDTO;
import com.proconsul.sql.SqlScript;


@WebServlet("/loginHr")
public class LoginHRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection con = ConnectionManager.getConnection();

		String email = request.getParameter("email");
		String password = request.getParameter("password");

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
