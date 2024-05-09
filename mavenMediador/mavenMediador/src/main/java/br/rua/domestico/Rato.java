package br.rua.domestico;

public class Rato extends Animal {
	private boolean vivo;
	
	public void foge() {
		chamarPerseguir();
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
}
