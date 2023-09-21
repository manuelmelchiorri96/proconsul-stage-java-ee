package com.proconsul.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.ejb.CategoriaEJBLocal;


@WebServlet("/Proconsul_Web_Application_Stage_Java_EE/home")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CategoriaEJBLocal categorieEJB;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		ArrayList<CategoriaDTO> categorie = categorieEJB.findAllCategorie(session);
		
		String [] arrayCategorie = (String[]) categorie.toArray();
		
		System.out.println(arrayCategorie);
		
		request.setAttribute("categorie", arrayCategorie);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request,response);
		
		request.getRequestDispatcher("/home.jsp");
	
		
	}


}
