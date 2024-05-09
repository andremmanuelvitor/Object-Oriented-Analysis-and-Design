package br.gov.tributo;

public class Salario extends Rendimento{
	private double mensal;

	public double getMensal() {
		return mensal;
	}

	public void setMensal(double mensal) {
		notifica(mensal);
		this.mensal = mensal;
	}
	
}
