package br.gov.financa;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Central c = new Central();
		System.out.print("dinheiro do central: ");
		c.setDinheiro(scan.nextFloat());
		Brasil b = new Brasil();
		b.setCentral(c);	
		Empresa e = new Empresa();
		e.setBanco(b);
		System.out.print("emprestimo: ");
		e.pedirEmprestimo(scan.nextFloat());
		System.out.println("central.dinheiro= " + c.getDinheiro() );
		System.out.println("empresa.capital= " + e.getCapital() );
	}
}
