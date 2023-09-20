package com.proconsul.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proconsul.ejb.UtenteHRLoginEJBLocal;

import javax.ejb.EJB;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginHRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private UtenteHRLoginEJBLocal utenteHRLogin;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		String page = utenteHRLogin.loginUtenteHR(email, password, session);

		response.sendRedirect(page);

	}

}
