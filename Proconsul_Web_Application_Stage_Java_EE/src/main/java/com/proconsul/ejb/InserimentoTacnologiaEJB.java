package com.proconsul.ejb;

import java.sql.Connection;
import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.TecnologiaDAO;
import com.proconsul.dao.TecnologiaDAOImpl;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.dto.TecnologiaDTO;
import com.proconsul.sql.SqlScrip;


@Stateless
@LocalBean
public class InserimentoTacnologiaEJB implements InserimentoTacnologiaEJBLocal {
	
//	@Override
//	public ArrayList<CategoriaDTO> findAllCategorie(HttpSession session) {
//		
//		
//		Connection con = ConnectionManager.getConnection();
//		
//		ArrayList<CategoriaDTO> categorie = new ArrayList<>();
//		
//		TecnologiaDAO tecnologiaDAO = new TecnologiaDAOImpl();
//		
//		categorie = tecnologiaDAO.findAllCategorie(con, SqlScrip.findAllCategoria);
//		
//		ConnectionManager.closeConnection(con);
//		
//		if(!categorie.isEmpty()) {
//			session.setAttribute("categorie", categorie);
//			
//		}
//		
//		return categorie;
//		
//		
//	}

	
	public String addTec(HttpSession session, TecnologiaDTO tecnologiaDTO) {
		
		String page = "error.html";
		
		Connection con = ConnectionManager.getConnection();
		
		int nRowsInserted = 0;
		
		TecnologiaDAO tecnologiaDAO = new TecnologiaDAOImpl();
		
		nRowsInserted = tecnologiaDAO.addTec(con, SqlScrip.tecnologiaInsert, tecnologiaDTO);
		
		if(nRowsInserted>0) {
			session.setAttribute("tecnologiaDTO", tecnologiaDTO);
			page = "seccess.jsp";
		}
		
		return page;
	}

	
	
	

    

}
