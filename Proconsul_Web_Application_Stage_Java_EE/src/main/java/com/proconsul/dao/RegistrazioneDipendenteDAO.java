package com.proconsul.dao;

import java.sql.Connection;

import com.proconsul.dto.DipendenteDTO;

public interface RegistrazioneDipendenteDAO {

	public int registraDipendente(Connection connection, String sql, DipendenteDTO dipendente);
	
}
