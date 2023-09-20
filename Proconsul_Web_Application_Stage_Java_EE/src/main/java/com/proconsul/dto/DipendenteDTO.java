package com.proconsul.dto;

import java.io.Serializable;
import java.sql.Date;

public class DipendenteDTO implements Serializable {


	private static final long serialVersionUID = -4051392597694436697L;
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String email;
	private Date dataNascita;
	private String cittaNatale;
	private String indirizzo;
	private String cittaResidenza;
	private String cap;
	private String numeroTelefonico;
	
	
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCittaNatale() {
		return cittaNatale;
	}
	public void setCittaNatale(String cittaNatale) {
		this.cittaNatale = cittaNatale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCittaResidenza() {
		return cittaResidenza;
	}
	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
	public DipendenteDTO() {
	}
	
	public DipendenteDTO(String codiceFiscale, String nome, String cognome, String email, Date dataNascita,
			String cittaNatale, String indirizzo, String cittaResidenza, String cap, String numeroTelefonico) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.cittaNatale = cittaNatale;
		this.indirizzo = indirizzo;
		this.cittaResidenza = cittaResidenza;
		this.cap = cap;
		this.numeroTelefonico = numeroTelefonico;
	}
	
	
}
