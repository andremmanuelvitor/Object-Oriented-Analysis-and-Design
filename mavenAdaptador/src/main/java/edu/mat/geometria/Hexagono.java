package edu.mat.geometria;

import bio.colmeia.FavoMel;

public class Hexagono extends Poligono{
	private FavoMel favo = new FavoMel();
	public void setLado(float lado) { favo.setLadoParede(lado); }
	public double area() { return favo.superficie(); }
}
