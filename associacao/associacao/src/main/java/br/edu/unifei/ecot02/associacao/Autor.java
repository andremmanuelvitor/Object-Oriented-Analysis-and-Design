package br.edu.unifei.ecot02.associacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Autor {
	private String nome;
	private Date nascimento;
	private List<Livro> livros = new ArrayList<Livro>();
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}
