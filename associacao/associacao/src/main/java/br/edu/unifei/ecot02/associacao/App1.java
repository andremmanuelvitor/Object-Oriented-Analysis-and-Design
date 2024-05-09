package br.edu.unifei.ecot02.associacao;

import java.util.Iterator;

public class App1 {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setPlaca("ABC1234");
		Carro c2 = new Carro();
		c2.setPlaca("XYZ9876");
		Pessoa p = new Pessoa();
		p.getCarro().add(c1);
		p.getCarro().add(c2);
		Iterator<Carro> it = p.getCarro().iterator();
		while (it.hasNext()) {
			Carro c = it.next();
			System.out.println(c.getPlaca());
		}
	}

}
