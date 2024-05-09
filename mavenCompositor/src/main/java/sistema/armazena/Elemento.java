package sistema.armazena;

import java.util.Date;

public abstract class Elemento {
	private String nome;
	private Date data;
	private String usuario;
	public abstract int espa�o();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
