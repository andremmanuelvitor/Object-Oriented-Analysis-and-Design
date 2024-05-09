package br.edu.unifei.ecot02.relacoes;

import java.util.ArrayList;
import java.util.List;

public class Componente {
	private String nome;
	private float preco;
	private List<Componente> comodos = 
			new ArrayList<Componente>();
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public List<Componente> getComodos() {
		return comodos;
	}
	public void setComodos(List<Componente> comodos) {
		this.comodos = comodos;
	}
	
}
