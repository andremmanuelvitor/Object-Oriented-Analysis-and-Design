package br.rua.domestico;

public class Gato extends Animal {
	private boolean fome;

	public void agarra() {
		chamarPerseguir();
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}
	
}
