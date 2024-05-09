package br.personagem;

public abstract class Ser {
	private String nome;
	private AlterEgo alterEgo;
	public Ser(AlterEgo alterEgo) {
		this.alterEgo = alterEgo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public AlterEgo getAlterEgo() {
		return alterEgo;
	}
	public void setAlterEgo(AlterEgo alterEgo) {
		this.alterEgo = alterEgo;
	}
	
}
