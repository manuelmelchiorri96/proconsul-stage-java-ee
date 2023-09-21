package com.proconsul.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proconsul.dto.DipendenteDTO;
import com.proconsul.ejb.RegistrazioneDipendenteEJBLocal;

@WebServlet("/registrazioneDipendente")
public class RegistrazioneDipendenteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@EJB
	private RegistrazioneDipendenteEJBLocal registrazioneDipendente;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dataString = request.getParameter("dataNascita");
		
		Date dataNascitaSql = Date.valueOf(dataString);
		
		System.out.println("data");
		System.out.println(dataNascitaSql);
		
		DipendenteDTO dipendenteDTO = new DipendenteDTO(request.getParameter("codiceFiscale"),
														request.getParameter("nome"),
														request.getParameter("cognome"),
														request.getParameter("email"),
														dataNascitaSql,
														request.getParameter("cittaNatale"),
														request.getParameter("indirizzo"),
														request.getParameter("cittaResidenza"),
														request.getParameter("cap"),
														request.getParameter("numeroTelefonico"));
		
		HttpSession session = request.getSession();
		
		String page = registrazioneDipendente.registraDipendente(session, dipendenteDTO);
		
		response.sendRedirect(page);
		
	}

}
