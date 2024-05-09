package edu.mat.geometria;

public class Triangulo{
	private float base, altura;
	public float getBase() { return base; }
	public void setBase(float valor) { base=valor; }
	public float getAltura() { return altura; }
	public void setAltura(float valor) { altura=valor; }
	public float area() { return base * altura / 2; }
}