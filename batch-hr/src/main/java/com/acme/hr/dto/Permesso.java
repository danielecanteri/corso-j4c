package com.acme.hr.dto;

import java.util.Date;

public class Permesso {

	private int idDipendente;
	private Date dataPermesso;
	private int ore;

	public int getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(int idDipendente) {
		this.idDipendente = idDipendente;
	}

	public Date getDataPermesso() {
		return dataPermesso;
	}

	public void setDataPermesso(Date dataPermesso) {
		this.dataPermesso = dataPermesso;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

}
