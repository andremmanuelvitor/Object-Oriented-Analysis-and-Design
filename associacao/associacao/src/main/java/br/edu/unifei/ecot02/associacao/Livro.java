package br.edu.unifei.ecot02.associacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livro {
	private String titulo;
	private Date publicacao;
	private String editora;
	private List<Autor> autores = new ArrayList<Autor>();
	//gets e sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	
}
