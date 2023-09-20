package com.proconsul.servlet;

import java.io.IOException;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.proconsul.ejb.UtenteHRLoginEJBLocal;

@WebServlet("/loginHr")
public class LoginHRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private UtenteHRLoginEJBLocal utenteHRLogin;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		String page = utenteHRLogin.findUtenteHRByEmailAndPassword(email, password, session);

		response.sendRedirect(page);

	}
}