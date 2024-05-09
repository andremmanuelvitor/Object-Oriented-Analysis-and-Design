package br.edu.unifei.ecot02.relacoes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String razao;
	private String cnpj;
	private List<Departamento> departamentos =
			new ArrayList<Departamento>();
	//gets e sets
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

}
