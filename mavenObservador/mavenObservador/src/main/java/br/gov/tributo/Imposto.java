package br.gov.tributo;

public abstract class Imposto {
	protected double valor;
	public abstract void atualiza(double v);
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
}
