package sistema.armazena;

public class Arquivo extends Elemento{
	private int tamanho;
	private String tipo;
	@Override
	public int espaço() {
		return tamanho;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
