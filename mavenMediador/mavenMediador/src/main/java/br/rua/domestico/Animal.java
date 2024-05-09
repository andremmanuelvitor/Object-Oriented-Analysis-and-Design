package br.rua.domestico;

public abstract class Animal {
	private Perseguicao perseguicao;
	protected void chamarPerseguir() {
		perseguicao.perseguir();
	}
	public Perseguicao getPerseguicao() {
		return perseguicao;
	}
	public void setPerseguicao(Perseguicao perseguicao) {
		this.perseguicao = perseguicao;
	}	
}
