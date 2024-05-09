package br.edu.unifei.ecot02.relacoes;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private String matricula;
	private String endereco;
	private List<Comodo> comodos = 
			new ArrayList<Comodo>();
	//gets e sets
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Comodo> getComodos() {
		return comodos;
	}
	public void setComodos(List<Comodo> comodos) {
		this.comodos = comodos;
	}
	
}
