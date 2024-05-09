package br.edu.unifei.ecot02.associacao;

public class App2 {
	public static void main(String[] args) {
		Autor a = new Autor();
		a.setNome("Booch");
		Livro l = new Livro();
		l.setTitulo("UML");
		l.getAutores().add(a);
		//bidirecional
		a.getLivros().add(l);
	}
}
