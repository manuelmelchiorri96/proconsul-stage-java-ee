package com.proconsul.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proconsul.dao.TecnologiaDAO;
import com.proconsul.dao.TecnologiaDAOImpl;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.dto.TecnologiaDTO;
import com.proconsul.ejb.InserimentoTacnologiaEJBLocal;


@WebServlet("/inserimentoTecnologia")
public class InserimentoTecnologiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@EJB
	private InserimentoTacnologiaEJBLocal inserimentoTecnologia;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session = request.getSession();
		ArrayList<CategoriaDTO> categorie = (ArrayList<CategoriaDTO>) session.getAttribute("categorie");
		
		TecnologiaDTO tecnlogiaDTO = new TecnologiaDTO(request.getParameter("nome"),
				request.getParameter("nomeCategoria"));
		
		
		String page = inserimentoTecnologia.addTec(session, tecnlogiaDTO);
		
		response.sendRedirect(page);
		

	}

}
