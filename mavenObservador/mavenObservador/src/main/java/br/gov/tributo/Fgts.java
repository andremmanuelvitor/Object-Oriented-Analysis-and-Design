package br.gov.tributo;

public class Fgts extends Imposto {

	@Override
	public void atualiza(double v) {
		this.valor=v*0.08;
	}

}
