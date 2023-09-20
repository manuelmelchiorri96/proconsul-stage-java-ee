package com.proconsul.dao;

import java.sql.Connection;

import com.proconsul.dto.UtenteHRDTO;

public interface UtenteHRDAO {

	public UtenteHRDTO findUtenteHRByEmailAndPassword(Connection con, String sql, String email, String password);
}
