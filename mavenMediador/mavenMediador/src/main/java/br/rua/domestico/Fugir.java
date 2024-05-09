package br.rua.domestico;

public class Fugir implements Perseguicao {

	private Gato gato;
	private Rato rato;
	
	@Override
	public void perseguir() {
		gato.setFome(true);
		rato.setVivo(true);
	}

	public Gato getGato() {
		return gato;
	}

	public void setGato(Gato gato) {
		this.gato = gato;
	}

	public Rato getRato() {
		return rato;
	}

	public void setRato(Rato rato) {
		this.rato = rato;
	}

	
}
