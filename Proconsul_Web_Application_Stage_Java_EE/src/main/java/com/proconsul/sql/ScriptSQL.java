package com.proconsul.sql;

public interface ScriptSQL {

	final static String ricercaDipendenteTecnologiaByTecnologia = "select d1_0.dipendente_codice_fiscale,d1_0.tecnologia_nome,"
			+ "d1_0.competenza,d1_0.esperienza from dipendente_tecnologia d1_0 where d1_0.tecnologia_nome=?";
	final static String ricercaNomeDipendenteByCodiceFiscale = "select d1_0.nome, d1_0.cognome from dipendente d1_0 where d1_0.codice_fiscale=?";
	
}
