package com.editora;

public abstract class Publicacao {
	private String titulo;
	private float preco;
	private Origem origem;
	public Publicacao(Origem origem) {
		this.origem = origem;
	}
	public float taxa() {
		return origem.imposto(preco);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}
}
