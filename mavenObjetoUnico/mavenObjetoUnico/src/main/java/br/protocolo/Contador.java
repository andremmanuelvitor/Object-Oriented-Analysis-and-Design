package br.protocolo;

public class Contador {
	private int numero;
	private static Contador instancia = new Contador();

	private Contador() {}

	public int getNumero() {
		return numero;
	}

	public void incrementa() {
		numero++;
	}

	public static Contador getInstancia() {
		return instancia;
	}

}