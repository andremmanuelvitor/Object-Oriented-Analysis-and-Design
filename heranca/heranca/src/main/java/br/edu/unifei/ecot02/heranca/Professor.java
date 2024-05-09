package br.edu.unifei.ecot02.heranca;

public class Professor extends Pessoa{
	private String especialidade;
	public int conhecimento() {
		return (idade()*4)/2;
	}
	//gets e sets
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
