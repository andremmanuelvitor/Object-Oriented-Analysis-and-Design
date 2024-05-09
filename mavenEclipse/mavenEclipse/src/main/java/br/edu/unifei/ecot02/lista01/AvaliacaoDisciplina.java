package br.edu.unifei.ecot02.lista01;

public class AvaliacaoDisciplina {
	private String nome;
	private double prova;
	private double trabalho;
	
	public double media() {
		return prova*0.8+trabalho *0.2;
	}
	
	public boolean aprovado() {
		return this.media()>=5;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		if(prova >=0 && prova <= 10) {
			this.prova = prova;			
		}
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		if(trabalho >= 0 && trabalho <= 10) {
			this.trabalho = trabalho;
		}
	}
	
}
