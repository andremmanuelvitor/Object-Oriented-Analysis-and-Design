package br.edu.unifei.ecot02.lista01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int i;
		double p, t; 
		Scanner s = new Scanner(System.in);
		AvaliacaoDisciplina a[] = new AvaliacaoDisciplina[40];
		for (i = 0; i < a.length; i++) {
			a[i] = new AvaliacaoDisciplina();
			System.out.print("nome: ");
			a[i].setNome(s.next());
			do {
				System.out.print("prova: ");
				p = s.nextDouble();
				a[i].setProva(p);
			}while(p < 0 || p > 10);
			do {
				System.out.print("trab: ");
				t = s.nextDouble();
				a[i].setTrabalho(t);
			}while(t < 0 || t > 10);
			System.out.print("media: " + a[i].media());
			if(a[i].aprovado()) {
				System.out.println("[aprovado]");
			}else{
				System.out.println("[reprovado]");				
			}
		}
	}

}
