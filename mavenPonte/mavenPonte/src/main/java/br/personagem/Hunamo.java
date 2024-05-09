package br.personagem;

public class Hunamo extends Ser{

	private String natural;
	
	public Hunamo(AlterEgo alterEgo) {
		super(alterEgo);
	}

	public String getNatural() {
		return natural;
	}

	public void setNatural(String natural) {
		this.natural = natural;
	}
	
}
