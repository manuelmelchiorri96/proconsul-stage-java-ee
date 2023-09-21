package com.proconsul.dto;

import java.io.Serializable;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = -3610468951309061924L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public CategoriaDTO() {
	}

	public CategoriaDTO(String nome) {
		this.nome = nome;
	}
	
	
}
