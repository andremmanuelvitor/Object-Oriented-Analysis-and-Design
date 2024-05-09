package br.edu.unifei.ecot02.associacao;

import java.util.ArrayList;
import java.util.List;

public class Individuo {
	private String nome;
	private String cpf;
	private Individuo pai;
	private Individuo mae;
	private List<Individuo> filhos = new ArrayList<Individuo>();
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Individuo getPai() {
		return pai;
	}
	public void setPai(Individuo pai) {
		this.pai = pai;
	}
	public Individuo getMae() {
		return mae;
	}
	public void setMae(Individuo mae) {
		this.mae = mae;
	}
	public List<Individuo> getFilhos() {
		return filhos;
	}
	public void setFilhos(List<Individuo> filhos) {
		this.filhos = filhos;
	}
	
}
