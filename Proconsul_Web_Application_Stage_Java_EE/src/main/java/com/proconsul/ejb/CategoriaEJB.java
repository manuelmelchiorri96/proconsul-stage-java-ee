package com.proconsul.ejb;

import java.sql.Connection;
import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.CategoriaDAO;
import com.proconsul.dao.CategoriaDAOImpl;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.sql.SqlScrip;


@Stateless
@LocalBean
public class CategoriaEJB implements CategoriaEJBLocal {

	@Override
	public ArrayList<CategoriaDTO> findAllCategorie(HttpSession session) {
		
		
		
		Connection con = ConnectionManager.getConnection();
		
		ArrayList<CategoriaDTO> categorie = new ArrayList<>();
		
		CategoriaDAO cetegoriaDAO = new CategoriaDAOImpl();
		
		categorie = cetegoriaDAO.findAllCategorie(con, SqlScrip.findAllCategoria);
		
		ConnectionManager.closeConnection(con);
		
		if(!categorie.isEmpty()) {
			
			session.setAttribute("categorie", categorie);
			
		}
		
		return categorie;
		
		
	
	}

 

}
