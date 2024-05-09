package br.edu.unifei.ecot02.relacoes;

public class App1 {

	public static void main(String[] args) {
		
		Componente c11 = new Componente();
		c11.getComodos().add(new Componente());

		Componente c12 = new Componente();
		c12.getComodos().add(new Componente());
		c12.getComodos().add(new Componente());

		Componente c13 = new Componente();
		c13.getComodos().add(new Componente());
		c13.getComodos().add(new Componente());
		c13.getComodos().add(new Componente());
		
		Componente c1 = new Componente();
		c1.getComodos().add(c11);
		c1.getComodos().add(c12);
		c1.getComodos().add(c13);
		
		Componente c2 = new Componente();
		c2.getComodos().add(new Componente());
		
		Componente c = new Componente();
		c.getComodos().add(c1);
		c.getComodos().add(c2);
	}

}
