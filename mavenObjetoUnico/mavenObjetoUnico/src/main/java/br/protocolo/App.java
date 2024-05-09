package br.protocolo;

public class App {
	public static void main(String[] args) {
		// Contador c = new Contador(); // nao compila!
		Contador c1 = Contador.getInstancia();
		c1.incrementa();
		Contador c2 = Contador.getInstancia();
		c2.incrementa();
		c2.incrementa();
		System.out.println(c1.getNumero());//imprime 3
		System.out.println(c2.getNumero());//imprime 3
		System.out.println(c1==c2);//imprime true
	}
}