package br.edu.unifei.ecot02.heranca;

public class Aluno extends Pessoa{
	private long matricula;
	public int conhecimento() {
		return (idade()*2)/2;
	}
	//gets e sets
	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
}
