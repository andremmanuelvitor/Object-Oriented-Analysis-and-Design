package br.personagem;

public class Alienigena extends Ser {

	private String raca;
	
	public Alienigena(AlterEgo alterEgo) {
		super(alterEgo);
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
