package br.gov.financa;

public class Empresa {
	private String cnpj;
	private float capital;
	private Banco banco;
	public void pedirEmprestimo(float v) {
		if(banco != null && banco.emprestimo(v)) {
			capital+=v;
		}
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public float getCapital() {
		return capital;
	}
	public void setCapital(float capital) {
		this.capital = capital;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

}
