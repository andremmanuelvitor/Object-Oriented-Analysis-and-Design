package br.edu.unifei.ecot02.associacao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private long telefones[] = new long[2];
	private String alergias[] = new String[3];
	private List<Carro> carro = new ArrayList<Carro>();
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long[] getTelefones() {
		return telefones;
	}
	public void setTelefones(long[] telefones) {
		this.telefones = telefones;
	}
	public String[] getAlergias() {
		return alergias;
	}
	public void setAlergias(String[] alergias) {
		this.alergias = alergias;
	}
	public List<Carro> getCarro() {
		return carro;
	}
	public void setCarro(List<Carro> carro) {
		this.carro = carro;
	}	
	
}
