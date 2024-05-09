package br.edu.unifei.ecot02.heranca;

import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.setNascimento(new GregorianCalendar(1990, 1, 1));
		System.out.println("a.idade="+a.idade());
		System.out.println("a.conhecimento="+a.conhecimento());
		Pessoa b = new Aluno();
		b.setNascimento(new GregorianCalendar(2000,1, 1));
		System.out.println("b.idade="+b.idade());
		System.out.println("b.conhecimento="+b.conhecimento());
		Pessoa c = new Professor();
		c.setNascimento(new GregorianCalendar(1970, 1, 1));
		System.out.println("c.idade="+c.idade());
		System.out.println("c.conhecimento="+c.conhecimento());
	}

}
