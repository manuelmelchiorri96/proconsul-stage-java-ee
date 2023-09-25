package com.proconsul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proconsul.bean.NomeCognomeBean;
import com.proconsul.connection.ConnectionManager;
import com.proconsul.dto.DipendenteTecnologiaDTO;

public class DipendenteTecnologiaDAOImpl implements DipendenteTecnologiaDAO {

	public List<DipendenteTecnologiaDTO> ricercaDipendenteTecnologiaByTecnologia(Connection con, String sql, String nomeTecnologia) {
		
		List<DipendenteTecnologiaDTO> risultato = new ArrayList<>();
		ResultSet rs = null;
		PreparedStatement ps = ConnectionManager.getPreparedStatment(con, sql);
		DipendenteTecnologiaDTO dipendenteTecnologiaDTO = null;
		
		try {
			
			ps.setString(1, nomeTecnologia);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				dipendenteTecnologiaDTO = new DipendenteTecnologiaDTO(
						rs.getString("dipendente_codice_fiscale"),
						rs.getString("tecnologia_nome"),
						rs.getString("esperienza"),
						rs.getString("competenza")
						);
				
				risultato.add(dipendenteTecnologiaDTO);
				
			}
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return risultato;
		
	}
	
	public NomeCognomeBean ricercaNomeDipendenteByCodiceFiscale(Connection con, String sql, String codiceFiscale) {
		
		ResultSet rs = null;
		NomeCognomeBean bean = null;
		PreparedStatement ps = ConnectionManager.getPreparedStatment(con, sql);
		
		try {
			
			ps.setString(1, codiceFiscale);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				bean = new NomeCognomeBean(rs.getString("nome"), rs.getString("cognome"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return bean;
		
	}

}
