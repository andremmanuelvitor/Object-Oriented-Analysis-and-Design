package br.edu.unifei.ecot02.relacoes;

public class App2 {
public static void main(String[] args) {
	Servidor s = new Servidor();
	// Cliente c = new Cliente(); // n�o compila
	Cliente c = new Cliente(s);
}
}
