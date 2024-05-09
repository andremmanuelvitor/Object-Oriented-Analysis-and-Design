package br.edu.unifei.ecot02.relacoes;

public class Mao {
	private int base;
	private int altura;
	private Dedo dedos[] = new Dedo[5];
	public Mao() {
		for(int i=0;i<5;i++) {
			dedos[i]=new Dedo();
		}
	}
	//gets e sets
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public Dedo[] getDedos() {
		return dedos;
	}
	public void setDedos(Dedo[] dedos) {
		this.dedos = dedos;
	}
	
}
