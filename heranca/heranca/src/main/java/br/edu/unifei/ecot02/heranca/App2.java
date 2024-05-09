package br.edu.unifei.ecot02.heranca;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		//Aluno a = new Pessoa() //não compila
		Pessoa a = new Pessoa();
		Pessoa b = new Aluno();
		Pessoa c = new Professor();
		List<Pessoa> l = new ArrayList<Pessoa>();
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(new Aluno());
		for (Pessoa pessoa : l) {
			System.out.println(pessoa);
		}
	
	}

}
