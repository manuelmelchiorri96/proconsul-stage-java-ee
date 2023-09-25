package com.proconsul.dto;

import java.io.Serializable;

public class DipendenteTecnologiaDTO implements Serializable {

	private static final long serialVersionUID = -8031649890021500345L;
	private String dipendenteId;
	private String tecnologiaId;
	private String esperienza;
	private String competenza;
	
	public String getDipendenteId() {
		return dipendenteId;
	}
	public void setDipendenteId(String dipendenteId) {
		this.dipendenteId = dipendenteId;
	}
	public String getTecnologiaId() {
		return tecnologiaId;
	}
	public void setTecnologiaId(String tecnologiaId) {
		this.tecnologiaId = tecnologiaId;
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
	
	
	public DipendenteTecnologiaDTO() {
	}
	
	public DipendenteTecnologiaDTO(String dipendenteId, String tecnologiaId, String esperienza,
			String competenza) {
		this.dipendenteId = dipendenteId;
		this.tecnologiaId = tecnologiaId;
		this.esperienza = esperienza;
		this.competenza = competenza;
	}
	
}
