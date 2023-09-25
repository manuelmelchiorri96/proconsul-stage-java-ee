package com.proconsul.dao;

import java.sql.Connection;
import java.util.List;

import com.proconsul.bean.NomeCognomeBean;
import com.proconsul.dto.DipendenteTecnologiaDTO;

public interface DipendenteTecnologiaDAO {

	public List<DipendenteTecnologiaDTO> ricercaDipendenteTecnologiaByTecnologia(Connection con, String sql, String nomeTecnologia);
	public NomeCognomeBean ricercaNomeDipendenteByCodiceFiscale(Connection con, String sql, String codiceFiscale);
}
