package edu.mat.geometria;

public abstract class Poligono{
	private float centroX, centroY;
	public float getCentroX() { return centroX; }
	public void setCentroX(float centroX) { this.centroX=centroX; }
	public float getCentroY() { return centroY; }
	public void setCentroY(float centroY) { this.centroY=centroY; }
	public abstract double area();
}
