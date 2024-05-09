package br.edu.unifei.ecot02.associacao;

public class Funcionario {
	private String nome;
	private String ctps;
	private Empresa empregador;
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public Empresa getEmpregador() {
		return empregador;
	}
	public void setEmpregador(Empresa empregador) {
		this.empregador = empregador;
	}

	
}
