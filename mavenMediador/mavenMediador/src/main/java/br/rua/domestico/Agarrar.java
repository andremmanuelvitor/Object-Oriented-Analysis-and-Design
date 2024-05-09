package br.rua.domestico;

public class Agarrar implements Perseguicao{

	private Gato gato;
	private Rato rato;
	
	@Override
	public void perseguir() {
		gato.setFome(false);
		rato.setVivo(false);
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
