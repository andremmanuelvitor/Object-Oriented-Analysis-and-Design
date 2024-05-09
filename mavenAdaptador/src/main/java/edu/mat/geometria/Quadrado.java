package edu.mat.geometria;

public class Quadrado extends Poligono{
	private float lado;
	public float getLado() { return lado; }
	public void setLado(float valLado) { lado=valLado; }
	public double area() { return lado*lado; }
}
