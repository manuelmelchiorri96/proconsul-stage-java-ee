package com.proconsul.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.proconsul.ejb.RicercaEJBLocal;

@WebServlet("/ricercaDipendenti")
public class RicercaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private RicercaEJBLocal ricercaEJB;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		List<String> nomiTecnologie = Arrays.asList(request.getParameterValues("nomiTecnologie[]"));
		HttpSession session = request.getSession();
		
		response.sendRedirect(ricercaEJB.ricerca(session, nomiTecnologie));
		
	}

}
