package com.editora;

public class Revista extends Publicacao {
	private int ano;
	private int mes;
	public Revista(Origem origem) {
		super(origem);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
}
