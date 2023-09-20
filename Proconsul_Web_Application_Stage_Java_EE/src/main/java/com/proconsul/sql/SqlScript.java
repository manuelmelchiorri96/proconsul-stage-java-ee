package com.proconsul.sql;

public interface SqlScript {

	public static final String sqlFindByEmailAndPassword = "select utente_hr from proconsul_stage_java_ee where email=? and password=?";
}
