package com.proconsul.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager implements ConnectionParameters {
	
    /*
     * metodo che apre una connessione
     * e la restituisce
     */
	public static Connection getConnection() {
		
		Connection con = null;
		
		try {
		
		Class.forName(dbDriver);
		
		con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		
		 if (con == null) {
	            System.err.println("Errore: impossibile stabilire una connessione.");
	        }
		}
		
		catch(ClassNotFoundException | SQLException ex) {	
			ex.printStackTrace();
			
		}
		
		return con;
		
		
	}
	
	/*
	 * metodo che inizilizza un PreparedStatement pronto all'uso,
	 * in grado di effettuare una operazione di inserimento, modifica
	 * o cancellazione a seconda delle esigenze del chiamante
	 */
	public static PreparedStatement  getPreparedStatement(Connection con, String sql) {
		
		PreparedStatement ps = null;
		
		try {
	
		ps = con.prepareStatement(sql);
		
		}
		
		catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return ps;
		
		
	}
	
	/*
	 * metodo che restituisce un 
	 * oggetto ResultSet
	 */
	public static ResultSet getResultSet(Connection con, String sql) {
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
		}
		
		catch(SQLException ex) {
			
			ex.printStackTrace();
			
		}
		
		return rs;
		
		
	}
	
	/*
	 * metodo che chiude
	 * una connessione
	 */
	public static void closeConnection(Connection con) {
		
		try {
			
		con.close();
		
		}
		
		catch(SQLException ex){
			
			ex.printStackTrace();
		}
	}
	

}
