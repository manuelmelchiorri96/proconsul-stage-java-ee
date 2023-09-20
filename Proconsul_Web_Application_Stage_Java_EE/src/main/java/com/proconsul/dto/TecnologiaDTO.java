package com.proconsul.dto;

import java.io.Serializable;

public class TecnologiaDTO implements Serializable {

	private static final long serialVersionUID = -4348721175346719613L;

	private String nome;

	private String nomeCategoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public TecnologiaDTO() {
	}

	public TecnologiaDTO(String nome, String nomeCategoria) {
		super();
		this.nome = nome;
		this.nomeCategoria = nomeCategoria;
	}

}
