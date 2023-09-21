package com.proconsul.servlet;

import java.io.IOException;
import java.sql.Connection;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.ejb.CategoriaEJBLocal;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
import jakarta.ejb.EJB;


@WebServlet("/inserimento")
public class CategoriaServlet extends HttpServlet {
	
	
	@EJB
	private CategoriaEJBLocal categoriaEJBLocal;
	
	private static final long serialVersionUID = 1L;
  
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Connection con = ConnectionManager.getConnection();
		
		CategoriaDTO categoriaDTO = new CategoriaDTO(request.getParameter("nomeCategoria"));
		
		
		HttpSession session = request.getSession();
		
		response.sendRedirect(categoriaEJBLocal.inserisciCategoria(session, categoriaDTO));

	}
	

}
