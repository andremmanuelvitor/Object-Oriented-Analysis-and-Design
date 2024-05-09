package br.rua.domestico;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("(1) Agarra / (2) Foge Opção:");
		int op = s.nextInt();
		Agarrar a = new Agarrar();
		Fugir f = new Fugir();			
		Rato r = new Rato();
		Gato g = new Gato();
		if(op == 1) {
			g.setPerseguicao(a);
			a.setRato(r);
			a.setGato(g);
			g.agarra();
			System.out.println("gato agarra");
		}else {
			r.setPerseguicao(f);
			f.setRato(r);
			f.setGato(g);
			r.foge();
			System.out.println("rato foge");
		}
		System.out.println("r.vivo="+r.isVivo());
		System.out.println("g.fome="+g.isFome());
	}

}
