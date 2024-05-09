package br.edu.unifei.ecot02.relacoes;

public class Cliente {
	private Servidor servidor;
	public Cliente(Servidor servidor) {
		this.servidor = servidor;
	}
	//gets e sets
	public Servidor getServidor() {
		return servidor;
	}
	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}
	
}
