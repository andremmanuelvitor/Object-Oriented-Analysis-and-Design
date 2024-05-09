package com.editora;

public class App {

	public static void main(String[] args) {
		Nacional n = new Nacional();
		Livro l = new Livro(n);
		l.setPreco(10);
		System.out.println("l="+l.taxa());
		Importado i = new Importado();
		Revista r = new Revista(i);
		r.setPreco(10);
		System.out.println("r="+r.taxa());
	}

}
