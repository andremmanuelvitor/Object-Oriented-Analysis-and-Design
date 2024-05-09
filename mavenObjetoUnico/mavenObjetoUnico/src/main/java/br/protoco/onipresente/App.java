package br.protoco.onipresente;


public class App {
	public static void main(String[] args) {
		// ContadorMaquina c = new ContadorMaquina(); // nao compila!
		ContadorMaquina c1 = ContadorMaquina.getInstancia();
		c1.incrementa();
		ContadorMaquina c2 = ContadorMaquina.getInstancia();
		c2.incrementa();
		c2.incrementa();
		System.out.println(c1.getNumero());//imprime ultimo valor + 3
		System.out.println(c2.getNumero());//imprime ultimo valor + 3
		System.out.println(c1==c2);//imprime true

	}
}