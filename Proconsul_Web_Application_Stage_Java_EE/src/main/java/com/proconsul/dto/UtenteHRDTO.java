package com.proconsul.dto;

import java.io.Serializable;

public class UtenteHRDTO implements Serializable {

	private static final long serialVersionUID = -6781402143567508488L;
	private String nome;
	private String cognome;
	private boolean utente;
	private String email;
	private String password;
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
	public boolean isUtente() {
		return utente;
	}
	public void setUtente(boolean utente) {
		this.utente = utente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public UtenteHRDTO() {
	}
	
	public UtenteHRDTO(String nome, String cognome, boolean utente, String email, String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.utente = utente;
		this.email = email;
		this.password = password;
	}
	
	
}
