package com.proconsul.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DipendenteTecnologiaVO implements Serializable {

	private String nome;
	private String cognome;
	private String nomeTecnologia;
	private String esperienza;
	private String competenza;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNomeTecnologia() {
		return nomeTecnologia;
	}
	public void setNomeTecnologia(String nomeTecnologia) {
		this.nomeTecnologia = nomeTecnologia;
	}
	public String getEsperienza() {
		return esperienza;
	}
	public void setEsperienza(String esperienza) {
		this.esperienza = esperienza;
	}
	public String getCompetenza() {
		return competenza;
	}
	public void setCompetenza(String competenza) {
		this.competenza = competenza;
	}
	public DipendenteTecnologiaVO(String nome, String cognome, String nomeTecnologia, String esperienza,
			String competenza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nomeTecnologia = nomeTecnologia;
		this.esperienza = esperienza;
		this.competenza = competenza;
	}
	public DipendenteTecnologiaVO() {
		super();
	}
	
}
