package com.proconsul.ejb;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.proconsul.bean.NomeCognomeBean;
import com.proconsul.connection.ConnectionManager;
import com.proconsul.dao.DipendenteTecnologiaDAO;
import com.proconsul.dao.DipendenteTecnologiaDAOImpl;
import com.proconsul.dto.DipendenteTecnologiaDTO;
import com.proconsul.sql.ScriptSQL;
import com.proconsul.vo.DipendenteTecnologiaVO;

import jakarta.ejb.Stateless;
import jakarta.servlet.http.HttpSession;

@Stateless
public class RicercaEJB implements RicercaEJBLocal {

    public String ricerca(HttpSession session, List<String> nomiTecnologia) {
        
    	Connection con = ConnectionManager.getConnection();
    	DipendenteTecnologiaDAO dipendenteTecnologiaDAO = new DipendenteTecnologiaDAOImpl();
    	String page = "error.html";
    	List<DipendenteTecnologiaDTO> listaDT = new ArrayList<>();
    	List<DipendenteTecnologiaVO> listaVO = new ArrayList<>();
    	List<List<DipendenteTecnologiaVO>> listaTotale = new ArrayList<>();
    	NomeCognomeBean bean = null;
    	DipendenteTecnologiaVO dtVO = null;
    	
    	for(String nome : nomiTecnologia) {
    		
    		listaDT = dipendenteTecnologiaDAO.ricercaDipendenteTecnologiaByTecnologia
    				(con, ScriptSQL.ricercaDipendenteTecnologiaByTecnologia, nome);
    		
    		for(DipendenteTecnologiaDTO dipendente : listaDT) {
    			
    			bean = dipendenteTecnologiaDAO.ricercaNomeDipendenteByCodiceFiscale
    					(con, ScriptSQL.ricercaNomeDipendenteByCodiceFiscale, dipendente.getDipendenteId());
    			
    			dtVO = new DipendenteTecnologiaVO(
    					bean.getNome(), 
    					bean.getCognome(), 
    					dipendente.getTecnologiaId(), 
    					dipendente.getEsperienza(), 
    					dipendente.getCompetenza()
    					);
    			
    			listaVO.add(dtVO);
    			
    		}
    		
    		listaTotale.add(listaVO);
    		
    	}
    	
    	ConnectionManager.closeConnection(con);
    	
    	if(listaTotale != null && !listaTotale.isEmpty()) {
    		
    		session.setAttribute("listaDipendenteTecnologia", listaTotale);
    		page = "tabella.jsp";
    		
    	}
    	
    	return page;
    	
    }

}
