package br.edu.unifei.ecot02.heranca;

public abstract class Poligono {
	private int x;
	private int y;
	public abstract double area();
	//gets e sets
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
