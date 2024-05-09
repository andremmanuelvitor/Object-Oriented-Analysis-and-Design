package br.edu.unifei.ecot02.heranca;

public class Triangulo extends Poligono {
	private int base;
	private int altura;
	@Override
	public double area() {
		return (base*altura)/2;
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
	
}
