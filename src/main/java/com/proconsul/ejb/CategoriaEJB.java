package com.proconsul.ejb;

import java.sql.Connection;

import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.CategoriaDAO;
import com.proconsul.dao.CategoriaDAOImpl;
import com.proconsul.dto.CategoriaDTO;
import com.proconsul.sql.SqlScript;

import jakarta.ejb.Stateless;
import jakarta.servlet.http.HttpSession;


@Stateless
public class CategoriaEJB implements CategoriaEJBLocal {

	
	@Override
	public String inserisciCategoria(HttpSession session, CategoriaDTO categoriaDTO) {

		String pagina = "inserimentoFallito.jsp";
		
		int righeInserite = 0;

		Connection con = ConnectionManager.getConnection();

		
		CategoriaDAO categoriaDAO = new CategoriaDAOImpl();
		
		righeInserite = categoriaDAO.inserisciCategoria(con, SqlScript.sqlInsert, categoriaDTO);

		
		ConnectionManager.closeConnection(con);

		
		if (righeInserite > 0) {
			
			session.setAttribute("categoriaDTO", categoriaDTO);
			pagina = "inserimentoRiuscito.jsp";
		}

		
		return pagina;
	}
	
	
}
