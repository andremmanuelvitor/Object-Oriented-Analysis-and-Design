package br.edu.unifei.ecot02.heranca;

public class Quadrado extends Poligono {
	private int lado;
	@Override
	public double area() {
		return lado*lado;
	}
	//gets e sets

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
