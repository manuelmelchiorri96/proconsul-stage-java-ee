package com.proconsul.sql;

public interface SqlScrip {
	
	public static final String tecnologiaInsert = "insert into tecnologia(nome, categoria_nome) values (?,?);";             
	public static final String findAllCategoria = "select * from categoria;";
}
 