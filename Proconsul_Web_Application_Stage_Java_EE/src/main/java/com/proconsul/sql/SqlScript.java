package com.proconsul.sql;

public interface SqlScript {

	public static final String sqlFindByEmailAndPassword = "select * from utente_hr where email=? and password=?";
}
