package com.proconsul.sql;

public interface SqlScript {

	public static final String sqlInserisciDipendente = "INSERT INTO `dipendente`(`codice_fiscale`, `cap`, `citta_natale`, `citta_residenza`, `cognome`, `data_di_nascita`, `email`, `indirizzo`, `nome`, `numero_telefonico`) "
			+ "	VALUES (?,?,?,?,?,?,?,?,?,?)";
	
}
