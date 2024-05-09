package br.personagem;

public class App {

	public static void main(String[] args) {
		Heroi h = new Heroi();
		h.setCodinome("Superman");
		Alienigena a = new Alienigena(h);
		a.setNome("Clark Kent");
	}

}
